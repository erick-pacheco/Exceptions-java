# Instructions  
### Description:
The `throws` keyword is used to show that a particular method may throw an exception under certain conditions. On its own, the throws keyword does not doesn't "do" anything, but it does tell the compiler (and your fellow developers) that the method you are writing could potentially throw an exception which will need to be handled wherever the method is called. 

### Steps:
1. Make a Calculator.java file
2. Copy the following starter code into the new file:
```java
public class Calculator{
  
  public static void throwANumber(int throwMe)throws Exception{
    throw new Exception("I don't like the number " + throwMe + ", you can have it back!");
  }

  public static void catchIt(int catchMe){
    try{
      throwANumber(catchMe);
    }catch(RuntimeException ex){
      System.out.println("You'll never see this!");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }finally{
      System.out.println("I'm in the finally block");
    }
  }

  // Your code will go here
  
}
```
The Calculator class defines a method called *throwANumber()*. Note that it takes in an int value and uses the `throws` keyword to indicate that an Exception could be thrown from it. In the method body, we are deliberately throwing an Exception using the `throw` keyword. This means that every time the method is called, an Exception will be thrown!

This class also defines a method called *catchIt()*. It takes in an int value. This method then calls the *throwANumber()* method, but notice that it surrounds the call in a `try/catch` block. Because we know that *throwANumber()* will throw an exception, we need to handle it, and that is what the `try/catch` block is for.

If we take a look at the `try/catch` block, we can see that the method call is in the try block, because we are trying to run that statement. If an exception is thrown, it is thrown to one of its catch blocks, depending on the type of Exception that is thrown. If a Runtime Exception was thrown, the first catch block will run. The purpose of the second catch block is to catch any Exception that is not a Runtime Exception, and, since our *throwANumber()* method throws an Exception, this second catch block is the one that will handle it.

The finally block is an optional block that runs irrespective of whether an exception is caught or not. The finally block will even run if the program is stopped due to an unhandled exception, which makes it distinct from just putting code after the end of the try/catch.

3. Now that we've learned about exception handling, you will create a method and handle a potential exception being thrown from it.
4. In Calculator.java, after the comment `// Your code will go here`, create a static method called `calculate(int x, int y)` that throws an `ArithmeticException` and does not return a value. (Hint: Don't use the `throw` keyword as we don't want it to always throw an exception but only throw it if it finds the `ArithmeticException`)
5. In the calculate method, have it print out the result of the operation: `x / y`.
6. Next, create a static method called `use(int x, int y)` that does not return a value.
7. Create a try/catch block in the *use()* method.
8. In the try block, call the *calculate()* method and pass in the values of the `x` and `y` parameters that we defined in the *use()* method.
9. Create a catch block that should catch `ArithmeticException` and print out `Don't divide by 0!`.
10. Create a second catch block that should catch any other Exception, making sure that our catch statements are from most specific to most general. This catch block should print out `Some other exception`. 
11. Lastly, create a finally block that will state how it will always run if an exception is caught or not. This block should print out `This will always print out`.

### Test:
Use the test provided. 

#### Sample output:
```
I don't like the number 4, you can have it back!
I'm in the finally block
Don't divide by 0!
This will always print out
Made it to the end!
```