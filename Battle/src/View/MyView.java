package View;
import Player.Player;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MyView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;
	private JButton 공격버튼1;
	private JButton 공격버튼2;
	private JProgressBar bar1;
	private JProgressBar bar2;
	private Player p1;
	private Player p2;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton 스트레스버튼1;
	private JButton 스트레스버튼2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyView frame = new MyView();
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
	public MyView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 눌렀을 때 완전히 꺼지게하기
		setBounds(100, 100, 765, 632); //위치와 크기 동시에 정하기
		this.setVisible(true); //생성자에 넣어주고 써도 돼고 메인에서 써도 댐
		contentPane = new JPanel(); //몰라도 댐
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(12, 10, 249, 404);
		contentPane.add(label1);
		
		label2 = new JLabel("");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(490, 10, 249, 404);
		contentPane.add(label2);
		
		공격버튼1 = new JButton("공격하기");
		공격버튼1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAttack(p1, p2, bar2, label2);
			}
		});
		공격버튼1.setBounds(12, 430, 249, 41);
		contentPane.add(공격버튼1);
		
		공격버튼2 = new JButton("공격하기");
		공격버튼2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionAttack(p2, p1, bar1, label1);
			}
		});
		공격버튼2.setBounds(490, 430, 249, 41);
		contentPane.add(공격버튼2);
		
		bar1 = new JProgressBar();
		bar1.setForeground(new Color(255, 0, 0));
		bar1.setBounds(12, 535, 249, 50);
		contentPane.add(bar1);
		
		bar2 = new JProgressBar();
		bar2.setForeground(new Color(255, 0, 0));
		bar2.setBounds(490, 535, 249, 50);
		contentPane.add(bar2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 10, 207, 404);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		스트레스버튼1 = new JButton("스트레스 해소");
		스트레스버튼1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStressRelief(p1);
			}
		});
		스트레스버튼1.setBounds(12, 481, 249, 44);
		contentPane.add(스트레스버튼1);
		
		스트레스버튼2 = new JButton("스트레스 해소");
		스트레스버튼2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStressRelief(p2);
			}
		});
		스트레스버튼2.setBounds(490, 481, 249, 44);
		contentPane.add(스트레스버튼2);
		
		JButton btnNewButton = new JButton("파일로저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File outfile = new File("c:\\Temp\\gamelog.txt");
				PrintWriter out = null;
				try {
					out = new PrintWriter(outfile);
					out.println(textArea.getText());
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(297, 461, 150, 85);
		contentPane.add(btnNewButton);
	}
	
	public MyView(Player p1, Player p2) {
		this(); //MyWin() 기본생성자 호출하기, super()로부르면 안댐
		
		//인자로 받은 Player 정보 세팅하기
		this.p1 = p1;
		this.p2 = p2;
		
		//player의 이미지 세팅하기
		label1.setIcon(new ImageIcon(MyView.class.getResource("/image/" + p1.getImage_live())));
		label2.setIcon(new ImageIcon(MyView.class.getResource("/image/" + p2.getImage_live())));
		
		//bar 최대값, value 최대값
		bar1.setMaximum(p1.getHp());
		bar2.setMaximum(p2.getHp());
		
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());
		
		//공격하기() 메소드 호출하기
	}
	
	public void actionAttack(Player p, Player target, JProgressBar target_bar, JLabel target_label) {
		p.attack(target);
		target_bar.setValue(target.getHp());
		textArea.append(p.name + "이(가) " + target.name + "을(를) 공격합니다!\n");
		textArea.append(p.name + "의 hp : " + p.getHp() + " | power : " + p.getPower() + " | stress : " + p.getStress() + "\n");
		textArea.append(target.name + "의 hp : " + target.getHp() + " | power : " + target.getPower() + " | stress : " + target.getStress() + "\n");
		
		if (p.getStress() >= 10)
		{
			textArea.append(p.name + "이(가) 스트레스가 높아 " + target.name + "을(를) 공격하기 싫어합니다..." );
		}
		
		if (target.getHp() <= 0)
		{
			target_label.setIcon(new ImageIcon(MyView.class.getResource("/image/" + target.getImage_dead())));
			textArea.append(p.name + " 이(가) 이겼습니다!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, p.name + " Win!!!");
			dispose();
		}
	}
	
	public void actionStressRelief(Player p)
	{
		textArea.append(p.name + "이(가) 스트레스를 풉니다...\n");
		p.스트레스해소();
		textArea.append(p.name + "의 스트레스 : " + p.getStress() + "\n");
	}
}
