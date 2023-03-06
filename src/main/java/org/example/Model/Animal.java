package org.example.Model;

public class Animal {
    private String name;
    private double runLimit;
    private double sweamDlLimit;

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(double runLimit) {
        this.runLimit = runLimit;
    }

    public double getSweamDlLimit() {
        return sweamDlLimit;
    }

    public void setSweamDlLimit(double sweamDlLimit) {
        this.sweamDlLimit = sweamDlLimit;
    }

    public double moveRun(double runDistansAnimalLimit, double runDistans) {
        double realRunDistans;
        if (runDistans <= runDistansAnimalLimit) {
            realRunDistans = runDistans;
        } else {
            realRunDistans = runDistansAnimalLimit;
        }
        return realRunDistans;
    }

    public double swimMove(double swimDistansAnimalLimit, double swimDistans) {
        double realSwimDistans;
        if (swimDistans <= swimDistansAnimalLimit) {
            realSwimDistans = swimDistans;
        } else {
            realSwimDistans = swimDistansAnimalLimit;
        }
        return realSwimDistans;
    }

}
