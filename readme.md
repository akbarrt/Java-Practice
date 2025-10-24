# Panduan Menggunakan Github

## Funfact : Jadi disini yang ada di codelab praktikum saya terdapat sebuah task bagaimana cara menggunakan git dan github  


## Jadi disini saya akan menjelaskan tentang cara menggunakan Git dan GitHub untuk mengelola proyek pengembangan perangkat lunak.
## Git adalah sistem kontrol versi terdistribusi yang memungkinkan pengembang untuk melacak perubahan dalam kode sumber mereka. GitHub, di sisi lain, adalah platform hosting berbasis web yang menggunakan Git untuk mengelola repositori kode sumber.
## Langkah-langkah Menggunakan Git dan GitHub
1. **Instalasi Git**: Pertama, Anda perlu menginstal Git di komputer Anda. Anda dapat mengunduhnya dari situs resmi Git (https://git-scm.com/) dan mengikuti petunjuk instalasi sesuai dengan sistem operasi yang Anda gunakan.
2. **Konfigurasi Git**: Setelah menginstal Git, Anda perlu mengonfigurasinya dengan memasukkan nama pengguna dan alamat email Anda. Gunakan perintah berikut di terminal:
   ```bash
   git config --global user.name "Nama Anda"
   git config --global user.email "Email Anda"
   ```
3. **Membuat Repositori Git**: Untuk memulai proyek baru, buat repositori Git dengan perintah berikut:
   ```bash
   git init nama-proyek
   ```
   Ini akan membuat folder baru dengan nama proyek Anda dan menginisialisasi repositori Git di dalamnya.
4. **Menambahkan File ke Repositori**: Setelah membuat repositori, Anda dapat menambahkan file ke dalamnya. Gunakan perintah berikut untuk menambahkan file:
   ```bash
   git add nama-file
   ```
   Atau untuk menambahkan semua file dalam direktori:
   ```bash
   git add .
   ```
5. **Membuat Commit**: Setelah menambahkan file, Anda perlu membuat commit untuk menyimpan perubahan. Gunakan perintah berikut:
   ```bash
   git commit -m "Pesan commit Anda"
   ```
6. **Membuat Repositori di GitHub**: Buka GitHub dan buat repositori baru dengan mengklik tombol "New" di halaman utama GitHub. Beri nama repositori Anda dan klik "Create repository".
7. **Menghubungkan Repositori Lokal dengan GitHub**: Setelah membuat repositori di GitHub, Anda perlu menghubungkannya dengan repositori lokal Anda. Gunakan perintah berikut:
   ```bash
   git remote add origin
   ``` 
8. **Mengirim Perubahan ke GitHub**: Untuk mengirim perubahan dari repositori lokal ke GitHub, gunakan perintah berikut:
   ```bash
   git push -u origin master
   ```
9. **Mengelola Perubahan**: Setelah mengirim perubahan, Anda dapat terus mengelola proyek Anda dengan menambahkan, meng-commit, dan meng-push perubahan sesuai kebutuhan.
10. **Bekerja dengan Cabang (Branch)**: Anda dapat membuat cabang baru untuk mengembangkan fitur baru tanpa mengganggu cabang utama. Gunakan perintah berikut untuk membuat cabang baru:
    ```bash
    git checkout -b nama-cabang
    ```
11. **Menggabungkan Cabang (Merge)**: Setelah selesai mengembangkan fitur di cabang baru, Anda dapat menggabungkannya kembali ke cabang utama dengan perintah berikut:
    ```bash
    git checkout master
    git merge nama-cabang
    ```
12. **Menarik Perubahan dari GitHub**: Jika ada perubahan yang dilakukan oleh kolaborator di GitHub, Anda dapat menarik perubahan tersebut ke repositori lokal Anda dengan perintah berikut:
    ```bash
    git pull origin master
    ```
Dengan mengikuti langkah-langkah di atas, Anda dapat dengan mudah menggunakan Git dan GitHub untuk mengelola proyek pengembangan perangkat lunak Anda. Selamat mencoba!