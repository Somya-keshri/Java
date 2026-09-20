package code;

// Custom exception class for handling stack-related errors
public class StackException extends Exception{

    // Constructor of StackException, receives an error message as a String
    public StackException(String message) {

        // Calls the constructor of the parent Exception class
        // and passes the error message to it
        super(message);
    }
}
