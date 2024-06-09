package rs.ac.singidunum;

public class Bank {
/**
 *
 *  0-100 kamata 3%
 *  100 - 1000 kamata 5%
 *  1000+ kamata 7%
 */

 public static double getInterestRate(double amount) throws IllegalArgumentException{
     // greska ovde, 0 treba da bude nelegalna vrednost!
     if (amount < 0) throw  new IllegalArgumentException();
     if (amount <= 100){
         return 3;
     } else if (amount <= 1000) {
            return 5;
     }else {
         return 7;
     }
 }





}
