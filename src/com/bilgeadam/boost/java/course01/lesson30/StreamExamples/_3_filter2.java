package com.bilgeadam.boost.java.course01.lesson30.StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_filter2 {
	public static void main(String[] args) {
		List<Student> listem = new ArrayList<Student>();
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit1", "Mızrak"));
		listem.add(new Student("Hamit2", "Mızrak"));
		listem.add(new Student("Hamit3", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit5", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		
		List<String> listem2 = listem.stream().map(Student::getAdi).filter(temp -> temp.startsWith("Hamit")).limit(3)
				.collect(Collectors.toList());
		listem2.forEach(System.out::println);
		System.out.println(listem2.size() + " tane var");
	}
}
