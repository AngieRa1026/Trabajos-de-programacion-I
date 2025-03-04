public class Logicos {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 5;
        byte c = 20;

        System.out.println("a > b && b < c: " + (a > b && b < c)); // true
        System.out.println("a < b || b > c: " + (a < b || b > c)); // false
        System.out.println("!(a > b): " + !(a > b)); // false
    }
}