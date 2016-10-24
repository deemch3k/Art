package week2.day2.library;

import org.junit.*;
import week2.day2.library.enums.Genre;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;
import week2.day2.library.model.*;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 17.10.2016.
 */
public class ReaderTest {

    private static ArrayList<PeriodicalIssue> issues;
    private static Reader reader;


    @Before
    public void init() {
        issues = new ArrayList<>();
        reader = new Reader("Dima");
    }

    @After
    public void tearDown() {
        issues = null;
        reader = null;
    }

    @Test
    public void getIssuesTest() throws Exception {

        issues.add(new Book("Name", "Artur", 1999, Genre.ACTION));
        issues.add(new Encyclopedia("Name2", "Nikolay", 1299, Genre.SCIENCE));

        reader.addPeriodicalIssues(issues);

        String actual = "Name";
        String expected = reader.getIssues().get(0).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = MoreThanMaxAmountOfPeriodicalIssuesException.class)
    public void getIssuesIfMaxCountOfIssuesMoreThanAllowed() throws MoreThanMaxAmountOfPeriodicalIssuesException {

        issues.add(new Book("Name", "Artur", 1999, Genre.ACTION));
        issues.add(new Encyclopedia("Name2", "Nikolay", 1299, Genre.SCIENCE));
        issues.add(new Encyclopedia("Name3", "Nikolay", 1279, Genre.SCIENCE));
        issues.add(new Encyclopedia("Name4", "Nikolay", 1259, Genre.SCIENCE));

        reader.addPeriodicalIssues(issues);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getIssuesIfIssuesIsEmpty() {

        reader.getIssues().get(0);

    }


    @Test
    public void addPeriodicalIssueTest() throws Exception {

        reader.addPeriodicalIssue(new Book("SomeName", "Kevin", 2011, Genre.SCIENCE));
        reader.addPeriodicalIssue(new Journal("SomeName1", "John", 2001, Genre.SCIENCE));

        int actual = reader.getAmountOfIssues();
        int expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = MoreThanMaxAmountOfPeriodicalIssuesException.class)
    public void addPeriodicalIssueIfIssuesMoreThanAllowed() throws MoreThanMaxAmountOfPeriodicalIssuesException {

        reader.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));
        reader.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));
        reader.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));
        reader.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));

    }

    @Test
    public void getCountOfIssuesTest() throws Exception {

        reader.addPeriodicalIssue(new Encyclopedia("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));
        reader.addPeriodicalIssue(new Encyclopedia("SomeName", "SomeAuthorName", 1999, Genre.SCIENCE));

        int expected = 2;
        int actual = reader.getAmountOfIssues();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCountOfIssuesIfCountEqualsZero() {

        int actual = reader.getAmountOfIssues();
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isBlackListTest() throws Exception {

        reader.setBlackList(true);

        Assert.assertTrue(reader.isBlackList());

    }

    @Test
    public void giveIssueIfReaderIsBlackList() throws MoreThanMaxAmountOfPeriodicalIssuesException {

        reader.setBlackList(true);

        Assert.assertFalse(reader.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1022, Genre.SCIENCE)));

    }
}
