package Decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = super.readData();
        return decompress(compressedData);
    }

    private String compress(String data) {
        // Simulate compression (for demonstration purposes)
        return "COMPRESSED(" + data + ")";
    }

    private String decompress(String data) {
        // Simulate decompression (for demonstration purposes)
        if (data.startsWith("COMPRESSED(") && data.endsWith(")")) {
            return data.substring(11, data.length() - 1);
        }
        return data; // Return as is if not in expected format
    }
    
}
