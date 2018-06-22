package java50;
import java.util.Scanner;
public class Java39 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数n:");
		int n=sc.nextInt();
		System.out.println("相应的数列的和为："+sum(n));
	}
	public static double sum(int n){
		double res=0;
		if(n%2==0){
			for(int i=2;i<=n;i+=2){
				res+=(double)1/i;
			}
		}else{
			for(int i=1;i<=n;i+=2){
				res+=(double)1/i;
			}
		}
		return res;
	}

}
