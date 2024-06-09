package rs.ac.singidunum;

public class StringOperations {
    public static String multiplyString(String a, int b){

        String returnValue = "";
        for (int i = 0; i < b; i++) {
            returnValue +=a;
        }
        return returnValue;
    }

    public static int CountCharacters(String a, int b){
        int counter = 0;
        for (int i = 0; i<a.length();i++) {
            if(b == a.charAt(i)){
                counter++;
            }
         }
        return  counter;
        }

        public static String reverseString(String a){
        return "";
        }

    }













