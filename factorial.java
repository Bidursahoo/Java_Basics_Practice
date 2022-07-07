import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1 , n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num");
        n = sc.nextInt();
        while(n!=1){
            fact = fact*n;
            n-=1;
        }
        System.out.print("factorial "+fact);
    }
}
