//Objects and References:
//-> Java passes the reference's value for objects.
//-> Modifications to objects in methods affect originals.


package in.kgcoding.PassBy;

public class TestPassByReference {
    public static class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

//  A static method move that takes a Point object as a parameter.
//  It increments both x and y values of that point.
//  Even though Java is pass-by-value, the value passed is the reference to the object, so the object itself is modified.
    public static void move(Point p){
        p.x++;
        p.y++;
    }

    public static void main(String[] args) {
        Point point = new Point(5,6);
        System.out.println(point);
//      When you call move(point), Java copies the reference (address) of the object.
//      So the method can change the object’s data (x and y).
        move(point);
        System.out.println(point);
    }
}
