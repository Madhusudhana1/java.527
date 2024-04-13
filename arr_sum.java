import java.util.*;
class arr_sum{
	public static void main(String[] args){
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the "+n+" Elements ");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum is "+sum);
	}
}