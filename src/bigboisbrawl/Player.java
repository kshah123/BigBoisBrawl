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
    private Image hit;
    private Image death;
    private Rectangle playerBox;
    private double x; //x coordnate of the top left of the image
    private double y; //y coordnate of the top left of the image
    private double height; //vertical distance of image
    private double width; //horizontal distance of image
    private double punchPow; //These are constants that are
    private double kickPow; // set after the construnctor is
    private double powPow; // called and determine power of moves 
    private double health;
    private double lateralMovement = 0;
    private double verticalMovement = 0;
    private boolean movingUp = false;
    public boolean isDead = false;
    private long moveStop = 0;
    private final double JUMP_HEIGHT = 20; //20 is arbitrary. Used for how high a jump goes

    public Player(Image l, Image r, Image jl, Image jr, Image p, Image k, Image pow, Image ht, Image d, double x_1, double y_1, double h, double w, double pp, double kp, double powp, double hlth){
        left = l;
        right = r;
        jumpLeft = jl;
        jumpRight = jr;
        punch = p;
        kick = k;
        power = pow;
        hit = ht;
        death = d;
        x = x_1;
        y = y_1;
        height = h;
        width = w;
        playerBox = new Rectangle(x - width, y, x, y + height);
        punchPow = pp;
        kickPow = kp;
        powPow = powp;
        health = hlth;
        
    }
    
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
    
    /*
    Name: Punch
    Arguments: Character being punched
    Logic: Deals damage to character being punched. Damage dealt = default damage * punchPow
    Return: void
    */

    public Image punch(Player a){
        if(System.currentTimeMillis() - moveStop >= 500){
        a.gotHit(10 * punchPow);
        return punch;
        }
        moveStop = System.currentTimeMillis();
        return null;
    }
    
    //Kick and power are the same thing as punch except they use kickPow and powPow respectively instead of punchPow
    
    public Image gotHit(double h){
        health -= h;
        if(h <= 0){
            isDead = true;
            return death;
        }
        return hit;
    }
}
