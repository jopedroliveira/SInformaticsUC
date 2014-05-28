import java.util.Scanner;

public class avaliacao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean validation = true;
		boolean hour = false;
		boolean user = false;
		boolean pass = false;
		boolean wayr = false;
		String name_a = null;
		String name_b = null;
		String over_time_ = null;
		String left1_time = null;
		int num_a = 0;
		int num_b = 0;
		int num_c = 0;
		int num_d = 0;
		int ini_time_min = 0;
		int fin_time_min = 0;
		int fin_lota_lot = 0;
		int fin_lotb_lot = 0;


		int month = 0;
		int ini_time = 0;
		int fin_time = 0;
		int part_a = 0;
		int part_b = 0;
		int left_time = 0;
		int labor_time = 0;
		int over_time = 0;
		int minh_ini = 0;
		int minim_int = 0;
	


		// user data
		// first name validation
		/*System.out.print("\nInsert your first name: ");

		boolean namea_a = sc.hasNextLine();
		if(namea_a == true){
			name_a = sc.nextLine();
		}
		else{
			System.out.print("The name you inserted is not valid");
			validation = false;
		}

		// last name validation
		System.out.print("\nInsert your last name: ");

		boolean nameb_b = sc.hasNextLine();
		if(nameb_b==true){
			name_b = sc.nextLine();
		}
		else{
			System.out.print("Invalid name");
			validation = false;
		}
*/
		// month validation
		System.out.print("\nPlease insert the current month: ");
		boolean month_ = sc.hasNextInt();

		if(month_ == true){
			month = sc.nextInt();
			if(month>12 || month <1){
				System.out.print("\nInvalid mounth");
				validation = false;
			}
		}
		else{
			System.out.print("\nInvalid mounth");
			validation = false;
		}
		//user data


		// username autentication
		// num validation
		System.out.print("\nInsert 2 numerbs separated by ENTER: ");
		boolean numa_a = sc.hasNextInt();

		if(numa_a == true){
			num_a=sc.nextInt();
		}
		else{
			user = false;
		}

		boolean numb_b = sc.hasNextInt();
		if(numb_b == true){
			num_b = sc.nextInt();
		}
		else{
			user = false;
		}

		if((num_a + num_b) == 1 && num_b <((num_a+num_b)/2.) || (num_a+num_b) == 2 && num_b<((num_a+num_b)/2.) || (num_a+num_b) == 3 && num_b<((num_a+num_b)/2.) || (num_a+num_b) == 5 && num_b<((num_a+num_b)/2.) ){
			user = true;
		}
		else{
			user = false;
		}

		// password autentication
		// set autentication way
		System.out.print("\nInsert a validation way: \nTo use a number code, Press 1 \nTo use a password, Press 2\n ");
		int way = sc.nextInt();
		if(way == 1 || way == 2){
			wayr=true;
		}
		else{
			wayr = false;
			validation = false;
		}

		// code number
		if(way == 1){
			System.out.print("\nInsert 2 numbers separated by ENTER: \n");
			boolean numc_c = sc.hasNextInt();
			if(numc_c == true){
				num_c = sc.nextInt();
			}
			else{
				System.out.print("\nInvalid number");
				validation = false;
			}

			boolean numd_d = sc.hasNextInt();
			if(numd_d == true){
				num_d = sc.nextInt();
			}
			else{
				System.out.print("\nInvalid number");
				validation = false;
			}

			// code number validation
			if(num_c < 10 && num_d>10 && num_d<20){
				pass = true;
			}
			else{
				pass = false;
				validation = false;
			}
		}

		// password 
		else if(way == 2){
			System.out.print("\nInsert a password (lower case):\n");
			Scanner password = new Scanner(System.in);
			String passw_a = null;
			passw_a = password.nextLine();

			if(month%2 == 0 && passw_a.equals("roscas"+month) || month%2 != 0 && passw_a.equals("joaquim"+month)){
				pass = true;
			}
			else{
				pass = false;
				validation = false;
			}

		}

		// final message
		boolean run = false;
		if(user == true && pass ==true && validation == true){
			System.out.print("\n LogIn Sucessful");
			run = true;
		}
		else if(user == true && pass == false){
			System.out.print("\nInvalid Password");
			run = false;
		}
		else if(user == false && pass == true){
			System.out.print("\nInvalid Username");
			run = false;
		}
		else if(user==true && pass == true && validation ==false){
			System.out.print("\nSome error was ocurred");
		}
		else{
			System.out.print("\nInvelid Username and Password");
			run = false;
		}


		// Production control
		if(run == true && validation == true){
			// hour control - start
			System.out.print("\nInsert the initial time: ");
			Scanner timer = new Scanner(System.in);
			boolean time_a = timer.hasNextInt();
			if(time_a == true){
				ini_time = timer.nextInt();
				if(ini_time<1 || ini_time>24){
					System.out.print("\nInvalid hour");
					hour = false;
					validation = false;
				}
				else{
					hour = true;
				}
			}
			else{
				System.out.print("\nInvalid hour");
				hour=false;
				validation = false;
			}
			// hour control - end
			if(validation == true){
				System.out.print("\nInsert the final time: ");
				Scanner end = new Scanner(System.in);
				boolean time_b = end.hasNextInt();
				if(time_b == true){
					fin_time = end.nextInt();
					if(fin_time <= 0 || fin_time > 24){
						System.out.print("Invalid hour");
						hour = false;
						validation = false;
					}
					else{
						hour = true;
					}
				}		
				else{
					System.out.print("\nInvalid hour");
					hour=false;
					validation = false;
				}

				// lot control
				if(validation == true){
					System.out.print("\nInsert a number of Type A pieces");
					Scanner lota = new Scanner(System.in);
					boolean lot_a = lota.hasNextInt();
					if(lot_a == true){
						part_a = lota.nextInt();
						validation = true;
					}
					else{
						System.out.print("\nInvalid number");
						validation = false;
					}
				}

				if(validation == true){
					System.out.print("\nInsert a number of Type B pieces");
					Scanner lotb = new Scanner(System.in);
					boolean lot_b = lotb.hasNextInt();
					if(lot_b == true){
						part_b = lotb.nextInt();
						validation = true;
					}
					else{
						System.out.print("\nInvalid number");
						validation = false;
					}
				}

				else{
					System.out.print("\nSome erro was occured");
				}

				ini_time_min = ini_time*60;
				fin_time_min = fin_time*60;
				fin_lota_lot = part_a*75; //predicted time for Y pieces type a
				fin_lotb_lot = part_b*45; //predicted time for X pieces tybe b
				labor_time = (fin_time - ini_time)*60;


				//exceed time
				if(validation){
					// over time
					if(fin_lota_lot < labor_time || fin_lotb_lot < labor_time ){
						if(labor_time-fin_lota_lot < labor_time-fin_lotb_lot){
							over_time = labor_time - fin_lota_lot;
							System.out.print("\nIt has "+over_time+ "minutes more (because of type A pieces) "); 
						}
						else{
							over_time =  labor_time - fin_lotb_lot;
							System.out.print("\n Your Purchease can be executed. It has " +over_time+ "minutes more (because of type B pieces)");
						}
					}
				}
				if(validation){
					// time left
					if(fin_lota_lot-labor_time > 0 || fin_lotb_lot-labor_time > 0){
						if(fin_lota_lot-labor_time> 0 && fin_lotb_lot-labor_time < 0){ 
							left_time = fin_lota_lot-labor_time;
							System.out.print("\nIt left "+left_time+ "minutes (because of type A pieces)");
						}
						else if(fin_lotb_lot-labor_time>0 && fin_lota_lot-labor_time<0){
							left_time = fin_lotb_lot-labor_time;
							System.out.print("\nIt left "+left_time+ "minutes (because of type B pieces)");
						}
						else{
							if(fin_lota_lot-labor_time > fin_lotb_lot-labor_time){
								left_time = fin_lota_lot-labor_time;
								System.out.print("\nIt left "+left_time+ "minutes (because of type A pieces)");
							}
							else{
								left_time = fin_lotb_lot-labor_time;
								System.out.print("\nIt left "+left_time+ "minutes (because of type B pieces)");
							}
						}
					}
				}
			}
		}
	}
}
					