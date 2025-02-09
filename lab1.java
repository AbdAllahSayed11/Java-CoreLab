/*
class example {
public static void main(String args[]) {
	System.out.println("Hello World ");
}
}
*/


//---------------------
/*
class example2 {
public static void main(String args[]) {
int num=100 ; 
System.out.println("the number is " + num) ; // + concatunate 
num *=2 ;
System.out.print("the number is ") ;
System.out.println( num) ;

}
}
*/

//--------------------------------
/*
class example3 {
public static void main(String args[]) {
int x =1 , y=2 ; 
if (x<y) 
System.out.print("x less than y\n");
x*=2;
if (x==y) 
System.out.print(" x is equal y\n");
x*=2;
if (x>y)
System.out.print(" x greater than y \n");
x*=2;
if(x==y)
System.out.print(" x equal than y");

}

}
*/

//------------------------
/*
class example4 {
public static void main(String args[]) {

int x=0;
for (int i=0;i<10;i++)
{
x++;
System.out.println(" x equal " + x);
}
}
}
*/

//---------------------------------------
/*
class example5 {
public static void main(String args[]) {
int x,y=20;

for (x=0;x<10;x++) 
{
System.out.println("This x " + x);
System.out.println("This y " + y);
y = y - 2;
}
}
}
*/
//-----------------------------------------------
/*
class example6 {
public static void main(String args[]) {

System.out.print("This first one ");
}
}
*/
//--------------------------------------------
/*
class example7 
{
public static void main(String args[]) 
{
if (args.length>0)
for (int i=0 ; i<args.length;i++)
System.out.println(args[i]);
else 
System.out.println("no input ");
}
}
*/

//------------------------------------------
/*
class example
{
public static void main(String args[]) 
{
if (args.length=>2) 
{
int num = Integer.parseInt(args[0]); 
String text = args[1];
String[] word = text.split(" ");
for (int i =0 ; i<num && i<word.length ; i++)
{
System.out.println(words[i]);
}
else {
System.out.println("error enter again ");}
}
}

}

*/

//*************************************
/*
 class example8 {
 public static void main(String args[]) {
if (args.length >= 2) {

int num = Integer.parseInt(args[0]); 

String text = args[1];
String[] words = text.split(" ");

for (int i = 0; i < num && i < words.length ; i++) 
{
System.out.println(words[i]);
}
} else {

    System.out.println("Error");
}
}
}
*/

class CustomException extends Exception 
{
    public CustomException(String message) 
{
        super(message); //parent object
}
}
//---------------------- lab4
class operation {

    public void method1(int x) throws CustomException 
{
        if (x < 0) {
          	  throw new CustomException("Negative value m 1");
        	}
       	 System.out.println("1 done ");
}

     	 public void method2(int number) throws CustomException {
      		  if (number >= 0) {
        	    throw new CustomException("Only negative number");
      			  }
      				  System.out.println("2 done ");    }

    public void method3(int value) throws CustomException 
{
        if (value > 100) {
            		throw new CustomException("3 value is not valid");
        }
        	System.out.println("done 3");  }
}
//-------------------------------------------

 class MainClass {
    public static void main(String[] args) {
        operation op = new operation();

        try
 {
            op.method1(-1);
  } catch (CustomException e) {
            System.out.println( e.getMessage());
    } finally 
{
            System.out.println("block method1");
      }

       
        try 
{
            op.method2(10);
   } catch (CustomException e) {
            System.out.println( e.getMessage());
  }
 finally 
{
            System.out.println("block method2");
 }
        try
 {
            op.method3(150);
    } catch (CustomException e) {
            System.out.println( e.getMessage());
        }
 finally {
            System.out.println("block method3");
        }
    }
}





