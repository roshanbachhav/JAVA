package com;

import java.awt.*;

class cylinder {
    public int radius;
    public int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    /*
        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }
    }
    */
    class Rectangle {
        private final int length;
        private final int breath;

        public Rectangle() {
            this.length = 4;
            this.breath = 4;
        }

        public Rectangle(int length, int breath) {
            this.length = length;
            this.breath = length;
        }

        public int getLength() {
            return length;
        }

        public int getBreath() {
            return breath;
        }
    }
}

public class cyl {
    public static void main(String[] args) {

        cylinder cyln = new cylinder();
    /*
        cyln.setRadius(9);
        cyln.setHeight(12);
//        cyln.volume();
        System.out.println(cyln.getRadius());
        System.out.println(cyln.area());
        System.out.println(cyln.volume());

    */
        Rectangle r = new Rectangle();
        System.out.println(r.getHeight());
    }
}
