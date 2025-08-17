fun main() {
    for (h in 0..23) {
        for (m in 0..59) {
            for (s in 0..59) {
                println("%02d:%02d:%02d".format(h, m, s))
            }
        }
    }
}
