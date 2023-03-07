public class Circle extends Point {
    //fields, only new, additional fields
    protected int radius;
    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString() + " radius of " + radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
