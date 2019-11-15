  
import javax.swing.*;
import java.awt.*;


public class MainFinestre {
	JFrame frame = new JFrame("Conto Corrente");
	JPanel panel = new JPanel();
	JButton deposita = new JButton("Deposita");
	JButton preleva = new JButton("Preleva");
	JButton stato = new JButton("Stato");
	
	public MainFinestre() {
		panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
		panel.add(deposita);
		panel.add(Box.createRigidArea(new Dimension(0,5)));
		panel.add(preleva);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFinestre();
			}
		});
	}

}
