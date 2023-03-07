import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> shapes = new ArrayList<>();
        shapes.add(new Point(4,5));
        shapes.add(new Point(8,2));
        shapes.add(new Circle(6,5,2));
        shapes.add(new Circle(4,7,4));
        shapes.add(new Sphere(4,5, 9));
        shapes.add(new Sphere(9,2, 2));

        for(Point p: shapes){
            System.out.println(p.area());
        }
    }
}