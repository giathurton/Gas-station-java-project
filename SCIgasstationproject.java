//Created by Gia Thurton

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class SCIGasStation
{
	public static void main (String [] args) {

		part1();
	}
	
	public static void part1() {
		while(true) {
		System.out.println("Hello, Welcome to SCI Gas Station!!!");
		System.out.println("\nPlease choose your service: \n \t 1) Gas only \n \t 2) Gas with car wash (10c off per gallon up to 15 gallons) \n \t 3) Exit ");
		Scanner inScan = new Scanner(System.in);
		int userchoice= inScan.nextInt();
		while(userchoice > 3 || userchoice <1) {
			System.out.println("Invalid option!");
			System.out.println("\nPlease choose your service: \n \t 1) Gas only \n \t 2) Gas with car wash (10c off per gallon up to 15 gallons) \n \t 3) Exit ");
			inScan = new Scanner(System.in);
			userchoice= inScan.nextInt();
		}
		if (userchoice==1) {
			gasonly();
			
		}
		if (userchoice==2) {
			carwash();
			
		}
		if(userchoice==3) {
			System.out.println("Goodbye");
			System.exit(0);
		}
		break;
		}
		}
		
		public static int gasonly(){
			System.out.println("Please select a gasoline type: \n \t 1) 87 ($2.59 per gallon)\n \t 2) 89 ($2.69 per gallon) \n \t 3) 91 ($2.84 per gallon) \n \t 4) 94 ($2.99 per gallon) \n \t 5) Cancel");
			Scanner inScan = new Scanner(System.in);
			inScan = new Scanner(System.in);
			int gaschoice = inScan.nextInt();
			while(gaschoice<1 || gaschoice>5) {
				System.out.println("Invalid option!");
				System.out.println("Please select a gasoline type: \n \t 1) 87 ($2.59 per gallon)\n \t 2) 89 ($2.69 per gallon) \n \t 3) 91 ($2.84 per gallon) \n \t 4) 94 ($2.99 per gallon) \n \t 5) Cancel");
				gaschoice = inScan.nextInt();
			}
			
			if(gaschoice==5) {
				part1();

			}
			confirmation(gaschoice);
			return (gaschoice);
			
		}
		public static double[] carwash(){
			Scanner inScan = new Scanner(System.in);
			inScan = new Scanner(System.in);
			System.out.println("Please select a type of car wash: \n \t 1) Basic ($5.00) \n \t 2) Shine ($7.00) \n \t 3) Deluxe ($9.00) \n \t 4) Premium ($11.00) \n \t 5) Cancel");
			double[] carwash = new double[2];
		carwash[0]= inScan.nextInt();
		while(carwash[0]<1 || carwash[0]>5) {
			System.out.println("Invalid option!");
			System.out.println("Please select a type of car wash: \n \t 1) Basic ($5.00) \n \t 2) Shine ($7.00) \n \t 3) Deluxe ($9.00) \n \t 4) Premium ($11.00) \n \t 5) Cancel");
			carwash[0] = inScan.nextInt();
		}
		if(carwash[0]==5) {
			part1();
		}
		System.out.println("Please select a gasoline type: \n \t 1) 87 ($2.59 per up to 15 gallons)\n \t 2) 89 ($2.69 per up to 15 gallons) \n \t 3) 91 ($2.84 per up to 15 gallons) \n \t 4) 94 ($2.99 per up to 15 gallons) \n \t 5) Cancel");
			carwash[1] = inScan.nextInt();
			while(carwash[1]<1 || carwash[1]>5) {
				System.out.println("Invalid option!");
				System.out.println("Please select a gasoline type: \n \t 1) 87 ($2.59 per up to 15 gallons)\n \t 2) 89 ($2.69 per up to 15 gallons) \n \t 3) 91 ($2.84 per up to 15 gallons) \n \t 4) 94 ($2.99 per up to 15 gallons) \n \t 5) Cancel");
				carwash[1] = inScan.nextInt();
			}
			carconfirmation(carwash);
			return(carwash);
			
			}
		
		public static int confirmation(int gaschoice) {
			System.out.println("Your order is as follows: ");
			if (gaschoice==1) {
			System.out.println("\t 1. A full tank of gas 87 ($2.59 per gallon)");}
			if(gaschoice==2) {
				System.out.println("\t 1. A full tank of gas 89 ($2.69 per gallon");
			}
			if(gaschoice==3) {
				System.out.println("\t 1. A full tank of gas 91 ($2.84 per gallon");
			}
			if(gaschoice==4) {
				System.out.println("\t 1. A full tank of gas 94 ($2.99 per gallon");
			}
			System.out.println("Confirm your order? (y/n)");
			Scanner inScan = new Scanner(System.in);
			String userinput = inScan.nextLine();
			if (userinput.equalsIgnoreCase("y")) {
				fillup1(gaschoice);
			}
			else if (userinput.equalsIgnoreCase("n")) {
				part1();
			}
			if (!userinput.equalsIgnoreCase("y") || !userinput.equalsIgnoreCase("n")) {

				while(!inScan.nextLine().equalsIgnoreCase("y") || !inScan.nextLine().equalsIgnoreCase("n")) {
					System.out.println("Invalid Choice \n Confirm your order? (y/n)");
					if (userinput.equalsIgnoreCase("y")) {
						fillup1(gaschoice);
					}
					else if (userinput.equalsIgnoreCase("n")) {
						part1();
					}
				}
			}
			return(gaschoice);
		}
		public static double[] carconfirmation(double[] carwash) {
			System.out.println("Your order is as follows: ");
			if(carwash[0]==1 && carwash[1]==1) {
				System.out.println("\t 1. A full tank of gas 87 ($2.49 per up to 15 gallons)");
				System.out.println("\t 2. Basic car wash ($5.00)");
			}
			
			if(carwash[0]==1 && carwash[1]==2) {
				System.out.println("\t 1. A full tank of gas 89 ($2.59 per up to 15 gallons)");
				System.out.println("\t 2. Basic car wash ($5.00)");
			}	
			if(carwash[0]==1 && carwash[1]==3) {
				System.out.println("\t 1. A full tank of gas 91 ($2.74 per up to 15 gallons)");
				System.out.println("\t 2. Basic car wash ($5.00)");
			}
			if(carwash[0]==1 && carwash[1]==4) {
				System.out.println("\t 1. A full tank of gas 94 ($2.89 per up to 15 gallons)");
				System.out.println("\t 2. Basic car wash ($5.00)");
			}
			if(carwash[0]==2 && carwash[1]==1) {
				System.out.println("\t 1. A full tank of gas 87 ($2.49 per up to 15 gallons)");
				System.out.println("\t 2. Shine car wash ($7.00)");
			}
			if(carwash[0]==2 && carwash[1]==2) {
				System.out.println("\t 1. A full tank of gas 89 ($2.59 per up to 15 gallons)");
				System.out.println("\t 2. Shine car wash ($7.00)");
			}
			if(carwash[0]==2 && carwash[1]==3) {
				System.out.println("\t 1. A full tank of gas 91 ($2.74 per up to 15 gallons)");
				System.out.println("\t 2. Shine car wash ($7.00)");
			}
			if(carwash[0]==2 && carwash[1]==4) {
				System.out.println("\t 1. A full tank of gas 94 ($2.89 per up to 15 gallons)");
				System.out.println("\t 2. Shine car wash ($7.00)");
			}
			if(carwash[0]==3 && carwash[1]==1) {
				System.out.println("\t 1. A full tank of gas 87 ($2.49 per up to 15 gallons)");
				System.out.println("\t 2. Deluxe car wash ($9.00)");
			}
			if(carwash[0]==3 && carwash[1]==2) {
				System.out.println("\t 1. A full tank of gas 89 ($2.59 per up to 15 gallons)");
				System.out.println("\t 2. Deluxe car wash ($9.00)");
			}
			if(carwash[0]==3 && carwash[1]==3) {
				System.out.println("\t 1. A full tank of gas 91 ($2.74 per up to 15 gallons)");
				System.out.println("\t 2. Deluxe car wash ($9.00)");
			}
			if(carwash[0]==3 && carwash[1]==4) {
				System.out.println("\t 1. A full tank of gas 94 ($2.89 per up to 15 gallons)");
				System.out.println("\t 2. Deluxe car wash ($9.00)");
			}
			if(carwash[0]==4 && carwash[1]==1) {
				System.out.println("\t 1. A full tank of gas 87 ($2.49 per up to 15 gallons)");
				System.out.println("\t 2. Premium car wash ($11.00)");
			}
			if(carwash[0]==4 && carwash[1]==2) {
				System.out.println("\t 1. A full tank of gas 89 ($2.59 per up to 15 gallons)");
				System.out.println("\t 2. Premium car wash ($11.00)");
			}
			if(carwash[0]==4 && carwash[1]==3) {
				System.out.println("\t 1. A full tank of gas 91 ($2.74 per up to 15 gallons)");
				System.out.println("\t 2. Premium car wash ($11.00)");
			}
			if(carwash[0]==4 && carwash[1]==4) {
				System.out.println("\t 1. A full tank of gas 87 ($2.89 per up to 15 gallons)");
				System.out.println("\t 2. Premium car wash ($11.00)");
			}
			System.out.println("Confirm your order? (y/n)");
			Scanner inScan = new Scanner(System.in);
			String userinput = inScan.nextLine();
			if (userinput.equalsIgnoreCase("y")) {
				fillup2(carwash);
			}
			else if (userinput.equalsIgnoreCase("n")) {
				part1();
			}
			if (!userinput.equalsIgnoreCase("y") || !userinput.equalsIgnoreCase("n")) {

				while(!inScan.nextLine().equalsIgnoreCase("y") || !inScan.nextLine().equalsIgnoreCase("n")) {
					System.out.println("Invalid Choice \n Confirm your order? (y/n)");
					if (userinput.equalsIgnoreCase("y")) {
						fillup2(carwash);
					}
					else if (userinput.equalsIgnoreCase("n")) {
						part1();
					}
				}
		}
			return(carwash);
		}

	public static double fillup1 (double gaschoice) {
		double min= 10.0;
		double max = 20.0;
		Random rand= new Random();
		double aRandomNumber= min + (max-min) * rand.nextDouble();
		System.out.printf("It took %.2f gallons to fill up your car.", aRandomNumber);
		if (gaschoice==1) {
			double fortotal = 2.59;
			gaschoice = fortotal;
		
		}
		if (gaschoice==2) {
			double fortotal = 2.69;
			gaschoice = fortotal;
			
			
		}
		if (gaschoice==3) {
			double fortotal = 2.84;
			gaschoice = fortotal;
			
		}
		if (gaschoice==4) {
			double fortotal = 2.99;
			gaschoice = fortotal;
			
		}
		double total = aRandomNumber * gaschoice;
		System.out.printf("\nYour total is: $%.2f",total);
		payment1(total);
		return(total);
	}
	
	public static double fillup2(double[] carwash) {
		double min= 10.0;
		double max = 20.0;
		Random rand= new Random();
		double aRandomNumber= min + (max-min) * rand.nextDouble();
		System.out.printf("It took %.2f gallons to fill up your car.", aRandomNumber);
		if(carwash[0]==1 && carwash[1]==1) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 5.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==1 && carwash[1]==2) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 5.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==1 && carwash[1]==3) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 5.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==1 && carwash[1]==4) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 5.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==2 && carwash[1]==1) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 7.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==2 && carwash[1]==2) {
			double fortotal = 2.59;
			carwash[1] = fortotal;
			double fortotal2= 7.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==2 && carwash[1]==3) {
			double fortotal = 2.74;
			carwash[1] = fortotal;
			double fortotal2= 7.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==2 && carwash[1]==4) {
			double fortotal = 2.89;
			carwash[1] = fortotal;
			double fortotal2= 7.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==3 && carwash[1]==1) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 9.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==3 && carwash[1]==2) {
			double fortotal = 2.59;
			carwash[1] = fortotal;
			double fortotal2= 9.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==3 && carwash[1]==3) {
			double fortotal = 2.74;
			carwash[1] = fortotal;
			double fortotal2= 9.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==3 && carwash[1]==4) {
			double fortotal = 2.89;
			carwash[1] = fortotal;
			double fortotal2= 9.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==4 && carwash[1]==1) {
			double fortotal = 2.49;
			carwash[1] = fortotal;
			double fortotal2= 11.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==4 && carwash[1]==2) {
			double fortotal = 2.59;
			carwash[1] = fortotal;
			double fortotal2= 11.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==4 && carwash[1]==3) {
			double fortotal = 2.74;
			carwash[1] = fortotal;
			double fortotal2= 11.00;
			carwash[0] = fortotal2;
		}
		if(carwash[0]==4 && carwash[1]==4) {
			double fortotal = 2.89;
			carwash[1] = fortotal;
			double fortotal2= 11.00;
			carwash[0] = fortotal2;
		}
		double total1 = (aRandomNumber * carwash[1]) + carwash[0];
		System.out.printf("\nYour total is: $%.2f",total1);
		payment(total1);
		return(total1);
		
	}
	
	public static double payment1(double total) {
		System.out.println("\nPlease enter a payment amount in the following format:");
		System.out.println("\t<amount><space><type>");
		System.out.println("\t   where <amount> is an integer");
		System.out.println("\t         <space> is a blank space");
		System.out.println("\t         <type> is either 20s, 10s, 5s, or 1s");
		System.out.println("\tYou may enter as many times as you like. Each entry will be added to your total until sufficient funds have been obtained.");
		
		double cashin=0;
		double theamount=0;
		double paid = theamount*cashin;
		double overalltotal=total;
		
		double difference = 0;
		while( difference>=0) {
		System.out.println("Enter your payment: ");
		Scanner scanner = new Scanner(System.in);
		String amount = scanner.next();
		String input = scanner.next();
		
		
		if(input.equals("10s")) {
			input="10";
		 cashin=Double.parseDouble(input);
		 theamount=Double.parseDouble(amount);
	
		}
		if(input.equals("20s")) {
			input="20";
			cashin=Double.parseDouble(input);
			theamount=Double.parseDouble(amount);
		}
		if(input.equals("5s")) {
			input="5";
			 cashin=Double.parseDouble(input);
			 theamount=Double.parseDouble(amount);
		}
		if(input.equals("1s")) {
			input="1";
			 cashin=Double.parseDouble(input);
			 theamount=Double.parseDouble(amount);
		}
		
		
		paid = theamount*cashin;
		
		difference = total - paid;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		
		if(difference>0) {
			System.out.println("You have added $" + paid + " to your total.");
			System.out.println("You have paid $" +df.format(paid)+" out of $" + df.format(overalltotal));
			System.out.println("You still owe $" +df.format(difference));
		}
		total=total-paid;
		
		
		}
		DecimalFormat df = new DecimalFormat("#.##");
		if(difference<0) {
			difference = Math.abs(difference);
			total=Math.abs(total);
			System.out.println("You have paid $" + paid +" out of $" + df.format(overalltotal));
			System.out.println("Your change is $" +df.format(difference));
		}
		change(difference);
		return(difference);
	}
	
	public static double payment(double total1) {
		System.out.println("\nPlease enter a payment amount in the following format:");
		System.out.println("\t<amount><space><type>");
		System.out.println("\t   where <amount> is an integer");
		System.out.println("\t         <space> is a blank space");
		System.out.println("\t         <type> is either 20s, 10s, 5s, or 1s");
		System.out.println("\tYou may enter as many times as you like. Each entry will be added to your total until sufficient funds have been obtained.");
		
		double cashin=0;
		double theamount=0;
		double paid = theamount*cashin;
		double overalltotal=total1;
		
		double difference = 0;
		while( difference>=0) {
		System.out.println("Enter your payment: ");
		Scanner scanner = new Scanner(System.in);
		String amount = scanner.next();
		String input = scanner.next();
		
		
		if(input.equals("10s")) {
			input="10";
		 cashin=Double.parseDouble(input);
		 theamount=Double.parseDouble(amount);
	
		}
		if(input.equals("20s")) {
			input="20";
			cashin=Double.parseDouble(input);
			theamount=Double.parseDouble(amount);
		}
		if(input.equals("5s")) {
			input="5";
			 cashin=Double.parseDouble(input);
			 theamount=Double.parseDouble(amount);
		}
		if(input.equals("1s")) {
			input="1";
			 cashin=Double.parseDouble(input);
			 theamount=Double.parseDouble(amount);
		}
		
		
		paid = theamount*cashin;
		difference = total1 - paid;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		if(difference>0) {
			System.out.println("You have added $" + paid + " to your total.");
			System.out.println("You have paid $" +df.format(paid)+" out of $" + df.format(overalltotal));
			System.out.println("You still owe $" +df.format(difference));
		}
		total1=total1-paid;
		
		
		}
		DecimalFormat df = new DecimalFormat("#.##");
		if(difference<0) {
			difference = Math.abs(difference);
			total1=Math.abs(total1);
			System.out.println("You have paid $" + paid +" out of $" + df.format(overalltotal));
			System.out.println("Your change is $" +df.format(difference));
		}
		change(difference);
		return(difference);
		}		
	
