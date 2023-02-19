package com.test;

import java.util.stream.Stream;

public class Dome06map {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("11", "22", "33");

        stream1.map(Integer::parseInt).forEach(s -> System.err.println(s+20));
    }
}
