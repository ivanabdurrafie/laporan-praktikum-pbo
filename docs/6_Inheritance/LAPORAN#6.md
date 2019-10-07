# Laporan Praktikum #6 - Inheritance

## Kompetensi
1. Memahami  konsep  dasar inheritance  atau  pewarisan. 
2. Mampu  membuat  suatu  subclass dari  suatu  superclass  tertentu. 
3. Mampu  mengimplementasikan konsep  single  dan  multilevel inheritance. 
4. Mampu  membuat  objek  dari suatu  subclass  dan melakukan pengaksesan  terhadap  atribut dan method baik  yang  dimiliki sendiri  atau  turunan  dari superclass  nya. 

## Ringkasan Materi
dalam inheritance kita bisa memanggil attribut ataupun method pada class parent menggunakan super digunakan untuk menghemat code karena tidak mengulang penulisan kode berulang kali


 
## Percobaan

### Percobaan 1
##### Class A

![contoh screenshot](img/p1afull.png)

![contoh screenshot](img/p1a.png)

link kode program ClassA.java : [ClassA.java](../../src/6_Inheritance/P1ClassA1841720099Rafi.java)

##### Class B

![contoh screenshot](img/p1bfull.png)

![contoh screenshot](img/p1b.png)

link kode program ClassB.java : [ClassB.java](../../src/6_Inheritance/P1ClassB1841720099Rafi.java)


##### Main

![contoh screenshot](img/p1mainfull.png)

![contoh screenshot](img/p1main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/Percobaan11841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p1hasil.png)

##### Pertanyaan

1. Pada  percobaan  1  diatas  program  yang  dijalankan  terjadi error,  kemudian  perbaiki  sehingga program  tersebut  bisa  dijalankan  dan  tidak  error! 


    ```java
    dengan menambahkan extends ke Class B      
    ClassB1841720099Rafi extends ClassA1841720099Rafi{}
    ```
    

2. Jelaskan  apa  penyebab  program  pada  percobaan  1  ketika  dijalankan  terdapat  error! 
   
        dibutuhkan fungsi extends agar bisa memakai fungsi atau attribut dari class parent

### Percobaan 2

##### Class A

![contoh screenshot](img/p2afull.png)

![contoh screenshot](img/p2a.png)

link kode program ClassA.java : [ClassA.java](../../src/6_Inheritance/P2ClassA1841720099Rafi.java)

##### Class B

![contoh screenshot](img/p2bfull.png)

![contoh screenshot](img/p2b.png)

link kode program ClassB.java : [ClassB.java](../../src/6_Inheritance/P2ClassB1841720099Rafi.java)


##### Main

![contoh screenshot](img/p2mainfull.png)

![contoh screenshot](img/p2main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/Percobaan11841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p2hasil.png)

##### Pertanyaan

1.Pada  percobaan  2  diatas  program  yang  dijalankan  terjadi  error,  kemudian  perbaiki  sehingga program  tersebut  bisa  dijalankan  dan  tidak  error! 

        dengan menambahkan fungsi get kita bisa memanggil attribut dari class parent yang ber modifier private
``` java
    public int getmX() {
        return mX;
    }
    public int getmY() {
        return mY;
    }
```
    

2. Jelaskan  apa  penyebab  program  pada  percobaan  2  ketika  dijalankan  terdapat  error! 
   
        karena attribut yang akan dipanggil ber modifier private sehingga tidak bisa diakses untuk class lain yang bukan turunannya

### Percobaan 3 (Super)

##### Class Bangun

![contoh screenshot](img/p3bangunfull.png)

![contoh screenshot](img/p3bangun.png)

link kode program ClassBangun.java : [ClassBangun.java](../../src/6_Inheritance/Bangun1841720099Rafi.java)

##### Class Tabung

![contoh screenshot](img/p3tabungfull.png)

![contoh screenshot](img/p3tabung.png)

link kode program ClassTabung.java : [ClassTabung.java](../../src/6_Inheritance/Tabung1841720099Rafi.java)


##### Main

![contoh screenshot](img/p3mainfull.png)

![contoh screenshot](img/p3main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/P3Main1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p3hasil.png)

##### Pertanyaan

1. Jelaskan  fungsi   “super”  pada  potongan  program  berikut  di  class  Tabung! 