public static void change(double difference) {
	double userval= difference;
	 if (userval!=0 && (int)userval/20!=1 && (int)userval/20!=0 ) {
	 System.out.println( (int)userval/20 + " twenty dollar bills");
	 }
	 if (userval!=0 && (int)userval/20==0 && (int)userval/20!=0) {
		 System.out.println( (int)userval/20 + " twenty dollar bill");
		 }
	 
	    userval=userval-(20*((int)userval/20));
	    
	    if (userval!=0 && (int)userval/10!=1 && (int)userval/10!=0) {
	    System.out.println( (int)userval/10 + " ten dollar bills");
	    }
	    if (userval!=0 && (int)userval/10==1 && (int)userval/10!=0) {
		    System.out.println( (int)userval/10 + " ten dollar bill");
		    }
	    
	    userval=userval-(10*((int)userval/10));
	    
	    if (userval!=0 && (int)userval/5!=1 && (int)userval/5!=0) {
	    System.out.println( (int)userval/5 + " five dollar bills");
	    }
	    if (userval!=0 && (int)userval/5==1 && (int)userval/5!=0) {
		    System.out.println( (int)userval/5 + " five dollar bill");
		    }
	    
	    userval=userval-(5*(int)(userval/5));
	    
	    if (userval!=0 && (int)userval!=1 && (int)userval!=0) {
	    System.out.println((int)userval + " one dollar bills");
	    }
	    if (userval!=0 && (int)userval==1 && (int)userval==0) {
		    System.out.println((int)userval + " one dollar bill");
		    }
	    
	    userval=userval-(1*((int)userval/1));
	    
	    if (userval!=0 && (int)userval/.25!=1 ) {
	    System.out.println((int)(userval/.25) + " quarters");
	    }
	    if (userval!=0 && (int)userval/.25==1 ) {
		    System.out.println((int)(userval/.25) + " quarter");
		    }
	    
	    userval=userval-(.25*((int)(userval/.25)));

	    if (userval!=0 && (int)userval/.10!=1 ) {
	    System.out.println((int)(userval/.10)+ " dimes");
	    }
	    if (userval!=0 && (int)userval/.10==1 ) {
		    System.out.println((int)(userval/.10)+ " dime");
		    }
	    
	    userval=userval-(.10*((int)(userval/.10)));
	    
	    if (userval!=0 && (int)userval/.05!=1 ) {
	    System.out.println((int)(userval/.05)+" nickles, and");
	    }
	    if (userval!=0 && (int)userval/.05==1) {
		    System.out.println((int)(userval/.05)+" nickle, and");
		    }
	    
	    userval=userval-(.05*((int)(userval/.05)));
	    
	    if (userval!=0 && (Math.round(userval/.01))!=1) {
	    System.out.println(Math.round(userval/.01) + " pennies");
	    }
	    if (userval!=0 && (Math.round(userval/.01))==1 ) {
		    System.out.println(Math.round(userval/.01) + " penny");
		    }
	    System.out.println("Thank you for shopping at SCI gas station\n");
	    part1();
}
}