package myComputerManual;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Menu {
	
	public void displayMenu() {
		//int a;
		//float b;
		//String s;
		
		//MenuPOJO MenuPOJO = new MenuPOJO();
		
		ManualPrint manualPrint = new ManualPrint();
		
		Scanner in = new Scanner(System.in);

		Integer choice_for_CPU = null, choice_for_Memory = null, choice_for_Disk = null, choice_for_Graphics_Card = null, optical_Drive = null, monitor = null, operating_System = null, support = null;

		Vector<String> menuItems = new Vector<String>();
		Vector<String> desc = new Vector<String>();
		Vector<String> gloss = new Vector<String>();
		Vector<String> lof = new Vector<String>();
		
		
		//String str_choice_for_CPU = null, str_choice_for_Memory = null, str_choice_for_Disk = null, str_choice_for_Graphics_Card = null, choice_for_optical_Drive = null, choice_for_monitor = null, choice_for_operating_System = null, choice_for_support = null;
		System.out.println("Below are Mandatory Options CPU, Memory, Disk, Graphics Card");

		while (true) {
			if (null == choice_for_CPU || choice_for_CPU < 1
					|| choice_for_CPU > 2) {
				System.out.println("Enter type of CPU ::");
				System.out.println("1. Intel i5");
				System.out.println("2. Intel i7");
				String line = in.nextLine();
				if (null != line && line.length() > 0) {
					choice_for_CPU = Integer.parseInt(line);
					if (choice_for_CPU == 1){
						menuItems.add("Intel i5");
						desc.add("The 4th generation Intel® Core™ i5 processor delivers amazing performance, stunning visuals, and built-in security for deeper protection.");
						gloss.add("L1 Cache: Level 1 cache, often called primary cache, is a static memory integrated with processor core that is used to store information recently accessed by a processor.\n"
								+ "SSSE4 : SSE4 instruction set extension consists of 54 instructions that improve performance of media data manipulation and text processing.\n"
								+ "TDP : The Thermal Design Power (TDP) is the average maximum power a processor can dissipate while running commercially available software.\n");
						lof.add("Figure 1 : Nehalem Microarchitecture\n"
								+ "Figure 2 : Direct Media Interface\n");
						System.out.println("You have selected : Intel i5 CPU");
					}
					else{
						menuItems.add("Intel i7");
						desc.add("the 4th generation Intel® Core™ i7 processor delivers top-of-the-line performance for your most demanding tasks.");
						gloss.add("L2 Cache: Level 2 cache, often called primary cache, is a static memory integrated with processor core that is used to store information recently accessed by a processor.\n"
								+ "SSSE4 : SSE4 instruction set extension consists of 54 instructions that improve performance of media data manipulation and text processing.\n"
								+ "TDP : The Thermal Design Power (TDP) is the average maximum power a processor can dissipate while running commercially available software.\n");
						lof.add("Figure 1 : Nehalem Microarchitecture\n"
								+ "Figure 2 : Sandy Bridge (Desktop)\n");
						System.out.println("You have selected : Intel i7 CPU");
					}
				}
			} else
				break;
			
			
		}
		while (true) {
			if (null == choice_for_Memory || choice_for_Memory < 1
					|| choice_for_Memory > 2) {
				System.out.println("Enter type of Memory ::");
				System.out.println("1. 4GB DDR3");
				System.out.println("2. 8GB DDR3");
				String line = in.nextLine();
				if (null != line && line.length() > 0) {
					choice_for_Memory = Integer.parseInt(line);
					if (choice_for_Memory == 1){
						menuItems.add("4GB DDR3");
						desc.add("Crucial 4GB Single DDR3 1333 MT/s (PC3-10600) CL9 Unbuffered UDIMM 240-Pin Desktop Memory Module CT51264BA1339");
						gloss.add("RAM : Random-Access Memory,  This is the memory where the software resides while it is running along with the data it is using. RAM is used by both OS and application software.\n"
								+ "DDR3 SDRAM : Double data rate type three synchronous dynamic random-access memory\n"
								+ "DIMM : DIMM or dual in-line memory module comprises a series of dynamic random-access memory integrated circuits.\n");
						lof.add("Figure 1 : Memory module DDRAM\n"
								+ "Figure 2 : A portion of a core memory\n");
						System.out.println("You have selected : 4GB DDR3 Memory");
					}
					else{
						menuItems.add("8GB DDR3");
						desc.add("Crucial 8GB Single DDR3 7333 MT/s (PC3-18600) CT9 Unbuffered UDIMM 240-Pin Desktop Memory Module CT51465641339");
						gloss.add("RAM : Random-Access Memory,  This is the memory where the software resides while it is running along with the data it is using. RAM is used by both OS and application software.\n"
								+ "DDR3 SDRAM : Double data rate type three synchronous dynamic random-access memory\n"
								+ "DIMM : DIMM or dual in-line memory module comprises a series of dynamic random-access memory integrated circuits.\n"
								+ "Latency : SDRAM latency refers to delays in transmitting data between the CPU and SDRAM. SDRAM latency is often measured in memory bus clock cycles.\n");
						lof.add("Figure 1 : Memory module DDRAM\n"
								+ "Figure 2 : Memory wall\n");
						System.out.println("You have selected : 8GB DDR3 Memory");
					}
				}
			} else
				break;
		}
		while (true) {
			if (null == choice_for_Disk || choice_for_Disk < 1
					|| choice_for_Disk > 2) {
				System.out.println("Enter type of Disk ::");
				System.out.println("1. 500GB");
				System.out.println("2. 1TB");
				String line = in.nextLine();
				if (null != line && line.length() > 0) {
					choice_for_Disk = Integer.parseInt(line);
					if (choice_for_Disk == 1){
						menuItems.add("500GB");
						desc.add("WD Elements 500GB USB 2.0 External Hard Disk is one of the best selling models of Western Digital and comes power packed with features");
						gloss.add("Magnetic Heads : Disk read/write heads are the small parts of a disk drive, that move above the disk platter and transform the platter's magnetic field into electrical current\n"
								+ "SATA : Serial ATA (SATA) is a computer bus interface that connects host bus adapters to mass storage devices such as hard disk drives and optical drives.\n"
								+ "Flash Memory : Flash memory is an electronic non-volatile computer storage medium that can be electrically erased and reprogrammed.\n");
						lof.add("Figure 1 : A 2.5inch SATA hard drive\n"
								+ "Figure 2 : Overview of how an HDD functions\n");
						System.out.println("You have selected : 500GB Disk");
					}
					else{
						menuItems.add("1TB");
						desc.add("WD Elements 1TB USB 3.0 External Hard Disk is one of the best selling models of Western Digital and comes power packed with features");
						gloss.add("Magnetic Heads : Disk read/write heads are the small parts of a disk drive, that move above the disk platter and transform the platter's magnetic field into electrical current\n"
								+ "SATA : Serial ATA (SATA) is a computer bus interface that connects host bus adapters to mass storage devices such as hard disk drives and optical drives.\n"
								+ "Flash Memory : Flash memory is an electronic non-volatile computer storage medium that can be electrically erased and reprogrammed.\n"
								+ "EPROM : An EPROM (rarely EROM), or erasable programmable read only memory, is a type of memory chip that retains its data when its power supply is switched off.\n");
						lof.add("Figure 1 : Major components of a computer HDD\n"
								+ "Figure 2 : Overview of how an HDD functions\n");
						System.out.println("You have selected : 1TB Disk");
					}
				}
			} else
				break;
		}
		while (true) {
			if (null == choice_for_Graphics_Card
					|| choice_for_Graphics_Card < 1
					|| choice_for_Graphics_Card > 2) {
				System.out.println("Enter type of Graphics Card ::");
				System.out.println("1. 1GB");
				System.out.println("2. 2GB");
				String line = in.nextLine();
				if (null != line && line.length() > 0) {
					choice_for_Graphics_Card = Integer.parseInt(line);
					if (choice_for_Graphics_Card == 1){
						menuItems.add("1GB");
						desc.add("EVGA GeForce GTX 770Ti Superclock w/G-SYNC Support 1GB GDDR5 128bit, Dual-Link DVI-I, HDMI DP 1.2 Graphics Card");
						gloss.add("EGA : The Enhanced Graphics Adapter (EGA) is an IBM PC computer display standard specification which is between CGA and VGA in terms of color and space resolution\n"
								+ "RGB : The RGB color model is an additive color model in which red, green, and blue light are added together in various ways to reproduce a broad array of colors.\n"
								+ "Palette : In computer graphics, a palette is either a given, finite set of colors for the management of digital images (that is, a color palette)\n");
						lof.add("Figure 1 : A Radeon HD 4770 card\n"
								+ "Figure 2 : Classical desktop computer architecture\n");
						System.out.println("You have selected : 1GB Graphics Card");
					}
					else{
						menuItems.add("2GB");
						desc.add("EVGA GeForce GTX 250Ti Superclock w/G-SYNC Support 2GB GDDR5 256bit, Dual-Link DVI-I, HDMI DP 3.6 Graphics Card");
						gloss.add("EGA : The Enhanced Graphics Adapter (EGA) is an IBM PC computer display standard specification which is between CGA and VGA in terms of color and space resolution\n"
								+ "RGB : The RGB color model is an additive color model in which red, green, and blue light are added together in various ways to reproduce a broad array of colors.\n"
								+ "Palette : In computer graphics, a palette is either a given, finite set of colors for the management of digital images (that is, a color palette)\n"
								+ "MCGA : The Multi-Color Graphics Array or MCGA was a video subsystem built into the motherboard of the IBM PS/2 Model 30\n");
						lof.add("Figure 1 : A Radeon HD 9850 card\n"
								+ "Figure 2 : Classical desktop computer architecture\n");
						System.out.println("You have selected : 2GB Graphics Card");
					}
				}
			} else
				break;

		}
		System.out
				.println("Below are Optional Options Optical Drive, Monitor, Operating System, Support");

		while (true) {
		System.out.println("Enter whether you need an Optical Drive ::");
		System.out.println("1. USB 2.0");
		System.out.println("2. USB 3.0");
		System.out.println("3. Not Required");
		String line = in.nextLine();
		
			if (null != line && line.length() > 0 && Integer.parseInt(line) >= 1
					&& Integer.parseInt(line) <= 2) {
				optical_Drive = Integer.parseInt(line);
				if (optical_Drive == 1){
					menuItems.add("USB 2.0");
					desc.add("Samsung USB 2.0 Ultra Portable External DVD Writer Model SE-218CB/RSBS");
					gloss.add("Laser : A laser is a device that emits light through a process of optical amplification based on the stimulated emission of electromagnetic radiation\n"
							+ "Spectram : The electromagnetic spectrum is the range of all possible frequencies of electromagnetic radiation\n"
							+ "Photodiode : A photodiode is a semiconductor device that converts light into current.\n");
					lof.add("Figure 1 : A CD/DVD-ROM Drive\n"
							+ "Figure 2 : An external USB SuperDrive\n");
					System.out.println("You have selected : USB 2.0 Optical Dive");
				}
				else{
					menuItems.add("USB 3.0");
					desc.add("Nokia USB 3.0 Ultra Portable External DVD Writer Model SE-918CB/R6BS");
					gloss.add("Laser : A laser is a device that emits light through a process of optical amplification based on the stimulated emission of electromagnetic radiation\n"
							+ "Spectram : The electromagnetic spectrum is the range of all possible frequencies of electromagnetic radiation\n"
							+ "Photodiode : A photodiode is a semiconductor device that converts light into current.\n"
							+ "Lens : A lens is an optical device which transmits and refracts light, converging or diverging the beam\n");
					lof.add("Figure 1 : A CD/DVD-ROM Drive\n"
							+ "Figure 2 : A CD-ROM Drive (without case)\n");
					System.out.println("You have selected : USB 3.0 Optical Drive");
				}
				break;
			} else if(line != null && line.length() == 0 && line.equals("")){
				menuItems.add("");
				desc.add("");
				gloss.add("");
				lof.add("");
				System.out.println("You haven't selected anything");
				break;
			} else if(null == line || Integer.parseInt(line) < 1
					|| Integer.parseInt(line) > 2){
				menuItems.add("");
				desc.add("");
				gloss.add("");
				lof.add("");
				System.out.println("You haven't selected anything");
				break;
			}
		}
	while (true) {
		System.out.println("Enter type of Monitor ::");
		System.out.println("1. 32inches");
		System.out.println("2. 54inches");
		System.out.println("3. Not Required");
		String line = in.nextLine();
		if (null != line && line.length() > 0 && Integer.parseInt(line) >= 1
				&& Integer.parseInt(line) <= 2) {
			monitor = Integer.parseInt(line);
			if (monitor == 1){
				menuItems.add("32inches");
				desc.add("Dell 1901FP UltraSharp - Grade C - No Stand - 32 LCD Monitor");
				gloss.add("Cathode Ray Tube : The cathode ray tube or (CRT) is a vacuum tube containing one or more electron guns, and a fluorescent screen used to view images\n"
						+ "Aspect Ratio : The aspect ratio of a geometric shape is the ratio between its sizes in different dimensions.\n"
						+ "Monochrome : Monochrome describes paintings, drawings, design, or photographs in one color or shades of one color.\n");
				lof.add("Figure 1 : A 32inch monitor\n"
						+ "Figure 2 : A panel mount 32-inch\n");
				System.out.println("You have selected : 32inches Monitor");
			}
			else{
				menuItems.add("54inches");
				desc.add("Samsung C150 Series S22C150N 21.5 1080p LED-Backlit LCD Monitor");
				gloss.add("Cathode Ray Tube : The cathode ray tube or (CRT) is a vacuum tube containing one or more electron guns, and a fluorescent screen used to view images\n"
						 + "Monochrome : Monochrome describes paintings, drawings, design, or photographs in one color or shades of one color.\n");
				lof.add("Figure 1 : A 54inch monitor\n"
						+ "Figure 2 : A panel mount 54-inch\n");
				System.out.println("You have selected : 54inches Monitor");
			}
			break;
		} else if(line != null && line.length() == 0 && line.equals("")){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		} else if(null == line || Integer.parseInt(line) < 1
				|| Integer.parseInt(line) > 2){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		}
	}
	while (true) {
		System.out.println("Enter type of Operating System ::");
		System.out.println("1. Windows 7");
		System.out.println("2. Windows 8.1");
		System.out.println("3. Not Required");
		String  line = in.nextLine();
		if (null != line && line.length() > 0 && Integer.parseInt(line) >= 1
				&& Integer.parseInt(line) <= 2) {
			operating_System = Integer.parseInt(line);
			if (operating_System == 1){
				menuItems.add("Windows 7");
				desc.add("Windows 7 is a personal computer operating system developed by Microsoft, a version of Windows NT.");
				gloss.add("Time Sharing : Time-sharing is the sharing of a computing resource among many users by means of multiprogramming and multi-tasking.\n"
						+ "Interrupts : A programmable interrupt controller (PIC) is a device that is used to combine several sources of interrupt onto one or more CPU lines\n");
				lof.add("Figure 1 : Screenshot of Windows 7\n"
						+ "Figure 2 : Windows 7 live thumbnails\n");
				System.out.println("You have selected : Windows 7 Operating System");
			}
			else{
				menuItems.add("Windows 8.1");
				desc.add("Windows 8 is a personal computer operating system developed by Microsoft as part of the Windows NT family.");
				gloss.add("Time Sharing : Time-sharing is the sharing of a computing resource among many users by means of multiprogramming and multi-tasking.\n"
						+ "Interrupts : A programmable interrupt controller (PIC) is a device that is used to combine several sources of interrupt onto one or more CPU lines\n"
						+ "CP67 : CP-67 was the control program portion of CP/CMS, a virtual machine operating system developed for the IBM System/360-67 by IBM's Cambridge Scientific Center\n");
				lof.add("Figure 1 : Screenshot of Windows 8.1\n"
						+ "Figure 2 : Windows 8.1 live thumbnails\n");
				System.out.println("You have selected : Windows 8.1 Operating System");
			}
			break;
		} else if(line != null && line.length() == 0 && line.equals("")){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		} else if(null == line || Integer.parseInt(line) < 1
				|| Integer.parseInt(line) > 2){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		}
	}
	while (true) {
		System.out.println("Enter type of Support ::");
		System.out.println("1. 1 Year");
		System.out.println("2. 2 Year");
		System.out.println("3. Not Required");
		String line = in.nextLine();
		if (null != line && line.length() > 0 && Integer.parseInt(line) >= 1
				&& Integer.parseInt(line) <= 2) {
			support = Integer.parseInt(line);
			if (support == 1){
				menuItems.add("1 Year");
				desc.add("You will get 1 year of dedicated phone and email support and also 3 month return policy on all items");
				gloss.add("Knowledge Base : A knowledge base (KB) is a technology used to store complex structured and unstructured information used by a computer system.\n"
						+ "Proactive Support Automation : It refers to support automation solutions that minimize downtime and enable 24x7 availability.\n"
						+ "Assisted Support Automation : It is the software that enables support personnel to remotely access their customers desktop or server for diagnostics and trouble ticket resolution\n");
				lof.add("Figure 1 : Official partner certificate\n");
				System.out.println("You have selected : 1 Year support ");
			}
			else{
				menuItems.add("2 Year");
				desc.add("You will get 2 year of dedicated phone and email support and also 3 month return policy on all items");
				gloss.add("Knowledge Base : A knowledge base (KB) is a technology used to store complex structured and unstructured information used by a computer system.\n"
						+ "Proactive Support Automation : It refers to support automation solutions that minimize downtime and enable 24x7 availability.\n"
						+ "Assisted Support Automation : It is the software that enables support personnel to remotely access their customers desktop or server for diagnostics and trouble ticket resolution\n");
				lof.add("Figure 1 : Official partner certificate\n");
				System.out.println("You have selected : 2 year support");
			}
			break;
		} else if(line != null && line.length() == 0 && line.equals("")){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		} else if(null == line || Integer.parseInt(line) < 1
				|| Integer.parseInt(line) > 2){
			menuItems.add("");
			desc.add("");
			gloss.add("");
			lof.add("");
			System.out.println("You haven't selected anything");
			break;
		}
	}
	
	HashMap<String, Integer> finalManual = manualPrint.getPageNumbers(menuItems);
	manualPrint.printManual(finalManual);
	
	HashMap<String, Integer> finalManual1 = manualPrint.getTOI(desc);
	manualPrint.printDesc(finalManual1);
	
	HashMap<String, Integer> finalManual2 = manualPrint.getGloss(gloss);
	manualPrint.printGloss(finalManual2);
	
	HashMap<String, Integer> finalManual4 = manualPrint.getLOF(lof);
	manualPrint.printLOF(finalManual4);
	
		in.close();	

	}
}
