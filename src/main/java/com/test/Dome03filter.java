package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Dome03filter {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "沸羊羊", "慢羊羊", "暖羊羊", "懒羊羊", "灰太狼", "红太狼", "小灰灰");

        stream.filter(s -> s.contains("羊羊")).forEach(System.err::println);
    }
}
