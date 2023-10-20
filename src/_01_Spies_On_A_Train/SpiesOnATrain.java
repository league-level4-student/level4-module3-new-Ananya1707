package _01_Spies_On_A_Train;

import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	
    	Node currentPassenger = train.getHead();
    	String spy = "";

    	for(int i = 0 ; i < train.size(); i++) {
    		String testimony = ((TrainCar) currentPassenger.getValue()).questionPassenger();
    		//String evidence = testimony.substring(testimony.indexOf("have"),testimony.length()-2);
    		//System.out.println(testimony);
    		//System.out.println(currentPassenger.getValue().toString());
    		String passengerName = currentPassenger.getValue().toString();
    		//System.out.println(testimony.substring(testimony.lastIndexOf("saw") + 4, testimony.length()-1));
    		String[] v = testimony.split(" ");
    		System.out.println(v[13]);
    		
    		for(String c: clues) {
    			System.out.println("clue:" + c);
    			
    			if(testimony.equals(c)) {
    				spy = currentPassenger.toString();
    			}
    		}
    		
    		currentPassenger = currentPassenger.getNext();
    	}

        return spy;

    }

}
