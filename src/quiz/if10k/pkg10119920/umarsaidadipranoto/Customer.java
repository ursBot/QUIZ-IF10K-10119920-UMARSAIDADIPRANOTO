/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119920.umarsaidadipranoto;

import java.util.Calendar;
import java.util.GregorianCalendar;

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

public class Customer extends ServicePrice implements CustomerInvoice{
    
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean isMember(){
        return true;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    @Override
    public String currentTime(){
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        
        GregorianCalendar date = new GregorianCalendar();
        
        String namabulan[] = {"Jan", "Feb", "Mar", "Apr", "Mei", "Juni", "Juli", "Aug", "Sept", "Okt", "Nov", "Des"};
        String namahari[] = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_WEEK);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Date Transaction : " + namahari[hari - 1] + ", " + tanggal + " "+ namabulan[bulan] + " " + tahun + " " + jam + ":" + menit + ":" + detik);
        return null;
    }
    
}
