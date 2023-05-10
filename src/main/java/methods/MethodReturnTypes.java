package methods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(strMeth());
        System.out.println(intMeth());
        System.out.println(boolMeth());
    }

    public static String  strMeth() {
        return "This is a string";
    }

    public static int  intMeth() {
        return 5;
    }

    public static boolean  boolMeth() {
        return true;
    }
}
