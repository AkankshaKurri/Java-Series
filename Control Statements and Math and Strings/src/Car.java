// Har class mei toString() method by Default rehta hai.

class Car {
    int noOfWheels;
    String color;
    int maxSpeed;
    int currentFuelInLitres;
    int noOfSeats;

    Car(int noOfWheels,String color, int maxSpeed, int currentFuelInLitres, int noOfSeats){
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentFuelInLitres = currentFuelInLitres;
        this.noOfSeats = noOfSeats;
    }

    /*
 @Override
 public String toString(){
     //return super.toString();
     return "My car color is " + color;
 } */

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLitres=" + currentFuelInLitres +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    //String Builder
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Car{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", color='").append(color).append('\'');
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", currentFuelInLitres=").append(currentFuelInLitres);
//        sb.append(", noOfSeats=").append(noOfSeats);
//        sb.append('}');
//        return sb.toString();
//    }

    public static void main(String[] args) {
        Car swift = new Car(4,"Blue",120,6,5);

        //If toString method is not defined, implicitly calls toString method
        // System.out.println(swift);      //It prints "Car@8efb846" .i.e. className@hascodeCreatedByObjectValues

        //Now we have defined string method
        //System.out.println(swift);       //It prints "My car color is Blue";
        //System.out.println(swift.toString());       //It prints "My car color is Blue";

        //Now we have generated toString() method
        //System.out.println(swift);  //It prints "Car{noOfWheels=4, color='Blue', maxSpeed=120, currentFuelInLitres=6, noOfSeats=5}"
        System.out.println(swift.toString()); //It prints "Car{noOfWheels=4, color='Blue', maxSpeed=120, currentFuelInLitres=6, noOfSeats=5}"

    }
}
