package Decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    // wraps the original writeData method to add encryption;
    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    // wraps the original readData method to add decryption;
    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }

    // private methods to handle encryption and decryption logic;

    private String encrypt(String data) {
        // Simple encryption logic (for demonstration)
        return new StringBuilder(data).reverse().toString();
    }

    private String decrypt(String data) {
        // Simple decryption logic (for demonstration)
        return new StringBuilder(data).reverse().toString();
    }
    
}
