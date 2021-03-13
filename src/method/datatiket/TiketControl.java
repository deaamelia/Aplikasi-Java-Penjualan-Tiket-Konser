/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.datatiket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class TiketControl {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;
    
    public TiketControl(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtiket","root","");
            st=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi database gagl, Terjadi kesalahan pada : \n"+e);
        }
    
    }
    
  public List tampil(){
      List LogTiket = new ArrayList();
      sql="select kode_tiket, nama_tiket, satuan, jumlah_stok, harga_kontrak, harga_beli from tbdatatiket order by idtiket asc";
      try {
          rs = st.executeQuery(sql);
          while (rs.next()){
              DataTiket Dt = new DataTiket();
              Dt.setKodetiket(rs.getString("kode_tiket"));
              Dt.setNmtiket(rs.getString("nama_tiket"));
              Dt.setsatuan(rs.getString("satuan"));
              Dt.setJmlstok(rs.getInt("jumlah_stok"));
              Dt.setHrgkontrak(rs.getInt("harga_kontrak"));
              Dt.setHrgbeli(rs.getInt("harga_beli"));
              LogTiket.add(Dt);
          }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada : \n"+e);
      } 
     return LogTiket; 
  }     
  
  public int tambahtiket(DataTiket e){
      sql ="insert into tbdatatiket (kode_tiket, nama_tiket, satuan, jumlah_stok, harga_kontrak, harga_beli) values('"+
      e.getKodetiket()+"','"+e.getNmtiket()+"','"+e.getSatuan()+"','"+e.getJmlstok()+"','"+e.getHrgkontrak()+"','"+e.getHrgbeli()+"')";
      int hasil=0;
      try {
          hasil=st.executeUpdate(sql);
          
      } catch (Exception a) {
          JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada : \n"+e);
      }
      return hasil;
            
              
  }

  public int editTiket(DataTiket e){
      sql="update tbtiket set nama_tiket='"+e.getNmtiket()+"',satuan'"+e.getSatuan()
              +"',jumlah_stok'"+e.getJmlstok()+"'";
      int hasil=0;
      try {
          hasil =st.executeUpdate(sql);
          
      } catch (Exception a) {
          JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada : \n"+a);
      }
      return hasil;
  }
  
}
