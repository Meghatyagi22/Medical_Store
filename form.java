package medicalstore;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class form implements ActionListener {
	
		JFrame f=new JFrame();
		JLabel jl1=new JLabel("USERNAME:");
		JLabel jl2=new JLabel("PASSWORD:");
		JButton b=new JButton("LOGIN");
		JTextField txt=new JTextField("");
		JTextField txt1=new JTextField("");
		database db=new database();
		form()
		{
			b.setBounds(500,190,80,40);
			jl1.setBounds(400,100,140,28);
			jl2.setBounds(400,120,140,28);
			txt.setBounds(500,100,160,20);
			txt1.setBounds(500,120,160,20);;
			
			f.add(b);
			f.add(jl1);
			f.add(jl2);
			f.add(txt);
			f.add(txt1);
			
			f.setSize(2000,2000);
			f.setLayout(null);
			f.setVisible(true);
			b.addActionListener(this);
		}
          public static void main(String args[])
		{
			
			new form();
		}

		public void actionPerformed(ActionEvent e)
		{
			int st=0;
			db.connect();
			String nm=txt.getText().trim();
			String ps=txt1.getText().trim();
			try {
				while( db.rst.next())
				{
					//System.out.println(db.rst.getString(1) + db.rst.getString(2));
					if(nm.compareTo(db.rst.getString(1).trim())==0 && ps.compareTo(db.rst.getString(2).trim())==0)
				{
						JOptionPane.showMessageDialog(null," Welcome !!! You are valid user ...!!!  ","WELCOME",JOptionPane.INFORMATION_MESSAGE);
				   	    f.setVisible(false);	
						
						st=1;
						break;
					//new second();
				}
				
				
				}
				
				if(st==0)
				{
				JOptionPane.showMessageDialog(null,"wrong");
				}
		}
			catch(SQLException sqe)
			{
				System.out.print(sqe);
			}
		}
}

