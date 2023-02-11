package cipher

import spock.lang.Specification

class CipherTest extends Specification{

    def 'encrypt message'() {
        setup:
        def cipher = new JavaCipher()
        when:
        def message = "Hello world"
        def key = 5
        def encrytedMessage = cipher.encrypt(message, key)
        then:
        encrytedMessage == null
    }
}
