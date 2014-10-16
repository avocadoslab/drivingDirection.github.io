package components;

import myComputerManual.ComponentsI;
import myComputerManual.MenuPOJO;

public class OperatingSystem implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getChoice_for_operating_System());
	   }
	}