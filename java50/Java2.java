package java50;
public class Java2 {
	public static void main(String[] args) {
		//素数是它除以2到sqr本身的数，没有能够整除他的 
		int count=0;
		for(int i=101;i<200;i+=2){
			boolean b=false;
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;
				}else{
					b=true;
				}
			}
			if(b==true){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("素数的个数为："+count);  
	}
}
