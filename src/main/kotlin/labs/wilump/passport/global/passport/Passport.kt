package labs.wilump.passport.global.passport

data class Passport(
    val uid: String,
    val role: String,
    val issuedId: String,
) {
    fun serialize() : String {
        return "$uid:$role:$issuedId"
    }

    companion object {
        fun of(serializedString: String) : Passport {
            val parts = serializedString.split(":")
            return Passport(parts[0], parts[1], parts[2])
        }
    }
}