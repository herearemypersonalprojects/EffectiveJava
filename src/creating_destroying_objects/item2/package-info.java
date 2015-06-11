/**
 * Consider a builder when faced with many constructor parameters
 * Why?
 * 1. The telescoping constructor pattern works, but it is hard to
 * write client code when there are many parameters, and harder still
 * to read it.
 * 2. The Builder pattern simulates named optional parameters
 * 
 * Conclusion: the Builder pattern is good choice when designing classes
 * whose constructors or static factories would have more than a handful
 * of parameters.
 * 
 */
/**
 * @author quocanh
 *
 */
package creating_destroying_objects.item2;