import java.io.*;
import java.util.*;

class Main 
{
	public static void main(String[] args) throws Exception 
	{
		/*FileReader fr=new FileReader ("ejemplo-quina.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		Vector vec=new Vector(1,1);
		String delims=" ";
		
		while((s = br.readLine()) != null) 
		{
			String [] token = s.split(delims);
			vec.addElement(token);
		}
		
		for(int i=0; i<vec.size(); i++)
		{
			String[] tmp=(String[]) vec.elementAt(i);
			
			for (int j = 0; j < tmp.length; j++)
			    System.out.print(tmp[j]+" ");
			
			System.out.println();
        }
		fr.close();
		br.close();*/
		
		//Quina q=new Quina("ejemplo-quina.txt");
		//q.print();
		//q.draw("res-quina.txt");
		
		Lotogol lt=new Lotogol("ejemplo-lotogol.txt");
		lt.print();
		lt.draw("res-lotogol.txt");
		
	}
}