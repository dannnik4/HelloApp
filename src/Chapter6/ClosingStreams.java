package Chapter6;

import java.io.FileInputStream;
import java.io.IOException;

public class ClosingStreams {
    public static void main(String[] args) {

//        FileInputStream fin=null;
//        try
//        {
//            fin = new FileInputStream("C://SomeDir//notes.txt");
//
//            int i=-1;
//            while((i=fin.read())!=-1){
//
//                System.out.print((char)i);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//        finally{
//
//            try{
//
//                if(fin!=null)
//                    fin.close();
//            }
//            catch(IOException ex){
//
//                System.out.println(ex.getMessage());
//            }
//        }

        try(FileInputStream fin=new FileInputStream("C://SomeDir//notes.txt"))
        {
            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

//    try(FileInputStream fin=new FileInputStream("C://SomeDir//Hello.txt");
//    FileOutputStream fos = new FileOutputStream("C://SomeDir//Hello2.txt"))
//    {
//        //..................
//    }
}
