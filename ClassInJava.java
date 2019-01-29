import java.util.*; // util package tu use Scanner class
class ClassInJava{
    int x;
    void getMethod() // method to get number
    {
        Scanner sc=new Scanner(System.in); // scanner to get input from user
        System.out.print("Enter Number :");
        x=sc.nextInt();
    }
    void printMethod() // method to create table
    {    System.out.println("________________ Table _______________");
       int i=1; 
       while(i<=10)
       { 
           System.out.println(""+x+" * "+i+" : "+(x*i));
            i++;
        }
    }
    public static void main(String[] args)
    {
        ClassInJava myObj=new ClassInJava(); // Create Object of Class 
        myObj.getMethod(); // calling methods of class using object
        myObj.printMethod();
    }
}