package week5.exceptions;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class TestExceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try");
            loop();
            loop2();
        } catch (MyException | MySecondException e) {
            e.printStackTrace();
            System.out.println("Inside catch");
        }finally {
            System.out.println("Inside finally");
        }

    }

    private static void loop() throws MyException {
        for (int i = 0; i < 100 ; i++) {

            if(i == 130){
                throw new MyException("13 is coming");
            }
            System.out.println(i);
        }
    }


    private static void loop2() throws MySecondException {
        int i = 0;
        while (i<100){
            if(i == 600){
                throw new MySecondException();
            }
            i++;
        }
    }
}
