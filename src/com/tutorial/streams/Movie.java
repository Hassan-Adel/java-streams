package com.tutorial.streams;

public class Movie {
    private String name;
    private int likes;

    public int getLikes() {
        return likes;
    }

    public Movie setLikes(int likes) {
        this.likes = likes;
        return this;
    }


    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }
}
