package myComputerManual;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Vector;

public class ManualPrint {
	
		public void printManual(HashMap<String,Integer> menuFinal){
		System.out.println("\n\n***** Page Numbers *****\n\n");
	    Iterator iterator = menuFinal.keySet().iterator();  
	    //System.out.println("Name               Page Number");
	    while (iterator.hasNext()) {  
	       String key = iterator.next().toString();  
	       String value = menuFinal.get(key).toString();   
	       System.out.println(key + "           " + value);  
	    	}  
		}
		
		public void printDesc(HashMap<String,Integer> menuFinal){
			System.out.println("\n\n***** Table of Contents *****\n\n");
		    Iterator iterator = menuFinal.keySet().iterator();  
		    //System.out.println("Name               Page Number");
		    while (iterator.hasNext()) {  
		       String key = iterator.next().toString();  
		       String value = menuFinal.get(key).toString();   
		       System.out.println(key + "           " + value);  
		    	}  
			}
		
		public void printGloss(HashMap<String,Integer> menuFinal){
			System.out.println("\n\n***** Glossary *****\n\n");
		    Iterator iterator = menuFinal.keySet().iterator();  
		    //System.out.println("Name               Page Number");
		    while (iterator.hasNext()) {  
		       String key = iterator.next().toString();  
		       //String value = menuFinal.get(key).toString();   
		       System.out.println(key + "           ");  
		    	}  
			}
		
		public void printLOF(HashMap<String,Integer> menuFinal){
			System.out.println("\n\n***** List of Figures *****\n\n");
		    Iterator iterator = menuFinal.keySet().iterator();  
		    //System.out.println("Name               Page Number");
		    while (iterator.hasNext()) {  
		       String key = iterator.next().toString();  
		       String value = menuFinal.get(key).toString();   
		       System.out.println(key + "           " + value);  
		    	}  
			}
	    
	public HashMap<String, Integer> getPageNumbers(Vector<String> menuItems)
	{
		HashMap<String,Integer> manual = new LinkedHashMap<String,Integer>();
		int pageNumber = 0;
		if(menuItems.get(0).length() != 0 && !menuItems.get(0).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("CPU\n ... " + menuItems.get(0), pageNumber);
		}
		if(menuItems.get(1).length() != 0 && !menuItems.get(1).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Memory\n ... " +menuItems.get(1), pageNumber);
		}
		if(menuItems.get(2).length() != 0 && !menuItems.get(2).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Disk\n ...    "+menuItems.get(2), pageNumber);
		}

		if(menuItems.get(3).length() != 0 && !menuItems.get(3).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Graphics Card\n ...      "+menuItems.get(3), pageNumber);
		}
		
		if(menuItems.get(4).length() != 0 && !menuItems.get(4).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Optical Drive\n ...  "+menuItems.get(4), pageNumber);
		}
		
		if(menuItems.get(5).length() != 0 && !menuItems.get(5).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Monitor\n ... "+menuItems.get(5), pageNumber);
		}
		
		if(menuItems.get(6).length() != 0 && !menuItems.get(6).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Operating System\n ..."+menuItems.get(6), pageNumber);
		}
		
		if(menuItems.get(7).length() != 0 && !menuItems.get(7).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Support\n ...   "+menuItems.get(7), pageNumber);
		}
		return manual;
	}
	
