public class hello {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b; // Corrected the subtraction logic
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition of a = " + a + " and b = " + b + " is " + add(a, b));
        System.out.println("Subtraction of a = " + a + " and b = " + b + " is " + subtract(a, b));
    }
}
