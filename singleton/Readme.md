# Why is this pattern needed?
 To provide single instance and global access to an object type.

 - If not Synchronized properly then due to interleaving multiple instances can be created by different threads. 
 - That can be avoided by the use of `volatile` and `synchronized`.
 - Use lazy initialization if the singleton object is heavy(resource intensive) to create. 
 - synchronize can slow down the throughput by a factor of 100. So it's better if lock only first time when instance is being created, instead of locking the entire `getInstance()`. 
 - Also, if there are multiple class loaders then there could be multiple instances of singleton class.
