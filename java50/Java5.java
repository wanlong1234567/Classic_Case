package java50;
import java.util.Scanner;
public class Java5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������" );
		int grade=sc.nextInt();
		 if(grade>=0&&grade<=100){ 
		 System.out.println("������ȷ��" );
		 char level = (grade >= 90) ? 'A' : (grade >= 60) ? 'B' : 'C';
			System.out.println("�ȼ�Ϊ��"+level);
		 }else{
			 System.out.println("���������������������ȷ��������");
		 }	 	 
	}
}
