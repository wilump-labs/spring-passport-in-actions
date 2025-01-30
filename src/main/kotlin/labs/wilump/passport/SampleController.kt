package labs.wilump.passport

import labs.wilump.passport.global.passport.CurrentPassport
import labs.wilump.passport.global.passport.Passport
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/public")
    fun public(): String {
        return "public"
    }

    @GetMapping("/me")
    fun me(@CurrentPassport passport: Passport): String {
        return passport.serialize()
    }
}