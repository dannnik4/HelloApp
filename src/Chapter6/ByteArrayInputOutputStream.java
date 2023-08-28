package Chapter6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInputOutputStream {
    public static void main(String[] args) {

//        byte[] array1 = new byte[]{1, 3, 5, 7};
//        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
//        int b;
//        while((b=byteStream1.read())!=-1){
//
//            System.out.println(b);
//        }
//
//        String text = "Hello world!";
//        byte[] array2 = text.getBytes();
//        // считываем 5 символов
//        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
//        int c;
//        while((c=byteStream2.read())!=-1){
//
//            System.out.println((char)c);
//        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try{
            baos.write(buffer);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos.toString());

        // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for(byte b: array){

            System.out.print((char)b);
        }
        System.out.println();
    }
}
