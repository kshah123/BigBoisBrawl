/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigboisbrawl;

/**
 *
 * @author user
 */
public class Rectangle {
    public double x1; //smaller
    public double x2; //larger
    public double y1; //smaller
    public double y2; //larger
    
    public Rectangle(double x, double x_2, double y, double y_2){
        x1 = x;
        x2 = x_2;
        y1 = y;
        y2 = y_2;
    }
    public void changePos(double x, double y, double h, double w){
        x2 = x;
        y1 = y;
        x1 = x + w;
        y2 = y + h;
    }
}
