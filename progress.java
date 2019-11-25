import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class progress {

	private JFrame frame;
	private JTextField tfsi;
	private JTextField name;
	private JTextField sur;
	private JTextField tfm;
	private JTextField tfe;
	private JTextField tfb;
	private JTextField tfco;
	private JTextField tfc;
	private JTextField tfp;
	private JTextField tft;
	private JTextField tfma;
	private JTextField tfts;
	private JTextField tfav;
	private JTextField tfra;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progress window = new progress();
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
	public progress() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(218, 165, 32));
		frame.setBounds(100, 100, 981, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(22, 22, 388, 292);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 41, 82, 14);
		panel.add(lblNewLabel);
		
		tfsi = new JTextField();
		tfsi.setBounds(97, 35, 86, 20);
		panel.add(tfsi);
		tfsi.setColumns(10);
		
		JLabel lblSurName = new JLabel("First Name");
		lblSurName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurName.setBounds(10, 69, 82, 14);
		panel.add(lblSurName);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(97, 63, 86, 20);
		panel.add(name);
		
		JLabel lblSurName_1 = new JLabel("Sur Name");
		lblSurName_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurName_1.setBounds(10, 94, 82, 14);
		panel.add(lblSurName_1);
		
		sur = new JTextField();
		sur.setColumns(10);
		sur.setBounds(97, 88, 86, 20);
		panel.add(sur);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode.setBounds(10, 119, 82, 14);
		panel.add(lblCourseCode);
		
		JLabel lblMaths = new JLabel("MATHS");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaths.setBounds(207, 38, 55, 14);
		panel.add(lblMaths);
		
		tfm = new JTextField();
		tfm.setColumns(10);
		tfm.setBounds(292, 35, 86, 20);
		panel.add(tfm);
		
		JLabel lblEnglish = new JLabel("ENGLISH");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnglish.setBounds(207, 66, 55, 14);
		panel.add(lblEnglish);
		
		tfe = new JTextField();
		tfe.setColumns(10);
		tfe.setBounds(292, 63, 86, 20);
		panel.add(tfe);
		
		JLabel lblBiology = new JLabel("BIOLOGY");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBiology.setBounds(207, 94, 55, 14);
		panel.add(lblBiology);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(292, 91, 86, 20);
		panel.add(tfb);
		
		JLabel lblComputer = new JLabel("COMPUTER");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComputer.setBounds(207, 122, 75, 14);
		panel.add(lblComputer);
		
		tfco = new JTextField();
		tfco.setColumns(10);
		tfco.setBounds(292, 119, 86, 20);
		panel.add(tfco);
		
		JLabel lblChemistry = new JLabel("CHEMISTRY");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChemistry.setBounds(207, 150, 71, 14);
		panel.add(lblChemistry);
		
		tfc = new JTextField();
		tfc.setColumns(10);
		tfc.setBounds(292, 147, 86, 20);
		panel.add(tfc);
		
		JLabel lblPhysics = new JLabel("PHYSICS");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhysics.setBounds(207, 178, 55, 14);
		panel.add(lblPhysics);
		
		tfp = new JTextField();
		tfp.setColumns(10);
		tfp.setBounds(292, 175, 86, 20);
		panel.add(tfp);
		
		JLabel lblTamil = new JLabel("TAMIL");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTamil.setBounds(207, 209, 55, 14);
		panel.add(lblTamil);
		
		tft = new JTextField();
		tft.setColumns(10);
		tft.setBounds(292, 206, 86, 20);
		panel.add(tft);
		
		JLabel lblMalayalam = new JLabel("MALAYALAM");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMalayalam.setBounds(207, 237, 82, 14);
		panel.add(lblMalayalam);
		
		tfma = new JTextField();
		tfma.setColumns(10);
		tfma.setBounds(292, 234, 86, 20);
		panel.add(tfma);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalScore.setBounds(10, 178, 82, 14);
		panel.add(lblTotalScore);
		
		tfts = new JTextField();
		tfts.setColumns(10);
		tfts.setBounds(97, 172, 86, 20);
		panel.add(tfts);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAverage.setBounds(10, 209, 57, 14);
		panel.add(lblAverage);
		
		tfav = new JTextField();
		tfav.setColumns(10);
		tfav.setBounds(97, 203, 86, 20);
		panel.add(tfav);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRanking.setBounds(10, 240, 57, 14);
		panel.add(lblRanking);
		
		tfra = new JTextField();
		tfra.setColumns(10);
		tfra.setBounds(97, 234, 86, 20);
		panel.add(tfra);
		 
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032B", "111032E"}));
		comboBox.setBounds(97, 117, 86, 20);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 164, 183, -10);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 150, 173, 2);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(420, 22, 535, 362);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 14, 515, 303);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(196, 328, 89, 23);
		panel_1.add(btnNewButton);
		
		
		
		table = new JTable();
		table.setBackground(new Color(240, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"  Studet ID", " Course Name", "    Maths", "   English", "  Biology", "  Computer", "  Chemistry", "  Physics", "  Tamil", "  Malayalam", "  Total Score", "  Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(82);
		table.getColumnModel().getColumn(12).setPreferredWidth(76);
		table.setBounds(22, 421, 933, 64);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_1 = new JButton("Add Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tfm.getText();
				float a = Float.parseFloat(str);
				String str1=tfe.getText();
				float b = Float.parseFloat(str1);
				String str2=tfb.getText();
				float c = Float.parseFloat(str2);
				String str3=tfco.getText();
				float d = Float.parseFloat(str3);
				String str4=tfc.getText();
				float f = Float.parseFloat(str4);
				String str5=tfp.getText();
				float g = Float.parseFloat(str5);
				String str6=tft.getText();
				float h = Float.parseFloat(str6);
				String str7=tfma.getText();
				float i = Float.parseFloat(str7);
				String str8=tfav.getText();
				float j = (a+b+c+d+f+g+h+i);
				
			tfts.setText(String.valueOf(j));
			tfav.setText(String.valueOf(j/8));
			if(a>=24 && b>=24 && c>=24 && d>=24 && f>=24 && g>=24 && h>=24 && i>=24)
				tfra.setText("Passed");
				else
					tfra.setText("Failed");
			String m = (String)comboBox.getSelectedItem();
			
			DefaultTableModel model=(DefaultTableModel) table.getModel();
			//model.addRow(new String[] {suid,cid,str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],g});
			model.addRow(new String[] {str,m,str1,str2,str3,str4,str5,str6,str7,str8,String.valueOf(j),tfav.getText(),tfra.getText()});
			//String[] row= {str,m,str1,str2,str3,str4,str5,str6,str7,str8,String.valueOf(j)};
				//DefaultTableModel model= (DefaultTableModel)table.getModel();
				//model.addRow(row);
			{
			      //  tfm.getText(),
					//(String)comboBox.getSelectedItem(),
					//tfe.getText(),
				//	tfb.getText(),
			//		tfco.getText(),
				//	tfc.getText(),
					//tfp.getText(),
			//		tft.getText(),
				//	tfma.getText()
					
			
				}
			}
			});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(107, 526, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JTextField temp = null;
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(271, 526, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"+
			"Student Name:\t\t\t"+name.getText()+
		       "\n==================================================="+
			"\nMath : \t\t"+tfm.getText()+
			"\nEnglish : \t\t"+tfe.getText()+
			"\nBiology : \t\t"+tfb.getText()+
			"\nComputer : \t\t"+tfco.getText()+
			"\nChemistry : \t\t"+tfc.getText()+
			"\nPhysics : \t\t"+tfp.getText()+
			"\nTamil : \t\t"+tft.getText()+
			"\nMalayalam : \t\t"+tfma.getText()+
			"\n==================================================="+
			"\nTotal Score : \t\t"+tfts.getText()+
			"\nAverage : \t\t"+tfav.getText()+
			"\nRanking: \t\t"+tfra.getText());
			}
		});
		btnShowReport.setForeground(Color.BLUE);
		btnShowReport.setBounds(401, 526, 109, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(553, 526, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.BLACK);
		btnReset.setForeground(Color.GREEN);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");sur.setText("");tfm.setText("");tfe.setText("");tfb.setText("");tfco.setText("");tfc.setText("");tfp.setText("");tft.setText("");tfma.setText("");tfsi.setText("");tfts.setText("");tfav.setText("");tfra.setText("");
			}
		});
		btnReset.setBounds(706, 526, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
