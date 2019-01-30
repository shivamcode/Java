// implement file to implement interface 
class ImplementFile implements Mobile{ // implement Mobile intrface
    public void number(){
        System.out.println("+91 8007504604");
    }
    public void name(){
        System.out.println("Shivam Kagalkar");
    }
    public void place(){
        System.out.println("Sangli");
    }
    public static void main(String[] args){
        ImplementFile interfaceObj=new ImplementFile(); // class object create
        interfaceObj.number();
        interfaceObj.name();
        interfaceObj.place();
    }

}