import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class TestApplet extends Applet {

	@Override
	public void init() {
		setBackground(Color.BLACK);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString("Abhishek", 50, 50);
	}
}
