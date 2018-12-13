import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;

public class TestPanel extends JPanel
{
	public TestPanel(NewTest game) 
	{
		 for (int i = 0; i < 8; i++)
         {
                 for (int j = 0; j < 8; j++)
                 {
                         TestTile tile = new TestTile(this);
                         tile.setBackground(Color.green);
                         game.add(tile);
                 }
         }
	}
}