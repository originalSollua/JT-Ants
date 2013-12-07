import java.util.Random;

public class ants
{
	public static void main(String[]args)
	{
			System.out.println("Hello World v 2.0");     // printstatement for debugging only
			
			int row = 40;							     // these variables are place holders for a larger grid later
			int col = 40;
			boardFrame run = new boardFrame(row, col);   //boardframe is where the nuts and bolts of drawing, as well as the movements will be done later
			
			bug2 swarm[] = new bug2[5];
			int h_posR = g_rand()%(row/2);
			int h_posC = g_rand()%(col/2);
	
			run.populate(h_posR,h_posC , (h_posR*2), (h_posC*2), swarm.length);	 //populate the grid with data, including walls
		
			Runnable b, c, d, e, f;
			b = new bug2(h_posR, h_posC, row, col, run);
			c = new bug2(h_posR, h_posC, row, col, run);
			d = new bug2(h_posR, h_posC, row, col, run);
			e = new bug2(h_posR, h_posC, row, col, run);
			f = new bug2(h_posR, h_posC, row, col, run);
			Thread t = new Thread (b);
			Thread u = new Thread (c);
			Thread v = new Thread (d);
			Thread w = new Thread (e);
			Thread x = new Thread (f);
			t.start();
			u.start();
			v.start();
			w.start();
			x.start();
			double ST = System.nanoTime();
			double totalT = 0;
			while(t.isAlive() && u.isAlive() && v.isAlive() && w.isAlive() && x.isAlive())
			{
				
			}
			totalT= (System.nanoTime() - ST);
			 double need = 1000000000; //divisor for seconds i think
			  totalT = totalT / need;
			  System.out.println("the run time is " +totalT);
			  
			 // System.exit(0);
	}
	public static int g_rand()
	{
		Random t = new Random();
		int m = t.nextInt();
		if(m < 0)
		{
			m = m*-1;
		}
		return m;
	}
}
