package hausaufgabe;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class Animal extends Actor {
	
	public int age;
	
	public Animal(){
		this.age = 0;
	}

    public void act()
    {
    	if (getGrid() == null)
            return;
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
        this.age += 1;
   }
    
 
     
    public ArrayList<Actor> getActors()
    {
        return getGrid().getNeighbors(getLocation());
    }
    
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Rock) && !(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }
    
    public ArrayList<Location> getMoveLocations()
    {
        return getGrid().getEmptyAdjacentLocations(getLocation());
    }
    
    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }
    
    public void makeMove(Location next)
    {
        if (next == null)
            removeSelfFromGrid();
        else
            moveTo(next);
    }

}
