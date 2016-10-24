package week3.singleton;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class SingletonHelper {

    private SingletonHelper(){}

    private static class Helper{
        private static final SingletonHelper instance = new SingletonHelper();
    }

    public SingletonHelper getInstance(){
        return Helper.instance;
    }


}
