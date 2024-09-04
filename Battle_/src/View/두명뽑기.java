package View;
import java.awt.EventQueue;
import java.awt.Image;

import Player.Player;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 두명뽑기 extends JFrame {

	private JFrame frame;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JButton btn1;

	private Random random = new Random();
	private Player attacker;
	private Player target;

	public static boolean isLabel1 = false, isLabel2 = false, isLabel3 = false, isLabel4 = false, isLabel5 = false, isLabel6 = false;
	
	ImageIcon a;
	Image b;
	private JLabel noel;
	private JLabel liam;
	private JLabel alex;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					두명뽑기 window = new 두명뽑기();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 두명뽑기() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setBounds(100, 100, 1225, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if (!isLabel1)
			a = new ImageIcon(두명뽑기.class.getResource("/image/노엘1.png"));
		
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/노엘2.png"));
		
		label1 = new JLabel("New label");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(23, 116, 200, 265);
		setLabel(label1);
		label1.setIcon(a);
		contentPane.add(label1);
		
		
		if (!isLabel2)
			a = new ImageIcon(두명뽑기.class.getResource("/image/리암1.png"));
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/리암2.png"));
		
		label2 = new JLabel("New label");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(253, 116, 200, 265);
		setLabel(label2);
		label2.setIcon(a);
		contentPane.add(label2);
		
		
		if (!isLabel3)
			a = new ImageIcon(두명뽑기.class.getResource("/image/본헤드1.png"));
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/본헤드2.png"));
		
		label3 = new JLabel("New label");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(487, 116, 200, 265);
		setLabel(label3);
		label3.setIcon(a);
		contentPane.add(label3);
		
		if (!isLabel4)
			a = new ImageIcon(두명뽑기.class.getResource("/image/데이먼1.png"));
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/데이먼2.png"));
		label4 = new JLabel("New label");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(538, 433, 200, 265);
		setLabel(label4);
		label4.setIcon(a);
		contentPane.add(label4);
		
		if(!isLabel5)
			a = new ImageIcon(두명뽑기.class.getResource("/image/콕슨1.png"));
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/콕슨2.png"));
		label5 = new JLabel("New label");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(762, 433, 200, 265);
		setLabel(label5);
		label5.setIcon(a);
		contentPane.add(label5);
		
		
		if(!isLabel6)
			a = new ImageIcon(두명뽑기.class.getResource("/image/알렉스1.png"));
		else
			a = new ImageIcon(두명뽑기.class.getResource("/image/알렉스2.png"));
		setLabel(label6);
		label6 = new JLabel("New label");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(983, 433, 200, 265);
		setLabel(label6);
		label6.setIcon(a);
		contentPane.add(label6);

		label7 = new JLabel("New label");
		label7.setBounds(175, 16, 350, 85);
		a = new ImageIcon(두명뽑기.class.getResource("/image/오아시스.png"));
		b = a.getImage().getScaledInstance(350, 85, Image.SCALE_SMOOTH);
		a = new ImageIcon(b);
		label7.setIcon(a);
		contentPane.add(label7);

		label8 = new JLabel("New label");
		label8.setBounds(720, 329, 350, 85);
		a = new ImageIcon(두명뽑기.class.getResource("/image/블러.png"));
		b = a.getImage().getScaledInstance(350, 85, Image.SCALE_SMOOTH);
		a = new ImageIcon(b);
		label8.setIcon(a);
		contentPane.add(label8);

		btn1 = new JButton("2명 뽑기");
		btn1.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseTwo();
			}
		});
		btn1.setBounds(814, 127, 212, 85);
		contentPane.add(btn1);
		
		noel = new JLabel("노엘");
		noel.setVerticalAlignment(SwingConstants.TOP);
		noel.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		noel.setHorizontalAlignment(SwingConstants.CENTER);
		noel.setBounds(23, 398, 200, 29);
		contentPane.add(noel);
		
		liam = new JLabel("리암");
		liam.setVerticalAlignment(SwingConstants.TOP);
		liam.setHorizontalAlignment(SwingConstants.CENTER);
		liam.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		liam.setBounds(253, 398, 200, 29);
		contentPane.add(liam);
		
		JLabel bonehead = new JLabel("본헤드");
		bonehead.setVerticalAlignment(SwingConstants.TOP);
		bonehead.setHorizontalAlignment(SwingConstants.CENTER);
		bonehead.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		bonehead.setBounds(487, 398, 200, 29);
		contentPane.add(bonehead);
		
		JLabel damon = new JLabel("데이먼");
		damon.setHorizontalAlignment(SwingConstants.CENTER);
		damon.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		damon.setBounds(538, 708, 200, 29);
		contentPane.add(damon);
		
		JLabel coxon = new JLabel("콕슨");
		coxon.setHorizontalAlignment(SwingConstants.CENTER);
		coxon.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		coxon.setBounds(762, 708, 200, 29);
		contentPane.add(coxon);
		
		alex = new JLabel("알렉스");
		alex.setHorizontalAlignment(SwingConstants.CENTER);
		alex.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		alex.setBounds(983, 708, 200, 29);
		contentPane.add(alex);
		
		JLabel lblNewLabel = new JLabel("브릿팝 최강 락밴드는 누가 될 것인가?!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(44, 525, 446, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오아시스와 블러의 숨막히는 대결");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(43, 570, 446, 85);
		contentPane.add(lblNewLabel_1);


		this.repaint();

	}

	public void setLabel(JLabel label)
	{
		b = a.getImage().getScaledInstance(200, 265, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
		a = new ImageIcon(b);
	}
	
	public void chooseTwo()
	{
		attacker = Main.oasis.get(random.nextInt(Main.oasis.size()));
		target = Main.blur.get(random.nextInt(Main.blur.size()));


		JOptionPane.showMessageDialog(null, "oasis의 " + attacker.name + ", blur의 " + target.name + "이(가) 뽑혔습니다!");

		//공격자와 타겟 설정
		if ((int)(Math.random()*100)%2 == 1)
		{
			Player temp = attacker;
			attacker = target;
			target = temp;
		}

		JOptionPane.showMessageDialog(null, "첫 공격은 " + attacker.name + "이(가) 시작합니다!");
		MyView myView = new MyView(attacker, target);
		myView.setVisible(true);
		dispose();
	}
}
