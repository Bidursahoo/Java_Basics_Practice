class Rectangle {
    int length , width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea(){
        int area = length*width;
        return area;
    }
}
class rectangle_check{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4,5);
        System.out.println("Area of first rectangle "+rec1.getArea());
        Rectangle rec2 = new Rectangle(5,8);
        System.out.println("Area of second rectangle "+rec2.getArea());
    }
}
