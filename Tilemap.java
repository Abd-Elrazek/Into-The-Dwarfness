
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tilemap
{
	private BufferedImage image;
	
	public Tilemap() 
	{
		try
		{
			image = ImageIO.read(new File(".//Images//Dungeon_Tileset.png"));
			System.out.println(image);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		
	}

	public void render(Graphics g) 
    {
    	g.drawImage(image, 0, 50, 512, 640, null);
    }
}
