package com.bilgeadam.boost.java.course01.lesson30;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LombokExamples {
	private String name2;
	private String surname;
	
	public static void main(String[] args) {
		
		LombokExamples lombokexamples = new LombokExamples("Sercan", "Üstün");
		System.out.println(lombokexamples);
		
	}
}
