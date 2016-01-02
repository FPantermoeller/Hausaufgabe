package hausaufgabe;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Cow extends Animal {

	public Cow(){
	}
	
	public void act(){
	
	
	if(((int) ((Math.random()*7))) == 0){
		insertNewCow();
		}
	
	if(this.age >= 10 && ((int) (Math.random()*5)) == 0){
		removeCowInsertFlower();
		}
	
	super.act();
	}

	public void removeCowInsertFlower() {
    	if (getGrid() == null)
            return;
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		this.removeSelfFromGrid();
		Flower flower = new Flower(Color.GREEN);
		flower.putSelfInGrid(gr, loc);
	}

	public void insertNewCow() {
    	if (getGrid() == null)
            return;
		Grid<Actor> gr = getGrid();
		ArrayList<Location> cowLocs = getMoveLocations();
		Location loc = selectMoveLocation(cowLocs);
		Cow cow = new Cow();
		cow.putSelfInGrid(gr, loc);
	}
}
