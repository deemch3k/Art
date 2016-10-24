package week2.day2.library.config;

import week2.day2.library.dao.IssueDAO;
import week2.day2.library.dao.ReaderDAO;
import week2.day2.library.database.LibraryDB;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class ApplicationContext {

    private ReaderDAO readerDAO = new ReaderDAO();
    private IssueDAO issueDAO = new IssueDAO();
    private static ApplicationContext instance;

    private ApplicationContext(){}

    public static ApplicationContext getInstance() {
        if(instance == null){
            synchronized (ApplicationContext.class){
                if(instance == null){
                    instance = new ApplicationContext();
                }
            }
        }
        return instance;
    }

    public ReaderDAO getReaderDAO() {
        return readerDAO;
    }

    public IssueDAO getIssueDAO() {
        return issueDAO;
    }
}
