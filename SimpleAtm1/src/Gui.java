import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Gui {
	 int counterforhistory;
	 int counterformove;
	int flagnexpre;
	int flaghis;
	int x; 
public Gui()
{
	Graphic();
}

public void Graphic() {

	counterforhistory=0;
	flagnexpre=0;
	flaghis=0;
	User u= new User();
	Transaction t= new Transaction();
	int [] arrayofvalue= new int[5];
	String [] arrayoftype = new String[5];
	int [] arrayofbalance = new int[5];
	
	
	
	for (int i = 0; i < arrayoftype.length; i++) {
		arrayoftype[i]="NO TRANSACTION";
	}
	for (int i = 0; i < arrayofvalue.length; i++) {
    arrayofvalue[i]=0; 
	}
	
	
	//CardNumberWINDOW.
		 JFrame f;
		 JLabel l;//welc.
		 JLabel l2;//cardno.
		 JPanel p;
		 JTextField text;
		 JButton b;
		 JButton b1; 
		 
		    f = new JFrame("Welcome Window");
			f.setSize(500,500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			p = new JPanel();
			//3shan a7ot el dim eli ana 3yzaha.
			p.setLayout(null);
			p.setBackground(Color.white);
			
			l=new JLabel("WELCOME TO ATM.");
			l.setForeground(Color.black);
			l.setFont(new Font("Cambria Math", Font.BOLD, 20));
			l.setBounds(150,70, 500, 100);
			
			l2 = new JLabel("CARD NUMBER:. ");
			l2.setForeground(Color.black);
			l2.setFont(new Font("Cambria Math", Font.BOLD, 20));
			l2.setBounds(50,150, 500, 100);
			
			
			
			text = new JTextField(30);
			text.setBounds(210, 170, 200, 40);
			
			
		    b1= new JButton("CLEAR");
		    b1.setBounds(210, 310, 200, 40);
			b1.setFont(new Font("Cambria Math", Font.BOLD, 20));
			b1.setForeground(Color.black);
		    b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
			text.setText("");
				}});
		    
		    
			
			b = new JButton("LOG IN");
			b.setBounds(210, 270, 200, 40);
			b.setFont(new Font("Cambria Math", Font.BOLD, 20));
			b.setForeground(Color.black);
		
			p.add(b);
			p.add(l);
			p.add(l2);
			p.add(text);
			p.add(b1);
			f.add(p);
			f.setVisible(true);
			
	//--------------------------------------------------------------------


	//MainMenu
	
	JFrame fm= new JFrame("Main Menu.");
	JLabel lm =new JLabel("Please Select Your Transaction.");
	JPanel pm = new JPanel();
	JLabel labelforbalance;
	
	fm.setSize(500, 500);
	fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	pm.setLayout(null);
	pm.setBackground(Color.white);
	
	lm.setFont(new Font("Cambria Math", Font.BOLD, 20));
	lm.setBounds(90,0, 500, 100);
	
	
	
	labelforbalance= new JLabel("");
	labelforbalance.setFont(new Font("Cambria Math", Font.BOLD, 20));
	labelforbalance.setBounds(120,250, 500, 100);
	
	JButton bm1= new JButton("DEPOSIT");
	JButton bm2= new JButton("WITHDRAW");
	JButton bm3= new JButton("BALANCE INQUIRY");
	JButton bm4= new JButton("NEXT>>>");
	JButton bm5= new JButton("<<<PREVIOUS");
	JButton bm6= new JButton("HISTORY");

	

	bm1.setBounds(110, 100, 250, 50);
	bm2.setBounds(110, 150, 250, 50);
	bm3.setBounds(110, 200,250, 50);
	bm4.setBounds(240, 400,200, 50);
	bm5.setBounds(40, 400,200, 50);
	bm6.setBounds(140, 350,200, 50);
	
	//deposit
	bm1.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm1.setForeground(Color.black);

	bm2.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm2.setForeground(Color.black);
	
	bm3.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm3.setForeground(Color.black);
	
	bm4.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm4.setForeground(Color.black);
	
	bm5.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm5.setForeground(Color.black);
	

	bm6.setFont(new Font("Cambria Math", Font.BOLD, 20));
	bm6.setForeground(Color.black);
	
    pm.add(bm1);
	pm.add(bm2);
	pm.add(bm3);
	pm.add(bm4);
	pm.add(bm5);
	pm.add(bm6);
	pm.add(lm);
	pm.add(labelforbalance);
	fm.add(pm);
	
	//------------------------------------------------------------------
	
	//DEPOSIT.
	
		JFrame frame2;
		JPanel panel2;
		JLabel label3;
		JLabel label4;
		
		 JButton button10;
		 JButton button11;
		 JButton button12;
		 JButton button13;
		 JButton button14;
		 JButton button15;
		 JButton button16;
		 JButton button17;
		 JButton button18;
		 JButton button19;
		 JButton button20;
		 JButton button21;
		 JButton button22;
		 JButton button23;
		 JButton button24;
		 JTextField textField;

		frame2 = new JFrame("DEPOSIT");
		frame2.setSize(500,500);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.white);
		
		label3= new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT:.");
		label3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		label3.setBounds(50,0, 500, 100);
		
		label4 = new JLabel("YOU ENTERED:");
		label4.setFont(new Font("Cambria Math", Font.BOLD, 20));
		label4.setBounds(0,300, 500, 100);
		
		
		textField = new JTextField(30);
		textField.setBounds(150, 325, 200, 40);
		
		
		//buttons.
		button10= new JButton("0");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button10.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button11= new JButton("1");
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button11.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button12= new JButton("2");
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button12.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button13= new JButton("3");
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button13.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button14= new JButton("4");
		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button14.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button15= new JButton("5");
		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button15.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button16= new JButton("6");
		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button16.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button17= new JButton("7");
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button17.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button18= new JButton("8");
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button18.getText();
				textField.setText(enterNo);
			}
		});
		
		
		button19= new JButton("9");
		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField.getText()+ button19.getText();
				textField.setText(enterNo);
			}
		});
		
		
		
		button20 = new JButton("CLEAR");
		button20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText("");
				}});
		    
		
		button21 = new JButton("CHECK BALANCE");
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "YOUR BALANCE ="+ u.balanceInquiry());
			}
		});
		
		button22 = new JButton("MENU");
		//in someActions//
		
		button23 = new JButton("EXIT");
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "THANK YOU");
				System.exit(0);
			}});
		
		
		button24 = new JButton("DEPOSIT");
		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flaghis=1;
				String getmoney = textField.getText();
				textField.setText("");
				JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESSFUL");
				int amountdepoists= Integer.parseInt(getmoney);
				u.deposit(amountdepoists);
				
				if (counterforhistory ==5)
				{
					counterforhistory=4;
					arrayoftype[0]=arrayoftype[1];
					arrayoftype[1]=arrayoftype[2];
					arrayoftype[2]=arrayoftype[3];
					arrayoftype[3]=arrayoftype[4];
					
					arrayofvalue[0]=arrayofvalue[1];
					arrayofvalue[1]=arrayofvalue[2];
					arrayofvalue[2]=arrayofvalue[3];
					arrayofvalue[3]=arrayofvalue[4];
					
					arrayofbalance[0]=arrayofbalance[1];
					arrayofbalance[1]=arrayofbalance[2];
					arrayofbalance[2]=arrayofbalance[3];
					arrayofbalance[3]=arrayofbalance[4];


					arrayoftype[counterforhistory]= "DEPOSIT";
					arrayofvalue[counterforhistory]= amountdepoists;
					arrayofbalance[counterforhistory]= u.balanceInquiry();
					counterforhistory++;
				}
			
				else 
				{
					arrayofvalue[counterforhistory]= amountdepoists;
					arrayoftype[counterforhistory]= "DEPOSIT";
					arrayofbalance[counterforhistory]= u.balanceInquiry();
					counterforhistory++;
				}
				
				
					
	}});
		


		button11.setBounds(170, 100, 50,50);
		button12.setBounds(220, 100, 50,50);
		button13.setBounds(270, 100,50,50);
		button14.setBounds(170, 150, 50,50);
		button15.setBounds(220, 150, 50,50);
		button16.setBounds(270, 150,  50,50);
		button17.setBounds(170, 200,  50,50);
		button18.setBounds(220, 200, 50,50);
		button19.setBounds(270, 200,  50,50);
		button10.setBounds(170, 250, 50,50);
		button20.setBounds(220, 250,  100,50);
		
		button21.setBounds(50, 400,  200,50);//balance
		button21.setFont(new Font("Cambria Math", Font.BOLD, 20));

		button22.setBounds(250, 400,  100,50);//menu
		button22.setFont(new Font("Cambria Math", Font.BOLD, 20));
		
		button23.setBounds(350, 400,  100,50);// exit
		button23.setFont(new Font("Cambria Math", Font.BOLD, 20));
		button23.setForeground(Color.red);
		
		button24.setBounds(350, 325,100,40); //deposit
		button24.setFont(new Font("Cambria Math", Font.BOLD, 10));

		

		panel2.add(button10);
		panel2.add(button11);
		panel2.add(button12);
		panel2.add(button13);
		panel2.add(button14);
		panel2.add(button15);
		panel2.add(button16);
		panel2.add(button17);
		panel2.add(button18);
		panel2.add(button19);
		panel2.add(button20);
		panel2.add(button21);
		panel2.add(button22);
		panel2.add(button23);
		panel2.add(button24);	
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(textField);
		frame2.add(panel2);
		
		//--------------------------------------------------------------------------------------
		
		//withdraw

		JFrame frame3;
		JPanel panel3;
		JLabel label5;
		JLabel label6;
		
		 JButton buttonn10;
		 JButton buttonn11;
		 JButton buttonn12;
		 JButton buttonn13;
		 JButton buttonn14;
		 JButton buttonn15;
		 JButton buttonn16;
		 JButton buttonn17;
		 JButton buttonn18;
		 JButton buttonn19;
		 JButton buttonn20;
		 JButton buttonn21;
		 JButton buttonn22;
		 JButton buttonn23;
		 JButton buttonn24;
		 JTextField textField_1;

		frame3 = new JFrame("WITHDRAW");
		frame3.setSize(500,500);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.white);
		
		label5= new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW:.");
		label5.setFont(new Font("Cambria Math", Font.BOLD, 20));
		label5.setBounds(50,0, 500, 100);
		
		label6 = new JLabel("YOU ENTERED:");
		label6.setFont(new Font("Cambria Math", Font.BOLD, 20));
		label6.setBounds(0,300, 500, 100);
		
		
		textField_1 = new JTextField(30);
		textField_1.setBounds(150, 325, 200, 40);
		
		
		//buttons.
		buttonn10= new JButton("0");
		buttonn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn10.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn11= new JButton("1");
		buttonn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn11.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn12= new JButton("2");
		buttonn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn12.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn13= new JButton("3");
		buttonn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn13.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn14= new JButton("4");
		buttonn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn14.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn15= new JButton("5");
		buttonn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn15.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn16= new JButton("6");
		buttonn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn16.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn17= new JButton("7");
		buttonn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn17.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn18= new JButton("8");
		buttonn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn18.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		buttonn19= new JButton("9");
		buttonn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNo = textField_1.getText()+ buttonn19.getText();
				textField_1.setText(enterNo);
			}
		});
		
		
		
		buttonn20 = new JButton("CLEAR");
		buttonn20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField_1.setText("");
				}});
		    
		
		buttonn21 = new JButton("CHECK BALANCE");
		buttonn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "YOUR BALANCE = "+ u.balanceInquiry());
			}
		});
		
		buttonn22 = new JButton("MENU");
		//in someActions//
		
		buttonn23 = new JButton("EXIT");
		buttonn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "THANK YOU");
				System.exit(0);
			}});
		
		
		buttonn24 = new JButton("WITHDRAW");
		buttonn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flaghis=1;
				String getmoney = textField_1.getText();
				textField_1.setText("");
				
				int amount= Integer.parseInt(getmoney);
				if (amount<=u.balanceInquiry())
				{
					u.withdraw(amount);
					JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESSFUL");
					
					if (counterforhistory ==5)
					{
						counterforhistory=4;
						arrayoftype[0]=arrayoftype[1];
						arrayoftype[1]=arrayoftype[2];
						arrayoftype[2]=arrayoftype[3];
						arrayoftype[3]=arrayoftype[4];
						
						arrayofvalue[0]=arrayofvalue[1];
						arrayofvalue[1]=arrayofvalue[2];
						arrayofvalue[2]=arrayofvalue[3];
						arrayofvalue[3]=arrayofvalue[4];
						
						arrayofbalance[0]=arrayofbalance[1];
						arrayofbalance[1]=arrayofbalance[2];
						arrayofbalance[2]=arrayofbalance[3];
						arrayofbalance[3]=arrayofbalance[4];

						arrayoftype[counterforhistory]= "WITHDRAW";
						arrayofvalue[counterforhistory]= amount;
						arrayofbalance[counterforhistory]= u.balanceInquiry();
						counterforhistory++;
					}
					else 
					{
						arrayofvalue[counterforhistory]= amount;
						arrayoftype[counterforhistory]= "WITHDRAW";
						arrayofbalance[counterforhistory]= u.balanceInquiry();
						counterforhistory++;
					}
				
				}
				
				else
					JOptionPane.showMessageDialog(null, "ERROR!!, CAN NOT WITHDRAW");
			}});
		
		buttonn11.setBounds(170, 100, 50,50);
		buttonn12.setBounds(220, 100, 50,50);
		buttonn13.setBounds(270, 100,50,50);
		buttonn14.setBounds(170, 150, 50,50);
		buttonn15.setBounds(220, 150, 50,50);
		buttonn16.setBounds(270, 150,  50,50);
		buttonn17.setBounds(170, 200,  50,50);
		buttonn18.setBounds(220, 200, 50,50);
		buttonn19.setBounds(270, 200,  50,50);
		buttonn10.setBounds(170, 250, 50,50);
		buttonn20.setBounds(220, 250,  100,50);
		
		buttonn21.setBounds(50, 400,  200,50);//balance
		buttonn21.setFont(new Font("Cambria Math", Font.BOLD, 20));

		buttonn22.setBounds(250, 400,  100,50);//menu
		buttonn22.setFont(new Font("Cambria Math", Font.BOLD, 20));
		
		buttonn23.setBounds(350, 400,  100,50);// exit
		buttonn23.setFont(new Font("Cambria Math", Font.BOLD, 20));
		buttonn23.setForeground(Color.red);
		
		buttonn24.setBounds(350, 325,100,40); //deposit
		buttonn24.setFont(new Font("Cambria Math", Font.BOLD, 10));

		

		panel3.add(buttonn10);
		panel3.add(buttonn11);
		panel3.add(buttonn12);
		panel3.add(buttonn13);
		panel3.add(buttonn14);
		panel3.add(buttonn15);
		panel3.add(buttonn16);
		panel3.add(buttonn17);
		panel3.add(buttonn18);
		panel3.add(buttonn19);
		panel3.add(buttonn20);
		panel3.add(buttonn21);
		panel3.add(buttonn22);
		panel3.add(buttonn23);
		panel3.add(buttonn24);	
		panel3.add(label5);
		panel3.add(label6);
		panel3.add(textField_1);
		frame3.add(panel3);
		//-------------------------------------------------------------------------
		//history button.
		
		bm6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flaghis==1)
				{
					x= counterforhistory-1;
					counterformove = x; 
					
					JOptionPane.showMessageDialog(null, "YOUR BALANCE = "+ arrayofbalance[counterformove]+ "   LAST TRANSACTION:. " + arrayoftype[counterformove] + " : " + arrayofvalue[counterformove]);
					flagnexpre=1;
				}
				
				else 
					JOptionPane.showMessageDialog(null, "Please Make One Transction At Least.");
				
			}
			});
		//-------------------------------------------------------------------------
		//next
		bm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flagnexpre==1)
				{
				
				counterformove++;
				if(counterformove == 5)
				{
					counterformove=0;
				}
				
				JOptionPane.showMessageDialog(null,"YOUR BALANCE = "+ arrayofbalance[counterformove]+ "   "  + arrayoftype[counterformove] + " : " + arrayofvalue[counterformove]);
					}
					
				else 
					JOptionPane.showMessageDialog(null, "Please Press History First.");
			
			}
			});
		//---------------------------------------------------------
		//previous
		bm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flagnexpre==1)
					
				{
					counterformove--;
					if(counterformove==-1)
					{
						counterformove=4;

					}
					
					
					JOptionPane.showMessageDialog(null, "YOUR BALANCE = "+ arrayofbalance[counterformove]+ "   "  + arrayoftype[counterformove] + " : " + arrayofvalue[counterformove]);

				}

				else 
					JOptionPane.showMessageDialog(null, "Please Press History First.");
			
			}
			});
		//--------------------------------------------------------------------------------------
		//some Actions.
		
		//LogIn.
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String getcardno = text.getText();
				int fr= Integer.parseInt(getcardno);
				
				if(getcardno == "")
				{
					JOptionPane.showMessageDialog(null, "ENTER YOUR CARD NUMBER!!");
				}
				
				if (fr == u.cardNo)
					    {
						f.setVisible(false);
						fm.setVisible(true);
					    }
					else 
						{ 
						JOptionPane.showMessageDialog(null, "NOT FOUND");
						}}});
		
		//---------------------------------
		
	//deposit button.
		bm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fm.setVisible(false);
				frame2.setVisible(true);
			}
		});
		
		//--------------------------------
		//withdraw button
		
		bm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fm.setVisible(false);
				frame3.setVisible(true);
			}
		});
		//------------------------------------
		//balance button 
		
		bm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelforbalance.setText("YOUR BALANCE = "+ String.valueOf(u.balanceInquiry()));
			}
		});
		
		//--------------------------------------
		//from deposit window to menu
		
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fm.setVisible(true);
				frame2.setVisible(false);
			}
		});
		
		//---------------------------------------
		//from withdraw window to menu
		buttonn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fm.setVisible(true);
				frame3.setVisible(false);
			}
		});
			}
		}

