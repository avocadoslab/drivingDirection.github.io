package components;

import myComputerManual.ComponentsI;
import myComputerManual.MenuPOJO;

public class Disk implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getStr_choice_for_Disk());
	   }
	}