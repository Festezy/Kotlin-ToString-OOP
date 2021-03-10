package data.ToString

class MahasiswaToString (val Name: String, val Nim: Int, val Jurusan: String) {
    override fun toString(): String {
        return """
            Nama    : $Name
            Nim     : $Nim
            Jurusan : $Jurusan
        """.trimIndent()
    }
}