import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class application {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application window = new application();
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
	public application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(46, 66, 75, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lb = new JLabel("New label");
		lb.setBounds(150, 209, 172, 14);
		frame.getContentPane().add(lb);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String uname=t1.getText();
				String pass=t2.getText();
				if(uname.equals("MANU")&&pass.equals("123"))
				{
					lb.setText("yes");
				}
				else
				{
					lb.setText("no");
				}
			}
		});
		btnSubmit.setBounds(170, 146, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(46, 103, 75, 14);
		frame.getContentPane().add(lblPassword);
		
		t1 = new JTextField();
		t1.setBounds(150, 63, 137, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(150, 100, 137, 17);
		frame.getContentPane().add(t2);
		
		
	}
}
                                           