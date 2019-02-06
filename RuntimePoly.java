class A{
    void method(){
        System.out.println("Method 1");
    }
}
class B extends A{
    void method(){
        System.out.println("Method 2 ");
    }
}
class C extends A{
    void method(){
        System.out.println("Method 3");
    }
}
class RuntimePoly{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A refObj;
        refObj=a;
        refObj.method();
        refObj=b;
        refObj.method();
        refObj=c;
        refObj.method();
    }
}