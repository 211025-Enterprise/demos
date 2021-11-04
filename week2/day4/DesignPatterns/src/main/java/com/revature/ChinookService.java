package com.revature;

import com.revature.model.Artist;
import com.revature.util.ConnectionSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChinookService {

    public List<Artist> getAllArtists() {
        String sql = "select * from \"Artist\" where";
        List<Artist> artistList = new ArrayList<>();

        try(Connection connection = ConnectionSingleton.getInstance()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                artistList.add(
                        new Artist(
                                rs.getInt(1),
                                rs.getString(2))
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return artistList;
    }

    public Artist getArtistsByName(String name) {
        String sql = "select * from \"Artist\" where \"Name\" = '" + name + "'";
        Artist artist = null;

        try(Connection connection = ConnectionSingleton.getInstance()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                artist = new Artist(
                                rs.getInt(1),
                                rs.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return artist;
    }
}
