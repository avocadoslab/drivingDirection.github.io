package components;

import myComputerManual.ComponentsI;
import myComputerManual.MenuPOJO;

public class Monitor implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getChoice_for_monitor());
	   }
	}