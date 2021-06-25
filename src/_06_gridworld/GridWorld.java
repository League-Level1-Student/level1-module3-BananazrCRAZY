package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		
		Location lb1 = new Location(2, 2);
		Bug b1 = new Bug();
		w.add(lb1, b1);
		
		int num = 0;
		Random ran = new Random();
		num = ran.nextInt(9-0+1)+0;
		Location lb2 = new Location(num, num);
		Bug b2 = new Bug();
		w.add(lb2, b2);
		
		b1.setColor(Color.BLUE);
		
		b1.setDirection(90);
		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Location lf1 = new Location(2, 1);
		Location lf2 = new Location(2, 3);
		w.add(lf1, f1);
		w.add(lf2, f2);
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				Location l = new Location(i, j);
				Flower f = new Flower();
				
				if ((i % 2) == 0)
					f.setColor(Color.RED);
				else
					f.setColor(Color.WHITE);
				
				if (((l.getCol() == lb1.getCol()) && (l.getRow() == lb1.getRow())) || ((l.getCol() == lb2.getCol()) && (l.getRow() == lb2.getRow())))
					System.out.println("Bug");
				else
					w.add(l, f);
			}
		}
	}
}
