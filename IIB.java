class Parent{
    Parent(){
        System.out.println("THis is message from Constructor of class Parent");
    }
    {
        System.out.println("This is instance init block of class parent");  // instance initializer block get invoked or run before constructor
    }
}
class Child extends Parent{
    Child(){
        super();
    }
    {
        System.out.println("This is Message form IIB of class Child");
    }
    
}
class IIB{
    public static void main(String[] args){
        Child cObj=new Child();
    }
}