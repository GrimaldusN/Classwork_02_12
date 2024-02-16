//public class EmailValidator {
//    public static boolean validateEmail(String email) {
//        // String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
//        // boolean c = checkEmailemailRegex;
//        return c;
//    }
//}


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}