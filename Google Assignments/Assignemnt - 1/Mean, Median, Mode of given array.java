import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<N;i++){
			sum+=arr[i];
		}
		System.out.println(((double)sum)/((double)N));
		Arrays.sort(arr);
		if (N%2!= 0){
			System.out.println((double)arr[N/2]);
		}else{
		    System.out.println((double)(arr[(N-1)/2]+arr[N/2])/2.0);
		}
		int maxValue=0,maxCount=0;

        for(int i=0;i<N;i++) {
            int count=0;
            for(int j=0;j<N;j++) {
                if(arr[j]==arr[i]){
                    count++;
                }if(count>maxCount){
                    maxCount=count;
                    maxValue=arr[i];
                }
            }
        }    
        System.out.println(maxValue);
	}
}
		


