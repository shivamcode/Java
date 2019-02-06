import java.util.*;
class Code{
    final int courseID=5000;
    void call(){
        System.out.println("Final INT :"+courseID);
    }
    final void reset(){
        int code=562;
    }
}
class Final{
    public static void main(String[] args){
        Code cObj=new Code();
        cObj.call();
    }
}