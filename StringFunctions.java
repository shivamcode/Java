class StringFunctions{
    public static void main(String[] args){
        String string="                Welcome to Java Coding";
        System.out.println("Length of String :"+string.length()); // length method to find length of string
        string=string.concat(", you can do it fine !             "); // joining string after string using concat method
        System.out.println(""+string);
        string=string.trim(); // removes whitespace of beginning of string and end of string
        System.out.print(string);

    }
}