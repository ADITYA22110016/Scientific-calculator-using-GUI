import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class pbl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pbl frame = new pbl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pbl() {
		setBackground(Color.CYAN);
		setTitle("Scientific calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 688);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnNewButton = new JButton("Add");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 27, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 75, SpringLayout.NORTH, contentPane);
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter First  number ");
		    	int x=sc.nextInt();
		    	System.out.println("Enter Second   number ");
		    	int y=sc.nextInt();
		    	System.out.println(x+y);				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnDiv = new JButton("Div");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnDiv, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnDiv, 43, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnDiv, 48, SpringLayout.NORTH, btnNewButton);
		btnDiv.setForeground(Color.RED);
		btnDiv.setFont(new Font("Kohinoor Devanagari", Font.PLAIN, 13));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter First  number ");
		    	int x=sc.nextInt();
		    	System.out.println("Enter Second   number ");
		    	int y=sc.nextInt();
		    	System.out.println(x/y);
			}
		});
		btnDiv.setBackground(Color.BLACK);
		contentPane.add(btnDiv);
		
		JButton btnSub = new JButton("Sub");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSub, 342, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnDiv, -68, SpringLayout.WEST, btnSub);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSub, 1, SpringLayout.NORTH, btnNewButton);
		btnSub.setForeground(Color.BLUE);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter First  number ");
		    	int x=sc.nextInt();
		    	System.out.println("Enter Second   number ");
		    	int y=sc.nextInt();
		    	System.out.println(x-y);

			}
		});
		btnSub.setFont(new Font("Kohinoor Devanagari", Font.PLAIN, 13));
		btnSub.setBackground(Color.YELLOW);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("Mul");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnMul, 539, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSub, -74, SpringLayout.WEST, btnMul);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMul, 9, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMul, 48, SpringLayout.NORTH, btnNewButton);
		btnMul.setForeground(Color.RED);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter First  number ");
		    	int x=sc.nextInt();
		    	System.out.println("Enter Second   number ");
		    	int y=sc.nextInt();
		    	System.out.println(x*y);
								
			}
		});
		btnMul.setFont(new Font("Kohinoor Devanagari", Font.PLAIN, 13));
		btnMul.setBackground(Color.GRAY);
		contentPane.add(btnMul);
		
		JButton btnConversions = new JButton("Conversions");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMul, -73, SpringLayout.WEST, btnConversions);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnConversions, -4, SpringLayout.NORTH, btnMul);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnConversions, -180, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnConversions, -46, SpringLayout.EAST, contentPane);
		btnConversions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Scanner sc=new Scanner(System.in);
		    	   System.out.println("Enter which coversion you want to perform ");
		    	   System.out.println("Enter 1 for degree to radians , 2 for radians to degrees ,3 for celcius to farheniet ,4 for celcuis to kelvin");
		    	 
		    	   int g=sc.nextInt();
		    	   if(g==1) {
		    		   System.out.println("Enter the value in degrees");
		    		   int t=sc.nextInt();
		    		   System.out.println("Your valur in radians is "+ Math.toRadians(t));  
		    	   }
		    	   else if(g==2){
		    		   System.out.println("Enter the value in radians");
		    		   int t=sc.nextInt();
		    		   System.out.println("Your valur in radians is "+ Math.toDegrees(t));   
		    	   }
		    	   else if(g==3) {
		    		   System.out.println("Enter the values in celcius");
		    		   int h=sc.nextInt();
		    		   double j=(((9/5)*h)+32);
		    		   System.out.println("The value in farheniet is" + j);
		    		  
		    	   }
		    	   else if(g==4) {
		    		   System.out.println("Enter the values in celcius");
		    		   int h=sc.nextInt();
		    		   double j=h+273;
		    		   System.out.println("The value in kelvin is" + j);
		    		  
		    	   }
		    	   
				
				
				
			}
		});
		btnConversions.setForeground(Color.MAGENTA);
		btnConversions.setFont(new Font("Kohinoor Devanagari", Font.PLAIN, 13));
		btnConversions.setBackground(new Color(34, 139, 34));
		contentPane.add(btnConversions);
		
		JButton btnMatrices = new JButton("Matrices");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMatrices, 55, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMatrices, -471, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMatrices, -812, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, btnMatrices);
		btnMatrices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner s=new Scanner(System.in);
	        	System.out.println("Enter first index of array (m terms)");
	        	 int h=s.nextInt();
	        	 System.out.println("Enter second  index of array (n terms)");
	        	 int k=s.nextInt();
	        	 int a[][]=new int[h][k];
	        	 int b[][]=new int[h][k];
	        	  int c[][]=new int[h][k];
	        	  Scanner sc=new Scanner(System.in);
	        	  for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Enter the elements of matrices");
	        			  a[i][j]=sc.nextInt();
	        		  }
	        	  }  
	        	  for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Enter the elements of matrices");
	        			  b[i][j]=sc.nextInt();
	        		  }
	        		 
	        	  }  
	        	  System.out.println("Enter which operation do you want to perform on matrices (Enter 1 for addition,2 for Substraction,3 for division,4 for multiplication)");
	              int g=sc.nextInt();
	              if(g==1) {
	        	  for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Addition of elements is ");
	        			  System.out.println(a[i][j]+b[i][j]);
	        		 
	        		  }
	        		 
	        	  }  
	              }
	              else if(g==2) { for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Substraction  of elements is ");
	        			  System.out.println(a[i][j]-b[i][j]);
	        		 
	        		  }
	        		 
	        	  }  
	              }
	        
	              else if(g==3) {  for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Division  of elements is ");
	        			  System.out.println(a[i][j]/b[i][j]);
	        		      
	        		  }
	        		 
	        	  } }
	              else if(g==4) {  for(int i=0;i<h;i++) {
	        		  for(int  j=0;j<k;j++) {
	        			  System.out.println("Multiplication  of elements is ");
	        			  System.out.println(a[i][j]*b[i][j]);
	        		      
	        		  }
	        		 
	        	  } 
	        	    
	          } 
				
				
				
				
				
			}
		});
		btnMatrices.setForeground(SystemColor.controlHighlight);
		btnMatrices.setBackground(new Color(205, 133, 63));
		contentPane.add(btnMatrices);
		
		JButton btnPercentage = new JButton("Percentage");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPercentage, 147, SpringLayout.WEST, contentPane);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter total no of marks ");
		    	int d=sc.nextInt();
		    	System.out.println("Enter  no of marks u obtained ");
		    	int k=sc.nextInt();
		    	double perc=((k*100)/d);
		        System.out.println("Congratulations you have obtained"    +perc+    "Percentage");
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPercentage, 0, SpringLayout.NORTH, btnMatrices);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPercentage, 0, SpringLayout.SOUTH, btnMatrices);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPercentage, 170, SpringLayout.EAST, btnMatrices);
		btnPercentage.setForeground(Color.RED);
		btnPercentage.setBackground(new Color(255, 160, 122));
		contentPane.add(btnPercentage);
		
		JButton btnPercentage_1 = new JButton("Exponent");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPercentage_1, 68, SpringLayout.EAST, btnPercentage);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSub, -53, SpringLayout.NORTH, btnPercentage_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPercentage_1, 0, SpringLayout.SOUTH, btnMatrices);
		btnPercentage_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter the number whose exponent is to be calculated ");
		    	double x=sc.nextInt();
		    	System.out.println(Math.exp(x));
				
				
				
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPercentage_1, 0, SpringLayout.NORTH, btnMatrices);
		btnPercentage_1.setForeground(Color.BLUE);
		btnPercentage_1.setBackground(new Color(138, 43, 226));
		contentPane.add(btnPercentage_1);
		
		JButton btnPercentage_1_1 = new JButton("Cube");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPercentage_1_1, 539, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPercentage_1, -69, SpringLayout.WEST, btnPercentage_1_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPercentage_1_1, -48, SpringLayout.SOUTH, btnMatrices);
		btnPercentage_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Base number");
				double d=sc.nextInt();
				double v=3.0;
			    System.out.println(Math.pow(d,v));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPercentage_1_1, 0, SpringLayout.SOUTH, btnMatrices);
		btnPercentage_1_1.setForeground(Color.ORANGE);
		btnPercentage_1_1.setBackground(new Color(0, 0, 255));
		contentPane.add(btnPercentage_1_1);
		
		JButton btnPercentage_1_1_1 = new JButton("Square");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPercentage_1_1_1, 760, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPercentage_1_1_1, -37, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnConversions, -52, SpringLayout.NORTH, btnPercentage_1_1_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPercentage_1_1, -97, SpringLayout.WEST, btnPercentage_1_1_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPercentage_1_1_1, -48, SpringLayout.SOUTH, btnMatrices);
		btnPercentage_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Base number");
				double d=sc.nextInt();
				double v=2.0;
			    System.out.println(Math.pow(d,v));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPercentage_1_1_1, 0, SpringLayout.SOUTH, btnMatrices);
		btnPercentage_1_1_1.setForeground(Color.MAGENTA);
		btnPercentage_1_1_1.setBackground(new Color(211, 211, 211));
		contentPane.add(btnPercentage_1_1_1);
		
		JButton btnFactorial = new JButton("Factorial");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFactorial, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnFactorial, 132, SpringLayout.SOUTH, btnMatrices);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				int i,fact=1;
				System.out.println("Enter the no which factorial is to be calculated ");
				  int no=sc.nextInt();  
				  for(i=1;i<=no;i++){    
				      fact=fact*i;    
				  }    
				  System.out.println("Factorial of "+no+" is: "+fact);    
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFactorial, 0, SpringLayout.WEST, btnMatrices);
		btnFactorial.setForeground(UIManager.getColor("Button.select"));
		btnFactorial.setBackground(new Color(240, 230, 140));
		contentPane.add(btnFactorial);
		
		JButton btnFibonacci = new JButton("Fibonacci");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFibonacci, 55, SpringLayout.EAST, btnFactorial);
		btnFibonacci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	 System.out.println("Enter n terms upto which fibonacci is been calculated ");
		    	 int n = sc.nextInt(), firstTerm = 0, secondTerm = 1;
		    	    System.out.println("Fibonacci Series till " + n + " terms:");
		    	    for (int i = 1; i <= n; ++i) {
		    	      System.out.println(firstTerm + ", ");
		    	      int nextTerm = firstTerm + secondTerm;
		    	      firstTerm = secondTerm;
		    	      secondTerm = nextTerm;
		    	    }
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFibonacci, -48, SpringLayout.SOUTH, btnFactorial);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnFibonacci, 0, SpringLayout.SOUTH, btnFactorial);
		btnFibonacci.setForeground(new Color(255, 20, 147));
		btnFibonacci.setBackground(new Color(224, 255, 255));
		contentPane.add(btnFibonacci);
		
		JButton btnSin = new JButton("Sin");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSin, 342, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFibonacci, -69, SpringLayout.WEST, btnSin);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSin, 0, SpringLayout.NORTH, btnFactorial);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSin, 0, SpringLayout.SOUTH, btnFactorial);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Decimal   number whose sine value is to be calculated ");
				double d=sc.nextInt();
			    System.out.println(Math.sin(d));
			}
		});
		btnSin.setForeground(new Color(255, 140, 0));
		btnSin.setBackground(new Color(0, 255, 0));
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCos, 550, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSin, -89, SpringLayout.WEST, btnCos);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCos, 0, SpringLayout.NORTH, btnFactorial);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Decimal   number whose cos value is to be calculated ");
				double d=sc.nextInt();
			    System.out.println(Math.cos(d));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCos, 0, SpringLayout.SOUTH, btnFactorial);
		btnCos.setForeground(new Color(0, 0, 255));
		btnCos.setBackground(new Color(255, 0, 0));
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("LOG");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCos, -114, SpringLayout.WEST, btnTan);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTan, -139, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTan, 0, SpringLayout.SOUTH, btnFactorial);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Decimal   number whose LOG  is to be calculated ");
				double d=sc.nextInt();
			    System.out.println(Math.log(d));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTan, 0, SpringLayout.NORTH, btnFactorial);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTan, -51, SpringLayout.EAST, contentPane);
		btnTan.setForeground(new Color(0, 128, 128));
		btnTan.setBackground(new Color(240, 248, 255));
		contentPane.add(btnTan);
		
		JButton btnPower = new JButton("POWER");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPower, 120, SpringLayout.SOUTH, btnFactorial);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPower, -812, SpringLayout.EAST, contentPane);
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Base number");
				double d=sc.nextInt();
				System.out.println("Enter Exponent number");
				double v=sc.nextInt();
			    System.out.println(Math.pow(d,v));	
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPower, 72, SpringLayout.SOUTH, btnFactorial);
		btnPower.setForeground(new Color(255, 99, 71));
		btnPower.setBackground(Color.PINK);
		contentPane.add(btnPower);
		
		JButton btnRoot = new JButton("Root");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRoot, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRoot, 0, SpringLayout.SOUTH, btnPower);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRoot, 159, SpringLayout.EAST, btnPower);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Decimal   number whose root  is to be calculated ");
				double d=sc.nextInt();
			    System.out.println(Math.sqrt(d));
				
				
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRoot, 0, SpringLayout.NORTH, btnPower);
		btnRoot.setForeground(new Color(255, 160, 122));
		btnRoot.setBackground(Color.PINK);
		contentPane.add(btnRoot);
		
		JButton btnPower_2 = new JButton("Floord");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPower_2, 0, SpringLayout.NORTH, btnPower);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPower_2, 79, SpringLayout.EAST, btnRoot);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPower_2, 0, SpringLayout.SOUTH, btnPower);
		btnPower_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter First  number ");
		    	double  x=sc.nextInt();
		    	System.out.println("Enter Second   number ");
		    	double  y=sc.nextInt();
		    	System.out.println((x/y));
				
				
			}
		});
		btnPower_2.setForeground(new Color(128, 0, 0));
		btnPower_2.setBackground(Color.PINK);
		contentPane.add(btnPower_2);
		
		JButton btnPower_3 = new JButton("Complex");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPower_2, -82, SpringLayout.WEST, btnPower_3);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPower_3, 0, SpringLayout.NORTH, btnPower);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPower_3, 0, SpringLayout.SOUTH, btnPower);
		btnPower_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	   System.out.println("Enter Real part of complex number ");
		    	   int h=sc.nextInt();
		    	   System.out.println("Enter imagnary part of complex number ");
		    	   int j=sc.nextInt();
		    	   System.out.println("Your complex number is "+ h + "+" +  "i"  +j);
		    	   System.out.println("Enter 1 to calculate the Magnitude of complex number , 2 to calculate the angle ");
		    	   int c=sc.nextInt();
		    	   if(c==1) {
		    		   System.out.println("The magnitude of complex number is " + Math.hypot(h, j));
		    	   }
		    	   else if(c==2) {
		    		   System.out.println("The angle of complex number is " + Math.atan2(j, h));
		    	   } 
		       }  
			
		});
		btnPower_3.setForeground(new Color(255, 165, 0));
		btnPower_3.setBackground(new Color(128, 128, 0));
		contentPane.add(btnPower_3);
		
		JButton btnPower_4 = new JButton("Inverses");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPower_3, -114, SpringLayout.WEST, btnPower_4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnPower_4, 0, SpringLayout.NORTH, btnPower);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnPower_4, 0, SpringLayout.WEST, btnTan);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnPower_4, 96, SpringLayout.WEST, btnTan);
		btnPower_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Scanner sc=new Scanner(System.in);
		    	   System.out.println("Enter the no whose inverse is to be calculated ");
		    	   System.out.println("Enter 1 for sin inverse ,2 for cos inverse,3 for tan inverse ");
		    	   int h=sc.nextInt();
		    	   System.out.println("Enter the value");
		    	   double j=sc.nextInt();
		    	   if(h==1) {
		    		   System.out.println("Sine inverse of following number is " + Math.asin(j));
		  
		    	   }
		    	   else if(h==2) {
		    		   System.out.println("cos inverse of following number is " + Math.acos(j));
		  
		    	   }
		    	   else if(h==3) {
		    		   System.out.println("tan inverse of following number is " + Math.atan(j));
		  
		    	   } 
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnPower_4, 0, SpringLayout.SOUTH, btnPower);
		btnPower_4.setForeground(new Color(255, 99, 71));
		btnPower_4.setBackground(Color.PINK);
		contentPane.add(btnPower_4);
		
		JButton btnHypotenuse = new JButton("Hypotenuse");
		btnHypotenuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
		    	   System.out.println("Enter the values ");
		    	   int x=sc.nextInt();
		    	   int y=sc.nextInt();
		    	   System.out.println(Math.hypot(x, y)); 				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnHypotenuse, 43, SpringLayout.SOUTH, btnRoot);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnHypotenuse, 0, SpringLayout.WEST, btnRoot);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnHypotenuse, -128, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnHypotenuse, 390, SpringLayout.WEST, contentPane);
		btnHypotenuse.setForeground(new Color(255, 0, 255));
		btnHypotenuse.setBackground(Color.PINK);
		contentPane.add(btnHypotenuse);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnExit, 40, SpringLayout.SOUTH, btnPower_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnExit, 140, SpringLayout.EAST, btnHypotenuse);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnExit, 88, SpringLayout.SOUTH, btnPower_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnExit, 325, SpringLayout.EAST, btnHypotenuse);
		btnExit.setForeground(new Color(127, 255, 212));
		btnExit.setBackground(Color.PINK);
		contentPane.add(btnExit);
	}
}