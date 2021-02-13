package com.crashcourse.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	List<String> foo = new ArrayList<>();

	foo.add("william");
	foo.add("pamela");
	foo.add("pedro");
	foo.add("joao");

	System.out.println(foo.stream().count());

	System.out.println(foo.stream().max(Comparator.comparingInt(String::length)));

	System.out.println(foo.stream().min(Comparator.comparingInt(String::length)));

	System.out.println(foo.stream().filter((e) -> e.length() < 5).collect(Collectors.toList()));
	System.out.println(foo.stream().filter((e) -> e.toLowerCase().contains("l")).collect(Collectors.toList()));

	System.out.println(foo.stream().map((e) -> e.concat(" >>>").concat(String.valueOf(e.length())))
		.collect(Collectors.toList()));

	System.out.println(foo.stream().limit(3).collect(Collectors.toList()));

	System.out.println(foo.stream().peek(System.out::println).collect(Collectors.toList()));
	foo.stream().forEach((e) -> System.out.println("teste  " + e));

	foo.stream().forEach(System.out::println);

	System.out.println(foo.stream().allMatch((e) -> e.contains("a")));

    }

}
