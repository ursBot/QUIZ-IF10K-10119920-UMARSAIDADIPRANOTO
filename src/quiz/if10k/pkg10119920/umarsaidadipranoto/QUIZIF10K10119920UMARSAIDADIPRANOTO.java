/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119920.umarsaidadipranoto;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class QUIZIF10K10119920UMARSAIDADIPRANOTO {

    
    public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
           Customer c = new Customer();
           ServicePrice s = new ServicePrice();
           
           String name, email, statusMember1;
           int serviceItem;
           boolean statusMember2;
           float price, sale, totalPay;
           
           System.out.println("====Program Kasir Rock n Roll Haircut====");
           System.out.print("Customer Name = ");
           name = input.nextLine();
           c.setName(name);
           
           System.out.print("Customer Email = ");
           email = input.next();
           c.setEmail(email);
           
           s.displayService();
           serviceItem = input.nextInt();
           s.getPrice(serviceItem);
           
           System.out.print("Are you Member (yes/no) : ");
           statusMember1 = input.next();
           s.checkMemberStatus(statusMember1);
           statusMember2 = s.checkMemberStatus(statusMember1);
           
           System.out.println();
           System.out.println();
           
           System.out.println("#*******************************#");
           System.out.println("#********CUSTOMER INVOICE*******#");
           c.currentTime();
           
           price = s.getPrice(serviceItem);
           System.out.print("Service Price : Rp." + price);
           System.out.println();
           
           sale = s.getSale(statusMember2,price);
           System.out.print("Discount : Rp." + sale);
           System.out.println();
           
           totalPay = s.getTotalPay(price,sale);
           System.out.print("Total Pay : Rp." + totalPay);
           System.out.println();
    }
}
