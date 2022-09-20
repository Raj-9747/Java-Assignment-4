public class Prac_1_try_catch {
    public static void main(String[] args) {
        int x=10;
        int y=6;
        int z[] = {5,2,0};
        System.out.println("Now! Program Start \n---------------------");
        try
        {
        System.out.println("First try block");
        try
        {
        System.out.println("Second try block");
        z[3] = 50;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        System.out.println("First catch block");
        System.out.println("Error Reported By Program :- "+e);
        }
        System.out.println("First try - catch ended.\n");
        z[2] = y/0;
        }
        catch(ArithmeticException e)
        {
        System.out.println("Second catch block");
        System.out.println("Error Reported By Program : "+e);
        }
        System.out.println("---------------------\nNow! Program is Ended");
        }
       
}