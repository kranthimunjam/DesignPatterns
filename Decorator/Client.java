package Decorator;

public class Client {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("file.txt");
        DataSource encryptedDataSource = new EncryptionDecorator(dataSource);
        DataSource compressedDataSource = new CompressionDecorator(encryptedDataSource);

        compressedDataSource.writeData("Hello, World!");
        String result = compressedDataSource.readData();
        System.out.println("Read data: " + result);
    }
}
