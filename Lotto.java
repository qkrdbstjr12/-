import java.util.Random;

public class Lotto{
	int[] su = new int[6]; //임의의 값 6개 저장
	
	public void input() {
		for(int i = 0; i < 6; i++) {
		su[0] = uniqueValue(0);	//구현해 보자.
		su[1] = uniqueValue(1);
		su[2] = uniqueValue(2);
		su[3] = uniqueValue(3);
		su[4] = uniqueValue(4);
		su[5] = uniqueValue(5);
		}
	}
	//배열출력
	
	void print() {
		for(int i = 0; i < 6; i++) {
			System.out.println(su[i]);
		}
	}

	public static void main(String[] args) {
		Lotto lo = new Lotto();
		lo.input();
		lo.print();
	}
	//중복되지 않은 값 찾아서 반환
	public int uniqueValue(int index) {
		int imsi;
		boolean eq;  //중복된 값 여부
		Random ran = new Random();
		do {
			imsi = ran.nextInt(45) +1;
			eq = false;
			for(int j = 0; j < index; j++) {
				if(imsi == su[j]) {
					eq = true;
					break;
				}

			}
			
		}while(eq);
		return imsi;
	}

}

