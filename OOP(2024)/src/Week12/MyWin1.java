package Week12;

import javax.swing.JFrame;


//크기 set, 보이기 set, close 기본 옵션 set
public class MyWin1 extends JFrame{
	public MyWin1() {
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //X 눌렀을 떄 끄게 역할함
	}
}
