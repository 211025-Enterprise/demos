package com.revature.model;

import java.io.Serializable;
import java.util.Objects;

public class Artist implements Serializable {

    private int artistId;

    private String name;

    public Artist() {
    }

    public Artist(int artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return artistId == artist.artistId && Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, name);
    }
}
