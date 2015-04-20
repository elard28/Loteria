import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

class Quina {
	Vector<String[]> vec=new Vector<String[]>(1,1);
	double total=0;
	int[] success;
	
	public Quina(){
		
	}
	
	public Quina(String txt) throws Exception
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
			
			switch(token.length)
			{
				case 5: total+=0.75;
					break;
				case 6: total+=3.0;
					break;
				case 7: total+=7.5;
					break;
			}
			
			vec.addElement(token);
		}
		
		fr.close();
		br.close();
	}
	
	public void print()
	{
		System.out.println(total);
		System.out.println(total*0.308292682);
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
			for (int j = 0; j < tmp.length; j++) 
			{
				for (int k = 0; k < draw.length; k++) 
				{
					//System.out.println("tmp["+j+"]="+tmp[j]+"  draw["+k+"]="+draw[k]);
					if(Integer.parseInt(tmp[j]) == Integer.parseInt(draw[k]))
					{
						success[i]++;
						break;
					}
				}
			}
		}
		
		int quina=0;
		int quadra=0;
		int terno=0;
		
		for (int i = 0; i < success.length; i++) 
		{
			//System.out.println("success["+i+"]="+success[i]);
			switch(success[i])
			{
				case 5: quina+=1;
					break;
				case 4: quadra+=1;
					break;
				case 3: terno+=1;
					break;
			}
		}
		
		System.out.println("Quina "+quina);
		System.out.println("Quadra "+quadra);
		System.out.println("Terno "+terno);
		
	}
	
	
	
}