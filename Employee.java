class Employee {
    String empName , designation;
    int empID;

    public Employee(String empName, String designation, int empID) {
        this.empName = empName;
        this.designation = designation;
        this.empID = empID;
    }
    void employeeDetails(){
        System.out.println("Name is "+empName);
        System.out.println("ID is "+empID);
        System.out.println("Designation is "+designation);
    }
}
class emp_check{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ramu Kaka" , "Security" , 4433);
        emp1.employeeDetails();
        Employee emp2 = new Employee("DJ Raju" , "Music Director" , 4488);
        emp2.employeeDetails();
    }
}
