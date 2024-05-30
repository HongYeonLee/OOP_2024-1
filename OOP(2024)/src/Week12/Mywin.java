package Week12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Week12.player.Player; //패키지가 다르니 임포트 필요

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Mywin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane; //액자위에 패널 올려둠, 지워도 댐
	private JButton btn1;
	private JButton btn2;
	private JLabel label1;
	private JLabel label2;
	private JProgressBar bar1;
	private JProgressBar bar2;
	Player p1, p2;
	private JScrollPane scrollPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //메인코드 몰라도 댐
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mywin frame = new Mywin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mywin() {

		setDefaultCloseOperation(EXIT_ON_CLOSE); //x버튼 눌렀을 때 완전히 꺼지게하기
		setBounds(100, 100, 694, 483); //위치와 크기 동시에 정하기
		this.setVisible(true); //생성자에 넣어주고 써도 돼고 메인에서 써도 댐
		contentPane = new JPanel(); //몰라도 댐
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("공격하기");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//버튼1 클릭했을 때

				p1.attack(p2);
				String str = p1.name + "이 " + p2.name + "을 공격합니다!\n" + p2.name +"의 hp :" + p2.getHp() + "\n";
;				ta.setText(ta.getText() + str); //기존 텍스트에다가 새로운 텍스트를 붙이는 형태
				
				bar2.setValue(p2.getHp());
				
				if (p2.getHp() <= 0) {
					label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/" + p2.getImgFile2())));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}//잠깐 멈춤
					
					dispose(); //현재 윈도우 닫기
					JOptionPane.showMessageDialog(null, p1.name + "가 이겼습니다!\n" + "게임 종료"); //팝업창 띄우기
					//팝업창이 아니라 새로운 엔딩 윈도우를 띄우고 싶으면 엔딩 윈도우를 만들고 부르기
				}
				
				//int s = bar2.getValue() - 10;
				//bar2.setValue(s);
				//if(bar2.getValue() <= 0) label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미미탈락.png")));
			}
		});
		btn1.setBounds(25, 307, 187, 61);
		contentPane.add(btn1);

		btn2 = new JButton("공격하기");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//버튼2 클릭했을 때
				
				p2.attack(p1);
				String str = p2.name + "가 " + p1.name + "을 공격합니다!\n" + p1.name + "의 hp : " + p1.getHp() + "\n";
				ta.setText(ta.getText() + str); //기존 텍스트에다가 새로운 텍스트를 붙이는 형태
				bar1.setValue(p1.getHp());
				
				if (p1.getHp() <= 0) {
					label1.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/" + p1.getImgFile2())));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}//잠깐 멈춤
					
					dispose(); //현재 윈도우 닫기
					JOptionPane.showMessageDialog(null, p2.name + "가 이겼습니다!\n" + "게임 종료!"); //팝업창 띄우기
					//팝업창이 아니라 새로운 엔딩 윈도우를 띄우고 싶으면 엔딩 윈도우를 만들고 부르기
				}
				
				//int s = bar2.getValue() - 10;
				//bar2.setValue(s);
				//if(bar2.getValue() <= 0) label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미미탈락.png")));
			}
		});
		
		btn2.setBounds(461, 308, 197, 61);
		contentPane.add(btn2);

		label1 = new JLabel("Player1");
		label1.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/짱1.png")));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
//		label1.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/신짱구.png")));
		label1.setBounds(27, 28, 185, 269);
		contentPane.add(label1);

		label2 = new JLabel("Player2");
		label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미1.PNG")));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
//		label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미미.PNG")));
		label2.setBounds(461, 22, 197, 269);
		contentPane.add(label2);

		bar1 = new JProgressBar();
		bar1.setValue(50);
		bar1.setForeground(new Color(255, 0, 0));
		bar1.setBounds(25, 381, 187, 52);
		contentPane.add(bar1);

		bar2 = new JProgressBar();
		bar2.setForeground(new Color(255, 0, 0));
		bar2.setValue(100);
		bar2.setBounds(461, 381, 197, 52);
		contentPane.add(bar2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 28, 225, 245);
		contentPane.add(scrollPane);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}

	public Mywin(Player p1, Player p2) {
		this(); //MyWin() 기본생성자 호출하기, super()로부르면 안댐
		
		//인자로 받은 Player 정보 세팅하기
		this.p1 = p1;
		this.p2 = p2;
		
		//player의 이미지 세팅하기
		label1.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/" + p1.getImgFile1())));
		label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/" + p2.getImgFile1())));
		
		//bar 최대값, value 최대값
		bar1.setMaximum(p1.getHp());
		bar2.setMaximum(p2.getHp());
		
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());
		
		//공격하기() 메소드 호출하기
	}
}
