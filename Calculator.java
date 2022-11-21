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

  public static void calculate(int x, int y) {
    
  }
  
}