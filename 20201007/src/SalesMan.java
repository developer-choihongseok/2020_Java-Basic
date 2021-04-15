
public class SalesMan extends Regular{
	
	private int sales;
	private double comission;
	
	public SalesMan(String irum, int nai, int salary, int sales, double comission) {
		super(irum, nai, salary);
		this.sales = sales;
		this.comission = comission;
	}

	@Override
	public double pay() {
		return super.pay() + (sales * comission);
	}

	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : " + pay() + "원");
	}
}