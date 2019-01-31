class TypeCastOBJ
{ 
    public static void main(String[] args) 
    { 
        double d = 23.05;  
          
        //explicit type casting 
        long l = (long)d; 
          
        //explicit type casting  
        int i = (int)l;  
        System.out.println("Double value "+d); 
          
        //fractional part removed
        System.out.println("Long value "+l);  
          
        //fractional part removed
        System.out.println("Int value "+i);  
    }  
} 