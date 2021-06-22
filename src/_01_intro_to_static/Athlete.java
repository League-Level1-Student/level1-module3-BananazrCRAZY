package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete a1 = new Athlete("Bob", 25);
    	Athlete a2 = new Athlete("John", 30);
    	
    	a1.bibNumber = 1;
    	a2.bibNumber = 2;
    	
    	Athlete.raceLocation = "Hawaii";
    	Athlete.raceStartTime = "10.00am";
    }
}