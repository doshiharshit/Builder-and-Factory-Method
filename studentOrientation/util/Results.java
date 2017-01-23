/**
 * Stores Message as a Result. Implements FileDisplay and ScreenDisplay
 */
package studentOrientation.util;

/**
 * @author Madhwani_Harsha_Doshi_Harshit
 *
 */
public class Results implements StdoutDisplayInterface, FileDisplayInterface{

	private String message;
	
	public Results() {
		Logger.writeMessage("Results Constructor called", Logger.DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * @param FileProcessor
	 * Writes result to File
	 */
	@Override
	public void writeSchedulesToFile(FileProcessor fileProcessorObjIn) {
		new FileProcessor("", APPLICATION_CONSTANTS.OUTPUT_FILENAME).writeToFile(getMessage());
	}

	/**
	 * Writes result to Screen
	 */
	@Override
	public void writeSchedulesToScreen() {
		System.out.println(getMessage());
	}

	/**
	 * Returns message.
	 * @return Message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets message 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return String
	 */
	@Override
	public String toString() {
		return getMessage();
	}
	
}
