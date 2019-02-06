import java.util.*;

//super keyword with veriables 
class Games{
    int id=10203;
}
class GamesCommunity extends Games{
    int id=6358;
    void print(){
        System.out.println("ID Of Games Community  :"+id);
        System.out.println("ID of Games :"+super.id);
    }
}
// Super keyword on methods
class LightBoard{
    String electric(){
        String ss="Light Board Works with electricity";
        return ss;
    }
}
class Bulb extends LightBoard{
    String electric(){
        String ss="Bulbs Mounted on Light Boards";
        return ss;
    }
    void display(){
        System.out.println("Message: "+super.electric());
        System.out.println("Message :"+electric());
    }
}

// super for constructor

class Hord{
    Hord(){
        System.out.println("For The HORD !");
    }
}
class Alliance extends Hord{
    Alliance(){
        super();
        String ss="For The Allance !";
        System.out.println("What is your class ? >"+ss);
    }
}

class SuperUse{
    public static void main(String[] args){
        GamesCommunity gObj=new GamesCommunity();
        gObj.print();

        Bulb bObj=new Bulb();
        bObj.display();

        Alliance aobj=new Alliance();
    }
}
