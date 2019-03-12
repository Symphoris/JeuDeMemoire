package com.symphoris.Model;

import java.util.Random;

public class MemoireModel  {
	private Random rd = new Random();
	private String m;
	private int cpt=0;
	
	public MemoireModel() {
		

	}
	
    public void mot() {
		
		String mot = "";
		for(int i= 0;i<5 ;i++) {
			mot+= String.valueOf(rd.nextInt(9));
		}
		m=mot;
		
		
	}
    public String getM() {
    	return m;
    }
    public int verif(String jt) {
		int nbe=0;
		String text =jt;
		if(!text.equals(m)) {
		  for (int i=0; i<text.length(); i++ ) {
			  if(text.charAt(i)!=m.charAt(i)) {
				  nbe++;
			  }
		  }
		}
		
		return nbe;
		
	}


}
