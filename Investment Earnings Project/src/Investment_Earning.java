/* Here are the requirements of this Mini Project

It should have the buying price per share

It should have the closing price on subsequent days

It should calculate the aggregate earnings/losses after each day

It should leave the program after a negative value is being inputted

 */

import java.util.Scanner;

import java.text.*;

public class Investment_Earning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your buying price per share : ");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true){
            System.out.println("Enter the closing price for day " + day +" (any negative value to leave : ");

            closingPrice = sc.nextDouble();
            if (closingPrice < 0.0){
                break;
            }
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0){
                System.out.println("After day "+ day +", you earned "+ df.format(earnings) +" per share ");
            }
            else if (earnings < 0.0){
                System.out.println("After day " + day + ", you lost "+ df.format(earnings) + " per share ");
            }
            else {
                System.out.println("After day "+ day + ", you have no earnings per share ");
            }
            day++;
        }
        sc.close();
    }
}


// Project idea is taken from the Begin Coding Fast YouTube channel but has been implemented by myself