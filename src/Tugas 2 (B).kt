fun main() {
    // 1. Menerima masukan dua bilangan dari keyboard
    print("Masukkan nilai A: ")
    var nilaiA: Int = readln().toInt()

    print("Masukkan nilai B: ")
    var nilaiB: Int = readln().toInt()

    // 2. Menampilkan nilai sebelum ditukar
    println("\nSebelum ditukar:")
    println("A = $nilaiA")
    println("B = $nilaiB")

    // 3. Proses pertukaran menggunakan variabel sementara
    // Variabel nilaiA dan nilaiB harus bertipe 'var' agar nilainya bisa ditugaskan ulang
    val temp: Int = nilaiA
    nilaiA = nilaiB
    nilaiB = temp

    // 4. Menampilkan nilai setelah pertukaran berhasil
    println("\nSetelah ditukar:")
    println("A = $nilaiA")
    println("B = $nilaiB")
}