package Decorator;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        // Code to write data to a file
        System.out.println("Writing data to file: " + filename);
    }

    @Override
    public String readData() {
        // Code to read data from a file
        System.out.println("Reading data from file: " + filename);
        return "Data from file";
    }
    
}
