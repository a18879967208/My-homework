package �γ̱�;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class kcb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame =new JFrame();
		JTable table =new JTable(new �γ̱�data());
		JScrollPane pane =new JScrollPane(table);
		frame.add(pane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
