import java.util.Random;

public class Lotto{
	int[] su = new int[6]; //������ �� 6�� ����
	
	public void input() {
		for(int i = 0; i < 6; i++) {
		su[0] = uniqueValue(0);	//������ ����.
		su[1] = uniqueValue(1);
		su[2] = uniqueValue(2);
		su[3] = uniqueValue(3);
		su[4] = uniqueValue(4);
		su[5] = uniqueValue(5);
		}
	}
	//�迭���
	
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
	//�ߺ����� ���� �� ã�Ƽ� ��ȯ
	public int uniqueValue(int index) {
		int imsi;
		boolean eq;  //�ߺ��� �� ����
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

