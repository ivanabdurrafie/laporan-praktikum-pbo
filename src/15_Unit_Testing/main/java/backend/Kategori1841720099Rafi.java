/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Ivan Abdurrafie
 */
import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720099Rafi {
    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720099Rafi() {
    }

    public Kategori1841720099Rafi(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdkategoriRafi() {
        return mIdkategori;
    }

    public void setmIdkategoriRafi(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganRafi() {
        return mKeterangan;
    }

    public void setmKeteranganRafi(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720099Rafi getByIdRafi(int id) {
        Kategori1841720099Rafi kat = new Kategori1841720099Rafi();
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720099Rafi();
                kat.setmIdkategoriRafi(rs.getInt("idkategori"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmKeteranganRafi(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720099Rafi> getAllRafi() {
        ArrayList<Kategori1841720099Rafi> ListKategori = new ArrayList<>();

        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720099Rafi kat = new Kategori1841720099Rafi();
                kat.setmIdkategoriRafi(rs.getInt("idkategori"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmKeteranganRafi(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720099Rafi> searchRafi(String keyword) {
        ArrayList<Kategori1841720099Rafi> ListKategori = new ArrayList<>();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi(sql);

        try {
            while (rs.next()) {
                Kategori1841720099Rafi kat = new Kategori1841720099Rafi();
                kat.setmIdkategoriRafi(rs.getInt("idkategori"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmKeteranganRafi(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveRafi() {
        if (getByIdRafi(mIdkategori).getmIdkategoriRafi() == 0) {
            String SQL = "INSERT INTO kategori (nama,keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdkategori = DBHelper1841720099Rafi.insertQueryGetIdRafi(SQL);
        } else {
            String SQL = "UPDATE kategori SET"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + "WHERE idKategori = '" + this.mIdkategori + "'";
            DBHelper1841720099Rafi.executeQueryRafi(SQL);
        }
    }

    public void deleteRafi() {
        String SQL = "DELETE FROM kategori WHERE idKategori = '" + this.mIdkategori + "'";
        DBHelper1841720099Rafi.executeQueryRafi(SQL);
    }

    ArrayList<Kategori1841720099Rafi> getByNamaAndKeteranganRafi(String mNamaRafi, String mKeteranganRafi) {
        ArrayList<Kategori1841720099Rafi> ListKategori = new ArrayList();
        ResultSet rs;
        if ((mNama.trim().length()>0) && (mKeterangan.trim().length()>0)){
            rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM kategori Where nama = '"+
            mNama +"' and keterangan = '"+ mKeterangan+"'");
        }else if ((mNama.trim().length()>0) && (mKeterangan.trim().length()==0)){
            rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM kategori Where nama = '"+
            mNama+"'");
        }else {
            rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM kategori Where keterangan = '"+ mKeterangan+"'");
        }
        try {
            while (rs.next()) {
                Kategori1841720099Rafi kat = new Kategori1841720099Rafi();
                kat.setmIdkategoriRafi(rs.getInt("idkategori"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmKeteranganRafi(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    }

