package hausaufgabe;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class CreatorFarmer extends Farmer {
	
	public ArrayList<Actor> getActors(){
		
		ArrayList<Location> location = getGrid().getOccupiedLocations();
		for ( Location l : location) {
			ArrayList<Actor> actor = insert(getGrid().get(l));
		};
	}

}
