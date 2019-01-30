
abstract class Bank{ // abstract class 
    abstract int getInterestRate(); // abstract method defination
}
class SBI extends Bank{   // classes using extending methods of abstract class 
    int getInterestRate(){
        return 6;
    }
}
class SUB extends Bank{
    int getInterestRate(){
        return 8;
    }
}
class AbstractBank{  //main class 
     public static void main(String[] args)
    {
        Bank bObj; // creating object of abstract method
        bObj=new SBI();
        System.out.println("Rate of interest (SBI) :"+bObj.getInterestRate()+"%");
        bObj=new SUB();
        System.out.println("Rate of Interest (SUB) :"+bObj.getInterestRate()+"%");

    }
}