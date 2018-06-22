package java50;
//问题分析这是一个斐波纳契数列
public class Java1 {
	public static void main(String[] args){
		//已经知道一月和二月的兔子数
		int a1=1;
		int a2=1;
		int a3;
		//打印一二月的兔子数
		System.out.println("第1个月兔子的数目:"+a1);
		System.out.println("第2个月兔子的数目:"+a2);
		//从3月开始，到十二月的兔子数
		for(int i=3;i<=12;i++){
			a3=a1+a2;
			a1=a2;
			a2=a3;
			//打印3-12月的兔子数量
			System.out.print("第"+i+"个月兔子的总数为："+a3+"\t\n");
		}
	}
}
