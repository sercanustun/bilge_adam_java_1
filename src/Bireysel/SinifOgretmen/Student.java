package Bireysel.SinifOgretmen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	
	private String name;
	private String surname;
	private int aldigiNot;
	private int aldigiNot2;
	
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
		
	}
}
