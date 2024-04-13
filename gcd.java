import java.util.*;
class gcd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int lcm,gcd,n1,n2,num,den,rem;
		System.out.println("Enter two numbers : ");
		n1=s.nextInt();
		n2=s.nextInt();
		num=(n1>n2)?n1:n2;
		den=(n1<n2)?n1:n2;
		rem=num%den;
		while(rem!=0){
			num=den;
			den=rem;
			rem=num%den;
		}
		gcd=den;
		lcm=n1*n2/gcd;
		System.out.println("lcm is "+lcm);
		System.out.println("gcd is "+gcd);
	}
}