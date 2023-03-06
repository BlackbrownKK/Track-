package org.example;

import org.example.Model.Animal;
import org.example.Model.Track;

import java.util.List;

public class Action {


    public String runAnimal(Animal animal, List<Track> wayOfTracks) {

        double wayPassRun = 0;
        double wayPassSweam = 0;
        int nubmer = 0;


        for (Track track : wayOfTracks) {
            nubmer++;

            System.out.println();
            System.out.println(nubmer + ":");
            System.out.println("getRunLimit " + animal.getRunLimit());
            System.out.println("getSweamDlLimit " + animal.getSweamDlLimit());

            while (wayPassRun <= animal.getRunLimit() && wayPassSweam <= animal.getSweamDlLimit()) {
                switch (track.getTrackKind()) {
                    case "ROAD" -> {
                        wayPassRun += animal.moveRun(animal.getRunLimit(), track.getTrackDistance());
                        animal.setRunLimit(animal.getRunLimit() - wayPassRun);
                    }
                    case "WATER" -> {
                        wayPassSweam += animal.swimMove(animal.getSweamDlLimit(), track.getTrackDistance());
                        animal.setSweamDlLimit(animal.getSweamDlLimit() - wayPassSweam);
                    }
                }
            }


            System.out.println("this plan track = " + track.getTrackDistance() + " " + track.getTrackKind());
            System.out.println();
            System.out.println("wayPassRun = " + wayPassRun);
            System.out.println("wayPassSweam = " + wayPassSweam);
            System.out.println();
            System.out.println("this runLimit = " + animal.getRunLimit());
            System.out.println("this sweamLimit = " + animal.getSweamDlLimit());
        }

        String dataResult;
        return dataResult = (animal.getName() + " has ranned " + wayPassRun + " has sweamd " + wayPassSweam);
    }
}
