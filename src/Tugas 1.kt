fun main() {
    println("=== INPUT BIODATA MAHASISWA ===")

    // 1. Menerima input dari keyboard menggunakan readln() dan konversi tipe data
    print("Masukkan Nama            : ")
    val namaMahasiswa: String = readln()

    print("Masukkan Umur            : ")
    val umurMahasiswa: Int = readln().toInt()

    print("Masukkan Tinggi Badan    : ")
    val tinggiBadan: Double = readln().toDouble()

    print("Mahasiswa Aktif? (true/false): ")
    val isMahasiswaAktif: Boolean = readln().toBoolean()

    print("Masukkan Golongan Darah  : ")
    val golonganDarah: Char = readln().first() // Mengambil karakter pertama sebagai Char

    // 2. Menampilkan biodata dengan format yang rapi
    println("\n=== BIODATA MAHASISWA ===")
    println("Nama            : $namaMahasiswa")
    println("Umur            : $umurMahasiswa tahun")
    println("Tinggi badan    : $tinggiBadan cm")
    println("Mahasiswa aktif : $isMahasiswaAktif")
    println("Golongan darah  : $golonganDarah")
}