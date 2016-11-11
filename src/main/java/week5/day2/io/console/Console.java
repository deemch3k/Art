package week5.day2.io.console;

import com.sun.deploy.util.SystemUtils;
import week5.day2.io.console.exceptions.DirectoryNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Console {

    private static String LOCATION = "D:\\"; // старт консоли
    private static File file = new File(LOCATION);
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws DirectoryNotFoundException, IOException {

        while (true) {
            System.out.println(LOCATION);
            String cmd = sc.nextLine();
            String[] cmds = parse(cmd);
            switch (cmds[0]) {
                case "ls":
                    ls();
                    break;
                case "cd":
                    cd(cmds[1]);
                    break;
                case "exit":
                    exit();
                    break;
                case "md":
                    md(cmds[1]);
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
                case "pwd":
                    System.out.println(LOCATION);
                    break;
                case "rm":
                    deleteRecursively(new File(LOCATION));
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private static String[] parse(String cmd) {
        cmd.trim();
        String[] cmds = cmd.split(" ");
        if (cmds.length == 1) {
            return new String[]{cmds[0], ""};
        }
        return cmds;
    }

    private static void help() {

        System.out.println("1. ls - Выводит на экран файлы текущей папки\n" +
                "2. cd - Смена текущей папки\n" +
                "3. exit - Остановка программы\n" +
                "4. md - Создание папки\n" +
                "5. dir - Выводит на экран все файлы папок и подпапок\n" +
                "6. cls - Очищает экран\n" +
                "7. help - Выводит на экран список команд\n" +
                "8. rm - удаляет текущую папку или файл");

    }

    private static File md(String dir) throws DirectoryNotFoundException {
        checkIsDirectory(file);
        if (dir.equals("")) {
            System.out.println("Неверный ввод названия папки");
        } else {
            File file = new File(LOCATION + "\\" + dir);
            file.mkdir();
        }
        return file;
    }

    private static void ls() {
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }

    private static void cd(String path) throws DirectoryNotFoundException {
        checkIsDirectory(file);
        if (checkFiles(path) !=  null) {
            LOCATION = LOCATION + path;
        } else if (path.equals("")) {
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
        checkIsDirectory(file);
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

    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

        public static boolean deleteRecursively(File root) {
            if(root != null && root.exists()) {
                if(root.isDirectory()) {
                    File[] children = root.listFiles();
                    if(children != null) {
                        File[] var2 = children;
                        int var3 = children.length;

                        for(int var4 = 0; var4 < var3; ++var4) {
                            File child = var2[var4];
                            deleteRecursively(child);
                        }
                    }
                }

                return root.delete();
            } else {
                return false;
            }
    }

    private static File checkFiles(String path) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().equals(path)) {
                return file1;
            }
        }
        return null;
    }

    private static boolean checkIsDirectory(File file) throws DirectoryNotFoundException {
        if (!file.isDirectory()) {
            throw new DirectoryNotFoundException();
        }
        return true;
    }

    private static boolean checkIsFile(File file) throws FileNotFoundException {
        if (!file.isFile()) {
            throw new FileNotFoundException();
        }
        return true;
    }


}
