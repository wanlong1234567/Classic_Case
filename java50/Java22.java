package java50;
public class Java22 {
	public static void main(String[] args) {
		 System.out.println(rec(5));
	}
	public static int rec(int a){
		long l=0;
		int n=0;
		if(a==1){
			return 1;
		}else{
			return a*rec(a-1);
		}
	}
}
