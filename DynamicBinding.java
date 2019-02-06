class Parent{
    void print(){
        System.out.println("From Print method of class Parent");
    }
}
class Child extends Parent{
    void print(){
        System.out.println("From Print method of class Child");
    }
}
class DynamicBinding{
    public static void main(String[] args) {
        Parent p=new Parent();
        Parent c=new Child();  
        p.print();
        c.print();
        
    }
}