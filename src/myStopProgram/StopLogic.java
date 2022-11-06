package myStopProgram;

public class StopLogic {
    private int character; //Attribut
    private int rows; //Attribut


    public void counteR(String text) { //Räknar antal tecken och antal rader
        if (!text.equalsIgnoreCase("Stop")) { //Ignorerar ordet Stop i beräkningen
            character += text.length();
            rows++;
        }
    }

    public int getCharacter() {
        return character;
    }

    public int getRows() {
        return rows;
    }

    private boolean isStopped = false;

    public boolean checkIfStopped() {
        return isStopped;
    }


    public void checkInput(String userInput) { //Stoppar programmet när ordet Stop skrivs in
        if (userInput.equalsIgnoreCase("Stop")) {
            isStopped = true;
        }
    }

}

