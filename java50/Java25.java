package java50;
import java.util.Scanner;
public class Java25 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入一个数：");
		 long n=sc.nextLong();
		 //将long转换为String
		 String ss=Long.toString(n);
		 char c[]=ss.toCharArray();//将String转换为数组c
		 boolean b=false;//进行判断
		 for(int i=0;i<=c.length/2;i++){
			 if(c[i]==c[c.length-1-i]){
				b=true;
			 }else{
				 b=false;
				 break;
			 }
		 }
		 if(b==true){
			 System.out.println(n+"是回文");
		 }else{
			 System.out.println(n+"不是回文");
		 }
	}
}
