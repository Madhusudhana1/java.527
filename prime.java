import java.util.*;
class prime{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n,i,prime=0;
		System.out.println("Enter the number : ");
		n=s.nextInt();
		for(i=2;i<n;i++){
			if(n%i==0){
				System.out.println("it is not a prime number : ");
				prime=1;
				break;
			}
		}
		if(prime==0){
				System.out.println("it is prime number");
		}
	}
}