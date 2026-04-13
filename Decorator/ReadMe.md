
- The Component declares the common interface for both wrappers and wrapped objects. In this case it is DataSource. 

- Concrete Component is a class of objects being wrapped. It defines the basic behavior. In this case it is FileDataSource.

- The Base Decorator class has a field for referencing a wrapped object. The field’s type should be declared as the component interface so it can contain both concrete components and decorators. The base decorator delegates all operations to the wrapped object.

- Concrete Decorators define extra behaviors that can be added to components dynamically. Concrete decorators override methods of the base decorator and execute their behavior either before or after calling the parent method.

- The Client can wrap components in multiple layers of decorators, as long as it works with all objects via the component interface.

------------------------------------------------------------- 
A little bit more on why we need an abstract base decorator? 

Avoids Code Duplication: A BaseDecorator implements the target interface and provides a default delegation for all its methods. Without it, every concrete decorator (e.g., Milk, Sugar) would have to manually implement every interface method just to forward the call to the wrapped object.

Simplifies Concrete Decorators: By extending the BaseDecorator, concrete subclasses only need to override the specific methods they intend to change or enhance. All other methods are automatically handled by the base class's default implementation.

Centralizes the Wrapper Reference: The BaseDecorator typically holds the protected reference to the wrapped object (the "decoree"). This ensures that all decorators consistently store and access the wrapped component in the same way.

Future-Proofing (Maintenance): If the original interface adds a new method, you only need to update the BaseDecorator once to include a default delegation. Without this middle layer, you would have to modify every single concrete decorator class in your project.

Explicit Intent: Using an abstract BaseDecorator clearly signals to other developers that these classes are intended to be "wrappers" rather than primary implementations of the component