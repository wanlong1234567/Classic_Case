package java50;
import java.util.*;
public class Java24 {
	public static void main(String[] args) {
		//�����õ���һ��ת����ȡ������.
		//����һ���ǰ����е������Ž�ȥ����ӡa.length
		Scanner s=new Scanner(System.in);
		System.out.println("������һ��������5λ������");
		int n=s.nextInt();
		int wei=0;
		int m=n;
		System.out.println("��˳���ӡ���Ϊ��");
		while(m>0){
			System.out.print(m%10);
			m=m/10;
			wei++;
		}
		System.out.println();
		System.out.println(n+"��һ��"+wei+"����");
	}
}
