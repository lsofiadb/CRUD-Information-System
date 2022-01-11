package backend.agricolas.exception;

public class FarmIdNotFoundException extends RuntimeException{

    public FarmIdNotFoundException(String message) {
        super(message);
    }
}
