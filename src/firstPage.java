import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class firstPage extends JFrame{
	private JButton adminlogin;
	private JButton accountantlogin;
	
	public firstPage() {
		super("Welcome TO FEE REPORT APP");
		button();
	}
	

	private void button() {

		adminlogin = new JButton("Admin Login");
		adminlogin.setToolTipText("Click Please");
		adminlogin.setForeground(Color.BLACK);
		adminlogin.setBounds(225, 125, 150, 25);
		adminlogin.addActionListener(e->{
			dispose();
			SecondPage a=new SecondPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);
			
		});
		add(adminlogin);
		
		accountantlogin = new JButton("Accountant Login");
		accountantlogin.setToolTipText("Click Please");
		accountantlogin.setBounds(225, 200, 150, 25);
		accountantlogin.setForeground(Color.BLACK);
		accountantlogin.addActionListener(e->{
			dispose();
			SixthPage a=new SixthPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);
			
		});
		add(accountantlogin);
		
	}


	public static void main(String[] args) {
		firstPage a=new firstPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);

	}

}
