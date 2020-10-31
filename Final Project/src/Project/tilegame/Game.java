package Project.tilegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Project.tilegame.display.Display;

public class Game implements Runnable
{
	private Display display;
	private Thread thread;
	private BufferStrategy buffer;
	private Graphics graphics;
	
	private boolean running = false;
	
	public String title;
	public int width, height;
	
	public Game(String title, int width, int height)
	{
		this.height = height;
		this.width = width;
		this.title = title;
	}
	
	private void init() 
	{ 
		display = new Display(title, width, height);
	}
	
	private void update()
	{
		
	}
	
	private void render() 
	{
		buffer = display.getCanvas().getBufferStrategy();
		if(buffer == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		graphics = buffer.getDrawGraphics();
		graphics.clearRect(0, 0, width, height);
		
		graphics.setColor(Color.red);
		graphics.fillRect(5, 5, 50, 70);
		graphics.setColor(Color.green);
		graphics.fillRect(0, 0, 15, 15);
		
		buffer.show();
		graphics.dispose();
	}
	
	public void run()
	{
		init();
		
		while(running)
		{
			update();
			render();
		}
		
		stop();
	}
	
	public synchronized void start()
	{
		if (running) 
		{
			return;
		}
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop()
	{
		if (!running)
		{
			return;
		}
		
		running = false;
		
		try 
		{
			thread.join();
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
