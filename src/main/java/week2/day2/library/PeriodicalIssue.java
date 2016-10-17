package week2.day2.library;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public abstract class PeriodicalIssue{

    private String name;
    private String AuthorName;
    private int year;

    public PeriodicalIssue(String name, String authorName, int year){
        this.name = name;
        AuthorName = authorName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PeriodicalIssue{");
        sb.append("name='").append(name).append('\'');
        sb.append(", AuthorName='").append(AuthorName).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeriodicalIssue that = (PeriodicalIssue) o;

        if (year != that.year) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return AuthorName != null ? AuthorName.equals(that.AuthorName) : that.AuthorName == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (AuthorName != null ? AuthorName.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
