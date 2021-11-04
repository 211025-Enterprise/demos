package com.revature;

import com.revature.model.Artist;
import com.revature.shapes.Circle;
import com.revature.shapes.Shape;
import com.revature.shapes.ShapeType;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//
//        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
//        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
//        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
//
//        circle.draw();
//        square.draw();
//        triangle.draw();

        ChinookService service = new ChinookService();
        List<Artist> artists = service.getAllArtists();

        String name = "Foo Fighters";

        for(Artist artist : artists){
            if(artist.getName().equals(name)){
                System.out.println(artist);
            }
        }
    }
}
