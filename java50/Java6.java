package java50;
import java.util.Scanner;
public class Java6{
	public static void main(String[] args){
		int a,b,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		a=sc.nextInt();
		System.out.println("��������һ��������");
		b=sc.nextInt();
		deff cd=new deff();
		m=cd.deff(a,b);
		int n=a*b/m;
		System.out.println("���Լ����"+m);
		System.out.println("��С��������"+n);
	}
}
