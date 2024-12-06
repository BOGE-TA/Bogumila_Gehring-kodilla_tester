package com.kodilla.collections.interfaces.homework;

    public class Ford implements Car {
        private int speed;

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public void increaseSpeed() {
            speed += 15; // Ford accelerates 15
        }

        @Override
        public void decreaseSpeed() {
            speed -= 10; // Ford brakes 10
        }
    }
