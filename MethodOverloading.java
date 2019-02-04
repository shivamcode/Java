import java.util.*;
class Overload{ // class with method overloading 
    void returnData(int a,int b){ // method with same name 1
        if(a>b)
            System.out.println("A  is large than B");
        else
            System.out.println("B is large than A");
    }
    void returnData(int a,int b,int c){ // method with same name but diffrent parameters 2 
        if(a>b && a>c)
            System.out.println("A is larger than B & C");
        else
        {
            if(b>c && b>a)
                System.out.println("B is larger than A & C");
            else
                System.out.println("C is Larger than A & B");
        }
        
    }
    
}

public class MethodOverloading{
    public static void main(String[] args){
        Overload o=new Overload();
        o.returnData(10, 12);
        o.returnData(12, 155, 96);
    }
}