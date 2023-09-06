package Chapter6;

import java.io.File;

public class ClassFile {
    public static void main(String[] args) {
//        // определяем объект для каталога
//        File dir = new File("C://SomeDir");
//        // если объект представляет каталог
//        if (dir.isDirectory()) {
//            // получаем все вложенные объекты в каталоге
//            for (File item : dir.listFiles()) {
//
//                if (item.isDirectory()) {
//
//                    System.out.println(item.getName() + "  \t folder");
//                } else {
//
//                    System.out.println(item.getName() + "\t file");
//                }
//            }
//        }

        // определяем объект для каталога
        File dir = new File("C://SomeDir//NewDir");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        // переименуем каталог
        File newDir = new File("C://SomeDir//NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");
    }
}