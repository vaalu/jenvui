/**
 * 
 */
package in.jeani.jmeter.jenv.ui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 */
public class EnvSelectionPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private GridBagLayout currentLayout = new GridBagLayout();
	private GridBagConstraints currentConstraints = new GridBagConstraints();
	
	private int totalColumns = 4;
	private int totalRows = 3;
	
	/**
	 * Create the panel.
	 */
	public EnvSelectionPanel() {
		this.setLayout(getCurrentLayout());
	}

	public GridBagLayout getCurrentLayout() {
		this.init();
		return this.currentLayout;
	}
	
	private void init() {
		addUpperPanelComponents();
		addMiddlePanelComponents();
		addLowerPanelComponents();
	}
	
	private void addUpperPanelComponents() {
		JTextField searchField = new JTextField();
		searchField.setColumns(20);
		currentConstraints.gridx = 0;
		currentConstraints.gridy = 0;
		currentConstraints.gridwidth = totalColumns - 1; // Span across 3 columns
		currentConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(searchField, currentConstraints);

		JButton searchButton = new JButton("Search");
		currentConstraints.gridx = totalColumns - 1; // Place in the last column
		currentConstraints.gridy = 0;
		currentConstraints.gridwidth = 1; // Span only 1 column
		currentConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(searchButton, currentConstraints);
	}
	private void addMiddlePanelComponents() {
		currentConstraints.gridx = 1;
		currentConstraints.gridy = 0;
		JLabel label = new JLabel("Welcome! Click the button below.", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        currentConstraints.gridwidth = totalColumns;
        currentConstraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(label, currentConstraints);
	}
	private void addLowerPanelComponents() {
		
	}

}
