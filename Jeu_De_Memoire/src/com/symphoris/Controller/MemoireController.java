package com.symphoris.Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import com.symphoris.Model.MemoireModel;
import com.symphoris.View.MemoireView;

public class MemoireController implements ActionListener {
	private MemoireModel model;
	private MemoireView view;
	private int cpt=0;
	private Timer t;
	
	
	
	public MemoireController() {
		model = new MemoireModel();
		view = new MemoireView();
		view.getB1().addActionListener(this);
		view.getB2().addActionListener(this);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(cpt<model.getM().length()) {
					view.getJl().setText(String.valueOf(model.getM().charAt(cpt)));
					cpt+=1;
				}
				else {
					view.getJl().setText("");
					view.getJt().setEditable(true);
					t.stop();
					System.out.println("fin");
				}
				
			}
			
		};
		String message = "";
		String titre ="fin de partie";
		
		if(e.getSource()==view.getB1()) {
			
			model.mot();
			 t = new Timer(500,act );
			t.start();
		}
		else {
			if(view.getJt().getText().length()!=model.getM().length()) {
				message = "vous  n'etes qu'un gros blagueur";
			}
			else {
				int er =model.verif(view.getJt().getText());
				if(er==0) {
					message = "vous avez gagné";
				}
				else {
					message = "vous avez perdu avec "+ er + "erreurs "+ model.getM();
				}
				
			}
			JOptionPane.showMessageDialog(null, message, titre,JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

}
