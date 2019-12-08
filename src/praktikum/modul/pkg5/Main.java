/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg5;
import java.util.*;
/**
 *
 * @author praktikan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. input data");
            System.out.println("2. cetak tunjangan");
            System.out.println("3. exit");
            System.out.print("masukan nomor menu yang anda pilih : ");
            menu = in.nextInt();
            switch(menu)
            {
                case 1:
                    System.out.print("Nama      : ");
                    String name = in.next();
                    System.out.print("Jabatan   : ");
                    String jabatan = in.next();
                    System.out.print("Status    : ");
                    String status = in.next();
                    System.out.print("Gaji      : ");
                    int gaji = in.nextInt();
                    Controller.add(jabatan, status, name, gaji);
                    break;

                case 2:
                    System.out.print("masukan nama yang dicari  : ");
                    String cari = in.next();
                    Controller.cetak(cari);
                    break;
            }
        }while(menu>0 && menu<3);
    }
    
}
