/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigboisbrawl;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.*;
/**
 *
 * @author user
 */
public class BigBoisBrawl extends StateBasedGame{

    // Name of game in title bar
	public static final String gameName = "Big Bois Brawl";
	
	// List of states:
	public static final int state1 = 0;
	
	// Creating memory allocation for states
	public BigBoisBrawl(String gameName) throws SlickException{
		super(gameName);
		this.addState(new State1(state1));
	}
	
	// Initializing States into game
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(state1).init(gc, this);

	}
	
	// Main Game
	public static void main(String[] args) {
		AppGameContainer appGC;
		try {
			appGC = new AppGameContainer(new BigBoisBrawl(gameName));
			appGC.setDisplayMode(1080, 720, false);;
			appGC.start();
		} catch(SlickException e){
			e.printStackTrace();
		}
	}
}