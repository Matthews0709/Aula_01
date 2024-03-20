package View;

import controller.ProcessosControler;

public class Principal 
{
	public static void main(String[] args) 
	{
		ProcessosControler ProcController =new ProcessosControler ();
		String os = ProcController.os();
		
		System.out.println(os);
	}
	
}