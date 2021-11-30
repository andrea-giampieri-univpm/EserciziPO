import java . awt .*;
import javax . swing .*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "porcone");
		JOptionPane.showInputDialog("pene");
		JOptionPane.showInternalConfirmDialog(null,"aaa");
		String value = "0";
		JFrame frame = new JFrame("JFrame Example");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel();
		JTextField tztField = new JTextField();
		JButton button = new JButton("aumenta");
		button.setText("Button");
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		//button.addActionListener(new ButtonActionListener(0));
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
