import java.util.*;
class rev_arr{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int temp;
		for(int i=0;i<n/2;i++){
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}	