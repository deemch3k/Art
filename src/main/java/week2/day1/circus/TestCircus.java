package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class TestCircus {

    public static void main(String[] args) {
        Circus circus = new Circus("Kobzov");

        Artist artist1 = new Clown("CLOWN");
        Artist artist2 = new Acrobat("ACROBAT");
        Artist artist3 = new ClownRopeWalker("ClownRopeWalker");


        circus.addArtist(artist1);
        circus.addArtist(artist2);

        circus.startPerformance();


    }

}
