import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

class FileRead{
    public static void main(String[] args)throws IOException{
        int ch;
        String filedata="";
        FileReader fr=null;
        try{
            fr=new FileReader("output.txt");
        }catch(Exception e){System.out.println("Error Message"+e);}

        while((ch=fr.read())!=-1){
            filedata=filedata+(char)ch;
        }
        fr.close();
        JOptionPane.showMessageDialog(null, "File Data :\n"+filedata);
    }
}