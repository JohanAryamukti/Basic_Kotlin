fun main() {
    // 1. Menerima masukan nama pengguna dari keyboard
    print("Masukkan nama: ")
    val namaPengguna: String = readln()

    // 2. Memanggil fungsi tampilkanSalam dengan argumen namaPengguna
    tampilkanSalam(namaPengguna)
}

// Fungsi tanpa nilai kembalian (Unit) untuk mencetak ucapan salam
fun tampilkanSalam(nama: String) {
    println("Selamat datang, $nama!")
}