fun main() {
    // 1. Menerima masukan bilangan bulat
    print("Masukkan bilangan: ")
    val bilanganInput: Int = readln().toInt()

    // 2. Memanggil fungsi untuk mengecek status genap atau ganjil
    val statusBilangan: String = cekGenapGanjil(bilanganInput)

    // 3. Menampilkan hasil sesuai format contoh luaran
    println("$bilanganInput merupakan bilangan $statusBilangan")
}

// Fungsi untuk menentukan bilangan Genap atau Ganjil menggunakan operator modulo (%)
fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) {
        "Genap"
    } else {
        "Ganjil"
    }
}