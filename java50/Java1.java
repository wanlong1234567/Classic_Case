package java50;
//�����������һ��쳲���������
public class Java1 {
	public static void main(String[] args){
		//�Ѿ�֪��һ�ºͶ��µ�������
		int a1=1;
		int a2=1;
		int a3;
		//��ӡһ���µ�������
		System.out.println("��1�������ӵ���Ŀ:"+a1);
		System.out.println("��2�������ӵ���Ŀ:"+a2);
		//��3�¿�ʼ����ʮ���µ�������
		for(int i=3;i<=12;i++){
			a3=a1+a2;
			a1=a2;
			a2=a3;
			//��ӡ3-12�µ���������
			System.out.print("��"+i+"�������ӵ�����Ϊ��"+a3+"\t\n");
		}
	}
}
