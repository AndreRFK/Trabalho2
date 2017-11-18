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
public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle(double largura, double comprimento) {
       width = largura;
        length = comprimento;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ", area=" + area + '}';
    }
}
