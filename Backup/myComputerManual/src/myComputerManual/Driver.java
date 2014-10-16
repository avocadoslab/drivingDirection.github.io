package myComputerManual;

import java.io.IOException;
import myComputerManual.Logger;

public class Driver {

	   public static void main(String[] args) throws NumberFormatException,IOException {
			
		   if(args.length == 0 || args.length>1)
		   {
			   	Logger.strbuild.append("Insufficient command line arguments");
			   	System.exit(0);
		   }
		   
		   Logger.strbuild.append("");
		   
		   String dString = args[0];
		   int dValue = Integer.parseInt(dString);
		   inputCheck(dValue);
			
			Logger.setDEBUG_VALUE(dValue);
		   
		  Menu menu = new Menu();
		      
		  menu.displayMenu();		  
		       
	      System.out.println(Logger.strbuild.toString());
	      
	     // System.out.println(MenuPOJO.getChoice_for_monitor()+"\n" + MenuPOJO.getChoice_for_operating_System()+"\n" 
	    //		  +MenuPOJO.getChoice_for_optical_Drive()+"\n" +MenuPOJO.getChoice_for_support()+"\n" +
	    //		  MenuPOJO.getStr_choice_for_CPU()+"\n" +MenuPOJO.getStr_choice_for_Disk()+"\n" 
	    //		  +MenuPOJO.getStr_choice_for_Graphics_Card()+"\n" +MenuPOJO.getStr_choice_for_Memory());
	   }
	   
	   @Override
		public String toString() {
			StringBuilder result = new StringBuilder();		
			result.append(System.getProperty("line.separator"));
			return result.toString();
		}
	   
	   public static void inputCheck(int input) {
			if (input < 1 && input > 5) {
				System.exit(1);
			}
		}
	}