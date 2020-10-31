package Project.tilegame;

import Project.tilegame.Game;

public class Launcher 
{
	public static void main(String[] args) 
	{
		Game game = new Game("things", 500, 500);
		game.start();
		
	}
}
