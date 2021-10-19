package com.bilgeadam.boost.java.course01.lesson30.StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5_genel {
	public static void main(String[] args) {
		// bu elemanlara 5 ekleyin
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5).stream().map(topla -> topla + 5).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
