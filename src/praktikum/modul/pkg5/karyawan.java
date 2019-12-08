/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg5;
import pajak.pajak;
/**
 *
 * @author praktikan
 */
public class karyawan extends bonus{
    private String jabatan;
    private String status;
    private String nama;
    private int gaji;
    pajak pajak = new pajak();
    
    public void karyawan()
    {
        
    }

    public karyawan(String jabatan, String status, String nama, int gaji) {
        this.jabatan = jabatan;
        this.status = status;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    
    @Override
    public double tunjangan(String status) {
        double hasil = 0;
        try{
            if(status.equals("BM"))//belum menikah
            {
                hasil = getGaji();
            }
            else if (status.equals("SM"))//sudah menikah
            {
                hasil = getGaji()+(getGaji()*0.05);
            }
            else if (status.equals("MA"))//memiliki 
            {
                hasil =  getGaji()+(getGaji()*0.2);
            }
        
        }catch(Exception ex){
            System.out.println("perhitungan salah");
        }
        return hasil;
    }
    
    public double hasil(String jabatan, String status)
    {
        double hasil = 0;
        hasil = tunjangan(status) - pajak.pjk(jabatan, tunjangan(status));
        return hasil;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
