package rs.ac.singidunum;

public class Theatre {

    public static final int capacity = 250;

    /**
     *
     * this method returns the percentage of discount
     *  up to 5 tickets, 0% discount.
     *  more than 5 tickets, up to 10 tickets, 5% discount
     *  more than 10 tickets, 10% discount
        System should reject any illegal number of tickets with illegal argument exception

     */

    public static int calculateDiscount(int numTickets) throws  IllegalArgumentException{
        int discount;
        if (numTickets < 0 || numTickets > capacity) throw  new IllegalArgumentException("Must be beetwen 1 and 250");
        if (numTickets <= 5){
            discount = 0;
        }
        else if (numTickets < 10){
            discount = 5;
        }
        else{
            discount = 10;
        }
        return discount;
    }

    /*
       Three types of seats
       a - the most expensive, 1000 rsd,
       b - economic, 700 rsd,
       c - cheapest, 500 rsd

       illegal input will throw an exception
     */
    public static double getPrice(char x) throws IllegalArgumentException{
        double price;
        switch (x){
            case 'a':
                price = 1000;
                break;
            case 'b':
                price = 700;
                break;
            case 'c':
                price = 500;
                break;
            default:
                throw new IllegalArgumentException("Wrong type of seat");
        }
    return price;
    }

    /*
    Coupons - 10 characters
    It allows discount for ticket
     */

    public static boolean checkCoupon(String coupon){
        if(coupon.length() != 10) {
            return false;
        }else
            return true;
    }


}
