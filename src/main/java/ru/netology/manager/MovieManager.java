package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];

    public MovieManager(Movie[] movies) {
        this.movies = movies;
    }

    public MovieManager() {

    }

    public void add(Movie movie) {

        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;

        movies = tmp;
    }

    public Movie[] findAll() {
        Movie[] movie  = new Movie[movies.length];

        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);

        }
        return movies;
    }

    public Movie[] findLast() {
        Movie[] result = new Movie[movies.length];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i -1;
            result[i] = movies[index];
        }

        return movies;
    }

}