![contoh screenshot](img/p3soal1.png)

    super.nama attribut berfungsi untuk memanggil attribut pada class parent
    

2. Jelaskan  fungsi  “super”  dan  “this”  pada  potongan  program  berikut  di  class  Tabung! 
   
![contoh screenshot](img/p3soal2.png)

    fungsi super adalah untuk memanggil attribut dari class parent dan fungsi this untuk memanggil atrribut yang berada di classnya sendiri

3. Jelaskan  mengapa  pada  class  Tabung  tidak  dideklarasikan  atribut  “phi”  dan  “r”  tetapi  class tersebut  dapat  mengakses  atribut  tersebut! 

        karena sudah attribut phi dan r sudah terdapat di class parent maka class turunannya bisa memanggil attribut yang diinginkan 

### Percobaan 4  (super  contsructor)

##### Class A

![contoh screenshot](img/p4afull.png)

![contoh screenshot](img/p4a.png)

link kode program ClassA.java : [ClassA.java](../../src/6_Inheritance/P4ClassA1841720099Rafi.java)

##### Class B

![contoh screenshot](img/p4bfull.png)

![contoh screenshot](img/p4b.png)

link kode program ClassB.java : [ClassB.java](../../src/6_Inheritance/P4ClassB1841720099Rafi.java)

##### Class C

![contoh screenshot](img/p4cfull.png)

![contoh screenshot](img/p4c.png)

link kode program ClassC.java : [ClassC.java](../../src/6_Inheritance/P4ClassC1841720099Rafi.java)

##### Main

![contoh screenshot](img/p4mainfull.png)

![contoh screenshot](img/p4main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/P4Main1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p4hasil.png)

##### Pertanyaan

1. Pada  percobaan  4  sebutkan  mana  class  yang  termasuk  superclass  dan  subclass,  kemudian 
jelaskan  alasannya!  

       superclass : ClassA1841720099Rafi, Subclass : ClassB1841720099Rafi dan ClassC1841720099Rafi karena Class B dan Class C memanggil parent Class A dengan menggunakan extends
    

2.  Ubahlah  isi  konstruktor  default  ClassC  seperti  berikut:  
   
    ![contoh screenshot](img/p4soal2.png)

    Tambahkan  kata  super()  di  baris  Pertaman dalam  konstruktor  defaultnya.  Coba  jalankan kembali  class  Percobaan4  dan  terlihat  tidak ada perbedaan  dari  hasil  outputnya! 

3. Ublah  isi  konstruktor  default  ClassC  seperti  berikut:  

    ![contoh screenshot](img/p4soal3.png) 

    Ketika  mengubah  posisi  super()  dibaris  kedua  dalam  kontruktor  defaultnya  dan  terlihat  ada error.  Kemudian  kembalikan  super()  kebaris pertama  seperti  sebelumnya,  maka  errornya akan hilang. 

    Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi  objek test dari class ClassC 

    ![contoh screenshot](img/p4soal3h.png) 

    Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

        Urutan proses jalannya Constructor adalah mulai dari constructor dari class parent lalu sub class akan dijalankan sesuai tingkat sub classnya

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC! 

    ![contoh screenshot](img/p4soal4.png) 

        fungsi super() pada potongan program diatas adalah untuk memanggil constructor dari class parent

### Percobaan 5

##### Class Karyawan

![contoh screenshot](img/p5karyawanfull.png)

![contoh screenshot](img/p5karyawan.png)

link kode program Karyawan.java : [Karyawan.java](../../src/6_Inheritance/Karyawan1841720099Rafi.java)

##### Class Manager

![contoh screenshot](img/p5managerfull.png)

![contoh screenshot](img/p5manager.png)

link kode program Manager.java : [Manager.java](../../src/6_Inheritance/Manager1841720099Rafi.java)

##### Class Staff

![contoh screenshot](img/p5stafffull.png)

![contoh screenshot](img/p5staff.png)

link kode program Staff.java : [Staff.java](../../src/6_Inheritance/Staff1841720099Rafi.java)

##### Main

![contoh screenshot](img/p5mainfull.png)

![contoh screenshot](img/p5main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/P5Inheritance11841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p5hasil.png)

##### Pertanyaan

1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 5 diatas!   

       superclass : Karyawan1841720099Rafi, Subclass : Staff1841720099Rafi dan Manager1841720099Rafi 
    

