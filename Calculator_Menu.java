import java.util.Scanner;

public class Calculator_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int choice;
        while(!quit){
            System.out.println("\n1. Sum");
            System.out.println("\n2. subtraction");
            System.out.println("\n3. division");
            System.out.println("\n4. multiplication");
            System.out.println("\n5. Exit ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\nEnter first num : ");
                    int num1 = sc.nextInt();
                    System.out.print("\nEnter second num : ");
                    int num2 = sc.nextInt();
                    int sum = num1+num2;
                    System.out.print("\nSum is "+sum);
                    break;
                case 2:
                    System.out.print("\nEnter first num : ");
                    int num3 = sc.nextInt();
                    System.out.print("\nEnter second num : ");
                    int num4 = sc.nextInt();
                    int sub = num3-num4;
                    System.out.print("\nSubtraction is "+sub);
                    break;
                case 3:
                    System.out.print("\nEnter first num : ");
                    int num5 = sc.nextInt();
                    System.out.print("\nEnter second num : ");
                    int num6 = sc.nextInt();
                    int div = num5/num6;
                    System.out.print("\nDivision is "+div);
                    break;
                case 4:
                    System.out.print("\nEnter first num : ");
                    int num7 = sc.nextInt();
                    System.out.print("\nEnter second num : ");
                    int num8 = sc.nextInt();
                    int mul = num7*num8;
                    System.out.print("\nMultiplication is "+mul);
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }
}
