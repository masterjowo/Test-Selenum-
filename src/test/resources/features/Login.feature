
#language: id

Fitur: fungsi login
  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://www.saucedemo.com/ mengunakan cucumber, testng , dan jenkins 

  @Sprint2B @TestCase1
  Skenario: Sebagai pengguna saya dapat login dengan benar (positive case)
    Jika user akses halaman landig page
    Maka user sudah berada pada halaman awal, user dapat menerapkan tombol Masuk
    Dan user memasukan nomer "081399057525" dan password "Admin12345@"
    Dan user menekan tombol masuk
    Maka user dapat melihat snackbar "ok"
    # 316485539 9623

  # @Sprint2B @TestCase2
  # Scenario: Sebagai pengguna saya mendapatkan peringatan jika salah input saat login (negative case)
  #   Given Diberikan  user akses halaman "https://www.saucedemo.com/"
  #   When Ketika user sudah berada pada halaman awal, user dapat melihat "Swag Labs"
  #   And Dan user memasukan UserName "standard_user1"
  #   And Dan user memasukan password "secret_sauce"
  #   And Dan user menekan tombol login
  #   Then Maka user dapat melihat "Epic sadface: Username and password do not match any user in this service"