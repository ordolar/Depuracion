package com.ccs.entornos.depuracion.quiniela;

import java.util.Scanner;

public class ComprobarApuestasApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		GeneradorApuestas gen=new GeneradorApuestas();
		gen.generarApuesta();
		int[] apuesta=new int[14];
		for(int i=0;i<apuesta.length;i++){
			System.out.println("Apuesta[" + i +"](0,1,2)>");
			apuesta[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("Acertados " + gen.comprobarApuesta(apuesta));
		

	}

}
