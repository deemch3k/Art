package week5.day2.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class FileAccess {

    public static void main(String[] args) throws IOException {

//        File file = new File("D:\\InteligIDEAWorkSpace\\ArtCodeACO16\\src\\main\\resources\\dir1\\dir2");
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        File[] files = file.listFiles();
//
//        for (File innerFiles : files){
//            System.out.println(innerFiles.getName());
//        }
//        System.out.println(file.delete());

//
//        File file1 = new File("D:\\InteligIDEAWorkSpace\\ArtCodeACO16\\src\\main\\resources\\dir1\\plain.txt");
//
//        System.out.println(file1.isDirectory());
//
//        System.out.println(file1.createNewFile());
//        System.out.println(file1.isDirectory());

        File dir = new File("D:\\InteligIDEAWorkSpace\\ArtCodeACO16\\src\\main\\resources\\dir1\\dir3\\dir7");

        dir.mkdir();

//        dir.renameTo(new File("D:\\InteligIDEAWorkSpace\\ArtCodeACO16\\src\\main\\resources\\dir1\\dir3\\dir897"));

    }




}
