package org.example.Model;

public class Track {

    private int trackNumber;
    private String trackKind;
    private double trackDistance;

    public Track(int trackNumber, String trackKind, double trackDistance) {
        this.trackNumber = trackNumber;
        this.trackKind = trackKind;
        this.trackDistance = trackDistance;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackKind() {
        return trackKind;
    }

    public void setTrackKind(String trackKind) {
        this.trackKind = trackKind;
    }

    public double getTrackDistance() {
        return trackDistance;
    }

    public void setTrackDistance(double trackDistance) {
        this.trackDistance = trackDistance;
    }
}
