package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Dome02count {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10);
        long count = integerStream.count();
        System.err.println("c1 = "+count);


        List<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","三张","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");
        Stream<String> stream = list.stream();
        long count1 = stream.count();
        System.err.println("c2 = "+count1);



    }
}
