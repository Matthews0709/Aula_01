package controller;

import java.io.*;

//teste de utilização de trycatch 

public class Trycatch
{

	public Trycatch () 
	{
		super();
		
	}

	public void CallProcesso(String processo) 
	{
		try {
			Runtime.getRuntime().exec(processo);
			
		}catch(Exception e) {
			
		  String msgErro = e.getMessage();
			
			if(msgErro.contains("740")) 
			{
				
			  StringBuffer buffer = new StringBuffer();
			 
			  buffer.append("cmd /c "); 
			  buffer.append(processo);	
			 
			  try {
	     		Runtime.getRuntime().exec(buffer.toString());
	    	 	}catch(IOException e1){
	    	 		
			 	e1.printStackTrace();
			 	}
			 
			}else
			 {
				e.printStackTrace();
			 }
		
		}
		
	}
	
	public static void ReadProcesso(String processo) 
	{
	  try {
		Process proc = Runtime.getRuntime().exec(processo);
		
		InputStream inp = proc.getInputStream();
		InputStreamReader leitor = new InputStreamReader(inp);
		BufferedReader buffer = new BufferedReader(leitor);
		
		String linha = buffer.readLine();
		 while(linha != null) 
		 {
			 System.out.println(linha);
			 
			 linha = buffer.readLine();
		 }
		  inp.close();
		  leitor.close();
		  buffer.close();
		  
	  } catch (Exception e) {
		
		e.printStackTrace();
	  }	
 		
	}
	
}
