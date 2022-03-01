/*
 * Deck.java
 * 
 * Copyright 2022 Manan Vij <vijman22@US-CompLabiMac-16.local>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.ArrayList;
public class Deck {
	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(String[] ranks, String[] suits, int[] points){
		for (int i = 0; i < ranks.length; i++){
			for (int j = 0; j < suits.length; j++){
				deck.add(new Card(ranks[i], suits[j], points[i]));
			}
		}
	}
	
	public void shuffleDeck(){
		
	}
	
	public void showHand(){
		for (Card card : deck){
			System.out.println(card.toString());
		}
	}
}

