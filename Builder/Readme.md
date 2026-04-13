Builder interface declares the product construction steps that are common to all types of builders. 

Concreate Builders provide different implementations of the construction steps. Concrete builders may produce products that don't follow the common interface as well. 

Products are resulting objects constructed by Builders. Products constructed by different builders don't have to belong to the same class heirarchy or interface. Meaning we don't need to have an interface Product which gets returned by various concrete builders.

Director defines the order in which the constrcution should happen. Here we can create and resuse specific configuration of products.

The Client must associate one of the builders with the director. Usually, it's done just once, via parameters of the director uses that builder object for construction.





