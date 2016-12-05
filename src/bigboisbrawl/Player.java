/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigboisbrawl;
import java.awt.Image;
/**
 *
 * @author user
 */
public class Player {
    private Image left;
    private Image right;
    private Image jumpLeft;
    private Image jumpRight;
    private Image punch;
    private Image kick;
    private Image power;
    private Rectangle playerBox;
    private double x; //x coordnate of the top left of the image
    private double y; //y coordnate of the top left of the image
    private double height; //vertical distance of image
    private double width; //horizontal distance of image
    private double lateralMovement = 0;
    private double verticalMovement = 0;
    private final double JUMP_HEIGHT = 20; //20 is arbitrary. Used for how high a jump goes

    /*
    Constructor
    Arguments: all the locations for the images, top left coordnates of image, width and height
    Logic: Sets stuff equal to arguments
    Return: none
    */
    
    /*
    Name: Move
    Arguments: keyInput(s)
    Logic: Changes lateral and vertical movement according to key presed. Diagonal jumping is allowed
    Return: void
    */
    
    /*
    Name: Jump
    Arguments: (1)none (2)lateral movement key pressed
    Logic: If (1) increased x at some rate unil it is JUMP_HIGHT higher than its original x coordnate. 
           If (2), then it maps out a parabolic function with a horizontal stretch. 
           Should be able to switch between the 2 methods while character is in the air
           Method terminates when character collides with ground
    Return: void
    */
    
}
