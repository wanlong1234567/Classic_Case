package java50;
public class Java3 {
	public static void main(String[] args) {
		for (int i = 101; i < 1000; i++) {
			int a = i % 10;//个位
			int b = (i / 10) % 10;//十位
			int c = i / 100;//百位
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println("輸出水仙花数："+i );
			}
		}
	}
}
