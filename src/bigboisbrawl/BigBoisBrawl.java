/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigboisbrawl;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import java.io.File;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
/**
 *
 * @author user
 */
public class BigBoisBrawl extends BasicGame{

    /**
     * @param args the command line arguments
     */
    public BigBoisBrawl() {
        super("Big Bois Brawl");
    }
    public static void main(String[] args) {
        File f = new File("natives");
        /*if(f.exists())
            System.setProperty("org.lwjgl.librarypath", f.getAbsolutePath());
        */
        try {
            AppGameContainer game = new AppGameContainer(new BigBoisBrawl());
            game.setDisplayMode(Window.width, Window.height, false);
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        gc.setTargetFrameRate(60);
        gc.setAlwaysRender(true);
        gc.setMaximumLogicUpdateInterval(60);
        gc.setShowFPS(false);
        gc.setVSync(true);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
