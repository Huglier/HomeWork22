package pro.sky.demo3.exception;

public class ZeroDivideException extends RuntimeException{
public ZeroDivideException(){

}

    public ZeroDivideException(String message) {
        super(message);
    }

    public ZeroDivideException(String message, Throwable cause) {
        super(message, cause);
    }
}