	public HashMap<String, Integer> getTOI(Vector<String> menuItems)
	{
		HashMap<String,Integer> manual = new LinkedHashMap<String,Integer>();
		int pageNumber = 0;
		if(menuItems.get(0).length() != 0 && !menuItems.get(0).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("CPU\n"+menuItems.get(0), pageNumber);
		}
		if(menuItems.get(1).length() != 0 && !menuItems.get(1).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nMemory\n"+menuItems.get(1)+"                           ", pageNumber);
		}
		if(menuItems.get(2).length() != 0 && !menuItems.get(2).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nDisk\n"+menuItems.get(2)+"   ", pageNumber);
		}

		if(menuItems.get(3).length() != 0 && !menuItems.get(3).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nGraphics Card\n"+menuItems.get(3)+"                          ", pageNumber);
		}
		
		if(menuItems.get(4).length() != 0 && !menuItems.get(4).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nOptical Drive\n"+menuItems.get(4)+"                                                                   ", pageNumber);
		}
		
		if(menuItems.get(5).length() != 0 && !menuItems.get(5).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nMonitor\n"+menuItems.get(5)+"                                                                              ", pageNumber);
		}
		
		if(menuItems.get(6).length() != 0 && !menuItems.get(6).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nOperating System\n"+menuItems.get(6)+"                                        ", pageNumber);
		}
		
		if(menuItems.get(7).length() != 0 && !menuItems.get(7).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nSupport\n"+menuItems.get(7)+"                                      ", pageNumber);
		}
		return manual;
	}
	
	public HashMap<String, Integer> getGloss(Vector<String> menuItems)
	{
		HashMap<String,Integer> manual = new LinkedHashMap<String,Integer>();
		int pageNumber = 0;
		if(menuItems.get(0).length() != 0 && !menuItems.get(0).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("CPU\n" + menuItems.get(0), pageNumber);
		}
		if(menuItems.get(1).length() != 0 && !menuItems.get(1).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Memory\n" +menuItems.get(1), pageNumber);
		}
		if(menuItems.get(2).length() != 0 && !menuItems.get(2).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Disk\n"+menuItems.get(2), pageNumber);
		}

		if(menuItems.get(3).length() != 0 && !menuItems.get(3).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Graphics Card\n"+menuItems.get(3), pageNumber);
		}
		
		if(menuItems.get(4).length() != 0 && !menuItems.get(4).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Optical Drive\n"+menuItems.get(4), pageNumber);
		}
		
		if(menuItems.get(5).length() != 0 && !menuItems.get(5).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Monitor\n"+menuItems.get(5), pageNumber);
		}
		
		if(menuItems.get(6).length() != 0 && !menuItems.get(6).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Operating System\n"+menuItems.get(6), pageNumber);
		}
		
		if(menuItems.get(7).length() != 0 && !menuItems.get(7).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("Support\n"+menuItems.get(7), pageNumber);
		}
		return manual;
	}
	
	public HashMap<String, Integer> getLOF(Vector<String> menuItems)
	{
		HashMap<String,Integer> manual = new LinkedHashMap<String,Integer>();
		int pageNumber = 0;
		if(menuItems.get(0).length() != 0 && !menuItems.get(0).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("CPU\n" + menuItems.get(0)+"                                                         ", pageNumber);
		}
		if(menuItems.get(1).length() != 0 && !menuItems.get(1).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nMemory\n" +menuItems.get(1)+"                                                         ", pageNumber);
		}
		if(menuItems.get(2).length() != 0 && !menuItems.get(2).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nDisk\n"+menuItems.get(2)+"                                                         ", pageNumber);
		}

		if(menuItems.get(3).length() != 0 && !menuItems.get(3).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nGraphics Card\n"+menuItems.get(3)+"                                                         ", pageNumber);
		}
		
		if(menuItems.get(4).length() != 0 && !menuItems.get(4).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nOptical Drive\n"+menuItems.get(4)+"                                                         ", pageNumber);
		}
		
		if(menuItems.get(5).length() != 0 && !menuItems.get(5).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nMonitor\n"+menuItems.get(5)+"                                                         ", pageNumber);
		}
		
		if(menuItems.get(6).length() != 0 && !menuItems.get(6).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nOperating System\n"+menuItems.get(6)+"                                                         ", pageNumber);
		}
		
		if(menuItems.get(7).length() != 0 && !menuItems.get(7).equals("")){
			pageNumber = pageNumber + 1;
			manual.put("\nSupport\n"+menuItems.get(7)+"                                                         ", pageNumber);
		}
		return manual;
	}
}

