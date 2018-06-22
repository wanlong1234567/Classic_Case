package java50;
import java.util.*;
public class Java24 {
	public static void main(String[] args) {
		//这里用的是一种转换，取余数发.
		//还有一种是把所有的数都放进去，打印a.length
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个不多于5位的数：");
		int n=s.nextInt();
		int wei=0;
		int m=n;
		System.out.println("逆顺序打印结果为：");
		while(m>0){
			System.out.print(m%10);
			m=m/10;
			wei++;
		}
		System.out.println();
		System.out.println(n+"是一个"+wei+"数。");
	}
}
