package java50;
public class deff {
	public int deff(int x,int y){
		int t;
		if(x<y){
			t=x;
			x=y;
			y=t;
		}
		while(y!=0){
			if(x==y){
				return x;
			}else{
				int k=x%y;
				x=y;
				y=k;
			}
		}
		return x;
	}
}
