import java.util.Scanner;
class LeetcodeExample1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the num");
		int num=new Scanner(System.in).nextInt();
		System.out.println(reverse(num));
	}
	public static int reverse(int x) {
       
        long rev=0;
        for(;x!=0;x/=10){
            rev=rev*10+(x%10);
        }
        
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
        
    }
}
