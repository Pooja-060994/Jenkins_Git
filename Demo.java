
public class Demo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int num=1,l=0;
			for(int j=1;j<=i+1;j++) {
				if(j==1) {
					l =i+j;
					System.out.print(l);
					
				}else {
					l=l+5;
					System.out.print(l);
				}
				
				
			}
			System.out.println("");
		}

	}

}
