import java.util.Scanner;
import java.lang.Math;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ax=sc.nextInt();
	  int ay=sc.nextInt();
		int bx=sc.nextInt();
		int by=sc.nextInt();
		int cx=sc.nextInt();
		int cy=sc.nextInt();
		int area=(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
		System.out.print(Math.abs(area));
	}
}
