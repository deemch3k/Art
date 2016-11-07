package week5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class TestTryWithResources {

    public static void main(String[] args) {


        try(Scanner sc = new Scanner(System.in)) {
            sc.nextInt();
        }catch (InputMismatchException e){
            // NOPE
        }


    }

}
