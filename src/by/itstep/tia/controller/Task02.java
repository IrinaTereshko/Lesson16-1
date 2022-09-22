package by.itstep.tia.controller;

import by.itstep.tia.model.data.Dragon;
import by.itstep.tia.model.logic.DragonLogic;
import by.itstep.tia.util.UserInput;
import by.itstep.tia.view.Printer;

public class Task02 {
    public static void main(String[] args) {

        Dragon dragon = new Dragon();
        dragon.name = UserInput.inputString("Input dragon's name: ");
        dragon.age = UserInput.inputNumber( "Input dragon's age: ");

        int head = DragonLogic.calculateHeads(dragon);
        String msg = String.format("%s has %d heads\n", dragon.name, head);
        Printer.print(msg);

    }
}
