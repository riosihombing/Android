class ElectionResult {
    // Fungsi untuk menghitung pemenang berdasarkan suara masing-masing kandidat
    fun calculateWinner(totalVotes: Int, candidateVotes: Map<String, Int>): String {
        // Mencari kandidat dengan suara terbanyak
        var winner = ""
        var maxVotes = 0
        for ((candidate, votes) in candidateVotes) {
            if (votes > maxVotes) {
                winner = candidate
                maxVotes = votes
            }
        }
        // Mencetak hasil pemilihan umum
        println("Hasil Pemilihan Umum Presiden:")
        println("Total Suara Masuk: $totalVotes")
        println("Kandidat:")
        for ((candidate, votes) in candidateVotes) {
            println("$candidate: $votes suara")
        }
        println("Pemenang: $winner")
        return winner
    }
}

fun main() {
    // Total suara masuk
    val totalVotes = 4500
    // Suara masing-masing kandidat
    val candidateVotes = mapOf(
        "A" to 1500,
        "B" to 1800,
        "C" to 1200
    )

    // Membuat objek ElectionResult
    val electionResult = ElectionResult()
    // Menghitung pemenang berdasarkan suara masing-masing kandidat
    electionResult.calculateWinner(totalVotes, candidateVotes)
}
