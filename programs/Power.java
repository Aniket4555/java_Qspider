import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");
		int num=new Scanner(System.in).nextInt();
		isPower(num);
	}
	public static void isPower(int num){
		int pow=1;
		for(int i=1;i<=num;i++){
			pow *=num;
		}
		System.out.println(num+" = "+pow);
	}
}
