fun main() {
    // 1. Menerima masukan karakter dari pengguna menggunakan readln()
    print("Masukkan karakter: ")
    val input = readln()

    // Mengambil karakter pertama dari teks input
    val karakter: Char = input.first()

    // 2. Menganalisis karakter
    // .code mengembalikan nilai integer Unicode / ASCII dari karakter
    val kodeKarakter: Int = karakter.code
    // .isLetter() mengecek apakah karakter merupakan huruf (A-Z, a-z)
    val isHuruf: Boolean = karakter.isLetter()
    // .isDigit() mengecek apakah karakter merupakan angka (0-9)
    val isAngka: Boolean = karakter.isDigit()

    // 3. Menampilkan informasi analisis karakter sesuai format contoh
    println("\nKarakter       : $karakter")
    println("Kode karakter  : $kodeKarakter")
    println("Termasuk huruf : $isHuruf")
    println("Termasuk angka : $isAngka")
}