package Chapter6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamWriter {
    public static void main(String[] args) {

//        String text = "Привет мир!"; // строка для записи
//        try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes3.txt");
//            PrintStream printStream = new PrintStream(fos))
//        {
//            printStream.println(text);
//            System.out.println("Запись в файл произведена");
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

        try(PrintStream printStream = new PrintStream("notes3.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
