import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class degree {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					degree window = new degree();
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
	public degree() {
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
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDegrees.setBounds(51, 58, 93, 33);
		frame.getContentPane().add(lblDegrees);
		
		t1 = new JTextField();
		t1.setBounds(154, 58, 190, 33);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		JLabel lb = new JLabel("Result =");
		lb.setBounds(154, 121, 190, 28);
		frame.getContentPane().add(lb);
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				float t  =Float.parseFloat(t1.getText());
				float temp=(float)(t-273.15);
				String str=String.valueOf(temp);
				lb.setText(str);
		
			}
		});
		btnToCelsius.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnToCelsius.setBounds(51, 188, 140, 40);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				float t  =Float.parseFloat(t1.getText());
				float temp=(float)((t-273.15)*9/5+32);
				String str=String.valueOf(temp);
				lb.setText(str);	
			}
		});
		btnToFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnToFahrenheit.setBounds(251, 188, 140, 40);
		frame.getContentPane().add(btnToFahrenheit);
		
		JLabel lblResult = new JLabel("Result = ");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResult.setBounds(80, 121, 64, 29);
		frame.getContentPane().add(lblResult);
		
		
	}

}
