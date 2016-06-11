package com.learn.mygraphics;


import java.awt.*;
import javax.swing.*;

public class FractalCircles {

/**
* @param args the command line arguments
*/
public static void main(String[] args) 
{   //create a MyCanvas object
   MyCanvas canvas1 = new MyCanvas();

   //set up a JFrame to hold the canvas
   JFrame frame = new JFrame();
   frame.setTitle("FractalCircles.java");
   frame.setSize(500,700);
   frame.setLocation(100,100);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   //add the canvas to the frame as a content panel
   frame.getContentPane().add(canvas1);
   frame.setVisible(true);
}//end main
}//end class

class MyCanvas extends Canvas
{
public MyCanvas()
{} //end MyCanvas() constructor

//this method will draw the initial circle and invisible line
public void paint (Graphics graphics)
{
   int n=50; //radius of first circle

   //draw invisible line
   graphics.drawLine(0,250,500,250);

   //draw first circle
   graphics.drawOval(200,200,n*2,n*2);

   //run fractal algorith to draw 2 circles to the left and right
   drawCircles(graphics, n);
}

public void drawCircles (Graphics graphics, int n)
{
   int x1; int y1; //top left corner of left circle to be drawn
   int x2; int y2; //top left corner of right circle to be drawn

   //drawing left circle
   x1=200-((n/2)*2); 
   //***this math was found using the equation in chapter 11
   //***center point of circle = (x+(width/2), y+(height/2))
   y1=200-((n/2)*2);
   graphics.drawOval(x1, y1, ((n/2)*2), ((n/2)*2));
   graphics.drawString("hello dear", 100, 100);

   //drawing right circle
   x2=300-((n/2)*2);
   y2=300-((n/2)*2);
   graphics.drawOval(x1, y1, ((n/2)*2), ((n/2)*2));
}
}