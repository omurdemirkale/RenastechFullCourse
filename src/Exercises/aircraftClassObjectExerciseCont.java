package Exercises;

public class aircraftClassObjectExerciseCont {
    public static void main(String[] args) {
        int var1 = 5;
        double var2 = 3.65;

        aircraft cessna172 = new aircraft(); //creates object of class aircraft


        aircraft piperSaratoga = new aircraft();

        double cessna172Endurance;
        double piperEndurance;


        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;


        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
        System.out.println("Cessna172 can stay aloft for " + cessna172Endurance + " hours.");
piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
        System.out.println("Piper Saragota can stay aloft for " + piperEndurance + " hours.");



    }
}

