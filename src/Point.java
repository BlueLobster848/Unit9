public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*With any method, there must be a calling object
      Whoever it's calling, we call them THIS

      We also have a parameter -> Point other

      So we have two points:this, other
     */
    public double distanceTo(Point other){
        return Math.sqrt(Math.pow(this.x-other.x, 2)-Math.pow(this.y-other.y, 2));
    }

    public double area(){
        return 0;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }


}
