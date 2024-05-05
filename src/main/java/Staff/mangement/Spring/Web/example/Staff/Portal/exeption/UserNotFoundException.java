package Staff.mangement.Spring.Web.example.Staff.Portal.exeption;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
