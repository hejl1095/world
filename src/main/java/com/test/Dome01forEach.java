package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Dome01forEach {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","三张","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");
        list.forEach(System.err::println);

        System.err.println("---------------------------");
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.err.println(s));
    }
}
