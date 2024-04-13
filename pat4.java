import java.util.*;
class pat4{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,j,n;
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<2*i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*(n-i)-1;k++){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}