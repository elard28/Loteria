import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

class Lotogol {
	Vector<String[]> vec=new Vector<String[]>(1,1);
	double total=0;
	int[] success;
	
	public Lotogol(){
		
	}
	
	public Lotogol(String txt){
		
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
}