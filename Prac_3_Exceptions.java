/*   Id   : 21CE027
     Name : Fachara Raj
     Aim  : WAP that raises two exceptions. Specify two
            'catch’ clauses for the two exceptions. Each ‘catch’ block handles a different type of exception, For example the exception could be  ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.

 */
public class Prac_3_Exceptions {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int c[] = { 4, 5 };
        try {
            c[b] = c[1] / a;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic-Exception Reported By JAVA.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array-Index-Out-Of Bounds-Exception Reported By JAVA.");
        } finally {
            System.out.println("Inside Finally");
        }
    }
}
