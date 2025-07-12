//Unchecked Exception (Runtime Exception)
//->These are not checked by the compiler.
//->You can write the code without handling them — but they may crash at runtime.

package in.kgcoding.custom_exception;

// This is a custom UNCHECKED exception
public class TemperatureUncheckedException extends RuntimeException {
    private final double temperature;

    public TemperatureUncheckedException(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getMessage() {
        return "Unchecked: Temperature (" + temperature + "C) is outside the safe range!";
    }
}
