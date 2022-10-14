package Exercises;

public class aircraftClassObjectExercise {

    public static void main(String[] args) {
        int var1 = 5;
        double var2 = 3.65;

        aircraft cessna172 = new aircraft(); //creates object of class aircraft


        aircraft piperSaratoga = new aircraft();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;


        System.out.println("Cessna 172 passenger capacity: " + cessna172.passengers);
        System.out.println("Cessna 172 Fuel Burn rate : " + cessna172.fuelBurnRate + " gph");


        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;


        System.out.println("Piper Saragota Cruise Speed : " + piperSaratoga.cruiseSpeed + " mph");


// calculating without method
        /*double cessna172Endurance;
        double piperEndurance;

        cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
        System.out.println("Cessna172 can stay aloft for " + cessna172Endurance + " hours.");
        piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
        System.out.println("Piper Saragota can stay aloft for " + piperEndurance + " hours.");
*/



//calculating endurance with method calculateEndurance(created in aircraft class)
        System.out.println("Cessna 172");
        cessna172.calculateEndurance();

        System.out.println("Piper Saratoga");
        piperSaratoga.calculateEndurance();
    }
}

class aircraft { //creates new class and describes common variables
    int passengers;               // number of people
    int cruiseSpeed;              // miles per hour
    double fuelCapacity;          // gallons
    double fuelBurnRate;          // gallons per hour

// method to calculate aircraft endurance

    void calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;
        System.out.println("Endurance is " + endurance + "hours. ");
    }
}



