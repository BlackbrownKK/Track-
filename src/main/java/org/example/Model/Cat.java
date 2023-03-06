package org.example.Model;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getRunLimit() {
        return super.getRunLimit();
    }

    @Override
    public void setRunLimit(double runLimit) {
        super.setRunLimit(runLimit);
    }

    @Override
    public double getSweamDlLimit() {
        return super.getSweamDlLimit();
    }

    @Override
    public void setSweamDlLimit(double sweamDlLimit) {
        super.setSweamDlLimit(sweamDlLimit);
    }

    @Override
    public double moveRun(double runDistansAnimalLimit, double runDistans) {
        return super.moveRun(runDistansAnimalLimit, runDistans);
    }

    @Override
    public double swimMove(double swimDistansAnimalLimit, double swimDistans) {
        return super.swimMove(swimDistansAnimalLimit, swimDistans);
    }
}


