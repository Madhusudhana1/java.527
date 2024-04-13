import java.util.*;
class l_tri{
	public static  void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,j,k,n;
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<2*(n-i)-1;j++){
				System.out.print(" ");
			}
			for(k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}