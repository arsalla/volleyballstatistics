import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class Gameplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gameplay frame4 = new Gameplay();
					frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public static int jjvascore = 0;
	public static int  opponentscore = 0;
	public static String getOpponent() {
		return getOpponent();
	}
	public static String onenameinput;
	public static String twonameinput;
	public static String threenameinput;
	public static String fournameinput;
	public static String fivenameinput;
	public static String sixnameinput;
	
	public static int  onepassing = 0;
	public static int  twopassing = 0;
	public static int  threepassing = 0;
	public static int  fourpassing = 0;
	public static int  fivepassing = 0;
	public static int  sixpassing = 0;
	
	public static int  onepasscount = 0;
	public static int  twopasscount = 0;
	public static int  threepasscount = 0;
	public static int  fourpasscount = 0;
	public static int  fivepasscount = 0;
	public static int  sixpasscount = 0;
	
	public static int  onesetcount = 0;
	public static int  twosetcount = 0;
	public static int  threesetcount = 0;
	public static int  foursetcount = 0;
	public static int  fivesetcount = 0;
	public static int  sixsetcount = 0;
	
	public static int  onesetting = 0;
	public static int  twosetting = 0;
	public static int  threesetting = 0;
	public static int  foursetting = 0;
	public static int  fivesetting = 0;
	public static int  sixsetting = 0;
	
	public static int  oneseterr = 0;
	public static int  twoseterr = 0;
	public static int  threeseterr = 0;
	public static int  fourseterr = 0;
	public static int  fiveseterr = 0;
	public static int  sixseterr = 0; 
	
	public static int  onehitt = 0;
	public static int  twohitt = 0;
	public static int  threehitt = 0;
	public static int  fourhitt = 0;
	public static int  fivehitt = 0;
	public static int  sixhitt = 0;
	
	public static int  onekill = 0;
	public static int  twokill = 0;
	public static int  threekill = 0;
	public static int  fourkill = 0;
	public static int  fivekill = 0;
	public static int  sixkill = 0;
	
	public static int  onehiterr = 0;
	public static int  twohiterr = 0;
	public static int  threehiterr = 0;
	public static int  fourhiterr = 0;
	public static int  fivehiterr = 0;
	public static int  sixhiterr = 0;
	
	public static int  onedigg = 0;
	public static int  twodigg = 0;
	public static int  threedigg = 0;
	public static int  fourdigg = 0;
	public static int  fivedigg = 0;
	public static int  sixdigg = 0;
	
	public static int  onediggerr = 0;
	public static int  twodiggerr = 0;
	public static int  threediggerr = 0;
	public static int  fourdiggerr = 0;
	public static int  fivediggerr = 0;
	public static int  sixdiggerr = 0;
	
	public static int  oneblck = 0;
	public static int  twoblck = 0;
	public static int  threeblck = 0;
	public static int  fourblck = 0;
	public static int  fiveblck = 0;
	public static int  sixblck = 0;
	
	public static int  oneblckstf = 0;
	public static int  twoblckstf = 0;
	public static int  threeblckstf = 0;
	public static int  fourblckstf = 0;
	public static int  fiveblckstf = 0;
	public static int  sixblckstf = 0;
	
	public static int  oneblckerr = 0;
	public static int  twoblckerr = 0;
	public static int  threeblckerr = 0;
	public static int  fourblckerr = 0;
	public static int  fiveblckerr = 0;
	public static int  sixblckerr = 0;
	
	public static int  onesrv = 0;
	public static int  twosrv = 0;
	public static int  threesrv = 0;
	public static int  foursrv = 0;
	public static int  fivesrv = 0;
	public static int  sixsrv = 0;
	
	public static int  onesrverr = 0;
	public static int  twosrverr = 0;
	public static int  threesrverr = 0;
	public static int  foursrverr = 0;
	public static int  fivesrverr = 0;
	public static int  sixsrverr = 0;
	
	public static int  oneacee = 0;
	public static int  twoacee = 0;
	public static int  threeacee = 0;
	public static int  fouracee = 0;
	public static int  fiveacee = 0;
	public static int  sixacee = 0;
	
	public static String winner = "";
	public static String loser = "";
	
	String opponent1 = NewGame.opponent;
	
	String playerone = AddRoster.onenameinput;
	String playertwo = AddRoster.twonameinput;
	String playerthree = AddRoster.threenameinput;
	String playerfour = AddRoster.fournameinput;
	String playerfive = AddRoster.fivenameinput;
	String playersix = AddRoster.sixnameinput;
	
	public Gameplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 74, 150, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton fourpassone = new JButton("1");
		fourpassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourpassing = fourpassing +1;
				fourpasscount++;
			}
		});
		fourpassone.setForeground(Color.BLACK);
		fourpassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		fourpassone.setBounds(33, 29, 43, 29);
		panel.add(fourpassone);
		
		JButton fourpasstwo = new JButton("2");
		fourpasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourpassing = fourpassing + 2;
				fourpasscount++;
			}
		});
		fourpasstwo.setBounds(69, 29, 43, 29);
		panel.add(fourpasstwo);
		
		JButton fourpassthree = new JButton("3");
		fourpassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourpassing = fourpassing + 3;
				fourpasscount++;
			}
		});
		fourpassthree.setBounds(107, 29, 43, 29);
		panel.add(fourpassthree);
		
		JButton fourpasszero = new JButton("0");
		fourpasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourpasscount++;
				opponentscore++;
			}
		});
		fourpasszero.setForeground(Color.BLACK);
		fourpasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		fourpasszero.setBounds(0, 29, 43, 29);
		panel.add(fourpasszero);
		
		JButton foursetassist = new JButton("AST");
		foursetassist.setForeground(Color.BLACK);
		foursetassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		foursetassist.setBackground(Color.YELLOW);
		foursetassist.setBounds(96, 60, 54, 29);
		panel.add(foursetassist);
		
		JButton fourset = new JButton("SET");
		fourset.setForeground(Color.BLACK);
		fourset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourset.setBounds(43, 60, 63, 29);
		panel.add(fourset);
		
		JButton fourseterror = new JButton("ERR");
		fourseterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		fourseterror.setForeground(Color.BLACK);
		fourseterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourseterror.setBounds(0, 60, 54, 29);
		panel.add(fourseterror);
		
		JButton fourhiterror = new JButton("ERR");
		fourhiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		fourhiterror.setForeground(Color.BLACK);
		fourhiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourhiterror.setBounds(0, 89, 54, 29);
		panel.add(fourhiterror);
		
		JButton fourhitkill = new JButton("KILL");
		fourhitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourhitt++;
				fourkill++;
				jjvascore++;
			}
		});
		fourhitkill.setForeground(Color.BLACK);
		fourhitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourhitkill.setBounds(96, 89, 54, 29);
		panel.add(fourhitkill);
		
		JButton fourhit = new JButton("HIT");
		fourhit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourhitt++;
			}
		});
		fourhit.setForeground(Color.BLACK);
		fourhit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourhit.setBackground(Color.BLUE);
		fourhit.setBounds(43, 89, 63, 29);
		panel.add(fourhit);
		
		JButton fourdig = new JButton("DIG");
		fourdig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourdigg++;
			}
		});
		fourdig.setForeground(Color.BLACK);
		fourdig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourdig.setBackground(Color.BLUE);
		fourdig.setBounds(69, 114, 63, 29);
		panel.add(fourdig);
		
		JButton fourdigerror = new JButton("ERR");
		fourdigerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourdigg++;
				fourdiggerr++;
				opponentscore++;
			}
		});
		fourdigerror.setForeground(Color.BLACK);
		fourdigerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourdigerror.setBackground(Color.BLUE);
		fourdigerror.setBounds(13, 114, 63, 29);
		panel.add(fourdigerror);
		
		JButton fourblockerror = new JButton("ERR");
		fourblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourblck++;
				fourblckerr++;
				opponentscore++;
			}
		});
		fourblockerror.setForeground(Color.BLACK);
		fourblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourblockerror.setBounds(0, 140, 54, 29);
		panel.add(fourblockerror);
		
		JButton fourblock = new JButton("BLK");
		fourblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourblck++;
				
			}
		});
		fourblock.setForeground(Color.BLACK);
		fourblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourblock.setBackground(Color.BLUE);
		fourblock.setBounds(43, 140, 63, 29);
		panel.add(fourblock);
		
		JButton fourblockstuff = new JButton("END");
		fourblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fourblck++;
				fourblckstf++;
				jjvascore++;
			}
		});
		fourblockstuff.setForeground(Color.BLACK);
		fourblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourblockstuff.setBounds(96, 140, 54, 29);
		panel.add(fourblockstuff);
		
		JButton fourserveerror = new JButton("ERR");
		fourserveerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foursrv++;
				foursrverr++;
				opponentscore++;
			}
		});
		fourserveerror.setForeground(Color.BLACK);
		fourserveerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fourserveerror.setBounds(0, 166, 54, 29);
		panel.add(fourserveerror);
		
		JButton button_5 = new JButton("ACE");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foursrv++;
				fouracee++;
				jjvascore++;
			}
		});
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_5.setBackground(Color.YELLOW);
		button_5.setBounds(96, 166, 54, 29);
		panel.add(button_5);
		
		JButton button_12 = new JButton("SERVE");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foursrv++;
			}
		});
		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_12.setBounds(43, 166, 63, 29);
		panel.add(button_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(242, 74, 150, 201);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton threepassone = new JButton("1");
		threepassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threepassing = threepassing + 1;
				threepasscount++;
			}
		});
		threepassone.setForeground(Color.BLACK);
		threepassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		threepassone.setBounds(33, 28, 43, 29);
		panel_1.add(threepassone);
		
		JButton threepasstwo = new JButton("2");
		threepasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threepassing = threepassing + 2;
				threepasscount++;
			}
		});
		threepasstwo.setBounds(69, 28, 43, 29);
		panel_1.add(threepasstwo);
		
		JButton threepassthree = new JButton("3");
		threepassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threepassing = threepassing + 3;
				threepasscount++;
			}
		});
		threepassthree.setBounds(107, 28, 43, 29);
		panel_1.add(threepassthree);
		
		JButton threepasszero = new JButton("0");
		threepasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threepasscount++;
				opponentscore++;
			}
		});
		threepasszero.setForeground(Color.BLACK);
		threepasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		threepasszero.setBounds(0, 28, 43, 29);
		panel_1.add(threepasszero);
		
		JButton threesetassist = new JButton("AST");
		threesetassist.setForeground(Color.BLACK);
		threesetassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threesetassist.setBackground(Color.YELLOW);
		threesetassist.setBounds(96, 59, 54, 29);
		panel_1.add(threesetassist);
		
		JButton threeset = new JButton("SET");
		threeset.setForeground(Color.BLACK);
		threeset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeset.setBounds(43, 59, 63, 29);
		panel_1.add(threeset);
		
		JButton threeseterror = new JButton("ERR");
		threeseterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		threeseterror.setForeground(Color.BLACK);
		threeseterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeseterror.setBounds(0, 59, 54, 29);
		panel_1.add(threeseterror);
		
		JButton threhiterror = new JButton("ERR");
		threhiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		threhiterror.setForeground(Color.BLACK);
		threhiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threhiterror.setBounds(0, 88, 54, 29);
		panel_1.add(threhiterror);
		
		JButton threehitkill = new JButton("KILL");
		threehitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threehitt++;
				threekill++;
				jjvascore++;
			}
		});
		threehitkill.setForeground(Color.BLACK);
		threehitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threehitkill.setBounds(96, 88, 54, 29);
		panel_1.add(threehitkill);
		
		JButton threehit = new JButton("HIT");
		threehit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threehitt++;
			}
		});
		threehit.setForeground(Color.BLACK);
		threehit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threehit.setBackground(Color.BLUE);
		threehit.setBounds(43, 88, 63, 29);
		panel_1.add(threehit);
		
		JButton threedig = new JButton("DIG");
		threedig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threedigg++;
			}
		});
		threedig.setForeground(Color.BLACK);
		threedig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threedig.setBackground(Color.BLUE);
		threedig.setBounds(69, 113, 63, 29);
		panel_1.add(threedig);
		
		JButton threedefenseerror = new JButton("ERR");
		threedefenseerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onedigg++;
				onediggerr++;
				opponentscore++;
				System.out.println("JJVA: "+jjvascore+"\nOpponent: "+opponentscore+"\n"+onesrv);
			}
		});
		threedefenseerror.setForeground(Color.BLACK);
		threedefenseerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threedefenseerror.setBackground(Color.BLUE);
		threedefenseerror.setBounds(13, 113, 63, 29);
		panel_1.add(threedefenseerror);
		
		JButton threeblockerror = new JButton("ERR");
		threeblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threeblck++;
				threeblck++;
				opponentscore++;
			}
		});
		threeblockerror.setForeground(Color.BLACK);
		threeblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeblockerror.setBounds(0, 139, 54, 29);
		panel_1.add(threeblockerror);
		
		JButton threeblock = new JButton("BLK");
		threeblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threeblck++;
			}
		});
		threeblock.setForeground(Color.BLACK);
		threeblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeblock.setBackground(Color.BLUE);
		threeblock.setBounds(43, 139, 63, 29);
		panel_1.add(threeblock);
		
		JButton threeblockstuff = new JButton("END");
		threeblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threeblck++;
				threeblckstf++;
				jjvascore++;
			}
		});
		threeblockstuff.setForeground(Color.BLACK);
		threeblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeblockstuff.setBounds(96, 139, 54, 29);
		panel_1.add(threeblockstuff);
		
		JButton threeserveerror = new JButton("ERR");
		threeserveerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threesrv++;
				threesrverr++;
				opponentscore++;
			}
		});
		threeserveerror.setForeground(Color.BLACK);
		threeserveerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		threeserveerror.setBounds(0, 166, 54, 29);
		panel_1.add(threeserveerror);
		
		JButton button_7 = new JButton("ACE");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threesrv++;
				threeacee++;
			}
		});
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_7.setBackground(Color.YELLOW);
		button_7.setBounds(96, 166, 54, 29);
		panel_1.add(button_7);
		
		JButton button_13 = new JButton("SERVE");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threesrv++;
				
			}
		});
		button_13.setForeground(Color.BLACK);
		button_13.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_13.setBounds(43, 166, 63, 29);
		panel_1.add(button_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(452, 74, 150, 201);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton twopassone = new JButton("1");
		twopassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twopassing = twopassing + 1;
				twopasscount++;
			}
		});
		twopassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		twopassone.setForeground(Color.BLACK);
		twopassone.setBounds(33, 30, 43, 29);
		panel_2.add(twopassone);
		
		JButton twopasstwo = new JButton("2");
		twopasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twopassing = twopassing + 2;
				twopasscount++;
			}
		});
		twopasstwo.setBounds(69, 30, 43, 29);
		panel_2.add(twopasstwo);
		
		JButton twopassthree = new JButton("3");
		twopassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twopassing = twopassing + 3;
				twopasscount++;
			}
		});
		twopassthree.setBounds(107, 30, 43, 29);
		panel_2.add(twopassthree);
		
		JButton twopasszero = new JButton("0");
		twopasszero.setBackground(Color.BLUE);
		twopasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twopasscount++;
				opponentscore++;
			}
		});
		twopasszero.setForeground(Color.BLACK);
		twopasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		twopasszero.setBounds(0, 30, 43, 29);
		panel_2.add(twopasszero);
		
		JButton twoassist = new JButton("AST");
		twoassist.setBackground(Color.YELLOW);
		twoassist.setForeground(Color.BLACK);
		twoassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoassist.setBounds(96, 61, 54, 29);
		panel_2.add(twoassist);
		
		JButton twoset = new JButton("SET");
		twoset.setForeground(Color.BLACK);
		twoset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoset.setBounds(43, 61, 63, 29);
		panel_2.add(twoset);
		
		JButton twoerror = new JButton("ERR");
		twoerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		twoerror.setForeground(Color.BLACK);
		twoerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoerror.setBounds(0, 61, 54, 29);
		panel_2.add(twoerror);
		
		JButton twohiterror = new JButton("ERR");
		twohiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		twohiterror.setForeground(Color.BLACK);
		twohiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twohiterror.setBounds(0, 90, 54, 29);
		panel_2.add(twohiterror);
		
		JButton twohitkill = new JButton("KILL");
		twohitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twohitt++;
				twokill++;
				jjvascore++;
			
			}
		});
		twohitkill.setForeground(Color.BLACK);
		twohitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twohitkill.setBounds(96, 90, 54, 29);
		panel_2.add(twohitkill);
		
		JButton twohit = new JButton("HIT");
		twohit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twohitt++;
			}
		});
		twohit.setBackground(Color.BLUE);
		twohit.setForeground(Color.BLACK);
		twohit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twohit.setBounds(43, 90, 63, 29);
		panel_2.add(twohit);
		
		JButton btnDig = new JButton("DIG");
		btnDig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twodigg++;
			}
		});
		btnDig.setForeground(Color.BLACK);
		btnDig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnDig.setBackground(Color.BLUE);
		btnDig.setBounds(69, 115, 63, 29);
		panel_2.add(btnDig);
		
		JButton twodigerror = new JButton("ERR");
		twodigerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twodigg++;
				twodiggerr++;
				opponentscore++;
			}
		});
		twodigerror.setForeground(Color.BLACK);
		twodigerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twodigerror.setBackground(Color.BLUE);
		twodigerror.setBounds(13, 115, 63, 29);
		panel_2.add(twodigerror);
		
		JButton twoblockerror = new JButton("ERR");
		twoblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twoblck++;
				twoblckerr++;
				opponentscore++;
			}
		});
		twoblockerror.setForeground(Color.BLACK);
		twoblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoblockerror.setBounds(0, 141, 54, 29);
		panel_2.add(twoblockerror);
		
		JButton twoblock = new JButton("BLK");
		twoblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twoblck++;
			}
		});
		twoblock.setForeground(Color.BLACK);
		twoblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoblock.setBackground(Color.BLUE);
		twoblock.setBounds(43, 141, 63, 29);
		panel_2.add(twoblock);
		
		JButton twoblockstuff = new JButton("END");
		twoblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twoblckstf++;
				twoblck++;
				jjvascore++;
			}
		});
		twoblockstuff.setForeground(Color.BLACK);
		twoblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoblockstuff.setBounds(96, 141, 54, 29);
		panel_2.add(twoblockstuff);
		
		JButton twoserveerrror = new JButton("ERR");
		twoserveerrror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twosrv++;
				twosrverr++;
				opponentscore++;
			}
		});
		twoserveerrror.setForeground(Color.BLACK);
		twoserveerrror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		twoserveerrror.setBounds(0, 166, 54, 29);
		panel_2.add(twoserveerrror);
		
		JButton button_9 = new JButton("ACE");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twosrv++;
				twoacee++;
				jjvascore++;
			}
		});
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_9.setBackground(Color.YELLOW);
		button_9.setBounds(96, 166, 54, 29);
		panel_2.add(button_9);
		
		JButton button_14 = new JButton("SERVE");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twosrv++;
			}
		});
		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_14.setBounds(43, 166, 63, 29);
		panel_2.add(button_14);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(29, 315, 150, 201);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton fivepassone = new JButton("1");
		fivepassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivepassing = fivepassing + 1;
				fivepasscount++;
			}
		});
		fivepassone.setForeground(Color.BLACK);
		fivepassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		fivepassone.setBounds(33, 26, 43, 29);
		panel_3.add(fivepassone);
		
		JButton fivepasstwo = new JButton("2");
		fivepasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivepassing = fivepassing + 2;
				fivepasscount++;
			}
		});
		fivepasstwo.setBounds(69, 26, 43, 29);
		panel_3.add(fivepasstwo);
		
		JButton fivepassthree = new JButton("3");
		fivepassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivepassing = fivepassing + 3;
				fivepasscount++;
			}
		});
		fivepassthree.setBounds(107, 26, 43, 29);
		panel_3.add(fivepassthree);
		
		JButton fivepasszero = new JButton("0");
		fivepasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivepasscount++;
				opponentscore++;
			}
		});
		fivepasszero.setForeground(Color.BLACK);
		fivepasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		fivepasszero.setBounds(0, 26, 43, 29);
		panel_3.add(fivepasszero);
		
		JButton fivesetassist = new JButton("AST");
		fivesetassist.setForeground(Color.BLACK);
		fivesetassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivesetassist.setBackground(Color.YELLOW);
		fivesetassist.setBounds(96, 57, 54, 29);
		panel_3.add(fivesetassist);
		
		JButton fiveset = new JButton("SET");
		fiveset.setForeground(Color.BLACK);
		fiveset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveset.setBounds(43, 57, 63, 29);
		panel_3.add(fiveset);
		
		JButton fiveseterror = new JButton("ERR");
		fiveseterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		fiveseterror.setForeground(Color.BLACK);
		fiveseterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveseterror.setBounds(0, 57, 54, 29);
		panel_3.add(fiveseterror);
		
		JButton fivehiterror = new JButton("ERR");
		fivehiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		fivehiterror.setForeground(Color.BLACK);
		fivehiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivehiterror.setBounds(0, 86, 54, 29);
		panel_3.add(fivehiterror);
		
		JButton fivehitkill = new JButton("KILL");
		fivehitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivehitt++;
				fivekill++;
				jjvascore++;
			}
		});
		fivehitkill.setForeground(Color.BLACK);
		fivehitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivehitkill.setBounds(96, 86, 54, 29);
		panel_3.add(fivehitkill);
		
		JButton fivehit = new JButton("HIT");
		fivehit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivehitt++;
			}
		});
		fivehit.setForeground(Color.BLACK);
		fivehit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivehit.setBackground(Color.BLUE);
		fivehit.setBounds(43, 86, 63, 29);
		panel_3.add(fivehit);
		
		JButton fivedig = new JButton("DIG");
		fivedig.setForeground(Color.BLACK);
		fivedig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivedig.setBackground(Color.BLUE);
		fivedig.setBounds(69, 111, 63, 29);
		panel_3.add(fivedig);
		
		JButton fivedigerror = new JButton("ERR");
		fivedigerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivedigg++;
				fivediggerr++;
				opponentscore++;
			}
		});
		fivedigerror.setForeground(Color.BLACK);
		fivedigerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fivedigerror.setBackground(Color.BLUE);
		fivedigerror.setBounds(13, 111, 63, 29);
		panel_3.add(fivedigerror);
		
		JButton fiveblockerror = new JButton("ERR");
		fiveblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fiveblck++;
				fiveblckerr++;
				opponentscore++;
			}
		});
		fiveblockerror.setForeground(Color.BLACK);
		fiveblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveblockerror.setBounds(0, 137, 54, 29);
		panel_3.add(fiveblockerror);
		
		JButton fiveblock = new JButton("BLK");
		fiveblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fiveblck++;
			}
		});
		fiveblock.setForeground(Color.BLACK);
		fiveblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveblock.setBackground(Color.BLUE);
		fiveblock.setBounds(43, 137, 63, 29);
		panel_3.add(fiveblock);
		
		JButton fiveblockstuff = new JButton("END");
		fiveblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fiveblckstf++;
				fiveblck++;
				jjvascore++;
			
			}
		});
		fiveblockstuff.setForeground(Color.BLACK);
		fiveblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveblockstuff.setBounds(96, 137, 54, 29);
		panel_3.add(fiveblockstuff);
		
		JButton fiveserveerror = new JButton("ERR");
		fiveserveerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivesrv++;
				fivesrverr++;
				opponentscore++;
				
			}
		});
		fiveserveerror.setForeground(Color.BLACK);
		fiveserveerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		fiveserveerror.setBounds(0, 166, 54, 29);
		panel_3.add(fiveserveerror);
		
		JButton button_3 = new JButton("ACE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivesrv++;
				fiveacee++;
				jjvascore++;
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(96, 166, 54, 29);
		panel_3.add(button_3);
		
		JButton button_11 = new JButton("SERVE");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fivesrv++;
			}
		});
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_11.setBounds(43, 166, 63, 29);
		panel_3.add(button_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(242, 315, 150, 201);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton sixpassone = new JButton("1");
		sixpassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixpassing = sixpassing + 1;
				sixpasscount++;
			}
		});
		sixpassone.setForeground(Color.BLACK);
		sixpassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		sixpassone.setBounds(33, 27, 43, 29);
		panel_4.add(sixpassone);
		
		JButton sixpasstwo = new JButton("2");
		sixpasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixpassing = sixpassing + 2;
				sixpasscount++;
			}
		});
		sixpasstwo.setBounds(69, 27, 43, 29);
		panel_4.add(sixpasstwo);
		
		JButton sixpassthree = new JButton("3");
		sixpassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixpassing = sixpassing + 3;
				sixpasscount++;
			}
		});
		sixpassthree.setBounds(107, 27, 43, 29);
		panel_4.add(sixpassthree);
		
		JButton sizpasszero = new JButton("0");
		sizpasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixpasscount++;
				opponentscore++;
			}
		});
		sizpasszero.setForeground(Color.BLACK);
		sizpasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		sizpasszero.setBounds(0, 27, 43, 29);
		panel_4.add(sizpasszero);
		
		JButton sixsetassist = new JButton("AST");
		sixsetassist.setForeground(Color.BLACK);
		sixsetassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixsetassist.setBackground(Color.YELLOW);
		sixsetassist.setBounds(96, 58, 54, 29);
		panel_4.add(sixsetassist);
		
		JButton sixset = new JButton("SET");
		sixset.setForeground(Color.BLACK);
		sixset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixset.setBounds(43, 58, 63, 29);
		panel_4.add(sixset);
		
		JButton sixseterror = new JButton("ERR");
		sixseterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		sixseterror.setForeground(Color.BLACK);
		sixseterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixseterror.setBounds(0, 58, 54, 29);
		panel_4.add(sixseterror);
		
		JButton sixhiterror = new JButton("ERR");
		sixhiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		sixhiterror.setForeground(Color.BLACK);
		sixhiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixhiterror.setBounds(0, 87, 54, 29);
		panel_4.add(sixhiterror);
		
		JButton sixhitkill = new JButton("KILL");
		sixhitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixhitt++;
				sixkill++;
				jjvascore++;
			}
		});
		sixhitkill.setForeground(Color.BLACK);
		sixhitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixhitkill.setBounds(96, 87, 54, 29);
		panel_4.add(sixhitkill);
		
		JButton sixhit = new JButton("HIT");
		sixhit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixhitt++;
			}
		});
		sixhit.setForeground(Color.BLACK);
		sixhit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixhit.setBackground(Color.BLUE);
		sixhit.setBounds(43, 87, 63, 29);
		panel_4.add(sixhit);
		
		JButton sixdig = new JButton("DIG");
		sixdig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixdigg++;
			}
		});
		sixdig.setForeground(Color.BLACK);
		sixdig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixdig.setBackground(Color.BLUE);
		sixdig.setBounds(69, 112, 63, 29);
		panel_4.add(sixdig);
		
		JButton sixdigerror = new JButton("ERR");
		sixdigerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixdigg++;
				sixdiggerr++;
				opponentscore++;
			}
		});
		sixdigerror.setForeground(Color.BLACK);
		sixdigerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixdigerror.setBackground(Color.BLUE);
		sixdigerror.setBounds(13, 112, 63, 29);
		panel_4.add(sixdigerror);
		
		JButton sixblockerror = new JButton("ERR");
		sixblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixblck++;
				sixblckerr++;
				opponentscore++;
			}
		});
		sixblockerror.setForeground(Color.BLACK);
		sixblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixblockerror.setBounds(0, 138, 54, 29);
		panel_4.add(sixblockerror);
		
		JButton sixblock = new JButton("BLK");
		sixblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixblck++;
			}
		});
		sixblock.setForeground(Color.BLACK);
		sixblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixblock.setBackground(Color.BLUE);
		sixblock.setBounds(43, 138, 63, 29);
		panel_4.add(sixblock);
		
		JButton sixblockstuff = new JButton("END");
		sixblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixblck++;
				sixblckstf++;
				jjvascore++;
			}
		});
		sixblockstuff.setForeground(Color.BLACK);
		sixblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixblockstuff.setBounds(96, 138, 54, 29);
		panel_4.add(sixblockstuff);
		
		JButton sixserveerror = new JButton("ERR");
		sixserveerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixsrv++;
				sixsrverr++;
				opponentscore++;
			}
		});
		sixserveerror.setForeground(Color.BLACK);
		sixserveerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		sixserveerror.setBounds(0, 166, 54, 29);
		panel_4.add(sixserveerror);
		
		JButton button_1 = new JButton("ACE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixsrv++;
				sixacee++;
				jjvascore++;
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(96, 166, 54, 29);
		panel_4.add(button_1);
		
		JButton button_10 = new JButton("SERVE");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sixsrv++;
			}
		});
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		button_10.setBounds(43, 166, 63, 29);
		panel_4.add(button_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(452, 315, 150, 201);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton onepassone = new JButton("1");
		onepassone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onepassing = onepassing + 1;
				onepasscount++;
			}
		});
		onepassone.setForeground(Color.BLACK);
		onepassone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		onepassone.setBounds(33, 29, 43, 29);
		panel_5.add(onepassone);
		
		JButton onepasstwo = new JButton("2");
		onepasstwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onepassing = onepassing + 2;
				onepasscount++;
			}
		});
		onepasstwo.setBounds(69, 29, 43, 29);
		panel_5.add(onepasstwo);
		
		JButton onepassthree = new JButton("3");
		onepassthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onepassing = onepassing + 3;
				onepasscount++;
			}
		});
		onepassthree.setBounds(107, 29, 43, 29);
		panel_5.add(onepassthree);
		
		JButton onepasszero = new JButton("0");
		onepasszero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onepasscount++;
				opponentscore++;
			}
		});
		onepasszero.setForeground(Color.BLACK);
		onepasszero.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		onepasszero.setBounds(0, 29, 43, 29);
		panel_5.add(onepasszero);
		
		JButton onesetassist = new JButton("AST");
		onesetassist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		onesetassist.setForeground(Color.BLACK);
		onesetassist.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onesetassist.setBackground(Color.YELLOW);
		onesetassist.setBounds(96, 60, 54, 29);
		panel_5.add(onesetassist);
		
		JButton oneset = new JButton("SET");
		oneset.setForeground(Color.BLACK);
		oneset.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		oneset.setBounds(43, 60, 63, 29);
		panel_5.add(oneset);
		
		JButton oneseterror = new JButton("ERR");
		oneseterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		oneseterror.setForeground(Color.BLACK);
		oneseterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		oneseterror.setBounds(0, 60, 54, 29);
		panel_5.add(oneseterror);
		
		JButton onehiterror = new JButton("ERR");
		onehiterror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opponentscore++;
			}
		});
		onehiterror.setForeground(Color.BLACK);
		onehiterror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onehiterror.setBounds(0, 89, 54, 29);
		panel_5.add(onehiterror);
		
		JButton onehitkill = new JButton("KILL");
		onehitkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onehitt++;
				onekill++;
				jjvascore++;
				
			}
		});
		onehitkill.setForeground(Color.BLACK);
		onehitkill.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onehitkill.setBounds(96, 89, 54, 29);
		panel_5.add(onehitkill);
		
		JButton onehit = new JButton("HIT");
		onehit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onehitt++;
			}
		});
		onehit.setForeground(Color.BLACK);
		onehit.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onehit.setBackground(Color.BLUE);
		onehit.setBounds(43, 89, 63, 29);
		panel_5.add(onehit);
		
		JButton onedig = new JButton("DIG");
		onedig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onedigg++;
			}
		});
		onedig.setForeground(Color.BLACK);
		onedig.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onedig.setBackground(Color.BLUE);
		onedig.setBounds(69, 114, 63, 29);
		panel_5.add(onedig);
		
		JButton onediigerror = new JButton("ERR");
		onediigerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onedigg++;
				onediggerr++;
				opponentscore++;
			}
		});
		onediigerror.setForeground(Color.BLACK);
		onediigerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		onediigerror.setBackground(Color.BLUE);
		onediigerror.setBounds(13, 114, 63, 29);
		panel_5.add(onediigerror);
		
		JButton oneblockerror = new JButton("ERR");
		oneblockerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oneblck++;
				oneblckerr++;
				opponentscore++;
			}
		});
		oneblockerror.setForeground(Color.BLACK);
		oneblockerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		oneblockerror.setBounds(0, 140, 54, 29);
		panel_5.add(oneblockerror);
		
		JButton oneblock = new JButton("BLK");
		oneblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oneblck++;
			}
		});
		oneblock.setForeground(Color.BLACK);
		oneblock.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		oneblock.setBackground(Color.BLUE);
		oneblock.setBounds(43, 140, 63, 29);
		panel_5.add(oneblock);
		
		JButton oneblockstuff = new JButton("END");
		oneblockstuff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oneblckstf++;
				oneblck++;
				jjvascore++;
			}
		});
		oneblockstuff.setForeground(Color.BLACK);
		oneblockstuff.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		oneblockstuff.setBounds(96, 140, 54, 29);
		panel_5.add(oneblockstuff);
		
		JButton serveerror = new JButton("ERR");
		serveerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onesrv++;
				onesrverr++;
				opponentscore++;
			}
		});
		serveerror.setForeground(Color.BLACK);
		serveerror.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		serveerror.setBounds(0, 166, 54, 29);
		panel_5.add(serveerror);
		
		JButton serve = new JButton("SERVE");
		serve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onesrv++;
			}
		});
		serve.setForeground(Color.BLACK);
		serve.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		serve.setBounds(43, 166, 63, 29);
		panel_5.add(serve);
		
		JButton ace = new JButton("ACE");
		ace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onesrv++;
				oneacee++;
				jjvascore++;
			}
		});
		ace.setForeground(Color.BLACK);
		ace.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		ace.setBackground(Color.YELLOW);
		ace.setBounds(96, 166, 54, 29);
		panel_5.add(ace);
		
		JLabel onename = new JLabel(onenameinput);
		onename.setBounds(15, 6, 61, 16);
		panel_5.add(onename);
		
		JLabel lblI = new JLabel(playerone);
		lblI.setHorizontalAlignment(SwingConstants.CENTER);
		lblI.setBounds(452, 287, 150, 16);
		contentPane.add(lblI);
		
		JLabel lblIi = new JLabel(playertwo);
		lblIi.setHorizontalAlignment(SwingConstants.CENTER);
		lblIi.setBounds(459, 46, 143, 16);
		contentPane.add(lblIi);
		
		JLabel lblIi_1 = new JLabel(playerthree);
		lblIi_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIi_1.setBounds(242, 46, 150, 16);
		contentPane.add(lblIi_1);
		
		JLabel lblIv = new JLabel(playerfour);
		lblIv.setHorizontalAlignment(SwingConstants.CENTER);
		lblIv.setBounds(36, 46, 143, 16);
		contentPane.add(lblIv);
		
		JLabel lblV = new JLabel(playerfive);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setBounds(28, 287, 151, 16);
		contentPane.add(lblV);
		
		JLabel lblVi = new JLabel(playersix);
		lblVi.setHorizontalAlignment(SwingConstants.CENTER);
		lblVi.setBounds(242, 287, 150, 16);
		contentPane.add(lblVi);
		
		JLabel lblNewLabel = new JLabel("JJVA");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(217, 6, 115, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblOpponent = new JLabel(opponent1);
		lblOpponent.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblOpponent.setBounds(377, 6, 115, 16);
		contentPane.add(lblOpponent);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(187, 74, -8, 201);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(192, 74, -170, 201);
		contentPane.add(separator_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(252, 2, 34, 26);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(342, 2, 34, 26);
		contentPane.add(spinner_1);
		
		JButton btnNewButton = new JButton("End Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (opponentscore>jjvascore) {
					winner = "Opponent";
					loser = "JJVA";
				}
				else {
						winner = "JJVA";
						loser = "Opponent";
					}
				JFrame frame4 = (JFrame) contentPane.getTopLevelAncestor();
				frame4.dispose();
					
				Statss frame6 = new Statss();
					frame6.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(252, 520, 117, 29);
		contentPane.add(btnNewButton);
		
		
		}
}
