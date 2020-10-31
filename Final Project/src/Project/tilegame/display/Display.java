package Project.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display 
{
	//JFrame class is used to create display window
	private JFrame frame;
	//Canvas class is used to hold graphics
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	//Create constructor
	public Display(String title, int width, int height) 
	{
		this.title = title;
		this.width = width;
		this.height = height;
		
		createCanvas();
		createDisplay();
	}
	
	//initializes the frame
	private void createDisplay()
	{
		frame = new JFrame(title);
		frame.setSize(width, height);
		//Used to dispose of frame when [X] button is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Prevents dynamically resizing window
		frame.setResizable(false);
		//NULL location is center of screen
		frame.setLocationRelativeTo(null);
		//The window will not show up without this value set to true
		frame.setVisible(true);
		frame.add(canvas);
		frame.pack();
	}
	
	//initialize the canvas
	private void createCanvas()
	{
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
	}
	
	public Canvas getCanvas()
	{
		return canvas;
	}
}
