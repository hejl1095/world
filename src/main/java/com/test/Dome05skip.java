package com.test;

import java.util.stream.Stream;

public class Dome05skip {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "沸羊羊", "慢羊羊", "暖羊羊", "懒羊羊", "灰太狼", "红太狼", "小灰灰");

        stream.skip(2).forEach(System.err::println);
    }
}
