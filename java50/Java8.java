package java50;
import java.util.Scanner;
public class Java8{
	public static void main(String[] args){
		int a,b=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("��������a��ֵ��");
		a=sc.nextInt();
		System.out.print("������ӵ�������");
		int n=sc.nextInt();
		int i=0;
		while(i<n){
			b=b+a;
			sum=sum+b;
			a=a*10;
			++i;
		}
		System.out.println(sum);
	}
}
 