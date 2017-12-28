
public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product(5912, "TV", 5000, 100, "FULL HD AMOLED 3D TV");
		
		System.out.println("상품코드 \t| 상품명 \t| 상품가격 \t| 상품재고 \t| 상품설명");
		
		p.info();

	}

}
