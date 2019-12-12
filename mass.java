import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;

public class mass {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JLabel l;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mass window = new mass();
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
	public mass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 439, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 434, 67);
		frame.getContentPane().add(panel);
		
		JLabel lblBodyMassIndex = new JLabel("BODY MASS INDEX");
		panel.add(lblBodyMassIndex);
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(10, 74, 403, 216);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m) :");
		lblHeightm.setBounds(36, 11, 76, 35);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setBounds(36, 65, 76, 35);
		panel_1.add(lblWeightkg);
		
		t1 = new JTextField();
		t1.setBounds(112, 18, 86, 20);
		panel_1.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(112, 72, 86, 20);
		panel_1.add(t2);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(36, 132, 46, 14);
		panel_1.add(lblBmi);
		
		t3 = new JTextField();
		t3.setBounds(66, 121, 55, 35);
		panel_1.add(t3);
		t3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(t1.getText());
				float b = Float.parseFloat(t2.getText());
				float bmi = (b/(a*a));
				t3.setText(String.valueOf(bmi));
				if(bmi<18.5)
				{
					l.setText("Underwweight");
				
				}
				else if(bmi>=18.5&& bmi<24.9)
				{
					l.setText("Normalweight");
				}
				else if(bmi>=25 && bmi<29.9)
				{
					l.setText("Overweight");
				}
				else if(bmi>29.9)
				{
					l.setText("Obese");
				}
			}
			
		});
		btnCalculate.setBounds(109, 169, 89, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});
		btnClear.setBounds(218, 169, 71, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnExit.setBounds(312, 169, 55, 23);
		panel_1.add(btnExit);
		
		l = new JLabel("");
		l.setBounds(182, 132, 155, 14);
		panel_1.add(l);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(10, 301, 403, 91);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(0, 0, 0, 0);
		panel_2.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(0, 0, 0, 0);
		panel_2.add(table_3);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 0, 0);
		panel_2.add(table_1);
		
		table = new JTable();
		table.setBounds(0, 0, 0, 0);
		panel_2.add(table);
		
		table_4 = new JTable();
		table_4.setBounds(21, 62, 361, -40);
		panel_2.add(table_4);
		
		table_5 = new JTable();
		table_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_5.setBackground(Color.CYAN);
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normalweight", "Overweight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_5.getColumnModel().getColumn(0).setMinWidth(18);
		table_5.setBounds(31, 33, 344, 30);
		panel_2.add(table_5);
	}
}
