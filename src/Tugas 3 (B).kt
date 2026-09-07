// TugasVariabel3.kt - Program Menghitung Total Belanja

fun main() {
    println("=== INPUT DATA TRANSAKSI BELANJA ===")

    // 1. Menerima input data transaksi dari keyboard menggunakan readln()
    print("Masukkan Nama Barang       : ")
    val namaBarang: String = readln()

    print("Masukkan Harga Barang (Rp) : ")
    val hargaBarang: Double = readln().toDouble()

    print("Masukkan Jumlah Barang     : ")
    val jumlahBarang: Int = readln().toInt()

    print("Masukkan Diskon (%)        : ")
    val persentaseDiskon: Double = readln().toDouble()

    // 2. Menghitung rincian pembayaran menggunakan fungsi terpisah
    val subtotal: Double = hitungSubtotal(hargaBarang, jumlahBarang)
    val potongan: Double = hitungPotongan(subtotal, persentaseDiskon)
    val totalBayar: Double = hitungTotalBayar(subtotal, potongan)

    // 3. Menampilkan rincian transaksi belanja dengan format rapi
    println("\n==========================================")
    println("              STRUK BELANJA               ")
    println("==========================================")
    println("Nama Barang        : $namaBarang")
    println("Harga Satuan       : Rp $hargaBarang")
    println("Jumlah Beli        : $jumlahBarang unit")
    println("------------------------------------------")
    println("Subtotal           : Rp $subtotal")
    println("Diskon             : $persentaseDiskon %")
    println("Potongan Harga     : Rp $potongan")
    println("------------------------------------------")
    println("Total Bayar        : Rp $totalBayar")
    println("==========================================")
}

// Fungsi menghitung Subtotal = harga × jumlah
fun hitungSubtotal(harga: Double, jumlah: Int): Double {
    return harga * jumlah
}

// Fungsi menghitung Potongan = subtotal × diskon / 100
fun hitungPotongan(subtotal: Double, diskon: Double): Double {
    return (subtotal * diskon) / 100.0
}

// Fungsi menghitung Total bayar = subtotal - potongan
fun hitungTotalBayar(subtotal: Double, potongan: Double): Double {
    return subtotal - potongan
}