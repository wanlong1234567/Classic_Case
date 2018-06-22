package java50;
import java.util.Scanner;
public class Java5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：" );
		int grade=sc.nextInt();
		 if(grade>=0&&grade<=100){ 
		 System.out.println("输入正确！" );
		 char level = (grade >= 90) ? 'A' : (grade >= 60) ? 'B' : 'C';
			System.out.println("等级为："+level);
		 }else{
			 System.out.println("您输入错误，请重新输入正确的整数！");
		 }	 	 
	}
}
