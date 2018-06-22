package java50;
public class Java15 {
	public Java15(){	
	}
	public  void bj(int a,int b,int c){
		if(a>b){
			int temp;
			temp=a;
			a=b;
			b=temp;
		}if(a>c){
			int temp;
			temp=a;
			a=c;
			c=temp;
		}if(b>c){
			int temp;
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Java15 ja=new Java15();
		ja.bj(5200,172,600);
	}
}
