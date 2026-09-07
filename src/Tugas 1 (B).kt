fun main() {
    println("=== INPUT DATA AWAL MAHASISWA ===")

    // val: Nilai bersifat immutable (read-only), tidak dapat diubah.
    print("Masukkan Nama Mahasiswa      : ")
    val namaMahasiswa: String = readln()

    print("Masukkan NIM                 : ")
    val npmMahasiswa: String = readln()

    // var: Nilai bersifat mutable, dapat diperbarui nilainya selama program berjalan
    print("Masukkan Semester Saat Ini   : ")
    var semesterMahasiswa: Int = readln().toInt()

    print("Masukkan IPK Saat Ini        : ")
    var ipkMahasiswa: Double = readln().toDouble()

    // 1. Menampilkan data mahasiswa sebelum diperbarui
    println("\n==========================================")
    println("      DATA MAHASISWA (SEBELUM UPDATE)     ")
    println("==========================================")
    println("Nama     : $namaMahasiswa")
    println("NPM      : $npmMahasiswa")
    println("Semester : $semesterMahasiswa")
    println("IPK      : $ipkMahasiswa")

    // 2. Memperbarui nilai variabel var
    println("\n=== PEMBARUAN DATA AKADEMIK ===")
    print("Masukkan Semester Baru   : ")
    semesterMahasiswa = readln().toInt() // Memperbarui nilai var semester

    print("Masukkan IPK Terbaru     : ")
    ipkMahasiswa = readln().toDouble()   // Memperbarui nilai var IPK

    // 3. Menampilkan data mahasiswa setelah diperbarui
    println("\n==========================================")
    println("      DATA MAHASISWA (SETELAH UPDATE)     ")
    println("==========================================")
    println("Nama     : $namaMahasiswa (Tetap)")
    println("NPM      : $npmMahasiswa (Tetap)")
    println("Semester : $semesterMahasiswa (Diperbarui)")
    println("IPK      : $ipkMahasiswa (Diperbarui)")
}