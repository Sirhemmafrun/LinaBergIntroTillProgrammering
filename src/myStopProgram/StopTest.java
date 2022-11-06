package myStopProgram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StopTest {


    @Test //Testar hur många tecken som skrivits in
    public void addCharacter() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        myLogic.counteR("carrot"); //Skickar in carrot i counteR
        int actual = myLogic.getCharacter();
        int expected = 6;

        //Assert
        assertEquals(expected, actual);
    }

    @Test //Negativt test
    public void addNothing() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        myLogic.counteR("");
        int actual = myLogic.getCharacter();
        int expected = 0;

        //Assert
        assertEquals(expected, actual);
    }

    @Test //Testar fler rader
    public void addRows() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        myLogic.counteR("banana"); //Skickar in rader i counteR
        myLogic.counteR("melon");
        myLogic.counteR("kiwi");
        int actual = myLogic.getRows();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);
    }

    @Test //Testar boolean
    public void testBool() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        boolean actual = myLogic.checkIfStopped();
        boolean expected = false;

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test //Testar att ordet Stop blir sant
    public void testStop() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        myLogic.checkInput("Stop");
        boolean actual = myLogic.checkIfStopped();
        boolean expected = true;

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test //Testar om annat ord än stop blir false
    public void testNotStop() {
        //Arrange
        StopLogic myLogic = new StopLogic();

        //Act
        myLogic.checkInput("apple");
        boolean actual = myLogic.checkIfStopped();
        boolean expected = false;

        //Assert
        Assertions.assertEquals(expected, actual);
    }


}
