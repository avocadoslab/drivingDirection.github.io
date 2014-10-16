package driver;

import java.io.IOException;

import myComputerManual.ComponentsI;
import myComputerManual.Logger;
import myComputerManual.Menu;
import myComputerManual.MenuPOJO;
import myComputerManual.MyFactoy;

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
		  
		  /*
		  MyFactoy myFactoy = new MyFactoy();
          
	      ComponentsI choice1 = myFactoy.getValue(MenuPOJO.getStr_choice_for_CPU());	      
	      choice1.getLine();	    

	      ComponentsI choice2 = myFactoy.getValue(MenuPOJO.getStr_choice_for_Memory());
	      choice2.getLine();

	      ComponentsI choice3 = myFactoy.getValue(MenuPOJO.getStr_choice_for_Disk());
	      choice3.getLine();
	      
	      ComponentsI choice4 = myFactoy.getValue(MenuPOJO.getStr_choice_for_Graphics_Card());
	      choice4.getLine();
	      
	      ComponentsI choice5 = myFactoy.getValue(MenuPOJO.getChoice_for_optical_Drive());	      
	      choice5.getLine();

	      ComponentsI choice6 = myFactoy.getValue(MenuPOJO.getChoice_for_monitor());
	      choice6.getLine();

	      ComponentsI choice7 = myFactoy.getValue(MenuPOJO.getChoice_for_operating_System());
	      choice7.getLine();
	      
	      ComponentsI choice8 = myFactoy.getValue(MenuPOJO.getChoice_for_support());
	      choice8.getLine();
		  */     
		       
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