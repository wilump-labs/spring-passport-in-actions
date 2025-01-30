package labs.wilump.passport.global.passport

import labs.wilump.passport.global.constants.HttpHeaders.PASSPORT_HEADER
import org.springframework.core.MethodParameter
import org.springframework.stereotype.Component
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer

@Component
class CurrentPassportResolver : HandlerMethodArgumentResolver {
    override fun supportsParameter(parameter: MethodParameter): Boolean {
        return parameter.getParameterAnnotation(CurrentPassport::class.java) != null
    }

    override fun resolveArgument(
        parameter: MethodParameter,
        mavContainer: ModelAndViewContainer?,
        webRequest: NativeWebRequest,
        binderFactory: WebDataBinderFactory?
    ): Passport {
        return webRequest.getHeader(PASSPORT_HEADER)
            ?.let { Passport.of(it) }
            ?: throw InvalidPassportException("Passport not found in headers")
    }
}