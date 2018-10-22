/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA  :Alvin Lukman Nulhakim
 * NIM   :10117095    
 * KELAS :IF-3
 */
public class Cetak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        Printer objP = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        objP.setNama(scan1.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        objP.setJmlCetak(scan2.nextInt());
        objP.cetak(objP.getNama());
        System.out.println("Hasil Cetak : ");
        objP.cetak(objP.getJmlCetak(), objP.getNama());
        
    }
    
}
