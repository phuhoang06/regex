import java.util.regex.*;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy kiểm tra số điện thoại hợp lệ
        String pattern = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return Pattern.matches(pattern, phoneNumber);
    }

    public static void main(String[] args) {
        // Các ví dụ kiểm tra
        System.out.println(isValidPhoneNumber("(84)-(0978489648)")); // true
        System.out.println(isValidPhoneNumber("(84)-(22222222)"));   // false
        System.out.println(isValidPhoneNumber("(84)-(22b222222)"));  // false
        System.out.println(isValidPhoneNumber("(84)-(9978489648)")); // true
    }
}
