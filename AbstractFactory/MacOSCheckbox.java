package AbstractFactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checking a checkbox in MacOS style.");
    }
    
}
