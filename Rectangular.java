/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 *
 * @author Theodore Tsimiklis
 */
public class Rectangular {
    
    private int width;
    private int length;
    private String color; // non static belong to the object
    private static int numOfSide = 4; // static belong to the class
    /**
     * default constructor
     */
    public Rectangular() {
        Random rand = new Random();
        
        this.width = rand.nextInt(10) + 1;
        this.length = rand.nextInt(10) + 1;
        this.color = "black";
    }
    /**
     * constructor with all data members
     * @param width the width
     * @param length the length
     * @param color the color
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    /**
     * to calculate the area of a rectangular
     * @return the area of a rectangular
     */
    public int calcArea() {
        return width * length;
    } 
    /**
     * to calculate the perimeter of a rectangular
     * @return the perimeter of a rectangular
     */
    public int calcPerimeter() {
        return (width + length) * 2;
    }
    /**
     * 
     * @param rectangular copy of rectangular
     */
    public Rectangular(Rectangular rectangular ) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }
    /**
     * to compare two rectangular
     * @param rectangular another rectangular
     * @return if the two rectangular are the same
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width && this.length == rectangular.length
                && this.color.equals(rectangular.color);
    }
    /**
     * to generate a string
     * @return the generated string
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %s\n", "Color", color);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        
        return str;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
      
}
