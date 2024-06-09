package rs.ac.singidunum;

public class Calculator {


    public static int add(int a, int b){
        return a+1; // Ovde se nalazi greska, ne treba a+1 nego a+b
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b==0) throw  new ArithmeticException();
            return a / b;
    }

    public static int multiply(int a, int b){
        // nije jos implementirana
        return 0;
    }


}
