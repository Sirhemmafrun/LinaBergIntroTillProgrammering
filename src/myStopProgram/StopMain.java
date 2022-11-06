package myStopProgram;

import java.util.Scanner;

public class StopMain {

    static StopLogic sL = new StopLogic(); // Objekt av StopLogic, så jag enkelt kommer åt den nedan i koden

    public static void main(String[] args) {


        while (!sL.checkIfStopped()) { //Sålänge falsk körs koden
            System.out.println("Write any word, quit by writing stop: ");
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();

            sL.getCharacter();
            sL.counteR(text);
            sL.checkInput(text);
        }
        //När programmet är slut skrivs sammanlagda tecken och rader ut (exklusive stop-raden)
        System.out.println("This is how many characters: " + sL.getCharacter());
        System.out.println("This is how many rows: " + sL.getRows());
        System.out.println("Program is stopped");
    }
}
