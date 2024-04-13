import java.util.*;
class pat1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,j,n;
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}