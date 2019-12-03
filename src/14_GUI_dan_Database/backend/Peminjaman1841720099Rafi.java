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

public class Peminjaman1841720099Rafi {
    private int mIdpeminjaman, mIdanggota, mIdbuku;
    private Anggota1841720099Rafi mAnggota = new Anggota1841720099Rafi();
    private Buku1841720099Rafi mBuku = new Buku1841720099Rafi();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720099Rafi() {
    }

    public Peminjaman1841720099Rafi(Anggota1841720099Rafi mIdanggota, Buku1841720099Rafi mIdbuku, String mTanggalPinjam, String mTanggalKembali) {
        this.mAnggota = mIdanggota;
        this.mBuku = mIdbuku;
        this.mTanggalPinjam = mTanggalPinjam;
        this.mTanggalKembali = mTanggalKembali;
    }


    public int getmIdpeminjaman() {
        return mIdpeminjaman;
    }

    public void setmIdpeminjaman(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public int getmIdanggota() {
        return mIdanggota;
    }

    public void setmIdanggota(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public int getmIdbuku() {
        return mIdbuku;
    }

    public void setmIdbuku(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Anggota1841720099Rafi getmAnggota() {
        return mAnggota;
    }

    public void setmAnggota(Anggota1841720099Rafi mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720099Rafi getmBuku() {
        return mBuku;
    }

    public void setmBuku(Buku1841720099Rafi mBuku) {
        this.mBuku = mBuku;
    }

    public String getmTanggalPinjam() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjam(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembali() {
        return mTanggalKembali;
    }

    public void setmTanggalKembali(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }
    
    public Peminjaman1841720099Rafi getByIdRafi(int id) {
        Peminjaman1841720099Rafi pinjam = new Peminjaman1841720099Rafi();
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT " +
        "p.idpeminjaman AS idpeminjaman," +
        "p.tanggalpinjam AS tanggalpinjam," +
        "p.tanggalkembali AS tanggalkembali," +
        "a.idanggota AS idanggota," +
        "b.idbuku AS idbuku" +
        "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota" +
        "LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720099Rafi();
                pinjam.setmIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggota(rs.getInt("idanggota"));
                pinjam.setmIdbuku(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjam(rs.getString("tanggalpinjam"));
                pinjam.setmTanggalKembali(rs.getString("tanggalkembali"));
                pinjam.setmAnggota(new Anggota1841720099Rafi().getByIdRafi(getmIdanggota()));
                pinjam.setmBuku(new Buku1841720099Rafi().getByIdRafi(pinjam.getmIdbuku()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720099Rafi> getAllRafi() {
        ArrayList<Peminjaman1841720099Rafi> ListKategori = new ArrayList<>();

       ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT " +
        "p.idpeminjaman AS idpeminjaman," +
        "p.tanggalpinjam AS tanggalpinjam," +
        "p.tanggalkembali AS tanggalkembali," +
        "a.idanggota AS idanggota," +
        "b.idbuku AS idbuku " +
        "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota " +
        "LEFT JOIN buku b ON p.idbuku = b.idbuku");

        try {
            while (rs.next()) {
                Peminjaman1841720099Rafi pinjam = new Peminjaman1841720099Rafi();
                pinjam = new Peminjaman1841720099Rafi();
                pinjam.setmIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggota(rs.getInt("idanggota"));
                pinjam.setmIdbuku(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjam(rs.getString("tanggalpinjam"));
                pinjam.setmTanggalKembali(rs.getString("tanggalkembali"));
                pinjam.setmAnggota(new Anggota1841720099Rafi().getByIdRafi(getmIdanggota()));
                pinjam.setmBuku(new Buku1841720099Rafi().getByIdRafi(pinjam.getmIdbuku()));

                ListKategori.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public void cariAnggotaRafi(int id) {
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getmAnggota().setmIdAnggotaRafi(rs.getInt("idanggota"));
                getmAnggota().setmNamaRafi(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuRafi(int id) {
        ResultSet rs = DBHelper1841720099Rafi.selectQueryRafi("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getmBuku().setmIdBuku(rs.getInt("idbuku"));
                getmBuku().setmJudul(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveRafi() {
        if (getByIdRafi(mIdpeminjaman).getmIdpeminjaman()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali)" +
                    "values ("
                    + "'" + this.getmAnggota().getmIdAnggotaRafi()+ "', "
                    + "'" + this.getmBuku().getmIdBuku()+ "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" + this.mTanggalKembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720099Rafi.insertQueryGetIdRafi(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET"
                   + "idanggota = '" + this.getmAnggota().getmIdAnggotaRafi()+ "', "
                    + "idbuku = '" + this.getmBuku().getmIdBuku()+ "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720099Rafi.executeQueryRafi(SQL);
        }
    }

    public void deleteRafi() {
        String SQL = "DELETE FROM peminjaman WHERE peminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720099Rafi.executeQueryRafi(SQL);
    }
}
