fun main() {
    println("=== PROGRAM KONVERSI SUHU ===")

    // 1. Menerima input suhu dalam Celsius
    print("Masukkan suhu dalam Celsius: ")
    val suhuCelsius: Double = readln().toDouble()

    // 2. Menghitung konversi suhu menggunakan fungsi terpisah
    val suhuFahrenheit: Double = konversiCelsiusKeFahrenheit(suhuCelsius)
    val suhuKelvin: Double = konversiCelsiusKeKelvin(suhuCelsius)

    // 3. Menampilkan hasil konversi
    println("\n=== HASIL KONVERSI ===")
    println("Suhu Celsius    : $suhuCelsius °C")
    println("Suhu Fahrenheit : $suhuFahrenheit °F")
    println("Suhu Kelvin     : $suhuKelvin K")
}

// Fungsi untuk mengonversi Celsius ke Fahrenheit: (C × 9/5) + 32
fun konversiCelsiusKeFahrenheit(celsius: Double): Double {
    return (celsius * 9.0 / 5.0) + 32.0
}

// Fungsi untuk mengonversi Celsius ke Kelvin: C + 273.15
fun konversiCelsiusKeKelvin(celsius: Double): Double {
    return celsius + 273.15
}