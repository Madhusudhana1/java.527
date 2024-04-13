import java.util.*;
class ArrSum_BE{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=7,sum=0;
		int arr[]={1,2,3,4,5,6};
		for(int i=0;i<n;i++){
			try{
				sum=sum+arr[i];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index out of bounds expection occured at "+i);
				e.printStackTrace();
				break;
			}
		}
		System.out.println("Sum of first "+n+" is "+sum);
	}
}