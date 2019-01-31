class ExceptionHandlling{
    static int dividebyzero(int a,int b){
        int i=a/b;
        return i;
    }
    static int result(int a,int b){
        int res=0;
        try{
            res=dividebyzero(a, b);
        }
        catch(Exception e){
            System.out.println("Exception occured :"+e);
        }
        return res;
    }
    public static void main(String[] args){
        int a=12;
        int b=0;
        try{
            int i=result(a, b);
        }catch(Exception e){
            System.out.println("Get Exception Message :"+e.getMessage());
        }
    }
}