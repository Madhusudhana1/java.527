import java.util.*;
class pat7{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,j,n;
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i>0  && i<n-1 && j>0 && j<n-1){
					System.out.print(" ");
				}
				else{
					System.out.print("* ");
				}
		System.out.println();
	}	}
	
	}
}