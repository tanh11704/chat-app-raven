package form;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Home extends JPanel {

	public Home() {
		init();
	}

	private void init() {
		setLayout(new MigLayout("fillx, filly", "0[]5[]5[]0", ""));
	}

}
