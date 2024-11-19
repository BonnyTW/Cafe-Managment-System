 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	
	public Dashboard() {
		initialize();
	}

	//SPINNER 	
	private JSpinner CoffeSpinner;
	private JSpinner TeaSpinner;
	private JSpinner MacchiatoSpinner;
	private JSpinner CocaSpinner;
	private JSpinner Fantaspinner;
	private JSpinner Spritespinner;
	private JSpinner OrangeSpinner;
	private JSpinner AvocadoSpinner;
	private JSpinner AppleSpinner;
	private JSpinner BurgerSpinner;
	private JSpinner PizzaSpinner;
	private JSpinner FE_Spinner;
	
	//TEXT AREA
	private JTextArea textArea_tax;
	JTextArea textArea_subtot;
	JTextArea textArea_total;
	

	//For Spinner
	int coffequantity;
	int teaquantity;
	int macquantity;
	int cocaquantity;
	int fantaquantity;
	int spritequantity;
	int orangequantity;
	int avocadoquantity;
	int applequantity;
	int burgerquantity;
	int pizzaquantity;
	int fried_eggquantity;
	
	//Single Value
	int CoffeValue;
	int TeaValue;
	int MacValue;
	int CocaValue;
	int FantaValue;
	int SpriteValue;
	int OrangeValue;
	int AvocadoValue;
	int AppleValue;
	int BurgerValue;
	int PizzaValue;
	int FriedEggValue;
		
	
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1440, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel cafepanel = new JPanel();
		cafepanel.setBounds(712, 5, 1, 1);
		cafepanel.setBorder(new LineBorder(new Color(192, 192, 192), 4));
		cafepanel.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(cafepanel);
		cafepanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Swing Cafe");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 10, 151, 32);
		cafepanel.add(lblNewLabel);
		
		JPanel menupanel = new JPanel();
		menupanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "HotDrinks", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		menupanel.setBounds(10, 88, 524, 233);
		cafepanel.add(menupanel);
		menupanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 25, 163, 192);
		menupanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 10, 45, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Price");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 39, 45, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(10, 71, 62, 29);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Purchese");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBounds(10, 104, 68, 29);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Coffee");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(88, 20, 45, 13);
		panel.add(lblNewLabel_3);
		
		JLabel CoffeLabel = new JLabel("10 Br");
		CoffeLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		CoffeLabel.setBounds(88, 49, 45, 13);
		panel.add(CoffeLabel);
		
		CoffeSpinner = new JSpinner();
		CoffeSpinner.setBounds(86, 78, 47, 20);
		panel.add(CoffeSpinner);
		
		JCheckBox CoffeCheckBox = new JCheckBox("");
		CoffeCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(CoffeSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 CoffeCheckBox.setSelected(false);
		    		 CoffeSpinner.setValue(0);
		    	}
			}
		});
		CoffeCheckBox.setBounds(84, 110, 21, 21);
		panel.add(CoffeCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\coffee-cup-clipart-generative-ai-png.png"));
		lblNewLabel_5.setBounds(10, 132, 62, 50);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(183, 25, 163, 192);
		menupanel.add(panel_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Name");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(10, 10, 45, 29);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Price");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBounds(10, 39, 45, 29);
		panel_1.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 71, 62, 29);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Purchese");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_1.setBounds(10, 104, 68, 29);
		panel_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tea");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_2.setBounds(88, 20, 45, 13);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel TeaLabel = new JLabel("10 Br");
		TeaLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		TeaLabel.setBounds(88, 49, 45, 13);
		panel_1.add(TeaLabel);
		
		TeaSpinner = new JSpinner();
		TeaSpinner.setBounds(86, 78, 47, 20);
		panel_1.add(TeaSpinner);
		
		JCheckBox TeaCheckBox = new JCheckBox("");
		TeaCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(TeaSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 TeaCheckBox.setSelected(false);
		    		 TeaSpinner.setValue(0);
		    	}
			}
		});
		TeaCheckBox.setBounds(84, 110, 21, 21);
		panel_1.add(TeaCheckBox);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\images.jpg"));
		lblNewLabel_5_1.setBounds(10, 132, 70, 50);
		panel_1.add(lblNewLabel_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(356, 25, 163, 192);
		menupanel.add(panel_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Name");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(10, 10, 45, 29);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Price");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBounds(10, 39, 45, 29);
		panel_2.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Quantity");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_2.setBounds(10, 71, 62, 29);
		panel_2.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Purchese");
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_2.setBounds(10, 104, 68, 29);
		panel_2.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Macchiato");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_3.setBounds(88, 20, 65, 13);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel MacLabel = new JLabel("15 Br");
		MacLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		MacLabel.setBounds(88, 49, 45, 13);
		panel_2.add(MacLabel);
		
		MacchiatoSpinner = new JSpinner();
		MacchiatoSpinner.setBounds(86, 78, 47, 20);
		panel_2.add(MacchiatoSpinner);
		
		JCheckBox MacCheckBox = new JCheckBox("");
		MacCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(MacchiatoSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 MacCheckBox.setSelected(false);
		    		 MacchiatoSpinner.setValue(0);
		    	}
			}
		});
		MacCheckBox.setBounds(84, 110, 21, 21);
		panel_2.add(MacCheckBox);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\images1.jpg"));
		lblNewLabel_5_2.setBounds(10, 132, 62, 50);
		panel_2.add(lblNewLabel_5_2);
		
		JPanel menupanel_2 = new JPanel();
		menupanel_2.setLayout(null);
		menupanel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SoftDrinks", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		menupanel_2.setBounds(564, 88, 524, 233);
		cafepanel.add(menupanel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 25, 163, 192);
		menupanel_2.add(panel_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Name");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(10, 10, 45, 29);
		panel_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Price");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_5.setBounds(10, 39, 45, 29);
		panel_3.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3.setBounds(10, 71, 62, 29);
		panel_3.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("Purchese");
		lblNewLabel_2_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_3.setBounds(10, 104, 68, 29);
		panel_3.add(lblNewLabel_2_1_2_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Coca");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_4.setBounds(88, 20, 45, 13);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel CocaLabel = new JLabel("10 Br");
		CocaLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		CocaLabel.setBounds(88, 49, 45, 13);
		panel_3.add(CocaLabel);
		
		CocaSpinner = new JSpinner();
		CocaSpinner.setBounds(86, 78, 47, 20);
		panel_3.add(CocaSpinner);
		
		JCheckBox CocaCheckBox = new JCheckBox("");
		CocaCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(CocaSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 CocaCheckBox.setSelected(false);
		    		 CocaSpinner.setValue(0);
		    	}
			}
		});
		CocaCheckBox.setBounds(84, 110, 21, 21);
		panel_3.add(CocaCheckBox);
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\coca-cola-classic-getty-fotoatelie.jpg"));
		lblNewLabel_5_3.setBounds(10, 132, 62, 50);
		panel_3.add(lblNewLabel_5_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(183, 25, 163, 192);
		menupanel_2.add(panel_1_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Name");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2_2.setBounds(10, 10, 45, 29);
		panel_1_2.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("Price");
		lblNewLabel_2_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3_2.setBounds(10, 39, 45, 29);
		panel_1_2.add(lblNewLabel_2_1_3_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Quantity");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_2.setBounds(10, 71, 62, 29);
		panel_1_2.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_2_1_2 = new JLabel("Purchese");
		lblNewLabel_2_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_1_2.setBounds(10, 104, 68, 29);
		panel_1_2.add(lblNewLabel_2_1_2_1_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Fanta");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_2_2.setBounds(88, 20, 45, 13);
		panel_1_2.add(lblNewLabel_3_2_2);
		
		JLabel FantaLabel = new JLabel("10 Br");
		FantaLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		FantaLabel.setBounds(88, 49, 45, 13);
		panel_1_2.add(FantaLabel);
		
		Fantaspinner = new JSpinner();
		Fantaspinner.setBounds(86, 78, 47, 20);
		panel_1_2.add(Fantaspinner);
		
		JCheckBox FantaCheckBox = new JCheckBox("");
		FantaCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(Fantaspinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 FantaCheckBox.setSelected(false);
		    		 Fantaspinner.setValue(0);
		    	}
			}
		});
		FantaCheckBox.setBounds(84, 110, 21, 21);
		panel_1_2.add(FantaCheckBox);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\images13.jpg"));
		lblNewLabel_5_1_2.setBounds(10, 132, 70, 50);
		panel_1_2.add(lblNewLabel_5_1_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(356, 25, 163, 192);
		menupanel_2.add(panel_2_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Name");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_2.setBounds(10, 10, 45, 29);
		panel_2_2.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("Price");
		lblNewLabel_2_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_2.setBounds(10, 39, 45, 29);
		panel_2_2.add(lblNewLabel_2_1_4_2);
		
		JLabel lblNewLabel_2_1_1_2_2 = new JLabel("Quantity");
		lblNewLabel_2_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_2_2.setBounds(10, 71, 62, 29);
		panel_2_2.add(lblNewLabel_2_1_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_2 = new JLabel("Purchese");
		lblNewLabel_2_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_2_2.setBounds(10, 104, 68, 29);
		panel_2_2.add(lblNewLabel_2_1_2_2_2);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Sprite");
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_3_2.setBounds(88, 20, 65, 13);
		panel_2_2.add(lblNewLabel_3_3_2);
		
		JLabel SpriteLabel = new JLabel("10 Br");
		SpriteLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		SpriteLabel.setBounds(88, 49, 45, 13);
		panel_2_2.add(SpriteLabel);
		
		Spritespinner = new JSpinner();
		Spritespinner.setBounds(86, 78, 47, 20);
		panel_2_2.add(Spritespinner);
		
		JCheckBox SpriteCheckBox = new JCheckBox("");
		SpriteCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(Spritespinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 SpriteCheckBox.setSelected(false);
		    		 Spritespinner.setValue(0);
		    	}
			}
		});
		SpriteCheckBox.setBounds(84, 110, 21, 21);
		panel_2_2.add(SpriteCheckBox);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("");
		lblNewLabel_5_2_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\200112137-poznan-pol-nov-24-2022-can-of-sprite-a-brand-of-soft-drink-created-by-the-coca-cola-company.jpg"));
		lblNewLabel_5_2_2.setBounds(10, 132, 62, 50);
		panel_2_2.add(lblNewLabel_5_2_2);
		
		JPanel menupanel_1 = new JPanel();
		menupanel_1.setLayout(null);
		menupanel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "FastFoods", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		menupanel_1.setBounds(564, 352, 524, 233);
		cafepanel.add(menupanel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 25, 163, 192);
		menupanel_1.add(panel_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Name");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(10, 10, 45, 29);
		panel_4.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Price");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_6.setBounds(10, 39, 45, 29);
		panel_4.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("Quantity");
		lblNewLabel_2_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_4.setBounds(10, 71, 62, 29);
		panel_4.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("Purchese");
		lblNewLabel_2_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_4.setBounds(10, 104, 68, 29);
		panel_4.add(lblNewLabel_2_1_2_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Burger");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_5.setBounds(88, 20, 45, 13);
		panel_4.add(lblNewLabel_3_5);
		
		JLabel BurgerLabel = new JLabel("10 Br");
		BurgerLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		BurgerLabel.setBounds(88, 49, 45, 13);
		panel_4.add(BurgerLabel);
		
		BurgerSpinner = new JSpinner();
		BurgerSpinner.setBounds(86, 78, 47, 20);
		panel_4.add(BurgerSpinner);
		
		JCheckBox BurgerCheckBox = new JCheckBox("");
		BurgerCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(BurgerSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 BurgerCheckBox.setSelected(false);
		    		 BurgerSpinner.setValue(0);
		    	}
			}
		});
		BurgerCheckBox.setBounds(84, 110, 21, 21);
		panel_4.add(BurgerCheckBox);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\images11.jpg"));
		lblNewLabel_5_4.setBounds(10, 132, 62, 50);
		panel_4.add(lblNewLabel_5_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(183, 25, 163, 192);
		menupanel_1.add(panel_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Name");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBounds(10, 10, 45, 29);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Price");
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3_1.setBounds(10, 39, 45, 29);
		panel_1_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBounds(10, 71, 62, 29);
		panel_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Purchese");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_1_1.setBounds(10, 104, 68, 29);
		panel_1_1.add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Pizza");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_2_1.setBounds(88, 20, 45, 13);
		panel_1_1.add(lblNewLabel_3_2_1);
		
		JLabel PizzaLabel = new JLabel("10 Br");
		PizzaLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		PizzaLabel.setBounds(88, 49, 45, 13);
		panel_1_1.add(PizzaLabel);
		
		PizzaSpinner = new JSpinner();
		PizzaSpinner.setBounds(86, 78, 47, 20);
		panel_1_1.add(PizzaSpinner);
		
		JCheckBox PizzaCheckBox = new JCheckBox("");
		PizzaCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(PizzaSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 PizzaCheckBox.setSelected(false);
		    		 PizzaSpinner.setValue(0);
		    	}
			}
		});
		PizzaCheckBox.setBounds(84, 110, 21, 21);
		panel_1_1.add(PizzaCheckBox);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\images12.jpg"));
		lblNewLabel_5_1_1.setBounds(10, 132, 70, 50);
		panel_1_1.add(lblNewLabel_5_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(356, 25, 163, 192);
		menupanel_1.add(panel_2_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Name");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_1.setBounds(10, 10, 45, 29);
		panel_2_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Price");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBounds(10, 39, 45, 29);
		panel_2_1.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_2_1.setBounds(10, 71, 62, 29);
		panel_2_1.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("Purchese");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_2_1.setBounds(10, 104, 68, 29);
		panel_2_1.add(lblNewLabel_2_1_2_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Fried Eggs");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_3_1.setBounds(88, 20, 65, 13);
		panel_2_1.add(lblNewLabel_3_3_1);
		
		JLabel FE_Label = new JLabel("10 Br");
		FE_Label.setFont(new Font("Tahoma", Font.ITALIC, 12));
		FE_Label.setBounds(88, 49, 45, 13);
		panel_2_1.add(FE_Label);
		
		FE_Spinner = new JSpinner();
		FE_Spinner.setBounds(86, 78, 47, 20);
		panel_2_1.add(FE_Spinner);
		
		JCheckBox FE_CheckBox = new JCheckBox("");
		FE_CheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(FE_Spinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 FE_CheckBox.setSelected(false);
		    		 FE_Spinner.setValue(0);
		    	}
			}
		});
		FE_CheckBox.setBounds(84, 110, 21, 21);
		panel_2_1.add(FE_CheckBox);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\fried-egg.jpg"));
		lblNewLabel_5_2_1.setBounds(10, 129, 62, 53);
		panel_2_1.add(lblNewLabel_5_2_1);
		
		JPanel menupanel_3 = new JPanel();
		menupanel_3.setLayout(null);
		menupanel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Fresh Juices", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		menupanel_3.setBounds(10, 352, 524, 233);
		cafepanel.add(menupanel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(10, 25, 163, 192);
		menupanel_3.add(panel_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Name");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6.setBounds(10, 10, 45, 29);
		panel_5.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Price");
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_7.setBounds(10, 39, 45, 29);
		panel_5.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_1_5 = new JLabel("Quantity");
		lblNewLabel_2_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_5.setBounds(10, 71, 62, 29);
		panel_5.add(lblNewLabel_2_1_1_5);
		
		JLabel lblNewLabel_2_1_2_5 = new JLabel("Purchese");
		lblNewLabel_2_1_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_5.setBounds(10, 104, 68, 29);
		panel_5.add(lblNewLabel_2_1_2_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Orange");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_6.setBounds(88, 20, 45, 13);
		panel_5.add(lblNewLabel_3_6);
		
		JLabel OrangeLabel = new JLabel("10 Br");
		OrangeLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		OrangeLabel.setBounds(88, 49, 45, 13);
		panel_5.add(OrangeLabel);
		
		OrangeSpinner = new JSpinner();
		OrangeSpinner.setBounds(86, 78, 47, 20);
		panel_5.add(OrangeSpinner);
		
		JCheckBox OrangeCheckBox = new JCheckBox("");
		OrangeCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(OrangeSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 OrangeCheckBox.setSelected(false);
		    		 OrangeSpinner.setValue(0);
		    	}
			}
		});
		OrangeCheckBox.setBounds(84, 110, 21, 21);
		panel_5.add(OrangeCheckBox);
		
		JLabel lblNewLabel_5_5 = new JLabel("");
		lblNewLabel_5_5.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\Benefits-of-Drinking-Orange-Juice-every-morning.jpg"));
		lblNewLabel_5_5.setBounds(10, 132, 62, 50);
		panel_5.add(lblNewLabel_5_5);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(183, 25, 163, 192);
		menupanel_3.add(panel_1_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Name");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2_3.setBounds(10, 10, 45, 29);
		panel_1_3.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_1_3_3 = new JLabel("Price");
		lblNewLabel_2_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_3_3.setBounds(10, 39, 45, 29);
		panel_1_3.add(lblNewLabel_2_1_3_3);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Quantity");
		lblNewLabel_2_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_3.setBounds(10, 71, 62, 29);
		panel_1_3.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel_2_1_2_1_3 = new JLabel("Purchese");
		lblNewLabel_2_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_1_3.setBounds(10, 104, 68, 29);
		panel_1_3.add(lblNewLabel_2_1_2_1_3);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Avocado");
		lblNewLabel_3_2_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_2_3.setBounds(88, 20, 53, 13);
		panel_1_3.add(lblNewLabel_3_2_3);
		
		JLabel AvocadoLabel = new JLabel("10 Br");
		AvocadoLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		AvocadoLabel.setBounds(88, 49, 45, 13);
		panel_1_3.add(AvocadoLabel);
		
		AvocadoSpinner = new JSpinner();
		AvocadoSpinner.setBounds(86, 78, 47, 20);
		panel_1_3.add(AvocadoSpinner);
		
		JCheckBox AvocadoCheckBox = new JCheckBox("");
		AvocadoCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(AvocadoSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 AvocadoCheckBox.setSelected(false);
		    		 AvocadoSpinner.setValue(0);
		    	}
			}
		});
		AvocadoCheckBox.setBounds(84, 110, 21, 21);
		panel_1_3.add(AvocadoCheckBox);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\keto-avocado-smoothie-recipe_1989aa748aa35fd424ff5b163f413a73.png"));
		lblNewLabel_5_1_3.setBounds(10, 132, 62, 50);
		panel_1_3.add(lblNewLabel_5_1_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(356, 25, 163, 192);
		menupanel_3.add(panel_2_3);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Name");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_3.setBounds(10, 10, 45, 29);
		panel_2_3.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_1_4_3 = new JLabel("Price");
		lblNewLabel_2_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_4_3.setBounds(10, 39, 45, 29);
		panel_2_3.add(lblNewLabel_2_1_4_3);
		
		JLabel lblNewLabel_2_1_1_2_3 = new JLabel("Quantity");
		lblNewLabel_2_1_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_2_3.setBounds(10, 71, 62, 29);
		panel_2_3.add(lblNewLabel_2_1_1_2_3);
		
		JLabel lblNewLabel_2_1_2_2_3 = new JLabel("Purchese");
		lblNewLabel_2_1_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_2_2_3.setBounds(10, 104, 68, 29);
		panel_2_3.add(lblNewLabel_2_1_2_2_3);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Apple");
		lblNewLabel_3_3_3.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_3_3_3.setBounds(88, 20, 65, 13);
		panel_2_3.add(lblNewLabel_3_3_3);
		
		JLabel AppleLabel = new JLabel("10 Br");
		AppleLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		AppleLabel.setBounds(88, 49, 45, 13);
		panel_2_3.add(AppleLabel);
		
		AppleSpinner = new JSpinner();
		AppleSpinner.setBounds(86, 78, 47, 20);
		panel_2_3.add(AppleSpinner);
		
		JCheckBox AppleCheckBox = new JCheckBox("");
		AppleCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(AppleSpinner.getValue().toString())<=0) {
		    		 JOptionPane.showMessageDialog(null, "Please Increase the quantity");
		    		 AppleCheckBox.setSelected(false);
		    		 AppleSpinner.setValue(0);
		    	}
			}
		});
		AppleCheckBox.setBounds(84, 110, 21, 21);
		panel_2_3.add(AppleCheckBox);
		
		JLabel lblNewLabel_5_1_3_1 = new JLabel("");
		lblNewLabel_5_1_3_1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\images\\intro-1621953689.jpg"));
		lblNewLabel_5_1_3_1.setBounds(10, 132, 95, 50);
		panel_2_3.add(lblNewLabel_5_1_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(20, 52, 69, 26);
		cafepanel.add(lblNewLabel_1);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double SubTotal=0;
				double TaxRate=0.10;
				
				
				if(CoffeCheckBox.isSelected()) {
					coffequantity = (int) CoffeSpinner.getValue();
					CoffeValue = Integer.parseInt(CoffeLabel.getText().split(" ")[0]);
		            SubTotal+=CoffeValue*coffequantity;
				}
				
				if(TeaCheckBox.isSelected()) {
					teaquantity = (int) TeaSpinner.getValue();
					TeaValue = Integer.parseInt(TeaLabel.getText().split(" ")[0]);
		            SubTotal+=TeaValue*teaquantity;
				}
				
				if(MacCheckBox.isSelected()) {
					macquantity = (int) MacchiatoSpinner.getValue();
					MacValue = Integer.parseInt(MacLabel.getText().split(" ")[0]);
		            SubTotal+=MacValue*macquantity;
				}
				
				if(CocaCheckBox.isSelected()) {
					cocaquantity = (int) CocaSpinner.getValue();
					CocaValue = Integer.parseInt(CocaLabel.getText().split(" ")[0]);
		            SubTotal+=CocaValue*cocaquantity;
				}
				
				if(FantaCheckBox.isSelected()) {
					fantaquantity = (int) Fantaspinner.getValue();
					FantaValue = Integer.parseInt(FantaLabel.getText().split(" ")[0]);
		            SubTotal+=FantaValue*fantaquantity;
				}
				
				if(SpriteCheckBox.isSelected()) {
					spritequantity = (int) Spritespinner.getValue();
					SpriteValue = Integer.parseInt(SpriteLabel.getText().split(" ")[0]);
					SubTotal += SpriteValue * spritequantity;
				}
				
				if(OrangeCheckBox.isSelected()) {
					orangequantity = (int) OrangeSpinner.getValue();
					OrangeValue = Integer.parseInt(OrangeLabel.getText().split(" ")[0]);
		            SubTotal+=OrangeValue*orangequantity;
				}
				
				if(AvocadoCheckBox.isSelected()) {
					avocadoquantity = (int) AvocadoSpinner.getValue();
					AvocadoValue = Integer.parseInt(AvocadoLabel.getText().split(" ")[0]);
		            SubTotal+=AvocadoValue*avocadoquantity;
				}
				
				if(AppleCheckBox.isSelected()) {
					applequantity = (int) AppleSpinner.getValue();
					AppleValue = Integer.parseInt(AppleLabel.getText().split(" ")[0]);
		            SubTotal+=AppleValue*applequantity;
				}
				
				if(BurgerCheckBox.isSelected()) {
					burgerquantity = (int) BurgerSpinner.getValue();
					BurgerValue = Integer.parseInt(BurgerLabel.getText().split(" ")[0]);
		            SubTotal+=BurgerValue*burgerquantity;
				}
				
				if(PizzaCheckBox.isSelected()) {
					pizzaquantity = (int) PizzaSpinner.getValue();
					PizzaValue = Integer.parseInt(PizzaLabel.getText().split(" ")[0]);
		            SubTotal+=PizzaValue*pizzaquantity;
				}
				
				if(FE_CheckBox.isSelected()) {
					fried_eggquantity = (int) FE_Spinner.getValue();
					FriedEggValue = Integer.parseInt(FE_Label.getText().split(" ")[0]);
		            SubTotal+=fried_eggquantity*FriedEggValue;
				}
				
	            
				
				String subtot = String.format("%.2f", SubTotal);
				
				double Tax=SubTotal*TaxRate;
				String tax = String.format("%.2f", Tax);
				
				double Total=SubTotal+Tax;
				String tot = String.format("%.2f", Total);
				
				textArea_subtot.setText(subtot);
				textArea_tax.setText(tax);
				textArea_total.setText(tot);
				
			}
		});
		btnTotal.setBackground(new Color(0, 191, 255));
		btnTotal.setForeground(new Color(255, 255, 255));
		btnTotal.setBounds(20, 614, 122, 42);
		cafepanel.add(btnTotal);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.setForeground(Color.WHITE);
		btnReciept.setBackground(new Color(255, 20, 147));
		btnReciept.setBounds(182, 614, 122, 42);
		cafepanel.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoffeSpinner.setValue(0);
				TeaSpinner.setValue(0);
				MacchiatoSpinner.setValue(0);
				CocaSpinner.setValue(0);
				Fantaspinner.setValue(0);
				Spritespinner.setValue(0);
				OrangeSpinner.setValue(0);
				AvocadoSpinner.setValue(0);
				AppleSpinner.setValue(0);
				BurgerSpinner.setValue(0);
				PizzaSpinner.setValue(0);
				FE_Spinner.setValue(0);
				
				
				textArea_tax.setText("0.0");
				textArea_subtot.setText("0.0");
				textArea_total.setText("0.0");
				
				CoffeCheckBox.setSelected(false);
				TeaCheckBox.setSelected(false);
				MacCheckBox.setSelected(false);
				CocaCheckBox.setSelected(false);
				FantaCheckBox.setSelected(false);
				SpriteCheckBox.setSelected(false);
				OrangeCheckBox.setSelected(false);
				AvocadoCheckBox.setSelected(false);
				AppleCheckBox.setSelected(false);
				BurgerCheckBox.setSelected(false);
				PizzaCheckBox.setSelected(false);
				FE_CheckBox.setSelected(false);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(255, 0, 255));
		btnReset.setBounds(343, 614, 122, 42);
		cafepanel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(240, 230, 140));
		btnExit.setBounds(503, 614, 122, 42);
		cafepanel.add(btnExit);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 0, 0));
		panel_6.setBounds(1098, 88, 306, 568);
		cafepanel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Tax");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 427, 67, 24);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sub Total");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4_1.setBounds(10, 466, 100, 24);
		panel_6.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Total");
		lblNewLabel_4_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4_2.setBounds(10, 510, 67, 24);
		panel_6.add(lblNewLabel_4_2);
		
		textArea_tax = new JTextArea();
		textArea_tax.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
		textArea_tax.setText("0.0");
		textArea_tax.setToolTipText("");
		textArea_tax.setEditable(false);
		textArea_tax.setBounds(105, 429, 146, 22);
		panel_6.add(textArea_tax);
		
		
		textArea_subtot = new JTextArea();
		textArea_subtot.setFont(new Font("Monospaced", Font.ITALIC, 13));
		textArea_subtot.setText("0.0");
		textArea_subtot.setEditable(false);
		textArea_subtot.setBounds(105, 468, 146, 22);
		panel_6.add(textArea_subtot);
		
		textArea_total = new JTextArea();
		textArea_total.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
		textArea_total.setText("0.0");
		textArea_total.setEditable(false);
		textArea_total.setBounds(105, 512, 146, 22);
		panel_6.add(textArea_total);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(10, 10, 286, 407);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		frame.setVisible(true);
	}
	
}
