package Week12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mywin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane; //액자위에 패널 올려둠, 지워도 댐
	private JButton btn1;
	private JButton btn2;
	private JLabel label1;
	private JLabel label2;
	private JProgressBar bar1;
	private JProgressBar bar2;

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
			public void actionPerformed(ActionEvent e) {
				
				int s = bar2.getValue() - 10;
				bar2.setValue(s);
				if(bar2.getValue() <= 0) label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미미탈락.png")));
			}
		});
		btn1.setBounds(25, 307, 187, 61);
		contentPane.add(btn1);
		
		btn2 = new JButton("공격하기");
		btn2.setBounds(461, 308, 197, 61);
		contentPane.add(btn2);
		
		label1 = new JLabel("Player1");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/신짱구.png")));
		label1.setBounds(27, 28, 185, 269);
		contentPane.add(label1);
		
		label2 = new JLabel("Player2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setIcon(new ImageIcon(Mywin.class.getResource("/Week12/image/미미.PNG")));
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
	}
}
