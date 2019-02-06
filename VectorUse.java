import java.util.Iterator;
import java.util.Vector;

class VectorUser{
    public static void main(String[] args){
        Vector<String> vtr=new Vector<String>();
        vtr.add("bangalore");
        vtr.add("Mysore");
        vtr.add("Amrawati");
        Iterator<String> itr=vtr.iterator();
        while(itr.hasNext()){
            System.out.println(""+itr.next());
        }
    }
}