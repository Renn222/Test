import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestTile extends JPanel
{
	private Number num;
	private ImageIcon coverImg;
	private ImageIcon numImg;
	private ImageIcon flagImg;
	private ImageIcon questionImg;
	private ImageIcon mineImg;
	private boolean alive;
	private int x;
	private int y;
	private int iconType;
	private TestPanel board;
	private boolean hasMine;
	private int mineNumber;
	
	private final int COVER = 0;
	private final int NUMBER = 1;
	private final int FLAG = 2;
	private final int QUESTION = 3;
	private final int MINE = 4;
	
	//Class for each of the tiles on gameboard
	public TestTile(TestPanel board) 
	{
		
		//Coordinates will start from top left at (0, 0) and then next tiles will be (0, 1) and (1, 0) down to the last tile
		this.x = x;
		this.y = y;
		this.board = board;
		hasMine = false;
		
		JButton b = new JButton();
		//setBackground(new Color(0, 0, 0));
		this.add(b);
		setLayout(new BorderLayout());
		
		if((this.x + this.y) % 2 == 0)
		{
			setBackground(new Color(128, 128, 128));
		}
	
		else
		{
			setBackground(Color.white);
		}
		
		/*coverImg = new ImageIcon(getImageForTile(COVER));
		setImage(coverImg);
		/*	
		//each tile needs it's own listener, that way I know which tile is being clicked on
		listener = new Listener(this, board);
		this.addMouseListener(listener);
		
		//Mine image code
		if(hasMine == true)
		{
			mine = new Mine();
			mineImg = mine.getImageIcon();
		}		
		//Flag image code
		flag = new Flag();
		flagImg = flag.getImageIcon();
		
		//Tile cover image code
		cover = new Cover();
		coverImg = cover.getImageIcon();
		placeImageOnTile(COVER);*/
		
		//board.tileCheck(this);
	}

	
	public int getTileX()
	{
		return x;
	}
	
	public int getTileY()
	{
		return y;
	}
	
	public boolean getAlive()
	{
		return alive;
	}
	
	
	public int getIconType()
	{
		return iconType;
	}
	
	public boolean getHasMine()
	{
		return hasMine;
	}
	
	public void setMine()
	{
		hasMine = true;
	}
	
	public void setAlive(boolean mode)
	{
		alive = mode;
	}
		
	private void setImage(ImageIcon img)
	{
		JLabel imageLbl = new JLabel(img);
		this.add(imageLbl);
	}
	private Image getImageForTile(int type) 
    {
        String filename = "";

        switch (type) 
        {
            case COVER:
                filename += "Cover";
                break;
            case NUMBER:
                filename += "Number";
                break;
            case FLAG:
                filename += "Flag";
                break;
            case QUESTION:
                filename += "Question";
                break;
            case MINE:
                filename += "Mine";
                break;
        }
        filename += ".png";

        URL urlPieceImg = getClass().getResource("images/" + filename);
        return new ImageIcon(urlPieceImg).getImage();        
    }
	
	public void removeImage(int type)
	{
		JLabel imageLbl = new JLabel(coverImg);
		switch(type)
		{
			case COVER:
				imageLbl = new JLabel(coverImg);
				//board.tileCheck(this);
				break;
			case NUMBER:
				imageLbl = new JLabel(numImg);
				break;
			case FLAG:
				imageLbl = new JLabel(flagImg);
				break;
			case QUESTION:
				imageLbl = new JLabel(questionImg);
				break;
			case MINE:
				imageLbl = new JLabel(mineImg);
				break;
		}
		this.remove(imageLbl);
	}

}