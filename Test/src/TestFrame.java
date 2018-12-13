import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame
{
	TestPanel boardPanel;
	
	public TestFrame()
	{
		createFrame();

		boardPanel = new TestPanel(this);
		
		pack();
		setVisible(true);
	}
	
	private void createFrame()
	{
		setPreferredSize(new Dimension(800, 800));
		this.setResizable(false);
	}
	
	public static void main(String [] args)
	{
		new TestFrame();
	}
}