/*Written by Nick VonDollen
 * 11/7/2016
 * CS 249
 */
public class InvalidExpressionException extends Exception {

	public InvalidExpressionException(String message, Exception ex){
		 super(message,ex);
	}
}
