package java50;
import java.util.Scanner;
public class Java25 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("������һ������");
		 long n=sc.nextLong();
		 //��longת��ΪString
		 String ss=Long.toString(n);
		 char c[]=ss.toCharArray();//��Stringת��Ϊ����c
		 boolean b=false;//�����ж�
		 for(int i=0;i<=c.length/2;i++){
			 if(c[i]==c[c.length-1-i]){
				b=true;
			 }else{
				 b=false;
				 break;
			 }
		 }
		 if(b==true){
			 System.out.println(n+"�ǻ���");
		 }else{
			 System.out.println(n+"���ǻ���");
		 }
	}
}
