package components;
import myComputerManual.ComponentsI;
import myComputerManual.Logger;
import myComputerManual.MenuPOJO;

public class Support implements ComponentsI {

	   @Override
	   public void getLine() {
	      System.out.println(MenuPOJO.getChoice_for_support());
	      Logger.write(4, getClass().getName()+": in Support class");
	   }
	}