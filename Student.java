import java.util.Scanner;

class Student {
    int regNo;
    String stdName , branch;
    double cgpa;
    Scanner sc = new Scanner(System.in);

    public Student(int regNo, String stdName, String branch, double cgpa) {
        this.regNo = regNo;
        this.stdName = stdName;
        this.branch = branch;
        this.cgpa = cgpa;
    }
    public Student() {
        this.regNo = -1;
        this.stdName = "Null";
        this.branch = "Null";
        this.cgpa = 0.00;
    }
    void inputDetails(){
        System.out.print("Enter Name ");
        this.stdName = sc.nextLine();
        System.out.print("Enter branch ");
        this.branch = sc.nextLine();
        System.out.print("Enter registration number ");
        this.regNo = sc.nextInt();
        System.out.print("Enter CGPA  ");
        this.cgpa = sc.nextDouble();
    }
    void viewDetails(){
        System.out.println("Name "+stdName);
        System.out.println("Branch "+branch);
        System.out.println("Registration no. "+regNo);
        System.out.println("CGPA "+cgpa);
    }
}
class student_check{
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println("For default Constructor ");
        System.out.println();
        std1.inputDetails();
        std1.viewDetails();
        Student std2 = new Student(112233,"Alex" , "CST" , 9.22);
        System.out.println("For First parameterised Constructor ");
        System.out.println();
        std2.viewDetails();
        Student std3 = new Student(665577,"Brat" , "CST" , 8.45);
        System.out.println("For Second parameterised Constructor ");
        System.out.println();
    }
}
