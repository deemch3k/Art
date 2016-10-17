package week2.day2.library;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import week2.day2.library.exceptions.AuthorIsNullException;
import week2.day2.library.exceptions.IncorrectCriterionSortException;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;
import week2.day2.library.exceptions.NameIsNullException;

import java.time.Period;

/**
 * Created by Дмитрий on 17.10.2016.
 */
public class LibraryTest {

    @Before
    public void init() {

        library = new Library("National Library #1");

    }

    private static Library library;

    @After
    public void tearDown() {

        library = null;

    }


    @Test
    public void getReadersTest() {

        Reader andry = new Reader("Andry");

        library.addReader(new Reader("Kevin"));
        library.addReader(andry);

        Reader actual = library.getReaders().get(0);

        Assert.assertEquals(andry, actual);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getReadersIfListIsEmpty() {

        library.getReaders().get(0);

    }

    @Test
    public void getIssuesViaSortByNameTest() throws IncorrectCriterionSortException {

        PeriodicalIssue expected = new Book("AName", "SomeAuthorName", 1999);

        library.addPeriodicalIssue(new Book("CName", "SomeAuthorName", 1999));
        library.addPeriodicalIssue(new Encyclopedia("BName", "SomeAuthorName", 1999));
        library.addPeriodicalIssue(expected);

        PeriodicalIssue actual = library.getIssues("name").get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIssuesViaSortByYearTest() throws IncorrectCriterionSortException {

        PeriodicalIssue expected = new Encyclopedia("SomeName", "SomeAuthorName", 1009);

        library.addPeriodicalIssue(new Book("SomeName1", "SomeAuthorName1", 2001));
        library.addPeriodicalIssue(new Journal("SomeName2", "SomeAuthorName2", 1999));
        library.addPeriodicalIssue(expected);

        PeriodicalIssue actual = library.getIssues("year").get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIssuesViaSortByAuthorNameTest() throws IncorrectCriterionSortException {

        PeriodicalIssue expected = new Journal("SomeName", "AAuthorName", 1999);

        library.addPeriodicalIssue(new Book("SomeName", "BAuthorName", 1992));
        library.addPeriodicalIssue(new Book("SomeName", "CAuthorName", 1962));
        library.addPeriodicalIssue(expected);

        PeriodicalIssue actual = library.getIssues("author").get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IncorrectCriterionSortException.class)
    public void getIssuesIfIncorrectCriterionSortTest() throws Exception {

        library.getIssues("test");

    }


    @Test
    public void addReaderTest() {

        library.addReader(new Reader("Dima"));
        library.addReader(new Reader("Igor"));
        library.addReader(new Reader("Vlad"));

        int expected = 3;
        int actual = library.amountOfReaders();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addReaderIfNullTest() throws Exception {

        Assert.assertFalse(library.addReader(null));

    }

    @Test
    public void addPeriodicalIssueTest() {

        library.addPeriodicalIssue(new Journal("SomeName", "SomeAuthorName", 1999));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1999));
        library.addPeriodicalIssue(new Encyclopedia("SomeName", "SomeAuthorName", 1999));

        int expected = 3;
        int actual = library.amountOfPeriodicalIssues();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addPeriodicalIssueIfNull() throws Exception {

        Assert.assertFalse(library.addPeriodicalIssue(null));

    }

    @Test
    public void getAllIssuesThatHaveReadersTest() throws MoreThanMaxAmountOfPeriodicalIssuesException {

        Reader r1 = new Reader("Kevin");
        Reader r2 = new Reader("Mike");

        r1.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1099));
        r2.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1099));
        r2.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1099));

        library.addReader(r1);
        library.addReader(r2);

        int expected = library.getAllIssuesThatHaveReaders().size();
        int actual = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIssuesByAuthorTest() throws AuthorIsNullException {

        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1299));
        library.addPeriodicalIssue(new Book("SomeName", "Dima", 2006));
        library.addPeriodicalIssue(new Journal("SomeName", "Alex", 2016));

        int actual = library.getPeriodicalIssuesByAuthor("Alex").size();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = AuthorIsNullException.class)
    public void getIssuesByAuthorIfNullTest() throws Exception {

        library.getPeriodicalIssuesByAuthor(null);

    }

    @Test
    public void getPeriodicalIssueByNameTest() throws NameIsNullException {

        library.addPeriodicalIssue(new Book("SomeName1", "SomeAuthorName", 1899));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1899));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1899));

        int expected = 2;
        int actual = library.getPeriodicalIssuesByName("SomeName").size();

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = NameIsNullException.class)
    public void getPeriodicalIssueByNameIfNullTest() throws NameIsNullException {

        library.getPeriodicalIssuesByName(null);

    }

    @Test
    public void getPeriodicalIssueByYearTest() {

        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1799));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1699));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1799));

        int expected = 2;
        int actual = library.getPeriodicalIssuesByYear(1799).size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIssuesByYearTest() {

        PeriodicalIssue expected = new Book("SomeName", "SomeAuthorName", 1299);

        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1800));
        library.addPeriodicalIssue(expected);
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1899));

        PeriodicalIssue actual = library.getPeriodicalIssuesByYear(1299).get(0);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPeriodicalIssuesByYearViaSortTest(){

        PeriodicalIssue expected = new Book("BSomeName", "SomeAuthorName", 1800);

        library.addPeriodicalIssue(new Book("CSomeName", "SomeAuthorName", 1800));
        library.addPeriodicalIssue(expected);
        library.addPeriodicalIssue(new Book("ASomeName", "SomeAuthorName", 1800));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1899));
        library.addPeriodicalIssue(new Book("SomeName", "SomeAuthorName", 1119));

        PeriodicalIssue actual = library.getPeriodicalIssuesByYear(1800).get(1);

        Assert.assertEquals(expected,actual);

    }


}