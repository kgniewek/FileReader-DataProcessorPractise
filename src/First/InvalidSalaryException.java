package First;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException() {
    }

    public InvalidSalaryException(String message) {
        super(message);
    }
}
