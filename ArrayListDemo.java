import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> arraylist=new ArrayList<String>();
        arraylist.add("Shivam");
        arraylist.add("Welcome");
        arraylist.add("to");
        arraylist.add("Sangli");
        System.out.println(arraylist);

        arraylist.add(3, "please have Samosa"); // adding string to 3rd position of array list
        System.out.println(arraylist);
        arraylist.remove("Shivam");
        arraylist.remove(3);
        System.out.println(arraylist);

        for (String str :arraylist) { // itrating arraylist
            System.out.println("\n"+str);
            
        }


        System.out.println("Length of ArryList :"+arraylist.size()); // size of ArrayList


    }
}