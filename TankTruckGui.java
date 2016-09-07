import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class TankTruckGui {
	//Controls
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public TankTruckGui(){
		prepareGUI();
	}
	
	public static void main(String[] args){
		TankTruckGui swingTankTruckGui = new TankTruckGui();
		swingTankTruckGui.showTextField();
		
	}
	
	private void prepareGUI(){
		//Setup App Frame
		mainFrame = new JFrame("Tanker Truck GUI");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		//Setup Labels
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350,100);
		//Setup Layout
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		//Setup controls
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	
	//Display controls
	private void showTextField(){
		headerLabel.setText("Calculate How Many Tankers You Will Consume: ");
		//Set values for controls
		JLabel ageLabel= new JLabel("Age in Years: ", JLabel.RIGHT); 
		JLabel ouncesLabel = new JLabel("Ounces per day: ", JLabel.CENTER);
		final JTextField ageText = new JTextField(3);
		final JTextField ouncesText = new JTextField(3);
		
 		JButton calcButton = new JButton("Cakculate");
		
		//Action listener for button click
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Age" + ageText.getText();
				data+= ", Ounces: "
				+ new String(ouncesText.getText());
				statusLabel.setText(data);
				
			}
		});
		
		//Place controls of panels
		controlPanel.add(ageLabel);
		controlPanel.add(ageText);
		controlPanel.add(ouncesLabel);
		controlPanel.add(ouncesText);
		controlPanel.add(calcButton);
		//Set visibility
		mainFrame.setVisible(true);
	}		
}
