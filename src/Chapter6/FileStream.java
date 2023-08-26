package Chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
//        String text = "Hello world!"; // строка для записи
//        try (
//                FileOutputStream fos = new FileOutputStream("notes.txt")) {
//            // перевод строки в байты
//            byte[] buffer = text.getBytes();
//
//            fos.write(buffer, 0, buffer.length);
//            System.out.println("The file has been written");
//        } catch (
//                IOException ex) {
//
//            System.out.println(ex.getMessage());
//        }

        try(FileInputStream fin=new FileInputStream("notes.txt"))
        {
            int i;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}