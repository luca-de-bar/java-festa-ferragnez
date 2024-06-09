package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//Inizializzo array, Inizializzo Scanner
		String guests [] = {"Luca","Marco","Giovanni","Daniele","Giuseppe"};
		
		Scanner userInput = new Scanner (System.in);
		
		//Recupero input e salvo in variabile
		System.out.println("Inserisci il tuo nome, verificheremo se sei invitato.");
		String thisPerson = userInput.nextLine();
		
		boolean isInvited = false;
		
//		//Itero su array guests, controllo se input inserito è in array.
//		for (int i = 0; i<guests.length;i++) {
//			
//			if(guests[i].equals(thisPerson)) {
//				System.out.println("You are invited");
//				isInvited=true;
//				break;
//			}
//		}
//		
//		if(isInvited==false) {
//			System.out.println("You are not invited");
//		}
		
		int i =0;
		while(i<guests.length){
			if(thisPerson.equals(guests[i])){
				System.out.println("You are invited!");
				isInvited=true;
				i=guests.length;
			} else {
				i++;
			}
		}
		
		if(isInvited==false) {
			System.out.println("You are not invited");
		}
		
		userInput.close();
		
	}

}
