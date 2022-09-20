public class Prac_2_throw {
    static void function() throws IllegalAccessException {
        System.out.println("Inside function(). ");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String args[]) {
        try {
            function();
        } catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
    }
}
