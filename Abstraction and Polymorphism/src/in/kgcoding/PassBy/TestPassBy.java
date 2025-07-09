//Variable Pass By Value:
//-> Java's Default method
//-> Copies argument's value to function's parameter.
//-> Changes in function don't affect original variable.

//Primitive Types:
//-> Always passed by value.
//-> In-function changes don't impact originals.

package in.kgcoding.PassBy;

public class TestPassBy {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x,y);
        System.out.printf("x=%d, y=%d , Sum=%d\n",x,y,sum);
    }

    public static int add(int a , int b){
        System.out.printf("a=%d, b=%d\n",a,b);
        a+=b;
        return a;
    }
}
