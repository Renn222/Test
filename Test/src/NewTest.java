import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewTest extends JFrame 
{
	TestPanel boardPanel;
    public NewTest() 
    {
            createFrame();
            
            boardPanel = new TestPanel(this);
            pack();
            setVisible(true);
    }
    
    private void createFrame()
    {
    	setLayout(new GridLayout(8,8, 3, 3));
        setPreferredSize(new Dimension(800,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
            new NewTest();
    }
}