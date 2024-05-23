package Week12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//크기 set, 보이기 set, close 기본 옵션 set
//버튼 추가하기 : 크기와 위치 set!
public class MyWin2 extends JFrame{
	JButton b1 = new JButton("나는 버튼");
	JButton b2 = new JButton("나도 버튼");
	
	public MyWin2(){
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null); //윈도우의 격자무늬 무력화해서 내가 원하는 위치에 버튼붙이기
		
		b1.setBounds(10, 10, 300, 200);
		this.add(b1); //윈도우야 b1을 추가해 이므로 this사용
		
		b2.setBounds(400, 10, 300, 200);
		this.add(b2);
		
		b1.addActionListener(new ActionListener() {//익명객체 이용

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼이 눌렸음");
				b2.setBackground(Color.pink);
			}
			
		});
	}
}
