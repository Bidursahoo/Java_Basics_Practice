
class Employe {
    float basicSal, da, hra, grossSal;
    int empNo;
    String empName;

    Employe(float basicSal, int empNo, String empName) {
        this.basicSal = basicSal;
        this.da = (float) ((0.20) * this.basicSal);
        this.hra = (float) ((0.10) * this.basicSal);
        this.grossSal = calGrossSal();
        this.empNo = empNo;
        this.empName = empName;
    }
    float calGrossSal(){
        float grossSal = basicSal + da + hra;
        return grossSal;
    }
    void showEmpDetails(){
        System.out.println("Employee number is "+empNo);
        System.out.println("Name is "+empName);
        System.out.println("Basic Salary is "+basicSal);
        System.out.println("DA is "+da);
        System.out.println("HRA is "+hra);
        System.out.println("Gross is "+grossSal);
    }
}
class employee_test{
    public static void main(String[] args) {
        Employe emp1 = new Employe(50000, 1 ,"Ram");
        System.out.println("First details ");
        emp1.showEmpDetails();
		System.out.println();
        Employe emp2 = new Employe(80000, 2 ,"Rajjj");
        System.out.println("Second details ");
        emp2.showEmpDetails();
    }
}
