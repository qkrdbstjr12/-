
class Product {
	int pcode;          //��ǰ �ڵ� �����͸� �����ϴ� ����
	String pname;       //��ǰ�� �����͸� �����ϴ� ����
	int price;          //��ǰ������ �����ϴ� ����
	int quant;          //��ǰ������ �����͸� �����ϴ� ����
	String pdesc = "";  //��ǰ���� �����͸� �����ϴ� ����
	
	public void info() {
		String msg = pcode + "\t|" + pname + "\t|" + price + "\t|" + quant
	    + "\t|" + pdesc;
		System.out.println(msg);
	} 
	
	public void getPrice() {
		System.out.println(price);
	}       //��ü�� ������ �ִ� ������ ����ϴ� �����
	
	public Product(int pcode, String pname, int price, int quant, String pdesc) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant;
		this.pdesc = pdesc;
	}

}   


