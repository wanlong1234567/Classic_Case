package java50;
import java.util.Scanner;
public class Java7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输出一行字符：");
		String ss=sc.nextLine();//获取输入值ss
		char a[]=ss.toCharArray();//将ss转换为数组的形式
		//定义字母、空格、数字和其它字符的个数
		int kg=0;
		int zm=0;
		int sz=0;
		int qt=0;
		for(char aa:a){//进行判断
			if(aa==' '){
				kg++;
			}else if(aa>='a'&&aa<='z'||aa>='A'&&aa<'Z'){
				zm++;	
			}else if(aa>='0'&&aa<='9'){
				sz++;
			}else{
				qt++;
			}
		}//输出结果
		System.out.println("字母有："+zm+"个");
		System.out.println("空格有："+kg+"个");
		System.out.println("数字有："+sz+"个");
		System.out.println("其它字符有："+qt+"个");
	}
}