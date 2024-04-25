//Mini Project
//428,444,447
package DSLMiniProj;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Admin {
	public static void main(String args[]) {
		double sessionAmt=0;
		LinkedList<Log> log=new LinkedList<Log>();
		String code[] = { "Wakad", "Esquare", "Wipro", "IBM", "Infosys", "TCS" };
		/*
		 * 0=Wakad 1=Esquare 2=Wipro 3=IBM 4=Infosys 5=TCS numbering convention follows
		 * as seater number, landmark number
		 */
		int pickup, drop;
		Seater2 s20 = new Seater2();
		Seater4 s40 = new Seater4();
		Seater6 s60 = new Seater6();
		Landmarks Wakad = new Landmarks("Wakad", "Wakad Flyover", s20, s40, s60);
		Seater2 s21 = new Seater2();
		Seater4 s41 = new Seater4();
		Seater6 s61 = new Seater6();
		Landmarks Esquare = new Landmarks("E-Square(Xion Mall)", "Phase-I", s21, s41, s61);
		Seater2 s22 = new Seater2();
		Seater4 s42 = new Seater4();
		Seater6 s62 = new Seater6();
		Landmarks Wipro = new Landmarks("Wipro", "Phase-I", s22, s42, s62);
		Seater2 s23 = new Seater2();
		Seater4 s43 = new Seater4();
		Seater6 s63 = new Seater6();
		Landmarks IBM = new Landmarks("IBM software Labs", "Phase-II", s23, s43, s63);
		Seater2 s24 = new Seater2();
		Seater4 s44 = new Seater4();
		Seater6 s64 = new Seater6();
		Landmarks Infosys = new Landmarks("Infosys(Gate 1)", "Phase-II", s24, s44, s64);
		Seater2 s25 = new Seater2();
		Seater4 s45 = new Seater4();
		Seater6 s65 = new Seater6();
		Landmarks TCS = new Landmarks("Tata Consultancy Services(Gate 4)", "Phase-III", s25, s45, s65);
		Vehicle v200 = new Vehicle("MH 12 AB 1001", "Black", 44);
		Vehicle v201 = new Vehicle("MH 12 CB 2301", "Black", 45);
		Vehicle v202 = new Vehicle("MH 12 DQ 5401", "Grey", 43.6);
		Vehicle v203 = new Vehicle("MH 12 PR 9002", "Grey", 39.7);
		Vehicle v204 = new Vehicle("MH 16 AB 9012", "Red", 44);
		Vehicle v205 = new Vehicle("MH 12 NK 4785", "Blue", 44.5);
		Vehicle v206 = new Vehicle("MH 16 MK 6742", "Red", 39.4);
		Vehicle v207 = new Vehicle("MH 12 RD 4985", "Blue", 41.5);
		Vehicle v208 = new Vehicle("MH 16 HB 9012", "Black", 44);
		Vehicle v209 = new Vehicle("MH 12 UK 4787", "Blue", 44.5);
		Wakad.s2.enqueue(v200);
		Wakad.s2.enqueue(v201);
		Wakad.s2.enqueue(v202);
		Wakad.s2.enqueue(v203);
		Wakad.s2.enqueue(v204);
		Wakad.s2.enqueue(v205);
		Wakad.s2.enqueue(v206);
		Wakad.s2.enqueue(v207);
		Wakad.s2.enqueue(v208);
		Wakad.s2.enqueue(v209);
		Vehicle v400 = new Vehicle("MH 14 AB 1031", "Black", 33);
		Vehicle v401 = new Vehicle("MH 04 CB 2801", "Black", 25);
		Vehicle v402 = new Vehicle("MH 12 DQ 5491", "Grey", 26.6);
		Vehicle v403 = new Vehicle("MH 12 PR 8002", "Grey", 29.7);
		Vehicle v404 = new Vehicle("MH 16 AB 7012", "Red", 21);
		Wakad.s4.enqueue(v400);
		Wakad.s4.enqueue(v401);
		Wakad.s4.enqueue(v402);
		Wakad.s4.enqueue(v403);
		Wakad.s4.enqueue(v404);
		Vehicle v600 = new Vehicle("MH 16 XI 1111", "Black", 16);
		Vehicle v601 = new Vehicle("MH 04 UY 2871", "White", 17);
		Wakad.s6.enqueue(v600);
		Wakad.s6.enqueue(v601);
		Vehicle v210 = new Vehicle("MH 12 AB 3001", "Green", 44);
		Vehicle v211 = new Vehicle("MH 14 KM 2301", "Black", 45);
		Vehicle v212 = new Vehicle("MH 14 DQ 6501", "Grey", 43.6);
		Vehicle v213 = new Vehicle("MH 12 PR 3902", "Grey", 39.7);
		Vehicle v214 = new Vehicle("MH 16 HM 9612", "Red", 44);
		Vehicle v215 = new Vehicle("MH 12 GR 4885", "Black", 44.5);
		Vehicle v216 = new Vehicle("MH 16 VR 6542", "Red", 39.4);
		Vehicle v217 = new Vehicle("MH 12 LO 1985", "White", 41.5);
		Vehicle v218 = new Vehicle("MH 16 OP 1712", "Black", 44);
		Vehicle v219 = new Vehicle("MH 12 UL 8485", "Yellow", 44.5);
		Esquare.s2.enqueue(v210);
		Esquare.s2.enqueue(v211);
		Esquare.s2.enqueue(v212);
		Esquare.s2.enqueue(v213);
		Esquare.s2.enqueue(v214);
		Esquare.s2.enqueue(v215);
		Esquare.s2.enqueue(v216);
		Esquare.s2.enqueue(v217);
		Esquare.s2.enqueue(v218);
		Esquare.s2.enqueue(v219);
		Vehicle v410 = new Vehicle("MH 12 BG 1931", "Black", 33);
		Vehicle v411 = new Vehicle("MH 04 CB 2841", "white", 25);
		Vehicle v412 = new Vehicle("MH 12 DY 5661", "white", 22.6);
		Vehicle v413 = new Vehicle("MH 02 KR 2332", "Grey", 29.7);
		Vehicle v414 = new Vehicle("MH 16 AB 7092", "Red", 22);
		Esquare.s4.enqueue(v410);
		Esquare.s4.enqueue(v411);
		Esquare.s4.enqueue(v412);
		Esquare.s4.enqueue(v413);
		Esquare.s4.enqueue(v414);
		Vehicle v610 = new Vehicle("MH 16 NM 1691", "Black", 16);
		Vehicle v611 = new Vehicle("MH 04 YW 2801", "White", 15.5);
		Esquare.s6.enqueue(v610);
		Esquare.s6.enqueue(v611);
		Vehicle v220 = new Vehicle("MH 12 AB 2001", "White", 44);
		Vehicle v221 = new Vehicle("MH 14 CB 2201", "Black", 45);
		Vehicle v222 = new Vehicle("MH 14 DQ 6401", "Grey", 43.6);
		Vehicle v223 = new Vehicle("MH 12 PR 3802", "Grey", 39.7);
		Vehicle v224 = new Vehicle("MH 16 AG 9512", "Red", 44);
		Vehicle v225 = new Vehicle("MH 12 GR 4885", "Blue", 44.5);
		Vehicle v226 = new Vehicle("MH 16 QM 6642", "Red", 39.4);
		Vehicle v227 = new Vehicle("MH 12 LO 6985", "White", 41.5);
		Vehicle v228 = new Vehicle("MH 16 OP 9712", "Black", 44);
		Vehicle v229 = new Vehicle("MH 12 UX 8785", "Yellow", 44.5);
		Wipro.s2.enqueue(v220);
		Wipro.s2.enqueue(v221);
		Wipro.s2.enqueue(v222);
		Wipro.s2.enqueue(v223);
		Wipro.s2.enqueue(v224);
		Wipro.s2.enqueue(v225);
		Wipro.s2.enqueue(v226);
		Wipro.s2.enqueue(v227);
		Wipro.s2.enqueue(v228);
		Wipro.s2.enqueue(v229);
		Vehicle v420 = new Vehicle("MH 12 LG 2991", "Black", 33);
		Vehicle v421 = new Vehicle("MH 04 CB 2871", "white", 25);
		Vehicle v422 = new Vehicle("MH 12 UP 5611", "white", 22.6);
		Vehicle v423 = new Vehicle("MH 02 WS 7902", "Grey", 29.7);
		Vehicle v424 = new Vehicle("MH 16 AM 7082", "Red", 22);
		Wipro.s4.enqueue(v420);
		Wipro.s4.enqueue(v421);
		Wipro.s4.enqueue(v422);
		Wipro.s4.enqueue(v423);
		Wipro.s4.enqueue(v424);
		Vehicle v620 = new Vehicle("MH 16 NM 1691", "Black", 16);
		Vehicle v621 = new Vehicle("MH 04 YW 2801", "White", 15.5);
		Wipro.s6.enqueue(v620);
		Wipro.s6.enqueue(v621);
		Vehicle v230 = new Vehicle("MH 16 AB 5678", "White", 43);
		Vehicle v231 = new Vehicle("MH 14 CB 2201", "Black", 45);
		Vehicle v232 = new Vehicle("MH 14 DQ 6401", "Grey", 43.6);
		Vehicle v233 = new Vehicle("MH 12 PR 1234", "Grey", 39.7);
		Vehicle v234 = new Vehicle("MH 16 AG 9512", "Red", 44);
		Vehicle v235 = new Vehicle("MH 12 NO 6543", "Blue", 44.5);
		Vehicle v236 = new Vehicle("MH 16 MK 8942", "Red", 35.4);
		Vehicle v237 = new Vehicle("MH 12 LO 6985", "White", 41.5);
		Vehicle v238 = new Vehicle("MH 16 OP 9712", "Black", 44);
		Vehicle v239 = new Vehicle("MH 16 WX 5678", "Yellow", 44.5);
		IBM.s2.enqueue(v230);
		IBM.s2.enqueue(v231);
		IBM.s2.enqueue(v232);
		IBM.s2.enqueue(v233);
		IBM.s2.enqueue(v234);
		IBM.s2.enqueue(v235);
		IBM.s2.enqueue(v236);
		IBM.s2.enqueue(v237);
		IBM.s2.enqueue(v238);
		IBM.s2.enqueue(v239);
		Vehicle v430 = new Vehicle("MH 12 BG 1031", "Black", 33);
		Vehicle v431 = new Vehicle("MH 14 CN 5678", "white", 25);
		Vehicle v432 = new Vehicle("MH 12 IY 5661", "white", 22.6);
		Vehicle v433 = new Vehicle("MH 02 IR 6543", "Grey", 29.7);
		Vehicle v434 = new Vehicle("MH 16 IB 7792", "Red", 22);
		IBM.s4.enqueue(v430);
		IBM.s4.enqueue(v431);
		IBM.s4.enqueue(v432);
		IBM.s4.enqueue(v433);
		IBM.s4.enqueue(v434);
		Vehicle v630 = new Vehicle("MH 16 NM 6543", "Black", 16);
		Vehicle v631 = new Vehicle("MH 14 YW 9876", "White", 15.5);
		IBM.s6.enqueue(v630);
		IBM.s6.enqueue(v631);
		Vehicle v240 = new Vehicle("MH 16 AU 2109", "White", 43);
		Vehicle v241 = new Vehicle("MH 14 CU 2201", "Black", 45);
		Vehicle v242 = new Vehicle("MH 14 DU 6401", "Grey", 43.6);
		Vehicle v243 = new Vehicle("MH 12 UR 1954", "Grey", 39.7);
		Vehicle v244 = new Vehicle("MH 16 AG 9542", "Red", 44);
		Vehicle v245 = new Vehicle("MH 12 GO 6523", "Blue", 44.5);
		Vehicle v246 = new Vehicle("MH 16 MI 8982", "Red", 35.4);
		Vehicle v247 = new Vehicle("MH 12 LO 6935", "White", 41.5);
		Vehicle v248 = new Vehicle("MH 16 OP 9732", "Black", 44);
		Vehicle v249 = new Vehicle("MH 16 WX 5678", "Yellow", 44.5);
		Infosys.s2.enqueue(v240);
		Infosys.s2.enqueue(v241);
		Infosys.s2.enqueue(v242);
		Infosys.s2.enqueue(v243);
		Infosys.s2.enqueue(v244);
		Infosys.s2.enqueue(v245);
		Infosys.s2.enqueue(v246);
		Infosys.s2.enqueue(v247);
		Infosys.s2.enqueue(v248);
		Infosys.s2.enqueue(v249);
		Vehicle v440 = new Vehicle("MH 12 BG 1331", "Black", 33);
		Vehicle v441 = new Vehicle("MH 14 CN 5978", "white", 25);
		Vehicle v442 = new Vehicle("MH 12 LO 5361", "white", 22.6);
		Vehicle v443 = new Vehicle("MH 02 MI 6583", "Grey", 29.7);
		Vehicle v444 = new Vehicle("MH 16 WX 7892", "Red", 22);
		Infosys.s4.enqueue(v440);
		Infosys.s4.enqueue(v441);
		Infosys.s4.enqueue(v442);
		Infosys.s4.enqueue(v443);
		Infosys.s4.enqueue(v444);
		Vehicle v640 = new Vehicle("MH 16 KM 6543", "Black", 16);
		Vehicle v641 = new Vehicle("MH 14 PO 9876", "White", 15.5);
		Infosys.s6.enqueue(v640);
		Infosys.s6.enqueue(v641);
		Vehicle v250 = new Vehicle("MH 12 AH 1001", "Black", 44);
		Vehicle v251 = new Vehicle("MH 12 CH 2341", "Black", 45);
		Vehicle v252 = new Vehicle("MH 12 HQ 1251", "Grey", 43.6);
		Vehicle v253 = new Vehicle("MH 12 HR 9902", "Grey", 39.7);
		Vehicle v254 = new Vehicle("MH 16 NH 9992", "Red", 44);
		Vehicle v255 = new Vehicle("MH 12 NL 4785", "Blue", 44.5);
		Vehicle v256 = new Vehicle("MH 16 MB 6932", "Red", 39.4);
		Vehicle v257 = new Vehicle("MH 12 RY 4985", "Blue", 41.5);
		Vehicle v258 = new Vehicle("MH 16 HB 9112", "Black", 44);
		Vehicle v259 = new Vehicle("MH 12 UK 4307", "Blue", 44.5);
		TCS.s2.enqueue(v250);
		TCS.s2.enqueue(v251);
		TCS.s2.enqueue(v252);
		TCS.s2.enqueue(v253);
		TCS.s2.enqueue(v254);
		TCS.s2.enqueue(v255);
		TCS.s2.enqueue(v256);
		TCS.s2.enqueue(v257);
		TCS.s2.enqueue(v258);
		TCS.s2.enqueue(v259);
		Vehicle v450 = new Vehicle("MH 14 AB 7384", "Black", 33);
		Vehicle v451 = new Vehicle("MH 04 CB 2093", "Black", 25);
		Vehicle v452 = new Vehicle("MH 12 DQ 5490", "Grey", 26.6);
		Vehicle v453 = new Vehicle("MH 12 PR 8034", "Grey", 29.7);
		Vehicle v454 = new Vehicle("MH 16 AB 7013", "Red", 21);
		TCS.s4.enqueue(v450);
		TCS.s4.enqueue(v451);
		TCS.s4.enqueue(v452);
		TCS.s4.enqueue(v453);
		TCS.s4.enqueue(v454);
		Vehicle v650 = new Vehicle("MH 16 XL 1211", "Black", 16);
		Vehicle v651 = new Vehicle("MH 04 UL 2811", "White", 17);
		TCS.s6.enqueue(v650);
		TCS.s6.enqueue(v651);
		int size = 6;
		double[][] map = new double[size][size];// to store all the distances
		map[0][1] = 3.1;
		map[1][0] = 3.1;
		map[0][2] = 3.3;
		map[2][0] = 3.3;
		map[0][3] = 7.1;
		map[3][0] = 7.1;
		map[0][4] = 7.5;
		map[4][0] = 7.5;
		map[0][5] = 11;
		map[5][0] = 11;
		map[1][2] = 2.4;
		map[2][1] = 2.4;
		map[1][3] = 6.2;
		map[3][1] = 6.2;
		map[1][4] = 6.7;
		map[4][1] = 6.7;
		map[1][5] = 9.9;
		map[5][1] = 9.9;
		map[2][3] = 4.2;
		map[3][2] = 4.2;
		map[2][4] = 4.7;
		map[4][2] = 4.7;
		map[2][5] = 7.9;
		map[5][2] = 7.9;
		map[3][4] = 1.9;
		map[4][3] = 1.9;
		map[3][5] = 5.6;
		map[5][3] = 5.6;
		map[4][5] = 5;
		map[5][4] = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"\to-O-o o-O-o     o--o    O  o--o  o  o      o-o  o  o o   o o-O-o o-O-o o    o--o      o-o  o--o o--o  o   o o-O-o   o-o o--o \r\n"
						+ "\t  |     |       |   |  / \\ |   | | /      |     |  | |   |   |     |   |    |        |     |    |   | |   |   |    /    |    \r\n"
						+ "\t  |     |       O--o  o---oO-Oo  OO        o-o  O--O |   |   |     |   |    O-o       o-o  O-o  O-Oo  o   o   |   O     O-o  \r\n"
						+ "\t  |     |       |     |   ||  \\  | \\          | |  | |   |   |     |   |    |            | |    |  \\   \\ /    |    \\    |    \r\n"
						+ "\to-O-o   o       o     o   oo   o o  o     o--o  o  o  o-o    o     o   O---oo--o     o--o  o--o o   o   o   o-O-o   o-o o--o \r\n"
						+ "\t                                                                                                                             \r\n"
						+ "\t                                                                                                                             ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("SESSION OF :" + dtf.format(now) + "\n");
		int ch;
		do {
			System.out.println("Select vehicle type:");
			System.out.println(
					"1)Two seater vehicle\n2)Four seater vehicle\n3)Six seater vehicle\nEnter your choice(1/2/3)");
			int s;
			do {
				s = sc.nextInt();
				// Ask for number of seater
				if (s != 1 && s != 2 && s != 3) {
					System.out.println("Invalid choice!\nSelect from(1/2/3)");
				}
			} while (s != 1 && s != 2 && s != 3);
			String vehicleChoice = "";
			if (s == 1) {
				vehicleChoice = "Two seater vehicle";
			} else if (s == 2) {
				vehicleChoice = "Four seater vehicle";
			} else if (s == 3) {
				vehicleChoice = "Six seater vehicle";
			}
			System.out.print(vehicleChoice);
			System.out.println(" are available at the following locations:");
			if (s == 1) {
				if (Wakad.s2.isempty() == false) {
					System.out.println("0-Wakad");
				}
				if (Esquare.s2.isempty() == false) {
					System.out.println("1-Esquare");
				}
				if (Wipro.s2.isempty() == false) {
					System.out.println("2-Wipro");
				}
				if (IBM.s2.isempty() == false) {
					System.out.println("3-IBM");
				}
				if (Infosys.s2.isempty() == false) {
					System.out.println("4-Infosys");
				}
				if (TCS.s2.isempty() == false) {
					System.out.println("5-TCS");
				}
			}
			if (s == 2) {
				if (Wakad.s4.isempty() == false) {
					System.out.println("0-Wakad");
				}
				if (Esquare.s4.isempty() == false) {
					System.out.println("1-Esquare");
				}
				if (Wipro.s4.isempty() == false) {
					System.out.println("2-Wipro");
				}
				if (IBM.s4.isempty() == false) {
					System.out.println("3-IBM");
				}
				if (Infosys.s4.isempty() == false) {
					System.out.println("4-Infosys");
				}
				if (TCS.s4.isempty() == false) {
					System.out.println("5-TCS");
				}
			}
			if (s == 3) {
				if (Wakad.s6.isempty() == false) {
					System.out.println("0-Wakad");
				}
				if (Esquare.s6.isempty() == false) {
					System.out.println("1-Esquare");
				}
				if (Wipro.s6.isempty() == false) {
					System.out.println("2-Wipro");
				}
				if (IBM.s6.isempty() == false) {
					System.out.println("3-IBM");
				}
				if (Infosys.s6.isempty() == false) {
					System.out.println("4-Infosys");
				}
				if (TCS.s6.isempty() == false) {
					System.out.println("5-TCS");
				}
			}
			System.out.println("Enter the location code of your preferred pick up location from the above code:");
			do {
				pickup = sc.nextInt();
				if (pickup != 0 && pickup != 1 && pickup != 2 && pickup != 3 && pickup != 4 && pickup != 5) {
					System.out.println("Incorect location code entered!\nPlease Re-enter:");
				}
			} while (pickup != 0 && pickup != 1 && pickup != 2 && pickup != 3 && pickup != 4 && pickup != 5);
			System.out.println("Select a vehicle drop loction:");
			for (int i = 0; i < code.length; i++) {
				if (pickup != i) {
					System.out.println(i + "-" + code[i]);
				}
			}
			do {
				drop = sc.nextInt();
				if ((drop != 0 && drop != 1 && drop != 2 && drop != 3 && drop != 4 && drop != 5) || (drop == pickup)) {
					System.out.println("Invalid location code entered!\nPlease Re-enter:");
				}
			} while ((drop == pickup) || (drop != 0 && drop != 1 && drop != 2 && drop != 3 && drop != 4 && drop != 5));
			// billing
			Vehicle dispatchedVehicle = null;
			if (s == 1) {
				if (pickup == 0) {
					dispatchedVehicle = Wakad.s2.dequeue();
				} else if (pickup == 1) {
					dispatchedVehicle = Esquare.s2.dequeue();
				} else if (pickup == 2) {
					dispatchedVehicle = Wipro.s2.dequeue();
				} else if (pickup == 3) {
					dispatchedVehicle = IBM.s2.dequeue();
				} else if (pickup == 4) {
					dispatchedVehicle = Infosys.s2.dequeue();
				} else if (pickup == 5) {
					dispatchedVehicle = TCS.s2.dequeue();
				} 
			} else if (s == 2) {
				if (pickup == 0) {
					dispatchedVehicle = Wakad.s4.dequeue();
				} else if (pickup == 1) {
					dispatchedVehicle = Esquare.s4.dequeue();
				} else if (pickup == 2) {
					dispatchedVehicle = Wipro.s4.dequeue();
				} else if (pickup == 3) {
					dispatchedVehicle = IBM.s4.dequeue();
				} else if (pickup == 4) {
					dispatchedVehicle = Infosys.s4.dequeue();
				} else if (pickup == 5) {
					dispatchedVehicle = TCS.s4.dequeue();
				} 
			} else if (s == 3) {
				if (pickup == 0) {
					dispatchedVehicle = Wakad.s6.dequeue();
				} else if (pickup == 1) {
					dispatchedVehicle = Esquare.s6.dequeue();
				} else if (pickup == 2) {
					dispatchedVehicle = Wipro.s6.dequeue();
				} else if (pickup == 3) {
					dispatchedVehicle = IBM.s6.dequeue();
				} else if (pickup == 4) {
					dispatchedVehicle = Infosys.s6.dequeue();
				} else if (pickup == 5) {
					dispatchedVehicle = TCS.s6.dequeue();
				} 
			}
			System.out.println("Dispatched Vehicle:"+dispatchedVehicle.numberPlate);
			double price = billing(pickup, drop, map, s, dispatchedVehicle);
			sessionAmt+=price;
			if (s == 1) {
				if (drop == 0) {
					Wakad.s2.enqueue(dispatchedVehicle);
				} else if (drop == 1) {
					Esquare.s2.enqueue(dispatchedVehicle);
				} else if (drop == 2) {
					Wipro.s2.enqueue(dispatchedVehicle);
				} else if (drop == 3) {
					IBM.s2.enqueue(dispatchedVehicle);
				} else if (drop == 4) {
					Infosys.s2.enqueue(dispatchedVehicle);
				} else if (drop == 5) {
					TCS.s2.enqueue(dispatchedVehicle);
				} 
			} else if (s == 2) {
				if (drop == 0) {
					Wakad.s4.enqueue(dispatchedVehicle);
				} else if (drop == 1) {
					Esquare.s4.enqueue(dispatchedVehicle);
				} else if (drop == 2) {
					Wipro.s4.enqueue(dispatchedVehicle);
				} else if (drop == 3) {
					IBM.s4.enqueue(dispatchedVehicle);
				} else if (drop == 4) {
					Infosys.s4.enqueue(dispatchedVehicle);
				} else if (drop == 5) {
					TCS.s4.enqueue(dispatchedVehicle);
					}
			} else if (s == 3) {
				if (drop == 0) {
					Wakad.s6.enqueue(dispatchedVehicle);
				} else if (drop == 1) {
					Esquare.s6.enqueue(dispatchedVehicle);
				} else if (drop == 2) {
					Wipro.s6.enqueue(dispatchedVehicle);
				} else if (drop == 3) {
					IBM.s6.enqueue(dispatchedVehicle);
				} else if (drop == 4) {
					Infosys.s6.enqueue(dispatchedVehicle);
				}else if (drop == 5) {
					TCS.s6.enqueue(dispatchedVehicle);
				} 
			}
			System.out.println("\nVehicle Booked Successfully!\n");
			// Bill print
			System.out.println("----------------------------------------------------------------");
			System.out.println("______________________BILL_____________________\n");
			System.out.println("Vehicle Pickup Location: " + code[pickup]);
			System.out.println("Vehicle Drop Location: " + code[drop]);
			System.out.println("Assigned Vehicle:-\n");
			System.out.println("Vehicle no.: " + dispatchedVehicle.numberPlate + "\nColour: " + dispatchedVehicle.colour
					+ "\nMileage: " + dispatchedVehicle.mileage+"kmpl");
			System.out.println("Amount: Rs. " + price);
			System.out.println("-----------------------------------------------------------------");
			Log newEntry=new Log(dispatchedVehicle,pickup,drop);
			log.add(newEntry);
			System.out.println("Do you want more vehicle?\n1)Yes\n2)No\nEnter (1/2): ");
			do {
				ch = sc.nextInt();
				if (ch != 1 && ch != 2) {
					System.out.println("Invalid input!\nSelect from (1/2)");
				}
			} while (ch != 1 && ch != 2);
		} while (ch != 2);
		System.out.println("----------------SESSION ENDED-------------------");
		System.out.println("Session Details:\n");
		for(int i=0;i<log.size();i++)
		{
			System.out.println("Order number:"+(i+1));
			System.out.println("Vehicle: "+log.get(i).v.numberPlate);
			System.out.println("Pickup Location: "+code[log.get(i).pickup]);
			System.out.println("Drop Location: "+code[log.get(i).drop]);
			System.out.println();
		}
		System.out.println("Total session Amount= Rs. "+sessionAmt);
		System.out.println("-----------------------THANK YOU!------------------");
	}

	public static double billing(int start, int end, double[][] map, int s, Vehicle dispatchedVehicle) {
		double cost = 0;
		double dist = map[start][end];
		if (s == 1) {
			cost = dist * 15;
		} else if (s == 2) {
			cost = dist * 25;
		} else if (s == 3) {
			cost = dist * 32;
		}
		return cost;

	}
}

