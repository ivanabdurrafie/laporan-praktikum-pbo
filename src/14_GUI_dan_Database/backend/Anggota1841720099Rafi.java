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

public class Anggota1841720099Rafi {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720099Rafi() {
    }

    public Anggota1841720099Rafi(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaRafi() {
        return mIdAnggota;
    }

    public void setmIdAnggotaRafi(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmNamaRafi() {
        return mNama;
    }

    public void setmNamaRafi(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatRafi() {
        return mAlamat;
    }

    public void setmAlamatRafi(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTeleponRafi() {
        return mTelepon;
    }

    public void setmTeleponRafi(String mTelepon) {
        this.mTelepon = mTelepon;
    }    

    
    public Anggota1841720099Rafi getByIdRafi(int id) {
        Anggota1841720099Rafi kat = new Anggota1841720099Rafi();
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Anggota1841720099Rafi();
                kat.setmIdAnggotaRafi(rs.getInt("idanggota"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmAlamatRafi(rs.getString("alamat"));
                kat.setmTeleponRafi(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Anggota1841720099Rafi> getAllRafi() {
        ArrayList<Anggota1841720099Rafi> ListKategori = new ArrayList<>();

        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720099Rafi kat = new Anggota1841720099Rafi();
                kat.setmIdAnggotaRafi(rs.getInt("idanggota"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmAlamatRafi(rs.getString("alamat"));
                kat.setmTeleponRafi(rs.getString("telepon"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Anggota1841720099Rafi> searchRafi(String keyword) {
        ArrayList<Anggota1841720099Rafi> ListKategori = new ArrayList<>();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi(sql);

        try {
            while (rs.next()) {
                Anggota1841720099Rafi kat = new Anggota1841720099Rafi();
                kat.setmIdAnggotaRafi(rs.getInt("idanggota"));
                kat.setmNamaRafi(rs.getString("nama"));
                kat.setmAlamatRafi(rs.getString("alamat"));
                kat.setmTeleponRafi(rs.getString("telepon"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveRafi() {
        if (getByIdRafi(mIdAnggota).getmIdAnggotaRafi()== 0) {
            String SQL = "INSERT INTO anggota (nama,alamat,telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720099Rafi.insertQueryGetIdRafi(SQL);
        } else {
            String SQL = "UPDATE anggota SET"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + "WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720099Rafi.executeQueryRafi(SQL);
        }
    }

    public void deleteRafi() {
        String SQL = "DELETE FROM buku WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720099Rafi.executeQueryRafi(SQL);
    }
}
