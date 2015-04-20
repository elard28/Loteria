import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

class Lotogol {
	Vector<String[]> vec=new Vector<String[]>(1,1);
	double total=0;
	int[] success;
	
	public Lotogol(){
		
	}
	
	public Lotogol(String txt) throws Exception
	{
		addFile(txt);
	}
	
	public void addFile(String txt) throws Exception
	{
		FileReader fr=new FileReader(txt);
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		while((s = br.readLine()) != null) 
		{
			String [] token = s.split(" ");
			total+=Integer.parseInt(token[0])*0.5;
			vec.addElement(token);
		}
		
		
		fr.close();
		br.close();
	}
	
	public void print()
	{
		System.out.println(total);
		System.out.println(total*0.28);
	}
	
	public void draw(String txt) throws Exception
	{
		FileReader fr=new FileReader(txt);
		BufferedReader br = new BufferedReader(fr);
		String s;
		String[] draw = null;
		
		while((s = br.readLine()) != null) 
			draw = s.split(" ");
		
		fr.close();
		br.close();
		
		success=new int[vec.size()];
		
		for (int i = 0; i < vec.size(); i++) 
		{
			String[] tmp= vec.elementAt(i);
			for (int j = 1; j < tmp.length; j+=2) 
			{
				for (int k = 0; k < draw.length; k+=2) 
				{
					if(Integer.parseInt(tmp[j]) == Integer.parseInt(draw[k]) 
					&& Integer.parseInt(tmp[j+1]) == Integer.parseInt(draw[k+1]))
					{
						success[i]+=1;
						break;
					}
				}
			}
		}
		
		int success5=0;
		int success4=0;
		int success3=0;
		
		for (int i = 0; i < success.length; i++) 
		{
			switch(success[i])
			{
				case 5: success5++;
					break;
				case 4: success4++;
					break;
				case 3: success3++;
					break;
			}
		}
		
		System.out.println("1.- (5 aciertos) "+success5);
		System.out.println("2.- (4 aciertos) "+success4);
		System.out.println("3.- (3 aciertos) "+success3);
		
	}
	
	
}