2.  Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?  
   
        kata kunci yang digunakan untuk menurunkan suatu class ke class yang lain adalah extends

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!   

        attribut yang diimiliki class manager adalah mTunjangan dan attribut yang diwarisi oleh class Karyawan adalah mGaji
 
4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager! 

    ![contoh screenshot](img/p5soal.png) 

        super pada potongan program diatas adalah untuk memanggil attribut gaji dari class karyawan yang menjadi parent dari class manager untuk menentukan total gaji dengan menambahkan gaji dengan tunjangan

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya! 
   
         jenis inheritance hirarki karena terdapat dua subclass yang terkait pada class parent



### Percobaan 6

Menambahkan Class StaffHarian dan StaffTetap berdasarkan Percobaan 5

##### Class StaffTetap

![contoh screenshot](img/p6stafftetapfull.png)

![contoh screenshot](img/p6stafftetap.png)

link kode program StaffTetap.java : [StaffTetap.java](../../src/6_Inheritance/StaffTetap1841720099Rafi.java)

##### Class StaffHarian

![contoh screenshot](img/p6staffharianfull.png)

![contoh screenshot](img/p6staffharian.png)

link kode program StaffHarian.java : [StaffHarian.java](../../src/6_Inheritance/StaffHarian1841720099Rafi.java)

##### Main

![contoh screenshot](img/p6mainfull.png)

![contoh screenshot](img/p6main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/Inheritance11841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p6hasil.png)

##### Pertanyaan

1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?   

       Class diatas berjenis multilevel inheritance 
    

2.  Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut Sebutkan atribut mana saja yang diwarisi dari class Staff!  

        attribut yang dimiliki StaffTetap adalah mGolongan dan mAsuransi sedangkan attribut yang dimiliki oleh StaffHarian adalah mJmlJamkerja dan attribut yang diwari oleh class staff adalah mLembur dan mPotongan

3. Apakah fungsi potongan program berikut pada class StaffHarian  

    ![contoh screenshot](img/p6soal3.png) 

        memanggil attribut nama,alamat,jk,umur,gaji,lembur dan potongan dari class parent
 
4. Apakah fungsi potongan program berikut pada class StaffHarian

    ![contoh screenshot](img/p6soal4.png) 

        Memanggil fungsi tampilDataStaff pada class Staff yaitu parent dari StaffHarian

5. Perhatikan kode program dibawah ini yang terdapat  pada class StaffTetap 
   
   ![contoh screenshot](img/p6soal5.png) 

    Terlihat dipotongan program diatas atribut gaji lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan? 

        dengan memanggil attribut dari class parent  

## Tugas

### Tugas 1

##### Class Komputer

![contoh screenshot](img/t1komputerfull.png)

![contoh screenshot](img/t1komputer.png)

link kode program Komputer.java : [Komputer.java](../../src/6_Inheritance/Komputer1841720099Rafi.java)

##### Class Laptop

![contoh screenshot](img/t1laptopfull.png)

![contoh screenshot](img/t1laptop.png)

link kode program Laptop.java : [Laptop.java](../../src/6_Inheritance/Laptop1841720099Rafi.java)

##### Class PC

![contoh screenshot](img/t1pcfull.png)

![contoh screenshot](img/t1pc.png)

link kode program PC.java : [PC.java](../../src/6_Inheritance/PC1841720099Rafi.java)

##### Class Mac

![contoh screenshot](img/t1macfull.png)

![contoh screenshot](img/t1mac.png)

link kode program Mac.java : [Mac.java](../../src/6_Inheritance/Mac1841720099Rafi.java)

##### Class Windows

![contoh screenshot](img/t1windowsfull.png)

![contoh screenshot](img/t1windows.png)

link kode program Windows.java : [Windows.java](../../src/6_Inheritance/Windows1841720099Rafi.java)

##### Main

![contoh screenshot](img/t1mainfull.png)

![contoh screenshot](img/t1main.png)

link kode program Main.java : [Main.java](../../src/6_Inheritance/TMain1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/t1hasil.png)


## Kesimpulan

Dari praktikum diatas kita diajarkan cara penerapan dari inheritance dengan menggunakan extends dan super pada subclass yang ingin dituju

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivan Abdurrafie)***