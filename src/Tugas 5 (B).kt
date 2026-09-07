fun main() {
    println("=== INPUT DATA NILAI MAHASISWA ===")

    // 1. Menerima masukan nama dan komponen nilai dari keyboard
    print("Masukkan Nama Mahasiswa : ")
    val namaMahasiswa: String = readln()

    print("Masukkan Nilai Tugas    : ")
    val nilaiTugas: Double = readln().toDouble()

    print("Masukkan Nilai Kuis     : ")
    val nilaiKuis: Double = readln().toDouble()

    print("Masukkan Nilai UTS      : ")
    val nilaiUts: Double = readln().toDouble()

    print("Masukkan Nilai UAS      : ")
    val nilaiUas: Double = readln().toDouble()

    // 2. Menghitung nilai akhir menggunakan fungsi terpisah
    val nilaiAkhir: Double = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUts, nilaiUas)

    // 3. Menampilkan rincian nilai akhir
    println("\n==========================================")
    println("          LEMBAR HASIL EVALUASI           ")
    println("==========================================")
    println("Nama Mahasiswa    : $namaMahasiswa")
    println("------------------------------------------")
    println("Nilai Tugas (25%) : $nilaiTugas")
    println("Nilai Kuis  (15%) : $nilaiKuis")
    println("Nilai UTS   (25%) : $nilaiUts")
    println("Nilai UAS   (35%) : $nilaiUas")
    println("------------------------------------------")
    println("Nilai Akhir       : ${String.format("%.2f", nilaiAkhir)}")
    println("==========================================")
}

// Fungsi menghitung Nilai akhir = (tugas × 0.25) + (kuis × 0.15) + (UTS × 0.25) + (UAS × 0.35)
fun hitungNilaiAkhir(tugas: Double, kuis: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)
}