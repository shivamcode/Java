import java.util.*;
class DateOperations{
    public static void main(String[] args){
        Date date1 = new Date(); // Object Stores Todays Date
        System.out.println("Todays Date :"+date1);

        Date date2 =  new Date(3917,11,27);
        System.out.println("Get time "+date1.getTime()); // to print milliseconds
        System.out.println("Is Date 1 Comes After Date 2 :"+date1.after(date2)); // is date object is after
 
        System.out.println("Is Date 1 Comes Before Date 2 :"+date1.before(date2)); // is date object is before 
    }
}