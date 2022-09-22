package by.itstep.tia.controller;

import by.itstep.tia.model.data.Dragon;
import by.itstep.tia.model.logic.DragonLogic;
import by.itstep.tia.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        Dragon garynych = new Dragon();
        garynych.age = 120;
        garynych.name = "garynych";

        Dragon pushok = new Dragon();
        pushok.age = 350;
        pushok.name = "pushok";

        int head = DragonLogic.calculateHeads(garynych);
        String msg = String.format("Garynych has %d heads\n", head);
        Printer.print(msg);

        head = DragonLogic.calculateHeads(pushok);
        String msg1 = String.format("Pushok has %d heads\n", head);
        Printer.print(msg1);
    }
}
