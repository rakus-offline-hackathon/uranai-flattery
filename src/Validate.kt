fun isValidName(name: String): Boolean {
    if (name.isNullOrBlank()) {
        return false
    }
    return true
}

fun isValidBirthday(birthday: String): Boolean {
    if (birthday.isNullOrBlank()) {
        return false
    }

    var regex = Regex("^({4})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$")
    return !regex.matches(birthday)
}