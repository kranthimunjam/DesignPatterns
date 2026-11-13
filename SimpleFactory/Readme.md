 Simple Factory is an programming idiom, not a design pattern. 
 
# Why is this pattern needed? 
- To remove tight coupling introduced by 'new'. So we encapsulate what changes in another class(Factory).
- Another advantage of this is the only place we need to change if we decide to add a new Pizza type say GreekPizza. So if there are other places in code(besides PizzaStore) which also create Pizza, they end up adding a new condition if(type == greek) etc in all those places if we don't use factory.

# What is a static factory?
- With static factory, factory doesn't need to be instantiated but downside is it can't be sub-classed and change the behaviour of concrete method. 


  