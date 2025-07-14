package in.kgcoding.custom_exception;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            checkTemperature(100);  // This is too high – will throw exception
        } catch (TemperatureCheckedException e) {
            System.out.println(e.getMessage());  // This will print the custom message
        }
    }

    // Declaring the method can throw a checked exception
    public static void checkTemperature(double temp) throws TemperatureCheckedException {
        if (temp < 36.5 || temp > 37.5) {
            throw new TemperatureCheckedException(temp);  // Checked exception MUST be handled or declared
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
