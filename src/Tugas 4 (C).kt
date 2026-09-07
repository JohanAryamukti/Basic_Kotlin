fun main() {
    println("=== INPUT NILAI MAHASISWA ===")

    // 1. Menerima input nilai komponen
    print("Masukkan Nilai Tugas : ")
    val nilaiTugas: Double = readln().toDouble()

    print("Masukkan Nilai UTS   : ")
    val nilaiUts: Double = readln().toDouble()

    print("Masukkan Nilai UAS   : ")
    val nilaiUas: Double = readln().toDouble()

    // 2. Memanggil fungsi hitungNilaiAkhir
    val nilaiAkhir: Double = hitungNilaiAkhir(nilaiTugas, nilaiUts, nilaiUas)

    // 3. Memanggil fungsi tentukanGrade berdasarkan nilai akhir
    val gradeMahasiswa: String = tentukanGrade(nilaiAkhir)

    // 4. Menampilkan hasil evaluasi
    println("\n==========================================")
    println("         HASIL EVALUASI AKADEMIK          ")
    println("==========================================")
    println("Nilai Tugas (30%) : $nilaiTugas")
    println("Nilai UTS   (30%) : $nilaiUts")
    println("Nilai UAS   (40%) : $nilaiUas")
    println("------------------------------------------")
    println("Nilai Akhir       : ${String.format("%.2f", nilaiAkhir)}")
    println("Grade             : $gradeMahasiswa")
    println("==========================================")
}

// Fungsi 1: Menghitung nilai akhir dengan bobot Tugas 30%, UTS 30%, UAS 40%
fun hitungNilaiAkhir(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

// Fungsi 2: Menentukan grade huruf berdasarkan rentang nilai menggunakan ekspresi when
fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80.0 -> "A"
        nilai >= 70.0 -> "B"
        nilai >= 60.0 -> "C"
        nilai >= 50.0 -> "D"
        else -> "E"
    }
}