package hausaufgabe;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class Farmrunner {

	public static void main(String[] args) {
		BoundedGrid grid = new BoundedGrid(30,30);
    	ActorWorld world = new ActorWorld();
        world.setGrid(grid);
        world.add(new Cow());
        world.add(new Farmer());
        world.add(new Farmer());
        world.show();

	}

}
