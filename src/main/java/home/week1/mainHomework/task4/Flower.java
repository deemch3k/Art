package home.week1.mainHomework.task4;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Flower implements Comparable<Flower>{

    private int stemLenght;
    private int freshness;
    private int price;

    public Flower(int stemLenght, int freshness, int price) {
        this.stemLenght = stemLenght;
        this.freshness = freshness;
        this.price = price;
    }

    public int getStemLenght() {
        return stemLenght;
    }

    public void setStemLenght(int stemLenght) {
        this.stemLenght = stemLenght;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Flower o) {
        return freshness - o.freshness;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
        sb.append("stemLenght=").append(stemLenght);
        sb.append(", freshness=").append(freshness);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (stemLenght != flower.stemLenght) return false;
        if (freshness != flower.freshness) return false;
        return price == flower.price;

    }

    @Override
    public int hashCode() {
        int result = stemLenght;
        result = 31 * result + freshness;
        result = 31 * result + price;
        return result;
    }
}
