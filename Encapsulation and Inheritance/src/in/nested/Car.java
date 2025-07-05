//nested class - Class ke andar class define kar sakte hai useh nested class bolte hai

// Outer class - public ya default ho sakti hai
// Inner class - public , protected , private , default

//nested class types ->
// 1. static(static nested classes)
// 2. non-static(inner classes)


//Static Nested Class->  Static hoti hai, aur outer class ke object ke bina access ho sakti hai.
//                   -> can access outer class's static members but not it's non-static members.
//Inner Class ->Non-static hoti hai, outer class ke object ke bina kaam nahi karti.
//             -> Associated with an instance of the outer class (iska matlab yeh hai ki "Tire class" "car class ke object" se associated hai.)
//Local Inner Class ->  Method ke andar banti hai.
//Anonymous Inner Class	-> Ek class jo bina naam ke turant create aur use hoti hai (mostly with interfaces or abstract classes).

package in.nested;

public class Car {   //Outer class

    //Property
    private int noOfDoors;

    //Behaviour or Method
    public void repair(){
        Tyre t = new Tyre();
    }

    protected class Tyre{      //Inner class
        private double width;
        private double pressure;
        private String material;

        //Method
        public void inflate(){
            noOfDoors = 4;
        }

    }


}
