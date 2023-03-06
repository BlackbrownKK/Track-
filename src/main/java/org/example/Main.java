package org.example;

import org.example.Model.Cat;
import org.example.Model.Track;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // класс зверь пробедал столько то , проплыт столькото по лимиту
    static Action action = new Action();

    static List<Track> wayOfTracks = new ArrayList<>();




    public static void main(String[] args) {
        Track track01 = new Track(1, "ROAD", 50);
        Track track02 = new Track(2, "WATER", 3);
        Track track03 = new Track(3, "ROAD", 15);
        Track track04 = new Track(4, "WATER", 4);


        wayOfTracks.add(track01);
        wayOfTracks.add(track02);
        wayOfTracks.add(track03);
        wayOfTracks.add(track04);

        Cat cat1 = new Cat("Fil 1");
        cat1.setRunLimit(60);
        cat1.setSweamDlLimit(5);

        System.out.println();
        System.out.println(action.runAnimal(cat1, wayOfTracks));


    }

}