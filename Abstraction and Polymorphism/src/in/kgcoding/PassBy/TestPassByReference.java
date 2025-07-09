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

    public static void move(Point p){
        p.x++;
        p.y++;
    }

    public static void main(String[] args) {
        Point point = new Point(5,6);
        System.out.println(point);
        move(point);
        System.out.println(point);
    }
}
