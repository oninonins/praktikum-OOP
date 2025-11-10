# ☕ Praktikum Pemrograman Berorientasi Objek (OOP)

Repositori ini adalah arsip dari semua pekerjaan praktikum, tugas, dan Ujian Tengah Semester (UTS) untuk mata kuliah Pemrograman Berorientasi Objek (OOP) menggunakan Java. Setiap direktori `jobsheet` sesuai dengan satu modul pembelajaran, yang mencakup konsep-konsep inti OOP.

[](https://www.java.com)
[](https://opensource.org/licenses/MIT)

## Daftar Isi

  * [🚀 Konsep Utama yang Dipelajari](https://www.google.com/search?q=%23-konsep-utama-yang-dipelajari)
  * [📂 Struktur Direktori](https://www.google.com/search?q=%23-struktur-direktori)
  * [🛠️ Cara Menjalankan Proyek](https://www.google.com/search?q=%23%EF%B8%8F-cara-menjalankan-proyek)

-----

## 🚀 Konsep Utama yang Dipelajari

Repositori ini mencakup implementasi praktis dari pilar-pilar utama OOP, antara lain:

  * **Class dan Object**: Mendesain cetak biru (Class) dan membuat instansi nyata (Object) dari cetak biru tersebut. (cth: `Meja.java`, `Kursi.java`)
  * **Enkapsulasi (Encapsulation)**: Menyembunyikan data (atribut) menggunakan modifier `private` dan menyediakan akses terkontrol melalui method Getter dan Setter. (cth: `Anggota.java`, `Motor.java`)
  * **Pewarisan (Inheritance)**: Menciptakan hierarki kelas di mana kelas anak (subclass) mewarisi properti dan method dari kelas induk (superclass). (cth: `MejaBelajar.java` extends `Meja.java`, `Leptop.java` extends `Komputer.java`)
  * **Polimorfisme (Polymorphism)**: Kemampuan objek untuk mengambil banyak bentuk, biasanya dicapai melalui *method overriding* dan *interface*. (cth: `Rektor.java` yang menggunakan `ICumlaude`)
  * **Abstract Class & Interface**: Mendefinisikan kontrak (Interface) atau cetak biru sebagian (Abstract Class) yang harus dipenuhi oleh kelas-kelas implementernya. (cth: `Zombie.java`, `Destroyable.java`)
  * **Relasi Antar Kelas**: Membangun hubungan antar objek, seperti Agregasi dan Komposisi. (cth: `KeretaApi.java` memiliki `Pegawai.java`, `Laptop.java` memiliki `Processor.java`)

-----

## 📂 Struktur Direktori

Setiap `jobsheet` berfokus pada topik tertentu, membangun pemahaman OOP secara bertahap.

| Direktori | Topik Utama | Deskripsi Singkat |
| :--- | :--- | :--- |
| **jobsheet1** | Pengenalan Class & Object | Pembuatan class dasar (`Meja`, `Kursi`, `Lemari`) dan class `Demo` untuk menjalankan program. |
| **jobsheet2** | Constructor & Method | Penggunaan constructor untuk inisialisasi objek dan pembuatan method yang mengembalikan nilai (`Barang`, `Lingkaran`). |
| **jobsheet3** | Enkapsulasi | Penerapan *private access modifier* serta method `get()` dan `set()` untuk melindungi data (`EncapDemo`, `Motor`, `Anggota`). |
| **jobsheet4** | Relasi Antar Kelas | Implementasi konsep Komposisi dan Agregasi. Contoh: `Laptop` "memiliki" `Processor`, `Gerbong` "memiliki" `Kursi`. |
| **jobsheet5** | Pewarisan (Inheritance) | Penggunaan `extends` untuk menciptakan superclass (`Komputer`, `Pegawai`) dan subclass (`Leptop`, `Dosen`). |
| **jobsheet6** | Polimorfisme & Interface | Penggunaan `Interface` (`ICumlaude`) yang diimplementasikan oleh kelas (`Sarjana`, `Pascasarjana`) untuk mencapai polimorfisme. |
| **jobsheet9** | Abstract Class | Penggunaan `abstract class` (`Zombie`) dan `interface` (`Destroyable`) untuk studi kasus Plant vs Zombie. |
| **jobsheet10**| GUI Sederhana | Pengenalan Java Swing (`javax.swing`) untuk membuat antarmuka pengguna grafis sederhana (`OutputFrame.java`). |
| **uts** | Ujian Tengah Semester | Sebuah proyek mini (Plant vs Zombie) yang mengintegrasikan berbagai konsep OOP seperti Inheritance, Abstract Class, dan Interface. |

-----
