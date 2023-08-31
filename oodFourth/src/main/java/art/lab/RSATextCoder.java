package art.lab;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class RSATextCoder implements TextCoder {
    @Override
    public String getTheCipheredText(final String originalText, final String key) {
        final String ALGORITHM = "RSA";

        try {
            final KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            final Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

            final byte[] encryptedBytes = cipher.doFinal(originalText.getBytes(StandardCharsets.UTF_8));

            return new String(encryptedBytes, StandardCharsets.UTF_8);

        } catch (final Exception e) {
            System.err.println(e.getMessage());
            return "";
        }
    }
}
