package data.ToString

class PembeliToString (var userName: String, var password: String){
    override fun toString(): String {
        return "username $userName, dan password $password"
    }

}