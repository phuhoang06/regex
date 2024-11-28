import java.util.regex.*;

public class ClassNameValidator {

    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy kiểm tra tính hợp lệ
        String pattern = "^[CAP]\\d{4}[GHIK]$";
        return Pattern.matches(pattern, className);
    }

    public static void main(String[] args) {
        // Kiểm tra các ví dụ
        System.out.println(isValidClassName("C0223G")); // true
        System.out.println(isValidClassName("A0323K")); // true
        System.out.println(isValidClassName("M0318G")); // false
        System.out.println(isValidClassName("P0323A")); // false
    }
}
