// Kelas yang merepresentasikan sebuah buku
class Book(val title: String, val author: String, val price: Int)

// Kelas yang merepresentasikan pesanan buku
class BookOrder {
    // Daftar buku yang tersedia, diinisialisasi di dalam kelas
    val books = listOf(
        Book("Cantik itu Luka", "Eka Kurniawan", 55000),
        Book("Laut Bercerita", "Leila S. Chudori", 62000),
        Book("Bumi Manusia", "Pramoedya Ananta Toer", 78000)
    )

    // Fungsi untuk menghitung total harga pesanan
    fun calculateTotalPrice(): Int {
        var totalPrice = 0
        // Menggunakan perulangan untuk menambahkan harga setiap buku ke total harga
        for (book in books) {
            totalPrice += book.price
            // Mencetak rincian harga buku
            println("Rincian Harga Buku:")
            println("${book.title} - ${book.author}: Rp ${book.price}")
        }
        return totalPrice
    }
}

fun main() {
    // Membuat objek BookOrder
    val bookOrder = BookOrder()
    // Menghitung total harga pesanan
    val totalPrice = bookOrder.calculateTotalPrice()
    // Mencetak total harga pesanan
    println("\nTotal harga pesanan adalah: Rp $totalPrice")
}
