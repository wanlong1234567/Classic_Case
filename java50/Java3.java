package java50;
public class Java3 {
	public static void main(String[] args) {
		for (int i = 101; i < 1000; i++) {
			int a = i % 10;//��λ
			int b = (i / 10) % 10;//ʮλ
			int c = i / 100;//��λ
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println("ݔ��ˮ�ɻ�����"+i );
			}
		}
	}
}
