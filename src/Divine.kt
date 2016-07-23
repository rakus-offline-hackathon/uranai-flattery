fun calc(vararg exerted: Int): Int {
    val ans: String = exerted.sum().toString()
    return ans.substring(ans.length - 1).toInt()
}

fun getDivine(ordinal: Int): String {
    val types = Divine.values()
    for (type in types) {
        if (type.ordinal == ordinal) {
            return type.toString();
        }
    }
    return errorMessage
}

enum class Divine {
    マジで一番いい,
    一日中笑顔,
    人によっては幸せな日,
    痛いことはない,
    普通,
    電車が遅延する,
    かなりの痛みを味わう,
    退職する,
    仲いい人全員と一生会えない,
    死ぬ;
}