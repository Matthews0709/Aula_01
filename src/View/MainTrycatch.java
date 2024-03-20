package View;

import controller.Trycatch;

public class MainTrycatch 
{
	public static void main(String[] args) 
	{
		Trycatch proc = new Trycatch();
		
		String processo = "C:\\Windows\\write.exe"; 
		proc.CallProcesso(processo);
		
	}
	
}
