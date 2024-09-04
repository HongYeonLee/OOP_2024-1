package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;

import Player.Player;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class EndingView extends JFrame{

	private JFrame frame;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndingView window = new EndingView();
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
	public EndingView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		setBounds(100, 100, 1225, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("New label");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(193, 10, 850, 162);
		contentPane.add(label1);
		
		label2 = new JLabel("New label");
		label2.setBounds(33, 285, 310, 365);
		contentPane.add(label2);
		
		label3 = new JLabel("New label");
		label3.setBounds(438, 285, 310, 365);
		contentPane.add(label3);
		
		label4 = new JLabel("New label");
		label4.setBounds(863, 285, 310, 365);
		contentPane.add(label4);
		
		JLabel lblNewLabel = new JLabel("WIN!!!!!!!!!!!");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(373, 150, 491, 114);
		contentPane.add(lblNewLabel);
	}
	
	public EndingView(ArrayList<Player> win)
	{
		this();
		if (win == Main.oasis)
		{
			ImageIcon a = new ImageIcon(EndingView.class.getResource("/image/오아시스.png"));
			Image b = a.getImage().getScaledInstance(850, 162, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label1.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/노엘1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label2.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/리암1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label3.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/본헤드1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label4.setIcon(a);
			
		}
		else
		{
			ImageIcon a = new ImageIcon(EndingView.class.getResource("/image/블러.png"));
			Image b = a.getImage().getScaledInstance(850, 130, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label1.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/데이먼1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label2.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/콕슨1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label3.setIcon(a);
			
			a = new ImageIcon(EndingView.class.getResource("/image/알렉스1.png"));
			b = a.getImage().getScaledInstance(310, 365, Image.SCALE_SMOOTH);// a를 Image로 변환하여 스케일 조정
			a = new ImageIcon(b);
			label4.setIcon(a);
		}
	}
}
