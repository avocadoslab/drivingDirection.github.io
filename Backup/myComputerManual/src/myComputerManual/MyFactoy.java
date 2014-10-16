package myComputerManual;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import components.Cpu;
import components.Disk;
import components.GraphicsCard;
import components.Memory;
import components.Monitor;
import components.OperatingSystem;
import components.OpticalDrive;
import components.Support;


public class MyFactoy {
	
	  public ComponentsI getValue(String cType){
	      if(cType == null){
	         return null;
	      }		
	      if(cType.equalsIgnoreCase("Intel i5")||cType.equalsIgnoreCase("Intel i7")){
	         return new Cpu();
	      } else if(cType.equalsIgnoreCase("4GB DDR3")||cType.equalsIgnoreCase("8GB DDR3")){
	         return new Memory();
	      } else if(cType.equalsIgnoreCase("500GB")||cType.equalsIgnoreCase("1TB")){
	         return new Disk();
	      } else if(cType.equalsIgnoreCase("1GB")||cType.equalsIgnoreCase("2GB")){
		     return new GraphicsCard();
	      } else if(cType.equalsIgnoreCase("Yes")||cType.equalsIgnoreCase("No")){
			 return new OpticalDrive();
		  } else if(cType.equalsIgnoreCase("32inches")||cType.equalsIgnoreCase("54inches")){
			 return new Monitor();
		  } else if(cType.equalsIgnoreCase("Windows 7")||cType.equalsIgnoreCase("Windows 8.1")){
			 return new OperatingSystem();
		  } else if(cType.equalsIgnoreCase("1 Year")||cType.equalsIgnoreCase("2 Year")){
			 return new Support();
		  }      
	      
	      return null;
	   }
	  	  	  
	  @Override
		public String toString() {
			StringBuilder result = new StringBuilder();
			result.append(System.getProperty("line.separator"));
			return result.toString();
		}
	}