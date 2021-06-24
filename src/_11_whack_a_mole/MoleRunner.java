package _11_whack_a_mole;

import java.util.Random;

public class MoleRunner {
	public static void main(String[] args) {
		
	
mole mol = new mole();
Random ran = new Random();
int num = ran.nextInt(24);
mol.drawButtons(num);
}}
