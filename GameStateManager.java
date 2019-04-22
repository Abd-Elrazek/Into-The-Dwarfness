/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;

/**
 *
 * @author mathe
 */
public class GameStateManager 
{    
    public GameState currGameState;
    
    public GameStateManager() 
    {
        this.currGameState = new PlayState();
    }
    
    public void init() 
    {
        this.currGameState.init();
    }
    
    public void tick() 
    {
        this.currGameState.tick();
    }
    
    public void render(Graphics g) 
    {
        this.currGameState.render(g);
    }
    
    public void switchState (GameState newState) 
    {
        this.currGameState = newState;
        this.currGameState.init();
    }
}
