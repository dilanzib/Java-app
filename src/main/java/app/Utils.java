package app;

public class Utils {

    public static boolean isName(String str) {
        return str.matches("\".+?\"");
    }

    public static boolean isDot(String str) {
        return str.matches("\\.([a-z]|[A-A]|[0-9])*$");
    }

}