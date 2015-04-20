import java.io.*;
import java.util.*;

class Main 
{
	public static void main(String[] args) throws Exception 
	{	
		Loteria lot = null;
		String[] tok = null;
		
		if(args.length>0)
			tok=args;
				
		else{
			System.out.print("Texto: ");
			String entrada = "";
			Scanner entradaEscaner = new Scanner(System.in);
	        entrada = entradaEscaner.nextLine(); 
	        tok = entrada.split(" ");
		}
        
		if(tok.length==3)
		{
			switch(tok[0])
	        {
	        	case "quina": lot=new Quina(tok[1]+".txt");
	        		break;
	        	case "lotogol": lot=new Lotogol(tok[1]+".txt");
	        		break;
	        }
	        
	        lot.print();
	        lot.draw(tok[2]+".txt");
		}
        
		else System.out.println("Faltan argumentos");
		
	}
}

//quina ejemplo-quina res-quina
//lotogol ejemplo-lotogol res-lotogol