import java.util.*;
class Wrapper{
    public static void main(String[] args)
    {
        //to conver the primitive datatypes to object
        char ch='s'; // primitive dataype
        Character c=ch; // object type Autoboxing 
        ArrayList<Character> arryList=new ArrayList<Character>();
        arryList.add(c);
        System.out.println(arryList.get(0));
    }
}