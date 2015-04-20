import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

class Lotogol extends Loteria{
	
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
		
		prize=total*0.267692;
		
		fr.close();
		br.close();
	}
	
	public void draw(String txt) throws Exception
	{
		FileReader fr=new FileReader(txt);
		BufferedReader br = new BufferedReader(fr);
		String s;
		String[] draw = null;
		
		while((s = br.readLine()) != null) 
			draw = s.split(" ");
		
		/*String[] draw=null;
		int valor=fr.read();
        while(valor!=-1)
        {
            System.out.print((char)valor);
            valor=fr.read();
        }*/
		
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
					if(tmp[j] == draw[k] && tmp[j+1] == draw[k+1])
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
			String[] tmp= vec.elementAt(i);
			for (int j = 0; j < Integer.parseInt(tmp[0]); j++) 
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
		}
		
		System.out.println("1.- (5 aciertos) "+success5+" "+Math.round(prize*0.4/success5*100.0)/100.0);
		System.out.println("2.- (4 aciertos) "+success4+" "+Math.round(prize*0.3/success4*100.0)/100.0);
		System.out.println("3.- (3 aciertos) "+success3+" "+Math.round(prize*0.3/success3*100.0)/100.0);
		
	}
	
	
}