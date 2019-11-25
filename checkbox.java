import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.*;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
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
	public checkbox() {
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
		
		JCheckBox cb1 = new JCheckBox("  C++");
		cb1.setBounds(64, 51, 97, 40);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("  Java");
		cb2.setBounds(64, 134, 97, 40);
		frame.getContentPane().add(cb2);
		ButtonGroup G = new ButtonGroup();
		G.add(cb1);
		G.add(cb2);

		JLabel label = new JLabel("New label");
		label.setBounds(189, 101, 97, 24);
		frame.getContentPane().add(label);
		
		cb1.addItemListener(new ItemListener()
		{
	    	public void itemStateChanged(ItemEvent e)
			{
			 label.setText("C++"+(e.getStateChange()==1?" checked": "un checked"	));
			}
		});

		cb2.addItemListener(new ItemListener()
		{
	    	public void itemStateChanged(ItemEvent e)
			{
			 label.setText("Java"+(e.getStateChange()==1?" checked": "un checked"	));
			}
		});
	}
}
