package java50;
import java.util.Scanner;
public class Java7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�����һ���ַ���");
		String ss=sc.nextLine();//��ȡ����ֵss
		char a[]=ss.toCharArray();//��ssת��Ϊ�������ʽ
		//������ĸ���ո����ֺ������ַ��ĸ���
		int kg=0;
		int zm=0;
		int sz=0;
		int qt=0;
		for(char aa:a){//�����ж�
			if(aa==' '){
				kg++;
			}else if(aa>='a'&&aa<='z'||aa>='A'&&aa<'Z'){
				zm++;	
			}else if(aa>='0'&&aa<='9'){
				sz++;
			}else{
				qt++;
			}
		}//������
		System.out.println("��ĸ�У�"+zm+"��");
		System.out.println("�ո��У�"+kg+"��");
		System.out.println("�����У�"+sz+"��");
		System.out.println("�����ַ��У�"+qt+"��");
	}
}