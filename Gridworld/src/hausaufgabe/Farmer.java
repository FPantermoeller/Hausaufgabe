package hausaufgabe;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;

public class Farmer extends Critter {

	public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof Flower)
                a.removeSelfFromGrid();
        }
    }
}
