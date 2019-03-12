package com.symphoris.App;

import javax.swing.SwingUtilities;

import com.symphoris.Controller.MemoireController;
public class Application {
	private MemoireController mc;
	
	
	public Application() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run () {
				mc = new MemoireController();
			}
		});
	}

}
