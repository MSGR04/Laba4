package exceptions;
// this is checked error
public class NoAction extends RuntimeException{
    private final String error;
    public NoAction(){
        this.error = "Incorrect input data when using the method doAction, instead null use \"\"";
    }
    @Override
    public String getMessage() {
        return error;
    }
}