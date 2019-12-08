/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg5;
import java.util.*;

/**
 *
 * @author khoirul-06990
 */
public class Controller {
    
    static ArrayList<karyawan> k = new ArrayList<>();
    
    public static void cetak(String nama)
    {
        int i = 0;
        while(!k.get(i).getNama().equals(nama))
        {
            i++;
        }
        if(k.get(i).getNama().equals(nama))
        {
            double hasil = k.get(i).hasil(k.get(i).getJabatan(), k.get(i).getStatus());
            System.out.println(hasil);
        }
    }
    
    public static void add(String jabatan, String status, String nama, int gaji)
    {
        k.add(new karyawan(jabatan, status, nama, gaji));
    }
}
