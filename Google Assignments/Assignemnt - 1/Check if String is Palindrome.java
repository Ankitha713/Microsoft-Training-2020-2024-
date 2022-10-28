import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String S=sc.nextLine();
        boolean flag = true;  
        S=S.toLowerCase(); 
        for(int i=0;i<S.length()/2;i++){  
            if(S.charAt(i)!=S.charAt(S.length()-i-1)){  
                flag=false;  
                break;  
            }  
        }  
        if(flag){  
            System.out.println("String is Palindrome");  
        }else{  
            System.out.println("String is not Palindrome"); 
	    }
	}
}
