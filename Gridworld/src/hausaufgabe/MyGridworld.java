package hausaufgabe;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


class MyGridworld {

	    public static void main(String[] args)
	    {
	        Grid grid = new BoundedGrid(20,20);
	    	ActorWorld world = new ActorWorld();
	        world.setGrid(grid);
	        world.add(new Cow());
	        System.setProperty("info.gridworld.gui.tooltip", "hausaufgabe.Animal.age");
	        world.show();
	    }
}
	

