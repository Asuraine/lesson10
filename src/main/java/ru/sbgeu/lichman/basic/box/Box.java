package ru.sbgeu.lichman.basic.box;

public class Box {
        private String item;
        private String color;
        private final int width;
        private final int length;
        private final int height;
        private boolean isOpen;


        public void setColor(String color) {
            this.color = color;
        }

        public Box(String color, int width, int length, int height) {
            this.item = null;
            this.color = color;
            this.width = width;
            this.length = length;
            this.height = height;
            this.isOpen = true;
        }

        public void open() {
            if (isOpen) {
                System.out.println("Коробка уже открыта");
                this.isOpen = true;
            } else {
                System.out.println("Коробка открыта!");

            }
        }

        public void close() {
            if (isOpen) {
                System.out.println("Коробка закрыта!");
                this.isOpen = false;
            } else {
                System.out.println("Коробка закрыта");
            }
        }

        public void add(String item) {
            if (!isOpen) {
                System.out.println("Коробка закрыта! В нее нельзя положить предмет");
                return;
            }
            if (item == null) {
                item = item;
                System.out.println("В коробочку положили " + item);
                return;
            }
            if (item != null) {
                System.out.println("В коробке лежит " + item);
            }
        }

        public void info() {
            System.out.println("Тут " + color + " коробка с размерами " + width + "*" + length + "*" + height + "\nВ коробке есть: ");
            {
                System.out.println(item);
            }
        }
    }

