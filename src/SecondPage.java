import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SecondPage extends JFrame {
	  private JLabel namelabel;
	  private JLabel passwordlabel;
	  
	  private JTextField namefield;
	  private JTextField passfield; 
	  private JButton login;
	  private String s,s1,s2,s3;
	  
	  
	  public SecondPage() {
		  super("Admin Login");
		  label();
		  button();
	  }

	
	private void label() {
		
		namelabel = new JLabel("Name : ");
		setLayout(null);
		namelabel.setBounds(50, 70, 100, 30);
		namelabel.setBackground(Color.BLACK);
		namelabel.setForeground(Color.WHITE);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.CENTER);
		add(namelabel);
		
		namefield = new JTextField();
		namefield.setBounds(155, 70, 250, 30);
		namefield.setForeground(Color.MAGENTA);
		namefield.setBackground(Color.WHITE);
		namefield.setFont(new Font("MS Sans Serif", 20, 20));
		namefield.setHorizontalAlignment(JTextField.CENTER);
		add(namefield);
		
		passwordlabel = new JLabel("Password : ");
		setLayout(null);
		passwordlabel.setBounds(50, 140, 100, 30);
		passwordlabel.setBackground(Color.BLACK);
		passwordlabel.setForeground(Color.WHITE);
		 
		passwordlabel.setOpaque(true);
		passwordlabel.setHorizontalAlignment(JLabel.CENTER);
		add(passwordlabel);
		
		passfield = new JTextField();
		passfield.setBounds(155, 140, 250, 30);
		passfield.setForeground(Color.MAGENTA);
		passfield.setBackground(Color.WHITE);
		passfield.setFont(new Font("MS Sans Serif", 20, 20));
		passfield.setHorizontalAlignment(JTextField.CENTER);
		add(passfield);
			
	}
	
private void button() {
		
		login = new JButton("Login");
		login.setToolTipText("Click Please");
		login.setBounds(225, 200, 80, 30);
		login.setForeground(Color.BLACK);
		login.addActionListener(e->{
			
			s = namefield.getText();
			 s1 = passfield.getText();
			 s2="admin";
			 s3="admin";
				if (s.equals(s2)&&s1.equals(s3)) {
					dispose();
					ThirdPage a=new ThirdPage();
					a.setLayout(null);
					a.setVisible(true);
					a.setBounds(0, 0, 600, 400);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					a.setLocationRelativeTo(null);
				}
				else if(s.isEmpty()||s1.isEmpty()) {
					JOptionPane.showMessageDialog(null, "TextField Is Empty!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid input!");
				}
		});
		add(login);
	}


	public static void main(String[] args) {
		SecondPage a=new SecondPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);


	}

}
