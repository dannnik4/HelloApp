package Chapter6;

import java.io.*;

public class BufferedInputOutputStream {
    public static void main(String[] args) {

//        String text = "Hello world!";
//        byte[] buffer = text.getBytes();
//        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//
//        try(BufferedInputStream bis = new BufferedInputStream(in)){
//
//            int c;
//            while((c=bis.read())!=-1){
//
//                System.out.print((char)c);
//            }
//        }
//        catch(Exception e){
//
//            System.out.println(e.getMessage());
//        }
//        System.out.println();

        String text = "Hello world!"; // строка для записи
        try(FileOutputStream out=new FileOutputStream("notes.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
