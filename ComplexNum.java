class ComplexNum {
    int real , imaginary;

    public ComplexNum(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    void displayCompNumber(){
        System.out.println(real+" + "+imaginary+"i");
    }
    void addCompNumber(int real , int imaginary){
        this.real = this.real +real;
        this.imaginary = this.imaginary +imaginary;
    }
}
class complex_check{
    public static void main(String[] args) {
		ComplexNum com1 = new ComplexNum(44 , 12);
        System.out.println("first complex number");
        com1.displayCompNumber();
        System.out.println();
		ComplexNum com2 = new ComplexNum(11 , 8);
        System.out.println("second complex number");
        com2.displayCompNumber();
        System.out.println();
        System.out.println("After addition");
        com1.addCompNumber(com2.real, com2.imaginary);
        com1.displayCompNumber();
	}
}