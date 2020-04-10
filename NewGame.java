import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewGame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tournamentField;
	private JTextField opponentField;
	private JTextField dateField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGame frame2 = new NewGame();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static String opponent = "";
	public static String tournament = "";
	public static String date = "";
	
	public NewGame() {
		setTitle("VolleyStats");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddRoster = new JButton("Add Roster");
		btnAddRoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRoster frame3 = new AddRoster();
				frame3.setVisible(true);
			}
		});
		btnAddRoster.setBounds(179, 6, 91, 38);
		contentPane.add(btnAddRoster);
		
		JRadioButton rdbtnGame = new JRadioButton("1 Game");
		buttonGroup.add(rdbtnGame);
		rdbtnGame.setBounds(55, 56, 79, 23);
		contentPane.add(rdbtnGame);
		
		JRadioButton rdbtnGames = new JRadioButton("3 Games");
		buttonGroup.add(rdbtnGames);
		rdbtnGames.setBounds(179, 56, 91, 23);
		contentPane.add(rdbtnGames);
		
		JRadioButton rdbtnGames_1 = new JRadioButton("5 Games");
		buttonGroup.add(rdbtnGames_1);
		rdbtnGames_1.setBounds(308, 56, 91, 23);
		contentPane.add(rdbtnGames_1);
		
		JLabel lblNameOfTournament = new JLabel("Tournament");
		lblNameOfTournament.setBounds(55, 91, 79, 16);
		contentPane.add(lblNameOfTournament);
		
		JLabel lblOpponent = new JLabel("Opponent");
		lblOpponent.setBounds(55, 119, 79, 16);
		contentPane.add(lblOpponent);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(55, 147, 42, 16);
		contentPane.add(lblDate);
		
		tournamentField = new JTextField();
		tournamentField.setBounds(146, 86, 176, 26);
		contentPane.add(tournamentField);
		tournamentField.setColumns(10);
		
		opponentField = new JTextField();
		opponentField.setColumns(10);
		opponentField.setBounds(146, 114, 176, 26);
		contentPane.add(opponentField);
		
		dateField = new JTextField();
		dateField.setColumns(10);
		dateField.setBounds(146, 142, 176, 26);
		contentPane.add(dateField);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opponent = opponentField.getText();
				tournament = tournamentField.getText();
				date = dateField.getText();
				
				Gameplay frame4 = new Gameplay();
				frame4.setVisible(true);
				
				NewGame frame3 = new NewGame();
				frame3.setVisible(false);
				
				
				
				
			}
		});
		btnStart.setBounds(166, 192, 117, 29);
		contentPane.add(btnStart);
	}
}
