import java.text.NumberFormat
import java.util.Locale

fun main() {
    println("=== INPUT DATA GAJI PEGAWAI ===")

    print("Masukkan Nama Pegawai     : ")
    val namaPegawai: String = readln()

    // .replace(".", "").trim() membersihkan titik dan spasi sebelum diubah ke Long
    print("Masukkan Gaji Pokok (Rp)  : ")
    val gajiPokok: Long = readln().replace(".", "").trim().toLong()

    print("Masukkan Tunjangan (Rp)   : ")
    val tunjangan: Long = readln().replace(".", "").trim().toLong()

    print("Masukkan Uang Lembur (Rp) : ")
    val uangLembur: Long = readln().replace(".", "").trim().toLong()

    print("Masukkan Potongan (Rp)    : ")
    val potongan: Long = readln().replace(".", "").trim().toLong()

    // Perhitungan gaji
    val gajiKotor: Long = hitungGajiKotor(gajiPokok, tunjangan, uangLembur)
    val gajiBersih: Long = hitungGajiBersih(gajiKotor, potongan)

    val formatRupiah = NumberFormat.getNumberInstance(Locale("id", "ID"))

    // Menampilkan rincian slip gaji
    println("\n==========================================")
    println("            SLIP GAJI PEGAWAI             ")
    println("==========================================")
    println("Nama Pegawai      : $namaPegawai")
    println("------------------------------------------")
    println("Gaji Pokok        : Rp ${formatRupiah.format(gajiPokok)}")
    println("Tunjangan         : Rp ${formatRupiah.format(tunjangan)}")
    println("Uang Lembur       : Rp ${formatRupiah.format(uangLembur)}")
    println("------------------------------------------")
    println("Gaji Kotor        : Rp ${formatRupiah.format(gajiKotor)}")
    println("Potongan          : Rp ${formatRupiah.format(potongan)}")
    println("------------------------------------------")
    println("Gaji Bersih       : Rp ${formatRupiah.format(gajiBersih)}")
    println("==========================================")
}

// Fungsi menghitung Gaji kotor = gaji pokok + tunjangan + uang lembur
fun hitungGajiKotor(gajiPokok: Long, tunjangan: Long, uangLembur: Long): Long {
    return gajiPokok + tunjangan + uangLembur
}

// Fungsi menghitung Gaji bersih = gaji kotor - potongan
fun hitungGajiBersih(gajiKotor: Long, potongan: Long): Long {
    return gajiKotor - potongan
}