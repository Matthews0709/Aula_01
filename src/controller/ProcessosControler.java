package controller;

public class ProcessosControler 
{	
	public ProcessosControler()
	{
		super();
		
	}
	
	//Retorna o sistema operacional que a maquina esta rodando
		public String os() 
		{
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String version = System.getProperty("os.version");
			
			return os + " -v " + version + " -arch " + arch;
			
		}
		
}
