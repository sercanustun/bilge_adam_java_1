import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class helloworld {
	
	public static void main(String[] args) {
		
		Date simdikiZaman = new Date();
		System.out.println(simdikiZaman.toString());
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date tarih = df.parse("1984/01/01");
		System.out.println(tarih);
		
	}
}