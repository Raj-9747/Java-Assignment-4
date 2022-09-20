/*   Id   : 21CE027 
     Name : Fachara Raj
     Aim  : WAP to generate user defined exception using “throw” and “Throws” keyword.
 */
 
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
