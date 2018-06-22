package java50;
public class Java20 {
	public static void main(String[] args) {
		 int x=2,y=1,t;
		 double sum=0;
		 for(int i=1;i<=20;i++){
			 sum=sum+(double)x/y;
			 t=y;//t=1,2,3
			 y=x;//y=2,3,5
			 x=y+t;//x=3,5,8
		 }
		 System.out.println("前20项相加的和："+sum);
	}
}
