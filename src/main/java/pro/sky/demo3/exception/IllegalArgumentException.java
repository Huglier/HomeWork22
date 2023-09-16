package pro.sky.demo3.exception;

public class IllegalArgumentException extends RuntimeException{
    public IllegalArgumentException(){
    }

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
