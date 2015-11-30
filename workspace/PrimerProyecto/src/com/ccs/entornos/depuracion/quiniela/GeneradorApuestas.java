package com.ccs.entornos.depuracion.quiniela;

import java.util.Random;

public class GeneradorApuestas {

	private int[] quiniela=new int[14];
	
	public void generarApuesta(){
		Random rnd=new Random();
		for(int i=0;i<14;i++){
			quiniela[i]=rnd.nextInt(3);
		}
	}
	
	public int comprobarApuesta(int [] apuesta){
		int cont=0;
		for(int i=0;i<quiniela.length;i++){
			if(apuesta[i]==quiniela[i])
				cont++;
		}
		return cont;
	}
	
	public String toString(){
		String str="";
		for(int i=0;i<quiniela.length;i++){
			str=str+quiniela[i];
		}
		return str;
	}

}
