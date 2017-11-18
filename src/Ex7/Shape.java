/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

/**
 *
 * @author andre
 */
public class Shape {

    private String color;
    private double area;

    public Shape(String cor) {
        color = cor;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", area=" + area + '}';
    }
}
