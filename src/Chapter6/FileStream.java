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

//        try(FileInputStream fin=new FileInputStream("notes.txt"))
//        {
//            int i;
//            while((i=fin.read())!=-1){
//
//                System.out.print((char)i);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

//        try(FileInputStream fin=new FileInputStream("notes.txt"))
//        {
//            byte[] buffer = new byte[256];
//            System.out.println("File data:");
//
//            int count;
//            while((count=fin.read(buffer))!=-1){
//
//                for(int i=0; i<count;i++){
//
//                    System.out.print((char)buffer[i]);
//                }
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

        try(FileInputStream fin=new FileInputStream("notes.txt");
            FileOutputStream fos=new FileOutputStream("notes_new.txt"))
        {
            byte[] buffer = new byte[256];

            int count;
            // считываем буфер
            while((count=fin.read(buffer))!=-1){

                // записываем из буфера в файл
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}