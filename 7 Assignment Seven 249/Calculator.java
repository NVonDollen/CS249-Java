/*Written by Nick VonDollen
 * 11/7/2016
 * CS 249
 */
public class Calculator {
	public static double eval(String expr) throws InvalidExpressionException {
		try{
			int plusSymbol = expr.indexOf("+");
			int minusSymbol = expr.indexOf("-");
			//System.out.println("Minus Symbol found at: " + minusSymbol);
			//System.out.println("Plus Symbol found at: " + plusSymbol);
			double answer = 0;
			if(plusSymbol > -1 )	//if a + is found
			{
				String firstOperand = expr.substring(0,expr.indexOf("+"));
				String secondOperand = expr.substring(expr.indexOf("+")+1, expr.length());
				
				double firstOpDouble = Double.parseDouble(firstOperand);
				//System.out.println(firstOpDouble);
				double secondOpDouble = Double.parseDouble(secondOperand);
				//System.out.println(secondOpDouble);
				
				answer = firstOpDouble + secondOpDouble;
				return answer;
			}
			if(minusSymbol > -1)	//if a - is found
			{
				String firstOperand = expr.substring(0,expr.indexOf("-"));
				String secondOperand = expr.substring(expr.indexOf("-")+1, expr.length());
				
				double firstOpDouble = Double.parseDouble(firstOperand);
				//System.out.println(firstOpDouble);
				double secondOpDouble = Double.parseDouble(secondOperand);
				//System.out.println(secondOpDouble);
				
				answer = firstOpDouble - secondOpDouble;
				return answer;
			}
			else
			{
				String neitherExist = expr.substring(0,expr.indexOf("+"));
			}
			return answer;
			
			
		}			
		catch(Exception ex){
			throw new InvalidExpressionException("Invalid Expression", ex);
		}
	}
}
		


