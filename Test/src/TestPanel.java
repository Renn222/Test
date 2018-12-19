import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;

public class TestPanel extends JPanel
{
	private int width;
	private int height;
	private int numOfMines;
	public TestPanel(NewTest game) 
	{
		width = game.getTileWidth();
		height = game.getTileHeight();
		numOfMines = game.getNumOfMines();
		
		 for (int i = 0; i < width; i++)
         {
                 for (int j = 0; j < height; j++)
                 {
                         TestTile tile = new TestTile(this);
                         tile.setBackground(Color.green);
                         game.add(tile);
                 }
         }
	}
	
	
}