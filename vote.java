import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vote implements ActionListener
{
	JButton user,admin;
	JLabel a,b;
	JPanel pm = new JPanel();
	vote()
	{
		JFrame fm = new JFrame("Vote");
		ImageIcon image = new ImageIcon("E:\\My Projects\\Java Programs\\GUI\\voting\\vote.jpg");
		JLabel imageLabel = new JLabel(image); 
		imageLabel.setBounds(0,10,600,180);
        imageLabel.setVisible(true);
        pm.add(imageLabel);
        a = new JLabel("Casting The Vote Is Our Birth Right.");
        a.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        a.setForeground(Color.MAGENTA);                 
        a.setPreferredSize(new Dimension(120, 40));
        a.setBounds(170,200,500,30);
        b = new JLabel("Please Click On Appropriate Button For Further Process",SwingConstants.CENTER);
        b.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        b.setForeground(Color.MAGENTA);                 
        b.setPreferredSize(new Dimension(120, 40));
        b.setBounds(50,220,500,30);
		user = new JButton("User");
		user.addActionListener(this);
		user.setBounds(180,270,70,30);
        user.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        admin = new JButton("Administrator");
		admin.addActionListener(this);
		admin.setBounds(280,270,150,30);
        admin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        pm.setLayout(null);
        pm.setBackground(Color.YELLOW);
     	pm.add(a); pm.add(b);
		pm.add(user); pm.add(admin);
		fm.add(pm);
		fm.setSize(600,400);
		fm.setVisible(true);
		fm.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == user)
		{
			voting v = new voting();
			v.voteframe();
		}
		else
			new adminlogin();
	}
	public static void main(String[] args)
	{
		new vote();
	}
}

class administrator implements ActionListener
{
	JFrame fa = new JFrame("Result Menu");
	JPanel pa = new JPanel();
	JLabel l,l1,l2,l3,l4;
	JButton back;
	administrator()
	{
		ImageIcon image = new ImageIcon("E:\\My Projects\\Java Programs\\GUI\\voting\\vote4.jpg");
		JLabel imageLabel = new JLabel(image); 
		imageLabel.setBounds(0,0,600,180);
        imageLabel.setVisible(true);
        pa.add(imageLabel);
		pa.setLayout(null);
		pa.setBackground(Color.ORANGE);
		l = new JLabel("Total Votes Are:");
		l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        l.setBounds(200,190,200,30);
        l.setForeground(Color.RED);
		l1 = new JLabel("Candidate 1: " + voting.c1);
		l1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		l1.setBounds(100,220,500,30);
		l1.setForeground(Color.RED);
		l2 = new JLabel("Candidate 2: " + voting.c2);
		l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		l2.setBounds(300,220,500,30);
		l2.setForeground(Color.RED);
		l3 = new JLabel("Candidate 3: " + voting.c3);
		l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		l3.setBounds(100,250,500,30);
		l3.setForeground(Color.RED);
		l4 = new JLabel("Candidate 4: " + voting.c4);
		l4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		l4.setBounds(300,250,500,30);
		l4.setForeground(Color.RED);
		back = new JButton("Back");
		back.setBounds(220,280,100,30);
		back.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		back.addActionListener(this);
		pa.add(l); pa.add(l1); pa.add(l2); pa.add(l3); pa.add(l4); pa.add(back);
		fa.add(pa);
		fa.setSize(600,400);
		fa.setVisible(true);
		fa.setLocationRelativeTo(null);
	}
	public void actionPerformed(ActionEvent e1)
	{
		fa.dispose();
		new vote();
	}
}

class adminlogin implements ActionListener
{
	JButton l,back;
	JPanel pl = new JPanel();
	JTextField u = new JTextField(15);
	JPasswordField pass  =new JPasswordField(15);
	JFrame fl = new JFrame("Login Authentification");
	JLabel ul,passl,first;
	String puname,ppaswd;
	adminlogin()
	{
		ImageIcon image = new ImageIcon("E:\\My Projects\\Java Programs\\GUI\\voting\\login1.jpg");
		JLabel imageLabel = new JLabel(image); 
		imageLabel.setBounds(0,0,600,180);
        imageLabel.setVisible(true);
        pl.add(imageLabel);
		first = new JLabel("!! Please Login To See The Result !!");
		first.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        first.setForeground(Color.MAGENTA); 
        first.setBounds(140,180,400,30);                
		ul = new JLabel("Enter Username");
		ul.setBounds(140,220,150,20);
		ul.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		passl = new JLabel("Enter Password");
		pl.setLayout (null); 
		passl.setBounds(140,250,150,20);
		passl.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		fl.setSize(600,400);
		fl.setLocation(500,280);
		fl.setLocationRelativeTo(null);
		u.setBounds(300,220,150,20);
		pass.setBounds(300,250,150,20);
		l = new JButton("Login");
		l.setBounds(180,290,100,30);
		l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		l.addActionListener(this);
		back = new JButton("Back");
		back.setBounds(300,290,100,30);
		back.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		back.addActionListener(this);
		pl.add(first); pl.add(l); pl.add(u); pl.add(pass); pl.add(ul); pl.add(passl); pl.add(back);
		pl.setBackground(Color.CYAN);
		fl.add(pl);
		fl.setVisible(true);
		fl.getRootPane().setDefaultButton(l);
	} 

