package java50;
import java.util.Scanner;
public class Java6{
	public static void main(String[] args){
		int a,b,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		a=sc.nextInt();
		System.out.println("请再输入一个整数：");
		b=sc.nextInt();
		deff cd=new deff();
		m=cd.deff(a,b);
		int n=a*b/m;
		System.out.println("最大公约数："+m);
		System.out.println("最小公倍数："+n);
	}
}
