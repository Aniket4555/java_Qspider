import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the num");
		int num=new Scanner(System.in).nextInt();
		findFactorial(num);

	}
	public static void findFactorial(int num){
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}
