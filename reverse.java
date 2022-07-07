import java.util.Scanner;
class reverse{
	public static void main(String[] args) {
        int num , rev_num = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num");
        num = sc.nextInt();
        while(num!=0){
            rem = num%10;
            rev_num = rev_num *10 +rem;
            num/=10;
        }
        System.out.println("The reverse number is "+rev_num);
    }
}