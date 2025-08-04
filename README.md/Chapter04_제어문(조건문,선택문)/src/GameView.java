import javax.swing.*; // 경량
import java.awt.*; // image
public class GameView extends JPanel{
	Image back,air;
	
	int x=150;
	int y=100;
	public GameView()

	 {
		// TODO Auto-generated method stub
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\background.jpg");
		air=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\air.png");
	 }
			public void paint(Graphics g)
			{
			g.drawImage(back,0,0,getWidth(),getHeight(),this);
			g.drawImage(air,x,y,150,100,this);
			}
}

