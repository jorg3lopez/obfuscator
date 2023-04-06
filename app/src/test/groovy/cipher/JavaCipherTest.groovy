package cipher

import spock.lang.Specification

class JavaCipherTest extends Specification{

    def 'encrypt message'() {
        setup:
        def cipher = new JavaCipher()
        when:
        def message = "a b C Z"
        def key = 5
        def encrytedMessage = cipher.encrypt(message, key)
        then:
        encrytedMessage == "f g H E"
    }
}
