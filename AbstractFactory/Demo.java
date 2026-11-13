
public class Demo {
    public static void main(String[] args) {
        // Create a MacOS factory and use it to create MacOS components
        GUIFactory factory = new MacGUIFactory();
        App app = new App(factory);
        app.click();
        

        // Create a Windows factory and use it to create Windows components
        factory = new WindowsGUIFactory();
        app = new App(factory);
        app.click();
    }
}
