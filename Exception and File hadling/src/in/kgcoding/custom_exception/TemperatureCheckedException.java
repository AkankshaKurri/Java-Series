//1. Custom exceptions are user-defined exception classes that extend either Exception(for checked exceptions)
//   or RuntimeException (for unchecked exceptions).
//2. They are created to represent specific error conditions relevant to an application.

//Checked Exception (Compile-Time Exception)
//These are checked by the compiler.
//If you don’t handle them, your code won’t compile.

package in.kgcoding.custom_exception;

// This is a custom CHECKED exception
public class TemperatureCheckedException extends Exception {
    private final double temperature;

    public TemperatureCheckedException(double temperature) {
        this.temperature = temperature;
    }

    // This message is shown when exception is caught
    @Override
    public String getMessage() {
        return "Checked: Temperature (" + temperature + "C) is outside the safe range!";
    }
}