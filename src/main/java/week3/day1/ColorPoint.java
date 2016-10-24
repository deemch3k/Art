package week3.day1;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class ColorPoint extends Point {

    private Colors color;

    public ColorPoint(int x, int y, Colors color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;

        ColorPoint that = (ColorPoint) o;

        return color == that.color;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ColorPoint{");
        sb.append("color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
