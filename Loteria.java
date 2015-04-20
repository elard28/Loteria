import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;

class Loteria {
	Vector<String[]> vec=new Vector<String[]>(1,1);
	double total=0;
	double prize=0;
	int[] success;
	
	public Loteria(){
		
	}
	
	public void addFile(String txt) throws Exception{
		
	}
	
	public void print(){
		System.out.println(Math.round(total*100.0)/100.0);
		System.out.println(Math.round(prize*100.0)/100.0);
	}
	
	public void draw(String txt) throws Exception{
		
	}
} 