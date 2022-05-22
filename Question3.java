// JEAN MUJURU R183432H


1.	What is RunTime exception in java? Explain using Example Code.

The Runtime Exception is the parent class in all exceptions of the Java 
programming language that are expected to crash or break down the 
program or application when they occur.
The Runtime Exception usually shows the programmer_s error, rather than 
the condition a program is expected to deal with. Runtime Exceptions 
are also used when a condition that cannot happen. It should be noted 
that when a program is running out of memory, a program error is thrown 
instead of showing it as a Runtime Exception.
import java.lang
public class RuntimeException
extends Exception
RuntimeException is the superclass of those exceptions that can be 
thrown during the normal operation of the Java Virtual Machine.
RuntimeException and its subclasses are unchecked exceptions. 
Unchecked exceptions do not need to be declared in a method or 
constructor_s throws clause if they can be thrown by the execution 
of the method or constructor and propagate outside the method or 
constructor boundary.
class GFG {
	public static void main(String[] args)
	{
		// create array of 5 size
		int[] a = new int[] { 1, 2, 3, 4, 5 };

		// execute for loop
		for (int i = 0; i < 6; i++) {
			// print the value of array
			System.out.println(a[i]);
		}
	}
}


2.	Write a short program to demonstrate the try...catch...finally block

public class GFG{
    public void GreeksForGreeks(){
        // throw exception
        throw new Greeks();
    }
  
    public static void main(String[] args){
        try{
            new GFG().GreeksForGreeks();
        }
        // catch exception
        catch (Exception x){
            System.out.println(
                "example of runtime exception");
        }
    }
}
  
class Greeks extends RuntimeException{
    public Greeks(){
        super();
    }
}