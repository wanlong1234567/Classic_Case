package java50;
public class Java18 {
	public static void main(String[] args) {
		 char j[]={'a','b','c'};
		 char y[]={'x','y','z'};
		 for(int i=0;i<j.length;i++){
			 for(int k=0;k<y.length;k++){
				 if(j[i]=='a'&&y[k]=='x'){
					continue; 
				 }else if(j[i]=='c'&&y[k]=='x'||j[i]=='c'&&y[k]=='z'){
					 continue; 
				 }else if(j[i]=='a'&&y[k]=='y'||j[i]=='b'&&y[k]=='z'||j[i]=='b'&&y[k]=='y'){
					 continue;
				 }else{
					 System.out.println(j[i]+" vs "+y[k]);
				 }
			 }
		 }
	}
}
