public class Calculator {

  public static void throwANumber(int throwMe) throws Exception {
    throw new Exception("I don't like the number " + throwMe + ", you can have it back!");
  }

  public static void catchIt(int catchMe) {
    try {
      throwANumber(catchMe);
    } catch (RuntimeException ex) {
      log("You'll never see this!");
    } catch (Exception e) {
      log(e.getMessage());
    } finally {
      log("I'm in the finally block");
    }
  }

  // Your code will go here
  public static void calculate(int x, int y) throws ArithmeticException {
    log(x / y);
  }

  public static void use(int x, int y)  {
    try {
      calculate(x, y);
    } catch (ArithmeticException ex) {
      log("Don't divide by 0!");
    } catch (Exception ex) {
      log("Some other exception");
    } finally {
      log("This will always print out");
    }
  }

  public static void log(Object message) {
    System.out.println(message);
  }

}