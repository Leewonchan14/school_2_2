package excode;


import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame{
	JRadioButton[] Dir = new JRadioButton[3];
	JButton[] jbt = new JButton[3];
	JSlider[] sd = new JSlider[3];
	JLabel lb_color = new JLabel("SLIDER EXAMPLE");
	JButton color_bt;
	public SliderChangeEx() {
		super("2018212031 이원찬");
		Container c = getContentPane();
		
		JPanel up = new JPanel();
		up.setLayout(new FlowLayout());
		up.setBackground(Color.gray);
		
		JPanel Centor = new JPanel();
		
		Centor.setLayout(new FlowLayout());
			
		jbt[0] = new JButton("West");
		jbt[1] = new JButton("South");
		jbt[2] = new JButton("East");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		c.add(up,BorderLayout.NORTH);
		c.add(jbt[0],BorderLayout.WEST);
		c.add(jbt[1],BorderLayout.SOUTH);
		c.add(jbt[2],BorderLayout.EAST);
		
		c.add(Centor,BorderLayout.CENTER);
		
		ButtonGroup bg = new ButtonGroup();
		
		
		Dir[0] = new JRadioButton("West");
		Dir[1] = new JRadioButton("South");
		Dir[2] = new JRadioButton("East"); 
		
		
		Li a = new Li();
		
		for(int i=0;i<3;i++) {
			Dir[i].addItemListener(a);
			bg.add(Dir[i]);
			up.add(Dir[i]);
		}
		
		Dir[0].setSelected(true);
		
		MYL listen = new MYL();
		
		for(int i=0;i<3;i++) {
			sd[i]= new JSlider(0,255,125);
			sd[i].setPaintLabels(true);
			sd[i].setPaintTicks(true);
			sd[i].setMajorTickSpacing(50);
			sd[i].setMinorTickSpacing(10);
			sd[i].addChangeListener(listen);
			Centor.add(sd[i]);
		}
		sd[0].setForeground(Color.red);
		sd[1].setForeground(Color.green);
		sd[2].setForeground(Color.blue);
		
		
		
		
		setVisible(true);
		setSize(350,300);
		
	}
	class MYL implements ChangeListener{
		int[] rgb = {0,0,0};
		public void stateChanged(ChangeEvent e) {
			
			JSlider js = (JSlider)e.getSource();
			for(int i=0;i<3;i++) {
				rgb[i] = sd[i].getValue(); 
			}
			color_bt.setBackground(new Color(rgb[0],rgb[1],rgb[2]));
		}
	}
	class Li implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			
			for(int i=0;i<3;i++) {
				if(e.getItem()==Dir[i]) {
					color_bt = jbt[i];
				}
			}
			
		}
	}
	public static void main(String[] args) {
		new SliderChangeEx();

	}

}
