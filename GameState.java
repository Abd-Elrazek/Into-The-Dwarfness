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
public abstract class GameState 
{
    
    public abstract void init();
    public abstract void tick();
    public abstract void render(Graphics g);
}
