/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.datatiket;

/**
 *
 * @author ASUS
 */
public class DataTiket {
    public String kode_tiket, nama_tiket, satuan;
    public int jumlah_stok, harga_kontrak, harga_beli;

    public String getKodetiket(){
        return kode_tiket;
 
    }
    
    public void setKodetiket(String kode_tiket){
        this.kode_tiket = kode_tiket;
    }
    
    public String getNmtiket(){
        return nama_tiket;
    }
    
    public void setNmtiket(String nama_tiket){
        this.nama_tiket = nama_tiket;
    }
    
     public String getSatuan(){
        return satuan;
    }
    
      public void setsatuan(String satuan){
        this.satuan = satuan;
    }
    
     public int getJmlstok(){
        return jumlah_stok;
    }
    
      public void setJmlstok(int jumlah_stok){
        this.jumlah_stok = jumlah_stok;
    }
      
    public int getHrgkontrak(){
        return harga_kontrak;
    }
    
      public void setHrgkontrak(int harga_kontrak){
        this.harga_kontrak = harga_kontrak;
    }
    
      public int getHrgbeli(){
        return harga_beli;
    }
    
      public void setHrgbeli(int harga_beli){
        this.harga_beli = harga_beli;
    }
}
