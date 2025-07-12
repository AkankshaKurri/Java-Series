//You throw this: throw new TemperatureUncheckedException(100);
//JVM internally calls: e.getMessage();  // e = the exception object
//Your overridden method returns: "Unchecked: Temperature (100.0C) is outside the safe range!"
//JVM prints this message to the console.

package in.kgcoding.custom_exception;

public class UncheckedExample {
    public static void main(String[] args) {
        // No need to handle with try-catch, but you can if you want
        checkTemperature(100);  // This will throw unchecked exception
    }

    public static void checkTemperature(double temp) {
        if (temp < 36.5 || temp > 37.5) {
            throw new TemperatureUncheckedException(temp);  // Will crash at runtime if not caught
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}