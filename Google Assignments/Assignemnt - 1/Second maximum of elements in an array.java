import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int k=0;
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++){
		    k=(arr[N-2]);
		}
		System.out.println(k);
	}
}
