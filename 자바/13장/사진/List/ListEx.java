package excode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class ListEx extends JFrame{
	JList<String> list_right = new JList<String>();
	ImageIcon[] ima = {
			new ImageIcon("C:\\Users\\twoone14\\Pictures\\자바사진\\apple.jpg")
			,new ImageIcon("C:\\Users\\twoone14\\Pictures\\자바사진\\banana.jpg")
			,new ImageIcon("C:\\Users\\twoone14\\Pictures\\자바사진\\mango.jpg")
			,new ImageIcon("C:\\Users\\twoone14\\Pictures\\자바사진\\kiwi.jpg")
			,new ImageIcon("C:\\Users\\twoone14\\Pictures\\자바사진\\pear.jpg")
	};
	String[] pro = {"apple","banana","mango","kiwi","pear"};
	Vector<String> v =  new Vector<String>();
	JComboBox<String> cb = new JComboBox<String>(pro);
	JLabel mage = new JLabel(ima[0]);
	public ListEx() {
		super("2018212031 이원찬");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		cb.addActionListener(new action());
		
		c.add(cb);
		
		c.add(new JScrollPane(list_right));
		list_right.setVisibleRowCount(4);
		list_right.setFixedCellWidth(100);
		
		for(int i = 0;i<5;i++) {
			v.add(pro[i]);
		}
		list_right.setListData(v);
		c.add(mage);
		setSize(300,300);
		setVisible(true);
	}
	class action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> cb2 = 
			(JComboBox<String>)e.getSource();
			v.add(pro[cb2.getSelectedIndex()]);
			list_right.setListData(v);
			mage.setIcon(ima[cb2.getSelectedIndex()]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
