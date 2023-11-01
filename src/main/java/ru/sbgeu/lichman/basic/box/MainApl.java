package ru.sbgeu.lichman.basic.box;

public class MainApl {
    public static void main(String[] args) {

        Box box = new Box("Красный");
        box.info();
        box.add("Чашка");
        box.info();
        box.clear("Чашка");
        box.info();
        box.openBoxes();
        box.add("Чашка");
        box.closedBoxes();
        box.add("Чашка");
        box.info();
        box.setColor("Черный");
        box.info();
        box.add("Чашка");
        box.openBoxes();



    }
}
