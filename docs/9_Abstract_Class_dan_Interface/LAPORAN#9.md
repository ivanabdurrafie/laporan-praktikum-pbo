# Laporan Praktikum #9 - Abstract Class dan Interface

## Kompetensi
Setelah menempuh pokok bahasan ini, mahasiswa mampu :
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2. Menjelaskan maksud dan tujuan penggunaan Interface;
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Ringkasan Materi
Penerapan dari abstract class dan interface, karakteristik serta fungsi dari abstract class dan interface itu sendiri

## Percobaan

### Percobaan 1

##### Class Diagram

![contoh screenshot](img/p1uml.png)

##### Class Hewan

![contoh screenshot](img/p1hewanfull.png)

![contoh screenshot](img/p1hewan.png)

link kode program Hewan.java : [Hewan.java](../../src/9_Abstract_Class_dan_Interface/Hewan1841720099Rafi.java)

##### Class Kucing

![contoh screenshot](img/p1kucingfull.png)

![contoh screenshot](img/p1kucing.png)

link kode program Kucing.java : [Kucing.java](../../src/9_Abstract_Class_dan_Interface/Kucing1841720099Rafi.java)

##### Class Ikan

![contoh screenshot](img/p1ikanfull.png)

![contoh screenshot](img/p1ikan.png)

link kode program Ikan.java : [Ikan.java](../../src/9_Abstract_Class_dan_Interface/Ikan1841720099Rafi.java)

##### Class Orang

![contoh screenshot](img/p1orangfull.png)

![contoh screenshot](img/p1orang.png)

link kode program Orang.java : [Orang.java](../../src/9_Abstract_Class_dan_Interface/Orang1841720099Rafi.java)

##### Main

![contoh screenshot](img/p1mainfull.png)

![contoh screenshot](img/p1main.png)

link kode program Main.java : [Main.java](../../src/9_Abstract_Class_dan_Interface/PboMain1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p1hasil.png)


#### Pertanyaan

1. Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!
   

        Boleh
         
    ``` java
            Hewan1841720099Rafi burung = new Hewan1841720099Rafi() {
            @Override
            public void bergerakRafi() {
                System.out.println("Terbang");
            }
        };
    ```
         
### Percobaan 2

##### Class Diagram

![contoh screenshot](img/p2uml.png)

##### Interface *ICumlaude*

![contoh screenshot](img/p2intercumlaudefull.png)

![contoh screenshot](img/p2intercumlaude.png)

link kode program Interface ICumlaude.java : [ICumlaude.java](../../src/9_Abstract_Class_dan_Interface/P2ICumlaude1841720099Rafi.java)

##### Class Mahasiswa

![contoh screenshot](img/p2mahasiswafull.png)

![contoh screenshot](img/p2mahasiswa.png)

link kode program Mahasiswa.java : [Mahasiswa.java](../../src/9_Abstract_Class_dan_Interface/P2Mahasiswa1841720099Rafi.java)

##### Class Sarjana

![contoh screenshot](img/p2sarjanafull.png)

![contoh screenshot](img/p2sarjana.png)

link kode program Sarjana.java : [Sarjana.java](../../src/9_Abstract_Class_dan_Interface/P2Sarjana1841720099Rafi.java)

##### Class Pasca Sarjana

![contoh screenshot](img/p2pascasarjanafull.png)

![contoh screenshot](img/p2pascasarjana.png)

link kode program Pascasarjana.java : [Pascasarjana.java](../../src/9_Abstract_Class_dan_Interface/P2Pascasarjana1841720099Rafi.java)

##### Class Rektor

![contoh screenshot](img/p2rektorfull.png)

![contoh screenshot](img/p2rektor.png)

link kode program Rektor.java : [Rektor.java](../../src/9_Abstract_Class_dan_Interface/P2Rektor1841720099Rafi.java)


##### Main

![contoh screenshot](img/p2mainfull.png)

![contoh screenshot](img/p2main.png)

link kode program Main.java : [Main.java](../../src/9_Abstract_Class_dan_Interface/PboMain1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p2hasil.png)


#### Pertanyaan

1. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

        Interface tidak terkoneksi pada class mahasiswa

2. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
   
        Bisa, dengan  menambahkan abstract method kuliahDiKampus() pada interface cumlaude 

         
    ``` java
            public interface ICumlaude1841720099Rafi {
            public abstract void lulusRafi();
            public abstract void meraihIPKTinggiRafi();
            public abstract void kuliahDiKampusRafi();
            }
    ```

3. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?

        Bisa, Dengan menambahkan abstract method di interface cumlaude dan pada class rektor method kuliahDiKampus() dipanggil

4. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini:
    ``` java


            public void beriSertifikatCumlaudeRafi(P2ICumlaude1841720099Rafi mahasiswa){
            System.out.println("Saya Rektor, memberikan sertifikat cumlaude.");
            System.out.println("Selamat! silahkan perkenalkan diri anda .");
            mahasiswa.kuliahDiKampusRafi();
            mahasiswa.lulusRafi();
            mahasiswa.meraihIPKTinggiRafi();
            System.out.println("--------------------------------------------");
            }
    ```

### Percobaan 3

##### Class Diagram

![contoh screenshot](img/p3uml.png)

##### interface *IBerprestasi*

![contoh screenshot](img/p3interberprestasifull.png)

![contoh screenshot](img/p3interberprestasi.png)

link kode program interface IBerprestasi.java : [IBerprestasi.java](../../src/9_Abstract_Class_dan_Interface/IBerprestasi1841720099Rafi.java)

##### Class Pasca Sarjana

![contoh screenshot](img/p3pascasarjanafull.png)

![contoh screenshot](img/p3pascasarjanafull.png)

link kode program Kucing.java : [Kucing.java](../../src/9_Abstract_Class_dan_Interface/Pascasarjana1841720099Rafi.java)

##### Class Rektor

![contoh screenshot](img/p3rektorfull.png)

![contoh screenshot](img/p3rektor.png)

link kode program Rektor.java : [Rektor.java](../../src/9_Abstract_Class_dan_Interface/Rektor1841720099Rafi.java)

##### Main

![contoh screenshot](img/p3mainfull.png)

![contoh screenshot](img/p3main.png)

link kode program Main.java : [Main.java](../../src/9_Abstract_Class_dan_Interface/PboMain1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p3hasil.png)


#### Pertanyaan

1. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude.
   
        Dengan mengoverride abstrak method dari interface IBerprestasi ke class Sarjana
         
    ``` java
           @Override
            public void menjuraiKompetisirafi() {
                System.out.println("Saya telah menjuarai kompetisi Nasional");
            }

            @Override
            public void membuatPublikasiIlmiahRafi() {
                System.out.println("Saya menerbitkan artikel di jurnal Nasional");
            }
    ```


## Kesimpulan

Dari praktikum diatas kita diajarkan cara penerapan dari abstract class dan interface untuk melindungi source penting dari user pemakai

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivan Abdurrafie)***