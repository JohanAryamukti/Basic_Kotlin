fun main() {
    // 1. Menerima masukan bilangan desimal dalam bentuk String dari keyboard
    print("Masukkan bilangan desimal: ")
    val inputDesimalString: String = readln()

    // 2. Mengubah String menjadi Double
    val nilaiDouble: Double = inputDesimalString.toDouble()

    // 3. Mengubah Double menjadi Int
    val nilaiInt: Int = nilaiDouble.toInt()

    // 4. Mengubah Double kembali menjadi String
    val nilaiStringKembali: String = nilaiDouble.toString()

    // 5. Menampilkan hasil konversi
    println("\nNilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiStringKembali")
}