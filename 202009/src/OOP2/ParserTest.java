package OOP2;
/*
 인터페이스의 다형성
  - 리턴 타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 의미.
*/
interface Parseable{
	
	public abstract void parse(String fileName);	// 추상메서드
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed");
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed");
	}
}

class ParserManager{
	// 리턴타입이 Parseable 인터페이스이다.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			// 밑에 두 줄을 합치면, return new HTMLParser();
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

public class ParserTest {
	public static void main(String[] args) {
		
		Parseable parser = ParserManager.getParser("XML");	// Parseable parser = new XMLParser(); 와 같다.
		parser.parse("document.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");
	}
}
