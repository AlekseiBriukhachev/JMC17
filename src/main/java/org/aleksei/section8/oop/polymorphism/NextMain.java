package org.aleksei.section8.oop.polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Advert", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        Object uknownObject = Movie.getMovie("C", "Airplane");
        if (uknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) uknownObject;
            c.watchComedy();
        } else if (uknownObject instanceof Adventure) {
            ((Adventure) uknownObject).watchAdventure();
        } else if (uknownObject instanceof ScienceFiction sifi) {
            sifi.watchScienceFiction();
        }
    }
}
