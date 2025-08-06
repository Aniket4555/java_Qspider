import java.util.Scanner;
class PrimeNumber2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number:");
		int num=new Scanner(System.in).nextInt();
		isPrime(num);
	}
	public static void isPrime(int num){
		int cnt=0;
		for(int i=1;i<=num;i++){
		if(num%i==0){
			//System.out.println();
			cnt++;
		}
		}
		System.out.println("count:"+cnt);
	}
}
