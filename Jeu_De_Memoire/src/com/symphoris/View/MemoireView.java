
package com.symphoris.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemoireView extends JFrame {
	private JButton b1 = new JButton("start");
	private JButton b2 = new JButton("check");
	private JLabel jl = new JLabel("start");
	private JTextField jt = new JTextField();
	
	public MemoireView() {
		super("MemoireView");
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
        JPanel p = new JPanel();
		GridLayout gl = new GridLayout(3,1);
		GridLayout gl2 = new GridLayout(1,2);
		this.setLayout(gl);
		p.setLayout(gl2);
		p.add(b1);
		p.add(b2);
		this.getContentPane().add(jl);
		jl.setForeground(Color.BLUE);
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setFont(new Font("Arial",Font.BOLD,40));
		jt.setEditable(false);
		this.getContentPane().add(jt);
		this.getContentPane().add(p);
		this.setVisible(true);
	}
	public JButton getB1() {
		return b1;
	}
	public JButton getB2() {
		return b2;
	}
	public JLabel getJl() {
		return jl;
	}
	public JTextField getJt() {
		return jt;
	}

}
