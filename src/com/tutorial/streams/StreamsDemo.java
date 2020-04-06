package com.tutorial.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
