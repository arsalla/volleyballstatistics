import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRoster extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoster frame3 = new AddRoster();
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static String onenameinput;
	public static String twonameinput;
	public static String threenameinput;
	public static String fournameinput;
	public static String fivenameinput;
	public static String sixnameinput;

	
	public AddRoster() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblI = new JLabel("IV");
		lblI.setBounds(49, 16, 16, 16);
		contentPane.add(lblI);
		
		JLabel lblIii = new JLabel("III");
		lblIii.setBounds(212, 16, 16, 16);
		contentPane.add(lblIii);
		
		JLabel lblIi = new JLabel("II");
		lblIi.setBounds(370, 16, 16, 16);
		contentPane.add(lblIi);
		
		JLabel label_2 = new JLabel("I");
		label_2.setBounds(370, 107, 16, 16);
		contentPane.add(label_2);
		
		JLabel lblVi = new JLabel("VI");
		lblVi.setBounds(212, 107, 16, 16);
		contentPane.add(lblVi);
		
		JLabel lblV = new JLabel("V");
		lblV.setBounds(49, 107, 16, 16);
		contentPane.add(lblV);
		
		JTextField playerFourName = new JTextField();
		playerFourName.setBounds(6, 44, 98, 26);
		contentPane.add(playerFourName);
		playerFourName.setColumns(10);
		
		JTextField playerThreeName = new JTextField();
		playerThreeName.setColumns(10);
		playerThreeName.setBounds(167, 44, 98, 26);
		contentPane.add(playerThreeName);
		
		JTextField playerTwoName = new JTextField();
		playerTwoName.setColumns(10);
		playerTwoName.setBounds(319, 44, 98, 26);
		contentPane.add(playerTwoName);
		
		JTextField playerOneName = new JTextField();
		playerOneName.setColumns(10);
		playerOneName.setBounds(319, 128, 98, 26);
		contentPane.add(playerOneName);
		
		JTextField playerSixName = new JTextField();
		playerSixName.setColumns(10);
		playerSixName.setBounds(167, 135, 98, 26);
		contentPane.add(playerSixName);
		
		JTextField playerFiveName = new JTextField();
		playerFiveName.setColumns(10);
		playerFiveName.setBounds(6, 135, 98, 26);
		contentPane.add(playerFiveName);
		
		JButton btnSubmitLineup = new JButton("Submit Lineup");
		btnSubmitLineup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				onenameinput = playerOneName.getText();
				twonameinput = playerTwoName.getText();
				threenameinput = playerThreeName.getText();
				fournameinput = playerFourName.getText();
				fivenameinput = playerFiveName.getText();
				sixnameinput = playerSixName.getText();
				JFrame frame3 = (JFrame) contentPane.getTopLevelAncestor();
				frame3.dispose();
			}
		});
		btnSubmitLineup.setBounds(155, 196, 117, 29);
		contentPane.add(btnSubmitLineup);
	}
}
