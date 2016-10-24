package week2.day2.library.model;

import week2.day2.library.enums.Genre;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public abstract class PeriodicalIssue{

    private String name;
    private String authorName;
    private int year;
    private Genre genre;

    public PeriodicalIssue(String name, String authorName, int year,Genre genre){
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.genre = genre;
    }



    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeriodicalIssue that = (PeriodicalIssue) o;

        if (year != that.year) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (authorName != null ? !authorName.equals(that.authorName) : that.authorName != null) return false;
        return genre == that.genre;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PeriodicalIssue{");
        sb.append("name='").append(name).append('\'');
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", year=").append(year);
        sb.append(", genre=").append(genre);
        sb.append('}');
        return sb.toString();
    }
}
