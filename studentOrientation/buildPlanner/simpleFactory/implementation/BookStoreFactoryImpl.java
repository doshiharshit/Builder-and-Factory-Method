/**
 * 
 */
package studentOrientation.buildPlanner.simpleFactory.implementation;

import studentOrientation.buildPlanner.activity.implementation.MandoBookStore;
import studentOrientation.buildPlanner.activity.implementation.UniversityBookStore;
import studentOrientation.buildPlanner.activity.interfaces.BookStoreI;
import studentOrientation.buildPlanner.simpleFactory.interfaces.BookStoreFactoryI;
import studentOrientation.util.APPLICATION_CONSTANTS.BOOKSTORE;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class BookStoreFactoryImpl implements BookStoreFactoryI{

	/**
	 * Factory retrieves concrete class to bookstore type
	 */
	@Override
	public BookStoreI createBookStore(BOOKSTORE bookStoreChoice) {
		if (BOOKSTORE.UNIVERSITY.equals(bookStoreChoice)) {
			return new UniversityBookStore();
		}else if(BOOKSTORE.MANDO.equals(bookStoreChoice)){
			return new MandoBookStore();
		}else{
			return null;
		}
	}
	
}
