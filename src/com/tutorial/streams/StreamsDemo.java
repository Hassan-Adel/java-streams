package com.tutorial.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

    public static void MapElements(){
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
        var movieTitles = movies.stream().map(m ->m.getName());
        movieTitles.forEach(mt -> System.out.println(mt));

        //flat map
        var streamOfLists= Stream.of(List.of(1,2,3), List.of(4,5,6));
        //flatten to list of ints
        //Stream<List<x>> -> Stream<x>
        streamOfLists.flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
    }

    public static void FilteringStreams(){
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
        Predicate<Movie> isPopular  = movie -> movie.getLikes()>10;
        //1
        movies.stream().filter(m -> m.getLikes()>10)
                .forEach(l -> System.out.println(l));
        //2
        movies.stream().filter(isPopular)
                .forEach(l -> System.out.println(l));
    }

    public static void CreateStreams(){
        Collection<Integer> test = List.of(1,23,63,7,4,2);
        var stream = test.stream();

        int[] arr = {1,3,52,6};
        var stream2 = Arrays.stream(arr);
        stream2.forEach(n -> System.out.println(n));

        Stream.of(1,5,34,768,3);

        var infiniteStream =  Stream.generate(()->Math.random());
        infiniteStream.limit(10).forEach(n-> System.out.println(n));

        var infiniteStream2 = Stream.iterate(1, n->n+2);
        infiniteStream2.limit(3).forEach(n-> System.out.println(n));
    }
}
