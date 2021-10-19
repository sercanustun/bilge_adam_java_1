package com.bilgeadam.boost.java.course01.lesson30.StreamExamples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// 1.5 anotation
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NonNull
// Student bir clasım olsun datasetlerimiz ekleyelim
// verilerin içersinde Hamit kaç tane olduğunu bulsun
// olan verilerden sadece 3 tanesini bana versin .
// map her elemanı tek tek dolasarak elemanları arar

public class Student {
	private String adi;
	private String soyadi;
	
}
