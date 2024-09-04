package View;
import Player.Player;
import Player.노엘;
import Player.데이먼;
import Player.리암;
import Player.본헤드;
import Player.알렉스;
import Player.콕슨;
import java.awt.EventQueue;
import java.awt.Image;

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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class MyView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;
	private JButton 공격버튼1;
	private JButton 공격버튼2;
	private JProgressBar bar1;
	private JProgressBar bar2;
	private JProgressBar bar3;
	private JProgressBar bar4;
	private Player p1;
	private Player p2;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton 스트레스버튼1;
	private JButton 스트레스버튼2;
	private JButton 무기버튼1;
	private JButton 무기버튼2;
	private JLabel label4;
	private JLabel label3;
	
	private boolean isTurn;
	private JLabel lblNewLabel;
	private JLabel lblStress;
	private JLabel lblNewLabel_1;
	private JLabel lblStress_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;


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
		isTurn = true;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 눌렀을 때 완전히 꺼지게하기
		setBounds(100, 100, 1225, 802); //위치와 크기 동시에 정하기
		this.setVisible(true); //생성자에 넣어주고 써도 돼고 메인에서 써도 댐
		contentPane = new JPanel(); //몰라도 댐
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("공격");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(24, 59, 250, 446);
		contentPane.add(label1);
		
		label2 = new JLabel("타겟");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(926, 59, 250, 446);
		contentPane.add(label2);
		
		공격버튼1 = new JButton("공격하기");
		공격버튼1.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		공격버튼1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isTurn)
					actionAttack(p1, p2, bar2, label2);
	
				else
					JOptionPane.showMessageDialog(null, p1.name + "의 차례가 아닙니다");
			}
		});
		공격버튼1.setBounds(24, 609, 250, 41);
		contentPane.add(공격버튼1);
		
		공격버튼2 = new JButton("공격하기");
		공격버튼2.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		공격버튼2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isTurn)
					actionAttack(p2, p1, bar1, label1);
					
				else
					JOptionPane.showMessageDialog(null, p2.name + "의 차례가 아닙니다");
				
			}
		});
		공격버튼2.setBounds(926, 609, 250, 41);
		contentPane.add(공격버튼2);
		
		bar1 = new JProgressBar();
		bar1.setForeground(new Color(255, 0, 0));
		bar1.setBounds(24, 534, 249, 41);
		contentPane.add(bar1);
		
		bar2 = new JProgressBar();
		bar2.setForeground(new Color(255, 0, 0));
		bar2.setBounds(927, 534, 249, 45);
		contentPane.add(bar2);
		
		bar3 = new JProgressBar();
		bar3.setForeground(new Color(0, 0, 255));
		bar3.setBounds(25, 585, 249, 14);
		contentPane.add(bar3);
		
		bar4 = new JProgressBar();
		bar4.setForeground(new Color(0, 0, 255));
		bar4.setBounds(927, 585, 249, 14);
		contentPane.add(bar4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(288, 59, 620, 470);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		스트레스버튼1 = new JButton("스트레스 해소");
		스트레스버튼1.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		스트레스버튼1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isTurn)
					actionStressRelief(p1);	
				
				else
					JOptionPane.showMessageDialog(null, p1.name + "의 차례가 아닙니다");
				
			}
		});
		스트레스버튼1.setBounds(24, 710, 250, 44);
		contentPane.add(스트레스버튼1);
		
		스트레스버튼2 = new JButton("스트레스 해소");
		스트레스버튼2.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		스트레스버튼2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isTurn)
					actionStressRelief(p2);
					
				else
					JOptionPane.showMessageDialog(null, p2.name + "의 차례가 아닙니다");
				
			}
		});
		스트레스버튼2.setBounds(926, 710, 250, 44);
		contentPane.add(스트레스버튼2);
		
		무기버튼1 = new JButton("무기공격버튼");
		무기버튼1.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		무기버튼1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isTurn)
					actionWeaponAttack(p1, p2, bar2, label2);
					
				else
					JOptionPane.showMessageDialog(null, p1.name + "의 차례가 아닙니다");
				
			}
		});
		무기버튼1.setBounds(24, 660, 250, 41);
		contentPane.add(무기버튼1);
		
		무기버튼2 = new JButton("무기공격버튼");
		무기버튼2.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		무기버튼2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isTurn)
					actionWeaponAttack(p2, p1, bar1, label1);
					
				else
					JOptionPane.showMessageDialog(null, p2.name + "의 차례가 아닙니다");
			}
		});
		무기버튼2.setBounds(927, 658, 250, 41);
		contentPane.add(무기버튼2);
		
		label3 = new JLabel("New label");
		label3.setVerticalAlignment(SwingConstants.BOTTOM);
		label3.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(24, 0, 250, 50);
		contentPane.add(label3);
		
		label4 = new JLabel("New label");
		label4.setVerticalAlignment(SwingConstants.BOTTOM);
		label4.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(927, 0, 250, 50);
		contentPane.add(label4);
		
		lblNewLabel = new JLabel("HP");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(267, 534, 57, 41);
		contentPane.add(lblNewLabel);
		
		lblStress = new JLabel("Stress");
		lblStress.setHorizontalAlignment(SwingConstants.CENTER);
		lblStress.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblStress.setBounds(256, 585, 84, 14);
		contentPane.add(lblStress);
		
		lblNewLabel_1 = new JLabel("HP");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(873, 534, 57, 41);
		contentPane.add(lblNewLabel_1);
		
		lblStress_1 = new JLabel("Stress");
		lblStress_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStress_1.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblStress_1.setBounds(857, 585, 84, 14);
		contentPane.add(lblStress_1);
		
		lblNewLabel_2 = new JLabel("락스타들이 턴제로 서로를 공격합니다.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(395, 515, 374, 60);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("공격은 일반 공격과 무기 공격으로 나뉩니다.");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(372, 551, 420, 60);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("일반 공격은 락스타의 파워만큼 상대를 공격합니다.");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(326, 585, 506, 60);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("무기 공격은 락스타의 파워 + 무기의 파워 (확률적) + 무기의 추가 능력 (확률적)");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(336, 621, 506, 60);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("스트레스가 10이 넘어가면 락스타가 피곤해해 공격할 수 없습니다.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(336, 660, 506, 60);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("반드시 스트레스를 풀어줘야지만 다음 턴으로 넘어갑니다.");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(336, 701, 506, 60);
		contentPane.add(lblNewLabel_7);
		
		this.repaint();
	}
	
	public MyView(Player p1, Player p2) {
		this(); //MyWin() 기본생성자 호출하기, super()로부르면 안댐
		
		//인자로 받은 Player 정보 세팅하기
		this.p1 = p1;
		this.p2 = p2;
		
		//player의 이미지 세팅하기
		ImageIcon a = new ImageIcon(MyView.class.getResource("/image/" + p1.getImage_live()));
		Image b = a.getImage().getScaledInstance(250, 510, Image.SCALE_SMOOTH);
		a = new ImageIcon(b);
		label1.setIcon(a);
		label3.setText(p1.name);
		
		a = new ImageIcon(MyView.class.getResource("/image/" + p2.getImage_live()));
		b = a.getImage().getScaledInstance(250, 510, Image.SCALE_SMOOTH);
		a = new ImageIcon(b);
		label2.setIcon(a);
		label4.setText(p2.name);
		
		//피가 깍힌 상태로 보이도록 세팅
		bar1.setMaximum(p1.originalHp);
		bar2.setMaximum(p2.originalHp);
		
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());
		
		//스트레스 최대 
		bar3.setMaximum(25);
		bar4.setMaximum(25);
		
		bar3.setValue(p1.getStress());
		bar4.setValue(p2.getStress());
		
		//일반 공격 버튼 이름 세팅하기
		공격버튼1.setText(p1.getAttackName());
		공격버튼2.setText(p2.getAttackName());
		
		//무기 공격 버튼 이름 세팅하기
		무기버튼1.setText(p1.getWeapon().name);
		무기버튼2.setText(p2.getWeapon().name);
		
		this.repaint();
	}

	
	public void actionAttack(Player p, Player target, JProgressBar target_bar, JLabel target_label) {
		
		if (!isStressful(p))
		{
			textArea.append(p.attack(target));
			target_bar.setValue(target.getHp());
			textArea.append(target.show());
			textArea.append(p.show());
			textArea.append("\n");
			isTurn = !isTurn;
		}
		
		setStressBar();
		checkHp(p, target, target_label);
		
		this.repaint();
	}
	
	public void actionWeaponAttack(Player p, Player target, JProgressBar target_bar, JLabel target_label)
	{	
		if (!isStressful(p))
		{
			textArea.append(p.getWeapon().attack(target, p));
			target_bar.setValue(target.getHp());
			textArea.append(target.show());
			textArea.append(p.show());
			textArea.append("\n");
			isTurn = !isTurn;
		}

		setStressBar();
		checkHp(p, target, target_label);
	}
	
	public void actionStressRelief(Player p)
	{
		textArea.append(p.스트레스해소() + "\n");
		textArea.append(p.show() + "\n");
		isTurn = !isTurn;
		setStressBar();
	}
	
	public boolean isStressful(Player p)
	{
		if (p.getStress() >= 10)
		{
			textArea.append(p.name + "이(가) 스트레스가 높아 공격하기 싫어합니다...\n\n" );
			return true;
		}
		
		else
			return false;
		
	}
	
	public void checkHp(Player p, Player target, JLabel target_label)
	{
		if (target.getHp() <= 0)
		{
			ImageIcon a = new ImageIcon(MyView.class.getResource("/image/" + target.getImage_dead()));
			Image b = a.getImage().getScaledInstance(250, 510, Image.SCALE_SMOOTH);
			a = new ImageIcon(b);
			target_label.setIcon(a);
			
			textArea.append(p.name + "이(가) 이겼습니다!");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(null, p.name + "이(가) " + target.name + "을(를) 이겼습니다!");
			
			if (Main.oasis.contains(target))
				Main.oasis.remove(target);
			
			if (Main.blur.contains(target))
				Main.blur.remove(target);
			
			if (Main.oasis.isEmpty())
			{
				new EndingView(Main.blur);
				dispose();
			}
			
			else if (Main.blur.isEmpty())
			{
				new EndingView(Main.oasis);
				dispose();
			}
				
			else
			{
				if (target instanceof 노엘)
					두명뽑기.isLabel1 = true;
				else if (target instanceof 리암)
					두명뽑기.isLabel2 = true;
				else if (target instanceof 본헤드)
					두명뽑기.isLabel3 = true;
				else if (target instanceof 데이먼)
					두명뽑기.isLabel4 = true;
				else if (target instanceof 콕슨)
					두명뽑기.isLabel5 = true;
				else if (target instanceof 알렉스)
					두명뽑기.isLabel6 = true;
				
				두명뽑기 두명뽑기 = new 두명뽑기();
				두명뽑기.setVisible(true);
				dispose();
			}

		}
	}
	
	public void setStressBar()
	{
		bar3.setValue(p1.getStress());
		bar4.setValue(p2.getStress());
	}
}
