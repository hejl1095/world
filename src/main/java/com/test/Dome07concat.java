package com.test;

import java.util.stream.Stream;

public class Dome07concat {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("美羊羊", "喜羊羊", "沸羊羊", "慢羊羊", "暖羊羊", "懒羊羊");
        Stream<String> stream2 = Stream.of("迪丽热巴", "古力娜扎", "佟丽娅");

        Stream.concat(stream1,stream2).forEach(System.err::println);
    }
}
