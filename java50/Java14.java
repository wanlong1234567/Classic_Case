package java50;
import java.util.Scanner;
public class Java14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入几号：");
		int day = sc.nextInt();
		int d = 0;
		if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
			System.out.println("输入错误，请重新输入！");
			System.exit(0);
		}
		for (int i = 1; i <= month; i++) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				day = 31;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
			case 2:
				if (year % 400 == 0 || year % 4 == 0 && year % 100 == 0) {
					day = 29;
				} else {
					day = 28;
				}
			}
			d = d + day;
		}
		System.out.println(d);
	}
}

