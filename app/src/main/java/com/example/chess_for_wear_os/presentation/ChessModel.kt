
class ChessModel {
    override fun toString(): String {
        var desc = ""
        for (coll in 1..8) {
            desc += "$coll"
            for (row in 1..8) {
                desc += " ."
            }
            desc +=  "\n"
        }
        desc += "  1 2 3 4 5 6 7 8"
        return desc
    }
}