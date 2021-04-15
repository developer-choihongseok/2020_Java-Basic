package API;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		// Integer.parseInt() 메서드는 ,가 포함된 문자열 변환 X.
		// parse는 DecimalFormat의 조상인 NumberFormat에 정의된 메서드.
		// Number 클래스는 Integer, Double과 같은 숫자를 저장하는 래퍼클래스의 조상.
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89 -> ");
			
			double d = num.doubleValue();	// Number에 저장된 값을 double형의 값으로 변환하여 반환.
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
			System.out.println();
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String data = "123,456,789.5";
		
		DecimalFormat df3 = new DecimalFormat("####,####");
		
		Long roundData = Math.round(Double.parseDouble(data.replace(",", "")));
		
		System.out.println("data= " + data);
		System.out.println("roundData= " + roundData);
		System.out.println("만단위: " + df.format(roundData));
		System.out.println();
		
		try {
			Number number = df.parse(data);
			double d = number.doubleValue();	// Number에 저장된 값을 double형의 값으로 변환하여 반환.
			
			System.out.println("d= " + d);
			System.out.println("반올림= " + Math.round(d));
			System.out.println("만단위: " + df3.format(d));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}