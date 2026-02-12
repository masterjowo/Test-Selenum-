#language: id

Fitur: fungsi login
  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://vocagame.com mengunakan cucumber, testng , dan jenkins 

  @Sprint2B @TestCase1
  Skenario: Sebagai pengguna saya dapat login dengan benar 
    Jika user akses halaman landig page
    Maka user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk
    Dan user memasukan nomer "081399057525" dan password "Admin12345@"
    Dan user menekan tombol masuk
    Dan user memilih topup mobile legends
    Dan user memasukan data user id "316485539" dan zone id "9623"
    Dan user dapat memastikan nama "Ismail Bin Mail"
    Dan user memilih Weekly Diamond Pass
    Dan user memastikan harga "Rp 27,819"
    Dan user melakukan pembayaran QRIS 
