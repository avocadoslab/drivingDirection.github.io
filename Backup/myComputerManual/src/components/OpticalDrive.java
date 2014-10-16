package components;

import myComputerManual.ComponentsI;
import myComputerManual.MenuPOJO;

public class OpticalDrive implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getChoice_for_optical_Drive());
	   }
	}