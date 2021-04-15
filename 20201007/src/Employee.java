
abstract class Employee {
	
	private String irum;
	private int nai;
	
	Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}
	
	public abstract double pay();
	public abstract void print();
	
	void display() {
		System.out.print("이름 : " + irum + ", 나이 : " + nai);
	}	
}