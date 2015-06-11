/**
 * Consider static factory methods instead of constructors
 * Advantage:
 * 1. Unlike constructors, static the static factory methods have names
 * 2. Not required to create a new object each time they are invoked
 * 3. Return an object of any subtype of their return type
 * 4. Reduce the verbosity of creating parameterized type instances
 * 
 * Disadvantage:
 * 1. Classes which provide only static factory methods without public or 
 * protected constructors cannot be subclassed.
 * 2. Static factory methods are not readily distinguishable from other
 * static methods
 */
/**
 * @author quocanh
 *
 */
package creating_destroying_objects.item1;