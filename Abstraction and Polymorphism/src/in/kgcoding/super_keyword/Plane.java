package in.kgcoding.super_keyword;
class Plane extends Vehicle {
 @Override
 public void start() {
  super.start();  //Calling vehicle class start method.
  System.out.println("Plane is taking off");
 }

}
