package week5.day2.io.console;

import week5.day2.io.console.exceptions.DirectoryNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Console {

    private static String LOCATION = "D:\\"; // старт консоли
    private static File file = new File(LOCATION);
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws DirectoryNotFoundException {

        while (true) {
            System.out.println(LOCATION);
            String cmd = sc.nextLine();
            switch (cmd) {
                case "ls":
                    ls();
                    break;
                case "cd":
                    cd();
                    break;
                case "exit":
                    exit();
                    break;
                case "md":
                    md();
                    break;
                case "dir":
                    dir(LOCATION);
                    break;
                case "cls":
                    clear();
                    break;
                case "help":
                    help();
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private static void help() {

        System.out.println("1. ls - Выводит на экран файлы текущей папки\n" +
                "2. cd - Смена текущей папки\n" +
                "3. exit - Остановка программы\n" +
                "4. md - Создание папки\n" +
                "5. dir - Выводит на экран все файлы папок и подпапок\n" +
                "6. cls - Очищает экран\n" +
                "7. help - Выводит на экран список команд");

    }

    private static void md() throws DirectoryNotFoundException {
        System.out.println("Введите название папки");
        String dir = sc.nextLine();
        checkIsDirectory();
        new File(LOCATION + "\\" + dir).mkdir();
    }

    private static void ls() {
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }

    private static void cd() throws DirectoryNotFoundException {
        System.out.println("Введите название папки");
        String path = sc.nextLine();
        checkIsDirectory();
        if (checkFiles(path)) {
            LOCATION = LOCATION + path;
        } else if (path.equals("D:")) {
            LOCATION = "D:\\";
        } else {
            System.out.println("Такой папки нету");
        }
        file = new File(LOCATION);
    }

    private static void exit() {
        System.exit(-1);
    }

    private static void dir(String path) throws DirectoryNotFoundException {
        checkIsDirectory();
        String tag = "-";
        File fileDir = new File(path);
        File[] files = fileDir.listFiles();
        if (files != null)
            for (File f : fileDir.listFiles()) {
                if (f.isFile()) {
                    System.out.println(tag + f.getName());
                } else if (f.isDirectory()) {
                    dir(f.getAbsolutePath());
                    tag = tag + "-";
                }
            }
    }

    public static void clear(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static boolean checkFiles(String path) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().equals(path)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIsDirectory() throws DirectoryNotFoundException {
        if (!file.isDirectory()) {
            throw new DirectoryNotFoundException();
        }
        return true;
    }

    private static boolean checkIsFile() throws FileNotFoundException {
        if (!file.isFile()) {
            throw new FileNotFoundException();
        }
        return true;
    }


}