	public void actionPerformed(ActionEvent e2)
	{
		if(e2.getSource() == l)
		{
			puname = u.getText();
			ppaswd = pass.getText();
			if(puname.equals("samarpan") && ppaswd.equals("vote@2017"))
			{
				new administrator();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Wrong Username / Password");
				u.setText("");
				pass.setText("");
			}
		}
		else
		{
			fl.dispose();
			new vote();
		}
	} 
}

class voting implements ActionListener
{
	JFrame f;
	JRadioButton b1,b2,b3,b4;
	JButton b,back;
	JPanel p;
	JLabel l,l1,l2,l3,l4,ad;
	ButtonGroup group;
	public static int c1,c2=0,c3=0,c4=0,temp;
	public void voteframe()
	{
		temp=0;
		f = new JFrame("!!Vote @2017");
		p = new JPanel();
		group = new ButtonGroup();

		ImageIcon image = new ImageIcon("E:\\My Projects\\Java Programs\\GUI\\voting\\vote3.jpg");
        JLabel imageLabel = new JLabel(image); 
        p.add(imageLabel);
        imageLabel.setBounds(0,280,600,220);
        imageLabel.setVisible(true);

		JLabel label = new JLabel("Click On Button to Cast Your Vote Here !!",SwingConstants.CENTER);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        label.setOpaque(true); 
        label.setBackground(new Color(204, 238, 241)); 
        label.setForeground(Color.RED);                
        label.setPreferredSize(new Dimension(120, 40));
        label.setBounds(60,20,500,30);
        p.add(label);

		b1 = new JRadioButton("Candidiate 1: Mr. Kailash Saraswat From BJP");
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b1.setBounds(60,60,500,30);
		b2 = new JRadioButton("Candidate 2: Mr. Anil Varshney From CONGRESS");
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b2.setBounds(60,100,500,30);
		b3 = new JRadioButton("Candidiate 3: Mrs. Geeta Verma From BSP");
		b3.setForeground(Color.BLUE);
		b3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b3.setBounds(60,140,500,30);
		b4 = new JRadioButton("Candidate 4: Mr. Sandeep Sinha From RLDK");
		b4.setForeground(Color.BLUE);
		b4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		b4.setBounds(60,180,500,30);
		b = new JButton("Click To Vote");
		b.addActionListener(this);
		b.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        b.setBackground(Color.GRAY);
        b.setForeground(Color.WHITE);
        b.setBounds(100,220,200,30);
        back = new JButton("Back");
		back.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(400,220,100,30);
        back.addActionListener(this);
		group.add(b1); group.add(b2); group.add(b3); group.add(b4);
		p.add(b1); p.add(b2); p.add(b3); p.add(b4);
		p.add(b); p.add(back);
		p.setLayout(null);
		f.add(p);
		f.setSize(600,550);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e3)
	{
		if(e3.getSource()==b)
		{
    		int dialogButton = JOptionPane.YES_NO_OPTION;
			int n = JOptionPane.showConfirmDialog(f, "!! Want To Confirm Your Vote ?", "Confirmation Box", dialogButton);
			if(n == JOptionPane.YES_OPTION)
			{
				if(temp==0)
				{
					if(b1.isSelected())
						c1++;
					else
						if(b2.isSelected())
							c2++;
					else
						if(b3.isSelected())
							c3++;
					else
						if(b4.isSelected())
							c4++;
					else
						JOptionPane.showMessageDialog(null, "Oops !! You Have Not Selected Any Candidate");
				}
				else
					JOptionPane.showMessageDialog(null, "Oops !! You Are Allowed to  Select Only One Candidate");
			}
			temp++;
		}
		if(e3.getSource() == back)
		{
			f.dispose();
		    new vote();
		}
	}
}

