package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkranianFlag ukraine = new UkranianFlag();
        ukraine.draw();

        FrenchFlag france = new FrenchFlag();
        france.draw();


    }
}
