# Laporan Praktikum #7 - OVERLOADING DAN OVERRIDING

## Kompetensi
Setelah menempuh pokok bahasan ini, mahasiswa mampu :
1. Memahami konsep overloading dan overriding,
2. Memahami perbedaan overloading dan overriding,
3. Ketepatan dalam mengidentifikasi method overriding dan overloading
4. Ketepatan dalam mempraktekkan instruksi pada jobsheet
5. Mengimplementasikan method overloading dan overriding.

## Ringkasan Materi
Dalam Overloading kita bisa merubah parameter yang ada di dalam method kita sedangkan Overriding mengubah isi dari method turunan yang diambil dari method class parent


 
## Percobaan

### Percobaan 1

##### Class Diagram

![contoh screenshot](img/p1classdiagram.png)

##### Class Karyawan

![contoh screenshot](img/p1karyawanfull1.png)

![contoh screenshot](img/p1karyawanfull2.png)

![contoh screenshot](img/p1karyawanfull3.png)

link kode program Karyawan.java : [Karyawan.java](../../src/7_Overriding_dan_Overloading/Karyawan1841720099Rafi.java)

##### Class Staff

![contoh screenshot](img/p1stafffull1.png)

![contoh screenshot](img/p1stafffull2.png)

![contoh screenshot](img/p1staff.png)

link kode program Staff.java : [Staff.java](../../src/7_Overriding_dan_Overloading/Staff1841720099Rafi.java)

##### Class Manager

![contoh screenshot](img/p1managerfull1.png)

![contoh screenshot](img/p1managerfull2.png)

![contoh screenshot](img/p1managerfull3.png)

![contoh screenshot](img/p1manager1.png)

![contoh screenshot](img/p1manager2.png)

link kode program Manager.java : [Manager.java](../../src/7_Overriding_dan_Overloading/Manager1841720099Rafi.java)

##### Main

![contoh screenshot](img/p1mainfull1.png)

![contoh screenshot](img/p1mainfull2.png)

![contoh screenshot](img/p1mainfull3.png)

![contoh screenshot](img/p1mainfull4.png)

link kode program Main.java : [Main.java](../../src/7_Overriding_dan_Overloading/Utama1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/p1hasil.png)

![contoh screenshot](img/p1hasil2.png)


### Latihan

#### Latihan 1

##### Class Perkalianku

![contoh screenshot](img/l1perkalianfull.png)

![contoh screenshot](img/l1perkalian.png)

![contoh screenshot](img/l1hasil.png)

link kode program Perkalianku.java : [Perkalianku.java](../../src/7_Overriding_dan_Overloading/Perkalianku1841720099Rafi.java)

##### Pertanyaan

1. Dari source coding diatas terletak dimanakah overloading?
   
     
    ``` java
    void perkalian(int a,int b, int c){
        System.out.println(a*b*c)
    }
    
    ```
    

2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?
   
        jumlah parameter yang berbeda adalah 1

#### Latihan 2

##### Class Perkalianku

![contoh screenshot](img/l2perkalianfull.png)

![contoh screenshot](img/l2perkalian.png)

![contoh screenshot](img/l2hasil.png)

link kode program Perkalianku.java : [Perkalianku.java](../../src/7_Overriding_dan_Overloading/P2Perkalianku1841720099Rafi.java)

##### Pertanyaan

1. Dari source coding diatas terletak dimanakah overloading?
   
     
    ``` java
    void perkalian(double a,double b){
        System.out.println(a*b)
    }
    
    ```
    

2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?
   
        jumlah parameter yang berbeda adalah 2

#### Latihan 3

##### Class Ikan

![contoh screenshot](img/l3ikanfull.png)

![contoh screenshot](img/l3ikan.png)

![contoh screenshot](img/l3hasil.png)

link kode program Ikan.java : [Ikan.java](../../src/7_Overriding_dan_Overloading/Ikan1841720099Rafi.java)

##### Pertanyaan

1. Dari source coding diatas terletak dimanakah overriding?
   
     
    ``` java
    class Piranha extends Ikan{
        public void swim(){
            System.out.println("Piranha bisa makan daging")
        }
    }
    
    ```
    

2. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?
   
        overriding terjadi karena pada class piranha isi dari method swim dirubah menjadi "Piranha bisa makan daging"

 

## Tugas

### Tugas 1 Overloading

![contoh screenshot](img/s1uml.png)

##### Class Segitiga

![contoh screenshot](img/s2segitigafull.png)

![contoh screenshot](img/s2segitiga.png)

link kode program Segitiga.java : [Segitiga.java](../../src/7_Overriding_dan_Overloading/Segitiga1841720099Rafi.java)

##### Class Main

![contoh screenshot](img/s2mainfull.png)

![contoh screenshot](img/s2main.png)

link kode program Main.java : [Main.java](../../src/7_Overriding_dan_Overloading/T1Main1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/s2hasil.png)

### Tugas 2 Overriding

![contoh screenshot](img/s2uml.png)

##### Class Manusia

![contoh screenshot](img/s1manusiafull.png)

![contoh screenshot](img/s1manusia.png)

link kode program Manusia.java : [Manusia.java](../../src/7_Overriding_dan_Overloading/Manusia1841720099Rafi.java)

##### Class Dosen

![contoh screenshot](img/s1dosenfull.png)

![contoh screenshot](img/s1dosen.png)

link kode program Dosen.java : [Dosen.java](../../src/7_Overriding_dan_Overloading/Dosen1841720099Rafi.java)

##### Class Mahasiswa

![contoh screenshot](img/s1mahasiswafull.png)

![contoh screenshot](img/s1mahasiswa.png)

link kode program Mahasiswa.java : [Mahasiswa.java](../../src/7_Overriding_dan_Overloading/Mahasiswa1841720099Rafi.java)

##### Hasil

![contoh screenshot](img/s1hasil.png)




## Kesimpulan

Dari praktikum diatas kita diajarkan cara penerapan dari Overloading dan Overriding bagaimana cara membuat oveloading dan overriding beserta ketentuannya

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivan Abdurrafie)***