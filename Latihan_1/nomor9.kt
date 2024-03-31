open class KeluargaMouri(val nama: String, val pekerjaan: String) {
    open fun info() {
        println("Nama: $nama")
        println("Pekerjaan: $pekerjaan")
    }
}
class OrangTua(nama: String, pekerjaan: String, val peran: String) : KeluargaMouri(nama, pekerjaan) {
    override fun info() {
        super.info()
        println("Peran: $peran")
    }
}
class Anak(nama: String, pekerjaan: String, val sekolah : String, val peran: String) : KeluargaMouri(nama, pekerjaan) {
    override fun info() {
        super.info()
        println("sekolah : $sekolah")
        println("Peran: $peran")
    }
}
fun main() {
    val kogoro = OrangTua("Kogoro Mouri", "Detektif Swasta", "Ayah")
    val eri = OrangTua("Eri Kisaki", "Pengacara", "Ibu")
    val ran = Anak("Ran Mouri", "Siswa", "SMA Teitan", "Anak")
    println("Keluarga Mouri\n")
    println("Orang Tua:")
    kogoro.info()
    print("\n")
    eri.info()
    println("\nAnak:")
    ran.info()
    println("\nNomor Soal 9 tentang Detective Conan ini di Compile oleh\nNIM - Kelas- Nama")
}