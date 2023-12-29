package _01_Spies_On_A_Train;

import java.util.ArrayList;
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
    		//System.out.println(testimony);

    		
    		ArrayList<String> suspects = new ArrayList<String>();
    		
    		
    		for(String c: clues) {
    			//System.out.println("clue:" + c);
    			
    			if(testimony.indexOf(c) != -1) {
    				String[] v = testimony.split(" ");
    	    		//System.out.println(v[13]);
    	    		suspects.add(v[13]);
    			}
    		}
    		
    		int maxCount = 0;
    		for(String s: suspects) {
        		int count = 0;
    			for(String sus: suspects) {
    				if(s.equals(sus)) {
    					count++;
    				}
    			}
    			
    			if(maxCount < count) {
    				maxCount = count;
    				spy = s;
    			}
    		}
    		
    		currentPassenger = currentPassenger.getNext();
    	}

        return spy;

    }

}
