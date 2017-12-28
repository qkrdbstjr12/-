
class Product {
	int pcode;          //상품 코드 데이터를 저장하는 변수
	String pname;       //상품명 데이터를 저장하는 변수
	int price;          //상품가격을 저장하는 변수
	int quant;          //상품재고수량 데이터를 저장하는 변수
	String pdesc = "";  //상품설명 데이터를 저장하는 변수
	
	public void info() {
		String msg = pcode + "\t|" + pname + "\t|" + price + "\t|" + quant
	    + "\t|" + pdesc;
		System.out.println(msg);
	} 
	
	public void getPrice() {
		System.out.println(price);
	}       //객체가 가지고 있는 정보를 출력하는 세모드
	
	public Product(int pcode, String pname, int price, int quant, String pdesc) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant;
		this.pdesc = pdesc;
	}

}   


