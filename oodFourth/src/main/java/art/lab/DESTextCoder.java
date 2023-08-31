package art.lab;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class DESTextCoder implements TextCoder {
    @Override
    public String getTheCipheredText(final String originalText, final String key) {
        final String ALGORITHM = "DES";

        final SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);

        try {
            final Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            final byte[] encryptedBytes = cipher.doFinal(originalText.getBytes(StandardCharsets.UTF_8));

            return new String(encryptedBytes, StandardCharsets.UTF_8);

        } catch (final Exception e) {
            System.err.println(e.getMessage());
            return "";
        }
    }
}
