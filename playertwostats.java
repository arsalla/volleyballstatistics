import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class playertwostats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playertwostats frame = new playertwostats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
	
	String twonameinput1 = AddRoster.twonameinput;
	
	
	public playertwostats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(twonameinput1);
		lblNewLabel.setBounds(201, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassingPercentage = new JLabel("Passing Average: " + ((twopassing1)/(twopasscount1)));
		lblPassingPercentage.setBounds(166, 34, 163, 16);
		contentPane.add(lblPassingPercentage);
		
		JLabel lblAces = new JLabel("Aces: " + twoacee1);
		lblAces.setBounds(109, 57, 61, 16);
		contentPane.add(lblAces);
		
		JLabel lblServiceErrors = new JLabel("Service Errors: " + twosrverr1);
		lblServiceErrors.setBounds(243, 57, 112, 16);
		contentPane.add(lblServiceErrors);
		
		JLabel lblHittingErrors = new JLabel("Hitting Errors: " + twohiterr1);
		lblHittingErrors.setBounds(242, 141, 104, 16);
		contentPane.add(lblHittingErrors);
		
		JLabel lblKills = new JLabel("Kills: " + twokill1);
		lblKills.setBounds(109, 141, 61, 16);
		contentPane.add(lblKills);
		
		JLabel lblSettingErrors = new JLabel("Setting Errors: " + twoseterr1);
		lblSettingErrors.setBounds(242, 85, 112, 16);
		contentPane.add(lblSettingErrors);
		
		JLabel lblDefensiveErrors = new JLabel("Defensive Errors: " + twodiggerr1);
		lblDefensiveErrors.setBounds(225, 113, 139, 16);
		contentPane.add(lblDefensiveErrors);
		
		JLabel lblDigs = new JLabel("Digs: " + twodigg1);
		lblDigs.setBounds(109, 113, 61, 16);
		contentPane.add(lblDigs);
		
		JLabel lblBlocks = new JLabel("Blocks: " + twoblck1);
		lblBlocks.setBounds(95, 169, 61, 16);
		contentPane.add(lblBlocks);
		
		JLabel lblBlockingErrors = new JLabel("Blocking Errors: " + twoblckerr1);
		lblBlockingErrors.setBounds(232, 169, 115, 16);
		contentPane.add(lblBlockingErrors);
		
		JLabel lblSets = new JLabel("Assists: " + twosetting1);
		lblSets.setBounds(95, 85, 75, 16);
		contentPane.add(lblSets);
	}

}
