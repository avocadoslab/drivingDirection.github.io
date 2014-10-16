package components;

import myComputerManual.ComponentsI;
import myComputerManual.MenuPOJO;

public class Cpu implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getStr_choice_for_CPU());
	   }
	}
