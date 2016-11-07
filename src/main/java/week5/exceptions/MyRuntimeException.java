package week5.exceptions;

import week2.day2.library.Run;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
