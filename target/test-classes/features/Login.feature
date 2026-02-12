#language: id

Fitur: fungsi login
  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://vocagame.com mengunakan cucumber, testng , dan jenkins 

  @Sprint2B @TestCase1
  Skenario: Sebagai pengguna saya dapat login dengan benar 
    Jika user akses halaman landig page
    Maka user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk
    Dan user memasukan nomer "081399057525" dan password "Admin12345@"
    Dan user menekan tombol masuk
    Maka user dapat melihat snackbar berhasil login "ok"
    # 316485539 9623

  Skenario: Sebagai pengguna saya tidak dapat login karena password salah
    Jika user akses halaman landig page
    Maka user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk
    Dan user memasukan nomer "0813969057525" dan password "Admin12345@"
    Dan user menekan tombol masuk
    Maka user dapat melihat snackbar gagal login "Phone Number tidak ditemukan. Harap gunakan data yang valid dan terdaftar"