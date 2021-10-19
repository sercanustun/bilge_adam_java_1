package alombokkutuphanesi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LombokClass {
	
	private int id;
	private String adi;
	private String soyadi;
	private String numarasi;
	private String memleket;
	private String sehir;
	private String tarih;
	
	public LombokClass(int id) {
		
		this.id = id;
		
	}
	
}