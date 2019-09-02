# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:
1. Perbedaan paradigma berorientasi objek dengan paradigma struktural
2. Konsep dasar PBO

## Ringkasan Materi

Praktikum kali ini berisi tentang cara Penjelasan Inheritance beserta contoh penggunaannya, dengan menggunakan contoh Sepeda yang memiliki turunan Sepeda Gunung 

## Percobaan

### Percobaan 1


Sepeda.java

    Membuat class sepeda
![contoh screenshot](img/1-praktikum1.PNG)

![contoh screenshot](img/1-praktikum1project.PNG)

![contoh screenshot](img/1-praktikum1sourcecode.PNG)

link kode program Sepeda.java : [Sepeda.java](../../src/1_Pengantar_Konsep_PBO/Sepeda1841720099Rafi.java)

SepedaDemo.java

Source Code :
![contoh screenshot](img/2-praktikum1full.PNG)


![contoh screenshot](img/2-praktikum1sourcecode.PNG)

Hasil kompilasi :

![contoh screenshot](img/2-praktikum1hasil.PNG)

link kode program SepedaDemo.java : [SepedaDemo.java](../../src/1_Pengantar_Konsep_PBO/SepedaDemo1841720099Rafi.java)

### Percobaan 2

Sepeda Gunung extend Sepeda

![contoh screenshot](img/3-praktikum2extend.PNG)

Source Code Sepeda Gunung

![contoh screenshot](img/3-praktikum2source.PNG)

link kode program SepedaGunung.java : [SepedaGunung.java](../../src/1_Pengantar_Konsep_PBO/SepedaGunung1841720099Rafi.java)

Source Sepeda Demo Main

![contoh screenshot](img/3-praktikum2main.PNG)

Hasil

![contoh screenshot](img/3-praktikum2hasil.PNG)

## Pertanyaan

(silakan ketik pertanyaan di sini beserta jawabannya.)

1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek!
2. Apa yang dimaksud dengan object dan apa bedanya dengan class?
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
dengan pemrograman struktural!
4. Pada class Sepeda, terdapat state/atribut apa saja?
5. Tambahkan atribut warna pada class Sepeda.
6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari
nol

### Jawab

1. Aspek aspek OOP :

 | Nama          | Penjelasan |
|---------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Object        | Suatu rangkaian yang dalam program yang terdiri dari state dan behaviour. |
|  Class        | Sebuah blueprint atau prototype sebuah project.|
|  Abstraction  | Kemampuan sebuah program untuk melewati aspek informasi yang diproses  olehnya, yaitu kemampuan untuk memfokus pada inti. Setiap objek dalam  sistem melayani sebagai model dari "pelaku" abstrak yang dapat melakukan  kerja, laporan dan perubahan keadaannya, dan berkomunikasi dengan objek  lainnya dalam sistem, tanpa mengungkapkan bagaimana kelebihan ini  diterapkan. Proses, fungsi atau metode dapat juga dibuat abstrak, dan  beberapa teknik digunakan untuk mengembangkan sebuah pengabstrakan.|
| Encapsulation | Memastikan pengguna sebuah objek tidak dapat mengganti keadaan dalam dari sebuah objek dengan cara yang tidak layak hanya metode dalam objek tersebut yang diberi izin untuk mengakses keadaannya.|
| Polimorphism  | Sebuah turunan yang bisa memiliki banyak bentuk dapat digunakan untuk turunan yang memiliki jenis yang berbeda|
| Inheritance   | Sebuah pewarisan atau penurunan. digunakan untuk mengurangi penggunaan method yang sama,memperluas fungsionalitas program tanpa harus mengubah banyak bagian program. |
2. Class merupakan sebuah blueprint atau prototype dari sebuah projek yang dibuat untuk tujuan tertentu

    sedangkan object adalah pemanfaatan dari class yang siap untuk digunakan yang menjadi satu rangkaian program

3. - Penggunaan kembali fungsi yang ada menggunakan inheritance, lebih efisien
   - Mudah untuk pemeliharaan karena dengan OOP dapat model dapat dipisahkan sesuai yang diinginkan, tidak perlu merubah semua code hanya beberapa yang dibutuhkan saja
   - Class dan object bisa digunakan lagi atau Reusable
  
4. mSetMerek, mGantiGear, mTambahKecepatan, mRem, mCetakStatus
5. Attribut Warna
![contoh screenshot](img/setwarna.PNG)
6. Karena Attribut dari Sepeda Gunung adalah turunan dari attribut Sepeda jadi tidak perlu membuat class dari nol, hanya memanggil Class Sepeda dengan menggunakan extend dan menambahkan attribut tambahan untuk sepeda gunung 


## Tugas

Dokter

    Project files

![contoh screenshot](img/tugasfileprojek.PNG)

    Source Code 

![contoh screenshot](img/tugasdokterfull.PNG)

![contoh screenshot](img/tugasdoktersource.PNG)

link kode program dokter.java : [Dokter.java](../../src/1_Pengantar_Konsep_PBO/Dokter1841720099Rafi.java)

Dokter Spesialis

    Source Code 

![contoh screenshot](img/tugasdokterSpesialisfull.PNG)

![contoh screenshot](img/tugasdokterspesialissource.PNG)

link kode program dokterSpesialis.java : [DokterSpesialis.java](../../src/1_Pengantar_Konsep_PBO/DokterSpesialis1841720099Rafi.java)

Main

    Source Code 

![contoh screenshot](img/tugasdoktermainfull.PNG)

![contoh screenshot](img/tugasdoktermainsource.PNG)

link kode program dokterMain.java : [DokterMain.java](../../src/1_Pengantar_Konsep_PBO/DokterMain1841720099Rafi.java)

    hasil kompile
![contoh screenshot](img/tugasdokterhasil.PNG)

## Kesimpulan

Dengan menggunakan **Inheritance** kita dapat meminimalisir duplikasi kode dan method dapat digunakan kembali sesuai kebutuhan

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Ivan Abdurrafie)***