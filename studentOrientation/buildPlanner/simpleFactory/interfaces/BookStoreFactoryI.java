/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.interfaces;

import studentOrientation.buildPlanner.activity.interfaces.BookStoreI;
import studentOrientation.util.APPLICATION_CONSTANTS.BOOKSTORE;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public interface BookStoreFactoryI {
	public BookStoreI createBookStore(BOOKSTORE bookStoreChoice);
}
