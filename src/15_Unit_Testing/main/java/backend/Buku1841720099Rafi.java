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

public class Buku1841720099Rafi {
    private int mIdBuku;
    private Kategori1841720099Rafi mKategori = new Kategori1841720099Rafi();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720099Rafi() {
    }

    public Buku1841720099Rafi(Kategori1841720099Rafi mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getmIdBuku() {
        return mIdBuku;
    }

    public void setmIdBuku(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720099Rafi getmKategori() {
        return mKategori;
    }

    public void setmKategori(Kategori1841720099Rafi mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudul() {
        return mJudul;
    }

    public void setmJudul(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbit() {
        return mPenerbit;
    }

    public void setmPenerbit(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulis() {
        return mPenulis;
    }

    public void setmPenulis(String mPenulis) {
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720099Rafi getByIdRafi(int id) {
        Buku1841720099Rafi buku = new Buku1841720099Rafi();
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT b.idbuku,b.idkategori,c.nama,c.keterangan,b.judul,b.penerbit,b.penulis  FROM buku b left outer join kategori c on b.idkategori = c.idkategori " + " WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720099Rafi();
                buku.setmIdBuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategoriRafi(rs.getInt("idkategori"));
                buku.getmKategori().setmNamaRafi(rs.getString("nama"));
                buku.getmKategori().setmKeteranganRafi(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720099Rafi> getAllRafi() {
        ArrayList<Buku1841720099Rafi> ListKategori = new ArrayList<>();

       ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul, "
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Buku1841720099Rafi buku = new Buku1841720099Rafi();
                buku.setmIdBuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategoriRafi(rs.getInt("idkategori"));
                buku.getmKategori().setmNamaRafi(rs.getString("nama"));
                buku.getmKategori().setmKeteranganRafi(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));

                ListKategori.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Buku1841720099Rafi> searchRafi(String keyword) {
        ArrayList<Buku1841720099Rafi> ListKategori = new ArrayList<>();

        String sql = "SELECT b.idbuku,c.idkategori,c.nama,c.keterangan,b.judul,b.penerbit,b.penulis "
                + "FROM buku b left outer join kategori c on b.idkategori = c.idkategori "
                + "WHERE " + " b.judul LIKE '%" + keyword + "%' " + " OR b.penerbit LIKE '%" + keyword + "%'"
                + " OR b.penulis LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi(sql);

        try {
            while (rs.next()) {
                Buku1841720099Rafi buku = new Buku1841720099Rafi();
                buku.setmIdBuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategoriRafi(rs.getInt("idkategori"));
                buku.getmKategori().setmNamaRafi(rs.getString("nama"));
                buku.getmKategori().setmKeteranganRafi(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));

                ListKategori.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveRafi() {
        if (getByIdRafi(mIdBuku).getmIdBuku()== 0) {
            String SQL = "INSERT INTO buku (idkategori, judul, penulis, penerbit) VALUES("
                    + " '" + this.getmKategori().getmIdkategoriRafi()+ "', "
                    + " '" + this.mJudul + "', "
                    + " '" + this.mPenulis + "', "
                    + " '" + this.mPenerbit + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720099Rafi.insertQueryGetIdRafi(SQL);
        } else {
            String SQL = "UPDATE buku SET"
                    + " idkategori = '" + this.getmKategori().getmIdkategoriRafi()+ "', "
                    + " judul = '" + this.mJudul + "', "
                    + " penulis = '" + this.mPenulis + "', "
                    + " penerbit = '" + this.mPenerbit + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720099Rafi.executeQueryRafi(SQL);
        }
    }

    public void deleteRafi() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720099Rafi.executeQueryRafi(SQL);
    }
}
