import java.io.*;
import java.util.*;

class Main 
{
	public static void main(String[] args) throws Exception 
	{	
		Loteria lot = null;
		
		System.out.println("Texto:");
		
		String entradaTeclado = "";
		Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine(); //quina ejemplo-quina res-quina
        String[] tok = entradaTeclado.split(" ");
        
        switch(tok[0])
        {
        	case "quina": lot=new Quina(tok[1]+".txt");
        		break;
        	case "lotogol": lot=new Lotogol(tok[1]+".txt");
        		break;
        }
        
        lot.print();
        lot.draw(tok[2]+".txt");
        
		/*lot=new Quina("ejemplo-quina.txt");
		lot.print();
		lot.draw("res-quina.txt");*/
		
	}
}