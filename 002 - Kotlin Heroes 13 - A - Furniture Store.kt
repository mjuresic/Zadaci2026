import java.lang.StringBuilder

fun main() {
    val br = System.`in`.bufferedReader()
    val out = StringBuilder()

    val t = br.readLine().trim().toInt()

    repeat(t) {
        val n = br.readLine().trim().toInt()
        val cijene = br.readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }

        val krivo = mutableListOf<Int>()

        var prefMin = cijene.first()   

        for (i in 1 until n) {
            val cijena = cijene[i]
            if (cijena >= prefMin) {
                krivo  += (i + 1)
            } else {
                prefMin = cijena
            }
        }

        out.appendLine(krivo.size)
        out.appendLine(krivo.joinToString(" "))
    }

    print(out.toString())
}