/*
 * OUTPUT
 * 	o-O-o o-O-o     o--o    O  o--o  o  o      o-o  o  o o   o o-O-o o-O-o o    o--o      o-o  o--o o--o  o   o o-O-o   o-o o--o 
	  |     |       |   |  / \ |   | | /      |     |  | |   |   |     |   |    |        |     |    |   | |   |   |    /    |    
	  |     |       O--o  o---oO-Oo  OO        o-o  O--O |   |   |     |   |    O-o       o-o  O-o  O-Oo  o   o   |   O     O-o  
	  |     |       |     |   ||  \  | \          | |  | |   |   |     |   |    |            | |    |  \   \ /    |    \    |    
	o-O-o   o       o     o   oo   o o  o     o--o  o  o  o-o    o     o   O---oo--o     o--o  o--o o   o   o   o-O-o   o-o o--o 
	                                                                                                                             
	                                                                                                                             
SESSION OF :09/11/2023

Select vehicle type:
1)Two seater vehicle
2)Four seater vehicle
3)Six seater vehicle
Enter your choice(1/2/3)
1
Two seater vehicle are available at the following locations:
0-Wakad
1-Esquare
2-Wipro
3-IBM
4-Infosys
5-TCS
Enter the location code of your preferred pick up location from the above code:
0
Select a vehicle drop loction:
1-Esquare
2-Wipro
3-IBM
4-Infosys
5-TCS
1
Dispatched Vehicle:MH 12 AB 1001

Vehicle Booked Successfully!

----------------------------------------------------------------
______________________BILL_____________________

Vehicle Pickup Location: Wakad
Vehicle Drop Location: Esquare
Assigned Vehicle:-

Vehicle no.: MH 12 AB 1001
Colour: Black
Mileage: 44.0kmpl
Amount: Rs. 46.5
-----------------------------------------------------------------
Do you want more vehicle?
1)Yes
2)No
Enter (1/2): 
5
Invalid input!
Select from (1/2)
1
Select vehicle type:
1)Two seater vehicle
2)Four seater vehicle
3)Six seater vehicle
Enter your choice(1/2/3)
4
Invalid choice!
Select from(1/2/3)
2
Four seater vehicle are available at the following locations:
0-Wakad
1-Esquare
2-Wipro
3-IBM
4-Infosys
5-TCS
Enter the location code of your preferred pick up location from the above code:
3
Select a vehicle drop loction:
0-Wakad
1-Esquare
2-Wipro
4-Infosys
5-TCS
0
Dispatched Vehicle:MH 12 BG 1031

Vehicle Booked Successfully!

----------------------------------------------------------------
______________________BILL_____________________

Vehicle Pickup Location: IBM
Vehicle Drop Location: Wakad
Assigned Vehicle:-

Vehicle no.: MH 12 BG 1031
Colour: Black
Mileage: 33.0kmpl
Amount: Rs. 177.5
-----------------------------------------------------------------
Do you want more vehicle?
1)Yes
2)No
Enter (1/2): 
1
Select vehicle type:
1)Two seater vehicle
2)Four seater vehicle
3)Six seater vehicle
Enter your choice(1/2/3)
3
Six seater vehicle are available at the following locations:
0-Wakad
1-Esquare
2-Wipro
3-IBM
4-Infosys
5-TCS
Enter the location code of your preferred pick up location from the above code:
4
Select a vehicle drop loction:
0-Wakad
1-Esquare
2-Wipro
3-IBM
5-TCS
4
Invalid location code entered!
Please Re-enter:
2
Dispatched Vehicle:MH 16 KM 6543

Vehicle Booked Successfully!

----------------------------------------------------------------
______________________BILL_____________________

Vehicle Pickup Location: Infosys
Vehicle Drop Location: Wipro
Assigned Vehicle:-

Vehicle no.: MH 16 KM 6543
Colour: Black
Mileage: 16.0kmpl
Amount: Rs. 150.4
-----------------------------------------------------------------
Do you want more vehicle?
1)Yes
2)No
Enter (1/2): 
2
----------------SESSION ENDED-------------------
Session Details:

Order number:1
Vehicle: MH 12 AB 1001
Pickup Location: Wakad
Drop Location: Esquare

Order number:2
Vehicle: MH 12 BG 1031
Pickup Location: IBM
Drop Location: Wakad

Order number:3
Vehicle: MH 16 KM 6543
Pickup Location: Infosys
Drop Location: Wipro

Total session Amount= Rs. 374.4
-----------------------THANK YOU!------------------
*/
 