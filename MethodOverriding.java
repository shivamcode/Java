class Host{
    void setMessage(){System.out.println("You Are on host");}
}
class Client extends Host{
    void setMessage(){System.out.println("You are at Clients");}
}
public class MethodOverriding{
    public static void main(String[] args){
        Host hObj=new Host();
        hObj.setMessage();
        Host cObj=new Client();
        cObj.setMessage();
    }

}
