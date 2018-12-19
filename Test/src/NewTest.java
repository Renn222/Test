import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewTest extends JFrame 
{
	TestPanel boardPanel;
	private int width;
	private int height;
	private int difficulty = 2;
	private int numOfMines;
	
    public NewTest() 
    {
		decideBoardDimensions();
        createFrame();
        boardPanel = new TestPanel(this);

        pack();
        setVisible(true);
    }
    
    private void createFrame()
    {
    	int tilePixelLength = 40;
    	setLayout(new GridLayout(width, height, 3, 3));
        setPreferredSize(new Dimension(height * tilePixelLength, width * tilePixelLength));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
    private void decideBoardDimensions()
	{
		switch(difficulty)
		{
			case 0:
				width = 8;
				height = 8;
				numOfMines = 10;
				break;
			case 1:
				width = 16;
				height = 16;
				numOfMines = 40;
				break;
			case 2:
				width = 16;
				height = 30;
				numOfMines = 40;
				break;
		}
	}
   
    public int getTileWidth()
	{
		return width;
	}
	
	public int getTileHeight()
	{
		return height;
	}
	
	public int getNumOfMines()
	{
		return numOfMines;
	}
    public static void main(String[] args)
    {
            new NewTest();
    }
}