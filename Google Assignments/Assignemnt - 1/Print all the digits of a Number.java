import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
        String number=Integer.toString(N);
        for (int i=0;i<number.length();i++){
            System.out.print(number.charAt(i)+" ");
        }
    }
}
