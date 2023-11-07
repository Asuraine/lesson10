package ru.sbgeu.lichman.basic.box;

public class MainApl {
    public static void main(String[] args) {

        Box box = new Box("Черный", 10, 10, 10);
        box.info();
        box.add("Чашка");
        box.open();
        box.add("Чашка");
        box.setColor("Cиний");
        box.close();




    }
}
