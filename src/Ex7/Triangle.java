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
public class Triangle {

    private double base;
    private double height;
    private double area;

    public Triangle(double bs, double altura) {
        base = bs;
        height = altura;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + ", area=" + area + '}';
    }
}
