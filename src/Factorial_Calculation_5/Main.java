
package Factorial_Calculation_5;

public class Main {

    public static void main(String[] args) {
    int num = 5;
    long factorial = 1L;

        for(int i = 1; i <= num; ++i) {
            factorial *= (long)i;
        }

        System.out.println("Factorial: " + factorial);
    }
    
}
