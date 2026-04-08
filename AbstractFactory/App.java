package AbstractFactory;

// client code, which uses the abstract factory to create UI components without being concerned about the specific platform.
public class App {
        private Button button;
        private Checkbox checkbox;

        public App(GUIFactory factory) {
            button = factory.createButton();
            checkbox = factory.createCheckbox();
        }

        public void click() {
            button.paint();
            checkbox.check();
        }
}
