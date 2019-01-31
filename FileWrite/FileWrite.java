import java.io.*;
import javax.swing.*;
class FileWrite{
    public static void main(String[] args)throws IOException{
        String filedata=JOptionPane.showInputDialog(null, "Enter Data For File");
        FileWriter fw=new FileWriter("output.txt");
        for(int i=0;i<filedata.length();i++){
            fw.write(filedata.charAt(i));
        }
        System.out.println("File Data is Written Successfully");
        fw.close();
    }
}