public class Unary {
    public static void main(String[] args) {

        System.out.println("Negative operator");
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("Pre Increment plus operator");
        int a = 5;
        System.out.println(++a);
        System.out.println(a);

        System.out.println("Post Increment plus operator");
        System.out.println(a++);
        System.out.println(a);

        System.out.println("Pre Decrement minus operator");
        System.out.println(--a);
        System.out.println(a);

        System.out.println("Post Decrement minus Operator");
        System.out.println(a--);
        System.out.println(a);
    }
}
