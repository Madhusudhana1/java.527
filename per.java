import java.util.*;
class per{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n,i,sum=0,x;
		n=s.nextInt();
		x=n;
		for(i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(x==sum){
			System.out.println("it is a perfect number");
		}
		else{
			System.out.println("it is not a perfect number");
		}
	}
}