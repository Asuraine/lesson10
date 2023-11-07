package ru.sbgeu.lichman.basic.box;

public class Box {
        private String items;
        private String color;
        private final int width;
        private final int length;
        private final int height;
        private boolean isOpen;


        public void setColor(String color) {
            this.color = color;
        }

        public Box(String color, int width, int length, int height) {
            this.items = null;
            this.color = color;
            this.width = width;
            this.length = length;
            this.height = height;
            this.isOpen = true;
        }

        public void open() {
            if (isOpen) {
                System.out.println("Коробка открыта!");
                this.isOpen = true;
            } else {
                System.out.println("Коробка уже открыта");

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
            if (items == null) {
                items = item;
                System.out.println("В коробочку положили " + item);
                return;
            }
            if (items != null) {
                System.out.println("В коробке лежит " + items);
            }
        }


        public void info() {
            System.out.println("Тут " + color + " коробка с размерами " + width + "*" + length + "*" + height + "\nВ коробке есть: ");
            {
                System.out.println(items);
            }
        }
    }

