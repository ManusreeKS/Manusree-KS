import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticket {

	private JFrame frame;
	private JTextField tfn;
	private JTextField tff;
	private JTextField tfTo;
	private JTextField tfd;
	private JTextField tfti;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField tf;
	private JTextField tft;
	private JTextField tfs;
	private JTextField tfto;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 789, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(194, 11, 418, 61);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setBounds(33, 0, 310, 61);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblTicketBooking);
		
		JLabel lblNewLabel_3 = new JLabel("oo");
		lblNewLabel_3.setFont(new Font("Webdings", Font.PLAIN, 96));
		lblNewLabel_3.setBounds(326, 11, 59, 28);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(367, 90, 397, 277);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 43, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrom.setBounds(24, 90, 46, 14);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTo.setBounds(24, 127, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(24, 162, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(24, 198, 46, 14);
		panel_1.add(lblTime);
		
		tfn = new JTextField();
		tfn.setBounds(101, 31, 129, 29);
		panel_1.add(tfn);
		tfn.setColumns(10);
		
		tff = new JTextField();
		tff.setColumns(10);
		tff.setBounds(101, 87, 86, 20);
		panel_1.add(tff);
		
		tfTo = new JTextField();
		tfTo.setColumns(10);
		tfTo.setBounds(101, 124, 86, 20);
		panel_1.add(tfTo);
		
		
		tfd = new JTextField();
		tfd.setColumns(10);
		tfd.setBounds(101, 159, 86, 20);
		panel_1.add(tfd);
		
		tfti = new JTextField();
		tfti.setColumns(10);
		tfti.setBounds(101, 195, 86, 20);
		panel_1.add(tfti);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setBounds(297, 93, 76, 14);
		panel_1.add(lblTicketNumber);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(287, 115, 86, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(287, 156, 86, 20);
		panel_1.add(textField_6);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(297, 137, 46, 14);
		panel_1.add(lblPrice);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(287, 195, 86, 20);
		panel_1.add(textField_7);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(297, 177, 46, 14);
		panel_1.add(lblRoute);
		
		JButton btnC = new JButton("CONFIRM");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBounds(178, 226, 102, 29);
		panel_1.add(btnC);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(32, 99, 101, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblNewLabel_1);
		
		tf = new JTextField();
		tf.setBounds(141, 97, 159, 28);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 138, 330, 2);
		separator.setForeground(Color.BLACK);
		frame.getContentPane().add(separator);
		
		JRadioButton st = new JRadioButton("Standard");
		st.setBackground(new Color(216, 191, 216));
		st.setBounds(10, 147, 109, 23);
		st.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(st);
		
		JRadioButton si = new JRadioButton("Single Ticket");
		si.setBackground(new Color(216, 191, 216));
		si.setBounds(128, 147, 109, 23);
		si.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(si);
		
		JRadioButton ad = new JRadioButton("Adult");
		ad.setBackground(new Color(216, 191, 216));
		ad.setBounds(252, 147, 109, 23);
		ad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(ad);
		
		 ButtonGroup G1=new ButtonGroup();
			G1.add(st);
			G1.add(si);
			
		
		JRadioButton ac = new JRadioButton("AC");
		ac.setBackground(new Color(216, 191, 216));
		ac.setBounds(128, 184, 49, 23);
		ac.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(ac);
		
		JRadioButton fc = new JRadioButton("First Class");
		fc.setBackground(new Color(216, 191, 216));
		fc.setBounds(10, 184, 109, 23);
		fc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(fc);
		
		JRadioButton ch = new JRadioButton("Child");
		ch.setBackground(new Color(216, 191, 216));
		ch.setBounds(252, 184, 109, 23);
		ch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(ch);
		
		JRadioButton sl = new JRadioButton("Sleeper");
		sl.setBackground(new Color(216, 191, 216));
		sl.setBounds(179, 184, 71, 23);
		sl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(sl);
		
		ButtonGroup G=new ButtonGroup();
		G.add(ac);
		G.add(fc);
		G.add(sl);
		ButtonGroup G3=new ButtonGroup();
		G3.add(ch);
		G3.add(ad);
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"<<<SELECT>>>", "Arunachal Pradesh", "Andhra Pradesh", "Bihar", "Chandighad", "Delhi", "Goa", "Gujarat  ", "Hariyana", "Himachal Pradesh", "Jammu and Kashmir", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Meghalaya", "Missoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Telangana", "Tamilnad", "Utharkhand", "Uthar Pradesh", "West Bengal"}));
		cb1.setBounds(10, 228, 109, 20);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"<<<SELECT>>>", "Arunachal Pradesh", "Andhra Pradesh", "Bihar", "Chandighad", "Delhi", "Goa", "Gujarat  ", "Hariyana", "Himachal Pradesh", "Jammu and Kashmir", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Meghalaya", "Missoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Telangana", "Tamilnad", "Utharkhand", "Uthar Pradesh", "West Bengal"}));
		cb2.setBounds(136, 228, 109, 20);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"No of Seats", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cb3.setBounds(259, 228, 81, 20);
		frame.getContentPane().add(cb3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 259, 330, 2);
		separator_1.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setBounds(10, 272, 88, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 300, 88, 14);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 325, 88, 14);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblTotal);
		
		tft = new JTextField();
		tft.setBounds(151, 269, 86, 20);
		frame.getContentPane().add(tft);
		tft.setColumns(10);
		
		tfs = new JTextField();
		tfs.setBounds(151, 294, 86, 20);
		tfs.setColumns(10);
		frame.getContentPane().add(tfs);
		
		tfto = new JTextField();
		tfto.setBounds(151, 319, 86, 20);
		tfto.setColumns(10);
		frame.getContentPane().add(tfto);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 350, 330, 2);
		separator_2.setForeground(Color.BLACK);
		frame.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfn.setText(tf.getText());
				tff.setText((String)cb1.getSelectedItem());
				tfTo.setText((String)cb2.getSelectedItem());
				String str1;
				float tax=0;
				float price=0;
				if(fc.isSelected())
				{
					str1="Firstclass";
					price = 350;
					tax= (price*20)/100;
				}
				if(ac.isSelected())
				{
					str1="AC";
					price = 700;
					tax= (price*30)/100;
				}
				if(sl.isSelected())
				{
					str1="Sleeper";
					price = 200;
					tax= (price*10)/100;
				}
			}
		});
		btnNewButton.setBounds(9, 363, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				tft.setText("");
				tfs.setText("");
				tfto.setText("");
				G1.clearSelection();
				G.clearSelection();
				G3.clearSelection();
				cb1.getSelectedIndex();
				cb2.getSelectedIndex();
				cb3.getSelectedIndex();
			}
		});
		btnReset.setBounds(123, 363, 89, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(238, 363, 89, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(10, 408, 734, 164);
		frame.getContentPane().add(panel_2);
		
		table = new JTable();
		panel_2.add(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NAME", "BOOKING NO", "FROM", "TO", "NO OF SEAT", "TIME", "DATE", "AC/Non-AC", "PRICE"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(79);
		table.getColumnModel().getColumn(4).setPreferredWidth(78);
	}
}
