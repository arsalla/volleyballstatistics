import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Statss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statss frame6 = new Statss();
					frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int jjvascore1 = Gameplay.jjvascore;
	int opponentscore1 = Gameplay.opponentscore;
	
	String opponent2 = NewGame.opponent;
	
	int  onepassing1 = Gameplay.onepassing;
	int  twopassing1 = Gameplay.twopassing;
	int  threepassing1 = Gameplay.threepassing;
	int  fourpassing1 = Gameplay.fourpassing;
	int  fivepassing1 = Gameplay.fivepassing;
	int  sixpassing1 = Gameplay.sixpassing;
	
	int  onepasscount1 = Gameplay.onepasscount;
	int  twopasscount1 = Gameplay.twopasscount;
	int  threepasscount1 = Gameplay.threepasscount;
	int  fourpasscount1 = Gameplay.fourpasscount;
	int  fivepasscount1 = Gameplay.fivepasscount;
	int  sixpasscount1 = Gameplay.sixpasscount;
	
	int  onesetcount1 = Gameplay.onesetcount;
	int  twosetcount1 = Gameplay.twosetcount;
	int  threesetcount1 = Gameplay.threesetcount;
	int  foursetcount1 = Gameplay.foursetcount;
	int  fivesetcount1 = Gameplay.fivesetcount;
	int  sixsetcount1 = Gameplay.sixsetcount;
	
	int  onesetting1 = Gameplay.onesetting;
	int  twosetting1 = Gameplay.twosetting;
	int  threesetting1 = Gameplay.threesetting;
	int  foursetting1 = Gameplay.foursetting;
	int  fivesetting1 = Gameplay.fivesetting;
	int  sixsetting1 = Gameplay.sixsetting;
	
	int  oneseterr1 = Gameplay.oneseterr;
	int  twoseterr1 = Gameplay.twoseterr;
	int  threeseterr1 = Gameplay.threeseterr;
	int  fourseterr1 = Gameplay.fourseterr;
	int  fiveseterr1 = Gameplay.fiveseterr;
	int  sixseterr1 = Gameplay. sixseterr;
	
	int  onehitt1 = Gameplay.onehitt;
	int  twohitt1 = Gameplay.twohitt;
	int  threehitt1 = Gameplay.threehitt;
	int  fourhitt1 = Gameplay.fourhitt;
	int  fivehitt1 = Gameplay.fivehitt;
	int  sixhitt1 = Gameplay.sixhitt;
	
	int  onekill1 = Gameplay.onekill;
	int  twokill1 = Gameplay.twokill;
	int  threekill1 = Gameplay.threekill;
	int  fourkill1 = Gameplay.fourkill;
	int  fivekill1 = Gameplay.fivekill;
	int  sixkill1 = Gameplay.sixkill;
	
	int  onehiterr1 = Gameplay.onehiterr;
	int  twohiterr1 = Gameplay.twohiterr;
	int  threehiterr1 = Gameplay.threehiterr;
	int  fourhiterr1 = Gameplay.fourhiterr;
	int  fivehiterr1 = Gameplay.fivehiterr;
	int  sixhiterr1 = Gameplay.sixhiterr;
	
	int  onedigg1 = Gameplay.onedigg;
	int  twodigg1 = Gameplay.twodigg;
	int  threedigg1 = Gameplay.threedigg;
	int  fourdigg1 = Gameplay.fourdigg;
	int  fivedigg1 = Gameplay.fivedigg;
	int  sixdigg1 = Gameplay.sixdigg;
	
	int  onediggerr1 = Gameplay.onediggerr;
	int  twodiggerr1 = Gameplay.twodiggerr;
	int  threediggerr1 = Gameplay.threediggerr;
	int  fourdiggerr1 = Gameplay.fourdiggerr;
	int  fivediggerr1 = Gameplay.fivediggerr;
	int  sixdiggerr1 = Gameplay.sixdiggerr;
	
	int  oneblck1 = Gameplay.oneblck;
	int  twoblck1 = Gameplay.twoblck;
	int  threeblck1 = Gameplay.threeblck;
	int  fourblck1 = Gameplay.fourblck;
	int  fiveblck1 = Gameplay.fiveblck;
	int  sixblck1 = Gameplay.sixblck;
	
	int  oneblckstf1 = Gameplay.oneblckstf;
	int  twoblckstf1 = Gameplay.twoblckstf;
	int  threeblckstf1 = Gameplay.threeblckstf;
	int  fourblckstf1 = Gameplay.fourblckstf;
	int  fiveblckstf1 = Gameplay.fiveblckstf;
	int  sixblckstf1 = Gameplay.sixblckstf;
	
	int  oneblckerr1 = Gameplay.oneblckerr;
	int  twoblckerr1 = Gameplay.twoblckerr;
	int  threeblckerr1 = Gameplay.threeblckerr;
	int  fourblckerr1 = Gameplay.fourblckerr;
	int  fiveblckerr1 = Gameplay.fiveblckerr;
	int  sixblckerr1 = Gameplay.sixblckerr;
	
	int  onesrv1 = Gameplay.onesrv;
	int  twosrv1 = Gameplay.twosrv;
	int  threesrv1 = Gameplay.threesrv;
	int  foursrv1 = Gameplay.foursrv;
	int  fivesrv1 = Gameplay.fivesrv;
	int  sixsrv1 = Gameplay.sixsrv;
	
	int  onesrverr1 = Gameplay.onesrverr;
	int  twosrverr1 = Gameplay.twosrverr;
	int  threesrverr1 = Gameplay.threesrverr;
	int  foursrverr1 = Gameplay.foursrverr;
	int  fivesrverr1 = Gameplay.fivesrverr;
	int  sixsrverr1 = Gameplay.sixsrverr;
	
	int  oneacee1 = Gameplay.oneacee;
	int  twoacee1 = Gameplay.twoacee;
	int  threeacee1 = Gameplay.threeacee;
	int  fouracee1 = Gameplay.fouracee;
	int  fiveacee1 = Gameplay.fiveacee;
	int  sixacee1 = Gameplay.sixacee;
	
	int teamsrverr = onesrverr1+twosrverr1+threesrverr1+foursrverr1+fivesrverr1+sixsrverr1;
	int teamacee = oneacee1+twoacee1+threeacee1+fouracee1+fiveacee1+sixacee1;
	int teamblckerr = oneblckerr1+twoblckerr1+threeblckerr1+fourblckerr1+fiveblckerr1+sixblckerr1;
	int teamblckstf = oneblckstf1+twoblckstf1+threeblckstf1+fourblckstf1+fiveblckstf1+sixblckstf1;
	int teamdiggerr = onediggerr1+twodiggerr1+threediggerr1+fourdiggerr1+fivediggerr1+sixdiggerr1;
	int teamdigg1 = onedigg1+twodigg1+threedigg1+fourdigg1+fivedigg1+sixdigg1;
	int teamhiterr = onehiterr1+twohiterr1+threehiterr1+fourhiterr1+fivehiterr1+sixhiterr1;
	int teamkill = onekill1+twokill1+threekill1+fourkill1+fivekill1+sixkill1;
	int teamseterr = oneseterr1+twoseterr1+threeseterr1+fourseterr1+fiveseterr1+sixseterr1;
	int teampassing =(onepassing1+twopassing1+threepassing1+fourpassing1+fivepassing1+sixpassing1)/(onepasscount1+twopasscount1+threepasscount1+fourpasscount1+fivepasscount1+sixpasscount1);
	
	public Statss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPlayerStats = new JButton("Player 1 Stats");
		btnPlayerStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playeronestats frame = new playeronestats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats.setBounds(282, 214, 117, 29);
		contentPane.add(btnPlayerStats);
		
		JButton btnPlayerStats_1 = new JButton("Player 2 Stats");
		btnPlayerStats_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playertwostats frame = new playertwostats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats_1.setBounds(282, 183, 117, 29);
		contentPane.add(btnPlayerStats_1);
		
		JButton btnPlayerStats_2 = new JButton("Player 3 Stats");
		btnPlayerStats_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerthreestats frame = new playerthreestats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats_2.setBounds(167, 183, 117, 29);
		contentPane.add(btnPlayerStats_2);
		
		JButton btnPlayerStats_3 = new JButton("Player 4 Stats");
		btnPlayerStats_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerfourstats frame = new playerfourstats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats_3.setBounds(41, 183, 117, 29);
		contentPane.add(btnPlayerStats_3);
		
		JButton btnPlayerStats_4 = new JButton("Player 5 Stats");
		btnPlayerStats_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerfivestats frame = new playerfivestats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats_4.setBounds(41, 214, 117, 29);
		contentPane.add(btnPlayerStats_4);
		
		JButton btnPlayerStats_5 = new JButton("Player 6 Stats");
		btnPlayerStats_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playersixstats frame = new playersixstats();
				frame.setVisible(true);
			}
		});
		btnPlayerStats_5.setBounds(167, 214, 117, 29);
		contentPane.add(btnPlayerStats_5);
		
		JLabel lblTeamPasing = new JLabel("Passing Percentage: " + teampassing);
		lblTeamPasing.setBounds(6, 32, 144, 16);
		contentPane.add(lblTeamPasing);
		
		JLabel lblNewLabel = new JLabel("Service Errors: " + teamsrverr);
		lblNewLabel.setBounds(41, 60, 166, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAces = new JLabel("Aces: " + teamacee);
		lblAces.setBounds(95, 88, 61, 16);
		contentPane.add(lblAces);
		
		JLabel lblHittingErrors = new JLabel("Hitting Errors: " + teamhiterr);
		lblHittingErrors.setBounds(41, 116, 126, 16);
		contentPane.add(lblHittingErrors);
		
		JLabel lblNewLabel_1 = new JLabel("Kills: " + teamkill);
		lblNewLabel_1.setBounds(98, 144, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSettingErrors = new JLabel("Setting Errors: " + teamseterr);
		lblSettingErrors.setBounds(246, 32, 109, 16);
		contentPane.add(lblSettingErrors);
		
		JLabel lblJjva = new JLabel("JJVA : " + jjvascore1);
		lblJjva.setBounds(119, 6, 61, 16);
		contentPane.add(lblJjva);
		
		JLabel lblOpponent = new JLabel(opponentscore1 + " : " + opponent2);
		lblOpponent.setBounds(244, 6, 155, 16);
		contentPane.add(lblOpponent);
		
		JLabel lblBlockingErrors = new JLabel("Blocking Errors: " + teamblckerr);
		lblBlockingErrors.setBounds(237, 60, 126, 16);
		contentPane.add(lblBlockingErrors);
		
		JLabel lblBlocks = new JLabel("Blocks: " + teamblckstf);
		lblBlocks.setBounds(291, 88, 61, 16);
		contentPane.add(lblBlocks);
		
		JLabel lblDigs = new JLabel("Digs: " + teamdigg1);
		lblDigs.setBounds(302, 116, 61, 16);
		contentPane.add(lblDigs);
		
		JLabel lblDefensiveErrors = new JLabel("Defensive Errors: " + teamdiggerr);
		lblDefensiveErrors.setBounds(229, 144, 155, 16);
		contentPane.add(lblDefensiveErrors);
	}
}
