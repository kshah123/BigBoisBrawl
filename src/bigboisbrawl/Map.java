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
public class Map {
    private final String name;
    private final Ground[] grounds;
    private final Rectangle boundary;
    public Map(String n, Ground[] g, Rectangle b){
        name = n;
        grounds = g;
        boundary = b;
    }
    /*
    Name: collideAll
    Arguments: None
    Logic: Calls collide method FOR EACH ground on map
    Return: void
    */
    
    /*
    Name: checkDead
    Arguments: Player
    Logic: Checks if player is outside of the map. If so, call that player's die method
    Return: Void
    */
}
