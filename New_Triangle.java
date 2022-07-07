class Triangle {
    int side1 , side2 , side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    void printPerimeter(){
        int peri = side1+side2+side3;
        System.out.println("Perimeter is "+peri);
    }
    void printArea(){
        int semi = (side1+side2+side3)/2;
        double area = Math.sqrt( semi*(semi-side1)*(semi-side2)*(semi-side3));
        System.out.println("Area is "+area);
    }
}
class triangle_check{
    public static void main(String[] args) {
        Triangle tr = new Triangle(3,4,5);
        tr.printPerimeter();
        tr.printArea();
    }
}
