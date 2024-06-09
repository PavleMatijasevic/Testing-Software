package rs.ac.singidunum;

public class PrimeNumbers {
    // prosti brojevi 2, 3, 5, 7, 11, ...
    public boolean validate(Integer number){
        for(int i = 2; i<number/2; i++){
            if(number % 2 == 0){
                return false;
            }
        }
        return true;
    }


}
