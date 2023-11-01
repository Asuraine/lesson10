package ru.sbgeu.lichman.basic.box;

public class Box {
    String[] items = new String[5];
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    private float width;
    private float height;
    private float depth;
    private boolean openBox;
    private boolean closedBoxes;

    public Box(String color) {
        this.color = color;
        this.width = 100.5f;
        this.height = 200.5f;
        this.depth = 100.5f;
        this.openBox = false;
        this.closedBoxes = false;
    }

    public void openBoxes() {
        if (openBox = true) {
            System.out.println("Коробка открыта");
        } else
            System.out.println("Коробка закрыта");
    }

    public void closedBoxes() {
        if (closedBoxes == true) {
            System.out.println("Коробка открыта");
        } else
            System.out.println("Коробка закрыта");
    }


    public void info() {
        System.out.println("Цвет коробки: " + color);
        System.out.println("Длина: " + height + " " + "Ширина: " + width + " " + "Глубина: " + depth);
        for (int i = 0; i < items.length; i++) {
            System.out.println("Предметы в коробке:" + items[i]);

        }
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null && closedBoxes == true) {
                items[i] = item;
                System.out.println("Вы положили: " + item);
                return;
            }
        }
        System.out.println("Нет места для: " + item + " или коробка закрыта");
    }

    public void clear(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println("Из коробки убрали: " + item);
                {
                    for (i = 0; i < items.length; i++) {
                        items[i] = null;
                    }
                }
            }
        }
    }
}

