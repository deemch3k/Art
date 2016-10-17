package week2.day1.circus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Circus {

    private String name;
    private ArrayList<Artist> artists = new ArrayList<>();
    private ArrayList<Ropewalkerable> ropewalkers = new ArrayList<>();

    public Circus(String name) {
        this.name = name;
    }

    public boolean addArtist(Artist artist){

        return artists.add(artist);

    }

    public void startPerformance(){
        for (Artist artist : artists) {
            artist.act();
        }
    }

    public boolean hireRopewalker(Ropewalkerable rw){

        return ropewalkers.add(rw);

    }

    public void sort(Comparator<Artist> artistComparator){

        artists.sort(artistComparator);
        //Collections.sort(artists, artistComparator);
    }


}
