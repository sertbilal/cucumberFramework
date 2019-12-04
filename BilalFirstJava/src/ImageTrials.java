import java.awt.Graphics;
import java.awt.Image;

public class ImageTrials {

	public class LadyBug extends java.applet.Applet {

		Image bugimg;

		public void init() {
		bugimg = getImage(getCodeBase());
	 }

		public void paint(Graphics g) {
			g.drawImage(bugimg, 10, 10, this);
		}
	}
}
