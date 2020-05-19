package application;

import java.util.Scanner;

public class Exercice_09 {

	private static Scanner sc;

	public static void main(String[] args) {
		

		int hd , md ,ha,ma , jour_en_minute;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir l'heure de depart du vol ::");
		do {
			System.out.println("Heure ::");
			hd = sc.nextInt();
		}while(hd <0 && hd >=24);
		do {
			System.out.println("Munite ::");
			md = sc.nextInt();
		}while(md <0 && md >=60);
		
		System.out.println("Saisir l'heure de arrivé du vol ::");
		do {
			System.out.println("Heure ::");
			ha = sc.nextInt();
		}while(ha <0 && ha >=24);
		
		do {
			System.out.println("Munite ::");
			ma = sc.nextInt();
		}while(ma <0 && ma >=60);
		
			md = md + (hd*60);    
			ma = ma + (ha*60);  
			if (ma < md ) {
				System.out.println("---------------------------version 2-------------------------------");
				jour_en_minute = 24 * 60 ;	
				ma = ma + jour_en_minute ;  	
			}
			
			int duree =  ma-md;
			
			int d_h = duree / 60; 
			
			int d_mn = duree % 60; 
			
		System.out.println("la duree du vol en heure et minute est : "+d_h+" : "+d_mn);

	}

}
