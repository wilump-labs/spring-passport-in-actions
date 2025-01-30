package labs.wilump.passport.global.passport

class InvalidPassportException(override val message: String) : RuntimeException("Invalid passport")