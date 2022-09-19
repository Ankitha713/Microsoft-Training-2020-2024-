import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=X&&i<=Y;i++){
            if(X%i==0&&Y%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
