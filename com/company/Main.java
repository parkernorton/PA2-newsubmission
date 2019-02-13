package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        String userChoice = "0";
        while (!userChoice.equals("3")) {
            userChoice = getMenuChoice(keyboard);
            switch(userChoice) {
                case "1":
                    CurrencyExchange();
                    break;
                case "2":
                    resturantPOS();
                    break;
                default:
                    if(!userChoice.equals("3")) System.out.println("Please enter a valid choice");
            }

    }


    }


    public static void resturantPOS(){
        double foodTotal = 0.0;
        double alcoholTotal = 0.0;
        double amountPaid;
        double foodTotalWTax;
        double foodTotalWTip;
        double alcoholTotalWTax;
        double totalAmountDue;
        double change;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter how much your food total was: ");
        foodTotal = keyboard.nextInt();
        System.out.println("Please enter how much your alcohol total was: ");
        alcoholTotal = keyboard.nextInt();
        foodTotalWTax = (foodTotal * .09) + foodTotal;
        foodTotalWTip = (foodTotalWTax * .18) + foodTotalWTax;
        alcoholTotalWTax = (alcoholTotal * .09) + alcoholTotal;
        totalAmountDue = alcoholTotalWTax + foodTotalWTip;
        System.out.println("The total amount due is " + totalAmountDue);
        System.out.println("Please enter the amount paid");
        amountPaid = keyboard.nextInt();
        change = amountPaid - totalAmountDue;

        if (amountPaid > totalAmountDue) {
            System.out.println("Your change is " + change);
        }
        else if (amountPaid == totalAmountDue) {
            System.out.println("Thanks have a great day!");
        }
        else if (amountPaid < totalAmountDue) {
            System.out.println("There is an error because you didn't pay enough");
        }




    }

    public static void CurrencyExchange() {
        Scanner keyboard = new Scanner(System.in);
        String choice = "0";
        System.out.println("Enter 1 to convert from US Dollars to Canadian Dollars");
        System.out.println("Enter 2 to convert from US Dollars to Euros");
        System.out.println("Enter 3 to convert from US Dollars to Indian Rupees");
        System.out.println("Enter 4 to convert from US Dollars to Japanese Yen");
        System.out.println("Enter 5 to convert from US Dollars to Mexican Pesos");
        System.out.println("Enter 6 to convert from US Dollars to British Pounds");
        System.out.println("Enter 7 to convert from Canadian Dollars to US Dollars");
        System.out.println("Enter 8 to convert from Euros to US Dollars");
        System.out.println("Enter 9 to convert from Indian Rupees to US Dollars");
        System.out.println("Enter 10 to convert from Japanese Yen to US Dollars");
        System.out.println("Enter 11 to convert from Mexican Pesos to US Dollars");
        System.out.println("Enter 12 to convert from British Pounds to US Dollars");


        double USDollars;
        double CanadianConverted;
        double EuroConverted;
        double IndianRupeeConverted;
        double JapaneseYenConverted;
        double MexicanPesosConverted;
        double BritishPoundsConverted;
        double canadianDollars;
        double usDollarsConverted;
        double euroDollars;
        double indianRupees;
        double japaneseYen;
        double mexicanPesos;
        double britishPounds;



        choice = keyboard.nextLine();

        switch (choice) {
            case "1":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                CanadianConverted = USDollars * .9813;
                System.out.println("The amount of money you have in Canadian Dollars is: " + CanadianConverted);
                break;
            case "2":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                EuroConverted = USDollars * .757;
                System.out.println("The amount of money you have in Euros is: " + EuroConverted);
                break;
            case "3":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                IndianRupeeConverted = USDollars * 52.53;
                System.out.println("The amount of money you have in Indian Rupees is: " + IndianRupeeConverted);
                break;
            case "4":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                JapaneseYenConverted = USDollars * 80.92;
                System.out.println("The amount of money you have in Japanese Yen is: " + JapaneseYenConverted);
                break;
            case "5":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                MexicanPesosConverted = USDollars * 13.1544;
                System.out.println("The amount of money you have in Mexican Pesos is: " + MexicanPesosConverted);
                break;
            case "6":
                System.out.println("How much money do you have in US dollars?");
                USDollars = keyboard.nextInt();
                BritishPoundsConverted = USDollars * .6178;
                System.out.println("The amount of money you have in British Pounds is: " + BritishPoundsConverted);
                break;
            case "7":
                System.out.println("How much money do you have in Canadian Dollars?");
                canadianDollars = keyboard.nextInt();
                usDollarsConverted = canadianDollars / .9813;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;
            case "8":
                System.out.println("How much money do you have in Euros?");
                euroDollars = keyboard.nextInt();
                usDollarsConverted = euroDollars / .757;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;
            case "9":
                System.out.println("How much money do you have in Indian Rupees?");
                indianRupees = keyboard.nextInt();
                usDollarsConverted = indianRupees / 52.53;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;
            case "10":
                System.out.println("How much money do you have in Japanese Yen?");
                japaneseYen = keyboard.nextInt();
                usDollarsConverted = japaneseYen / 80.92;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;
            case "11":
                System.out.println("How much money do you have in Mexican Pesos?");
                mexicanPesos = keyboard.nextInt();
                usDollarsConverted = mexicanPesos / 13.1544;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;
            case "12":
                System.out.println("How much money do you have in British Pounds?");
                britishPounds = keyboard.nextInt();
                usDollarsConverted = britishPounds / .6178;
                System.out.println("The amount of money you have in US Dollars is: " + usDollarsConverted);
                break;



        }






    }

    public static String getMenuChoice(Scanner keyboard) {
        String choice = "0";
        System.out.println("Enter 1 to convert currencies");
        System.out.println("Enter 2 for restaurant POS");
        System.out.println("Enter 3 to exit");

        choice = keyboard.nextLine();

        return choice;

    }



}
