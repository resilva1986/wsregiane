package br.com.lojagama.util;

import javax.swing.JOptionPane;

public class Magic {

	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	
}
