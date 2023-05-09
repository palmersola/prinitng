public class Casting {


    public static void main(String[] args) {
        double num1 = 112.35;
        int num2 = (int)num1;
        System.out.println("Double: " + num1);
        System.out.println("int: " + num2);

        String num3 = "49";
        int num4 = Integer.parseInt(num3);
        System.out.println("The sting value is: " + num3);
        System.out.println("The integer value is: " + num4);
    }
}
