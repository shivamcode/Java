
class Jumbo{
}
class Bakhtawar extends Jumbo{

}
class Pride{
    Jumbo war(){
        System.out.println("War has been win");
        return new Jumbo();
    }

}
class Power extends Pride{
        Bakhtawar war(){
            System.out.println("War has been lost");
            return new Bakhtawar();
        }    
}
public class Covarient{
    public static void main(String[] args){
        Pride pObj=new Pride();
        pObj.war();
        Power pwObj=new Power();
        pwObj.war();
    }
}