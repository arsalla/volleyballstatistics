import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class VolleyballStats extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolleyballStats frame = new VolleyballStats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VolleyballStats() {
		setTitle("VolleyStats");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(153, 106, 143, 29);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = (JFrame) contentPane.getTopLevelAncestor();
				frame.dispose();
				NewGame frame2 = new NewGame();
				frame2.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		btnNewGame.setFont(new Font("Helvetica", Font.PLAIN, 13));
		contentPane.add(btnNewGame);
		
		JLabel lblVolleystats = new JLabel("VOLLEYSTATS");
		lblVolleystats.setForeground(Color.BLACK);
		lblVolleystats.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVolleystats.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 43));
		lblVolleystats.setBounds(104, 6, 236, 54);
		contentPane.add(lblVolleystats);
		
		JLabel label = new JLabel("VOLLEYSTATS");
		label.setForeground(Color.BLUE);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 43));
		label.setBounds(100, 6, 236, 54);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("VOLLEYSTATS");
		label_1.setForeground(Color.BLUE);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 43));
		label_1.setBounds(108, 6, 236, 54);
		contentPane.add(label_1);
		
		JLabel lblVersion = new JLabel("Version 1.0\n");
		lblVersion.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVersion.setForeground(Color.BLACK);
		lblVersion.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblVersion.setBounds(373, 243, 71, 29);
		contentPane.add(lblVersion);
	}
}
