package com.tutorial.streams;

import java.util.List;

public class StreamsDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        var count = movies.stream().filter(i -> i.getLikes()>10).count();
        System.out.println(count);
    }
}
