package com.revature.model;
import java.util.List;

public class User {

    public String username;
    String password;
    public int id;
    private List<String> features;

    public User() {
        super();
    }

    public User(int id) {
        super();
        this.id = id;
    }

    public User(String username, String password, int id, List<String> features) {
        super();
        this.username = username;
        this.password = password;
        this.id = id;
        this.features = features;
    }

    public String getUsername() {
        return username;
    }

    @Test
    private void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((features == null) ? 0 : features.hashCode());
        result = prime * result + id;
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (features == null) {
            if (other.features != null)
                return false;
        } else if (!features.equals(other.features))
            return false;
        if (id != other.id)
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User { "
                + "id= " + id + " username=" + username + ", password=" + password + ", features=" + features + "]";
    }
}