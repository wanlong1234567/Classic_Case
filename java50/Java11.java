package java50;
public class Java11 {
	public static void main(String[] args) {
		int count = 0;
		for (int m = 1; m < 5; m++) {
			for (int n = 1; n < 5; n++) {
				for (int l = 1; l < 5; l++) {
					if (m != n && n != l && m != l) {
						count++;
						System.out.println(m * 100 + n * 10 + l);
					}
				}
			}
		}
		System.out.println("共有" + count + "个三位数");
	}
}
