import javax.xml.bind.annotation.XmlAnyAttribute;

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
