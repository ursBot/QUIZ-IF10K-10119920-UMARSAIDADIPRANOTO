/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119920.umarsaidadipranoto;

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

public class ServicePrice implements ServiceItem{
    
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }

    @Override
    public void displayService(){
        
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3): ");
        
    }
    
    @Override
    public float getPrice(int serviceItem){
        
        switch (serviceItem) {
            case 1:
                priceService = 45000;
                /*System.out.print("Rp.45000.0");*/
                break;
            case 2:
                priceService = 55000;
                /*System.out.print("Rp.55000.0");*/
                break;
            case 3:
                priceService = 15000;
                /*System.out.print("Rp.15000.0");*/
                break;
            default:
                System.out.print("SALAH");
                break;
        }
        
        return priceService;
    }
    
    @Override
    public boolean checkMemberStatus(String statusMember){
        boolean isMember;
        
        if ( statusMember == "yes" ) {
            isMember = true;
        } else {
            isMember = false;
        }
        
        return isMember;
    }
    
    @Override
    public float getSale(boolean isMember, float parServicePrice){
        
        if ( isMember == true ) {
            discount = (float) (priceService * 10);
        } else {
            discount = 0;
        }
        
        return discount;
    }
    
    public float getTotalPay(float priceService, float discount){
        
        return priceService - discount;
    }
}
