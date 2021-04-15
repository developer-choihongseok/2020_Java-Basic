class TV2{
	
	private int size;
	
	public TV2(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV2 extends TV2{
	
	int color;
	
	public ColorTV2(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");
	}
}

class IPTV extends ColorTV2{
	
	String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 " + ip + "주소의");
		super.printProperty();
	}
}

public class ex2 {
	public static void main(String[] args) {
		// "192.1.1.2" 주소에 32인치, 2048컬러
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}
}