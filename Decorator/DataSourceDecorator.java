package Decorator;


// WHy is this class abstract? 
// Because it provides a base implementation for the DataSource interface, but it is not meant to be instantiated on its own. 
// It serves as a foundation for concrete decorators that will extend its functionality by overriding the writeData and readData methods.
//  By making it abstract, we ensure that it cannot be instantiated directly, and it encourages the creation of specific decorator classes 
// that add additional behavior to the DataSource.
// 1. 
public  abstract class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
    
}
