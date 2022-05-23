package ru.netology.manager;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {

    }

    public void add(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;

        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenght;
        if (movies.length < limit) {
            resultLenght = movies.length;
        } else {
            resultLenght = limit;
        }
        String[] result = new String[resultLenght];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
