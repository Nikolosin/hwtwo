package profile

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatar: String
) {
    val fullName: String
        get() = "$name $surname"
}

fun main() {
    val profile = Profile(12345, "qwerty123", "Andrey", "Sidorov", "single", "jpeg")
    println(profile.fullName)
}
