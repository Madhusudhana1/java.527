import java.util.*;
class vow{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter string : ");
		str=s.nextLine();
		int vowels=0;
		System.out.print("vowels are : ");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowels++;
				System.out.println(" "+ch+" ");
			}
			
		}
		System.out.println("total vowels "+vowels);
	}
}