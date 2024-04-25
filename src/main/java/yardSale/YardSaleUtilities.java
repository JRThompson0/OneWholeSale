package yardSale;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class YardSaleUtilities
{
    public static void yardSaleWholeSale(String productName, double negotiatedPrice, int qty)
    {

        System.out.println("Name \t\tQty\t\t\tPrice\t\tTotal");
        String singlePriceString = "$"+String.format("%,.2f",negotiatedPrice);
        System.out.println("----\t\t-----\t\t-----\t\t-----");
        double totalPrice = negotiatedPrice*qty;
        String totalPriceString = "$"+String.format("%,.2f",totalPrice);
        System.out.println(productName+"\t\t"+qty+"\t\t\t"+singlePriceString+"\t\t"+totalPriceString);
        System.out.println();
        System.out.println("\t\tThank you, come again!");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("purchased on: "+dtf.format(now));
    }
    public static void main(String[] args)
    {
        yardSaleWholeSale("Rice",2.00,3);
    }
}
