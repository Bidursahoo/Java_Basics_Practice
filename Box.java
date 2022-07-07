import java.util.Scanner;

class Box {
    int height , depth , width;

    public Box(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }
    double getVolume(){
        double vol = (double) height*depth*width;
        return vol;
    }
}
class box_check{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the parameters ");
        int h = sc.nextInt();
        int w = sc.nextInt();
        int b = sc.nextInt();
        Box bx = new Box(h , w , b);
        System.out.println("Volume is "+bx.getVolume());
    }
}
