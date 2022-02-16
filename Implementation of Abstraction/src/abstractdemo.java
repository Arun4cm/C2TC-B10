abstract class abstractdemo  
{ 
  abstract void calculate(int a, int b);  
 } 
class Addition extends abstractdemo 
{ 
  void calculate(int a, int b)
  { 
    int x = a + b; 
    System.out.println("Sum: " +x); 
   } 
} 
class Subtraction extends abstractdemo 
{ 
  void calculate(int a, int b)
  { 
    int y = a - b; 
    System.out.println("Subtract: " +y); 
  } 
} 
class Multiplication extends abstractdemo 
{ 
  void calculate(int a, int b)
  { 
    int z = a * b; 
    System.out.println("Multiply: " +z); 
  } 
} 
class MyClass 
{ 
 public static void main(String[] args) 
 { 
   Addition a = new Addition(); 
   Subtraction s = new Subtraction(); 
   Multiplication m = new Multiplication(); 
    
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 
  } 
}