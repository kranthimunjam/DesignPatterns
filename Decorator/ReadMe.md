
## Why is this pattern needed? 
    Instead of creating a class for each combination of behaviours(in this case classes would be CompressedData, EncryptedData, EncryptedCompressedData etc which leads to class explosion as more and more behaviours are added) we will use a class for each behaviour(CompressionDecorator, EncryptionDecorator etc) and mix and match these while creating obj to get the behaviour we want, no need to change any existing code. 
- There will be an interface for the base object(s). Like Coffee interface for all type of coffees. So the concrete types implement this: DarkRoast, Espresso, Latte etc. all implement the Coffee interface. 

- And to wrap the objects of type Coffee, we will create an abstract class CoffeeWrapper implement the same Coffee interface. This will be base decorator that all behaviours will implement this class.

- It is important to have decorator implement the same interface as the objects it is decorating.

- Concrete Decorators define extra behaviors that can be added to components dynamically. Concrete decorators override methods of the base decorator and execute their behavior either before or after calling the parent method.

- The Client can now pick and choose the behaviours it wants around the base object i.e., Coffee.

------------------------------------------------------------- 
A little bit more on why we need an abstract base decorator? 

Avoids Code Duplication: A BaseDecorator implements the target interface and provides a default delegation for all its methods. Without it, every concrete decorator (e.g., Mocha, Whip) would have to manually implement every interface method just to forward the call to the wrapped object.

Simplifies Concrete Decorators: By extending the BaseDecorator, concrete subclasses only need to override the specific methods they intend to change or enhance. All other methods are automatically handled by the base class's default implementation.

Centralizes the Wrapper Reference: The BaseDecorator typically holds the protected reference to the wrapped object (the "decoree"). This ensures that all decorators consistently store and access the wrapped component in the same way.

Future-Proofing (Maintenance): If the original interface adds a new method, you only need to update the BaseDecorator once to include a default delegation. Without this middle layer, you would have to modify every single concrete decorator class in your project.

Explicit Intent: Using an abstract BaseDecorator clearly signals to other developers that these classes are intended to be "wrappers" rather than primary implementations of the component

Limitations of this pattern: 
- What if I want to give a discount only for Espresso? It won't work with Wrapped Espresso. If the code relies on concrete component's type, decorators will break that code. As long as we use the abstract types, we should be fine.
- Is it possible to get the description as "double mocha, whip" instead of "mocha, whip, mocha"? Yes, we can use an outer most decorator(another wrapper) for changing the behavior of the description.