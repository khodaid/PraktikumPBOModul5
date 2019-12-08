/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajak;

/**
 *
 * @author praktikan
 */
public class pajak {
    // untuk menentukan besaran pajak
    public double pjk(String jabatan, double gaji)
    {
        double hasil = 0;
        switch (jabatan) {
            case "CEO":
                hasil = gaji * 0.1;
                break;
            case "CTO":
                hasil = gaji * 0.05;
                break;
            case "CFO":
                hasil = gaji * 0.03;
                break;
            default:
                break;
        }
        return  hasil;
    }
}
