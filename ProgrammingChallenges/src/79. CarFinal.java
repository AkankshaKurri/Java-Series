//Create an object with final fields and a constructor to initialize them

class CarFinal {
    final int fuelInLitres;
    final int noOfWheels;
    final String model;

    public CarFinal(int fuelInLitres, int noOfWheels, String model) {
        this.fuelInLitres = fuelInLitres;
        this.noOfWheels = noOfWheels;
        this.model = model;
        //this.noOfWheels++; //Error:Variable 'noOfWheels' might already have been assigned to
    }

    public static void main(String[] args) {
        CarFinal car = new CarFinal(5, 4, "Mercedes");
    }
}
