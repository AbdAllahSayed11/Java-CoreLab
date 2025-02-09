/*class ex1 {
static public void main (String args[]) {

int size =10;
int arr[]=new int[size];

for (int i=0 ; i<size;i++)
{
arr[i]=arr[i].rand();

}

}
}*/

/*
class SearchComparison {

    public static void main(String[] args) {
        int size = 1000; // Array size
        int[] array = new int[size];
        

        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(0,10000);
        }


        int target = rand.nextInt(100);
        
        long startTime = System.nanoTime();
        int linearResult = linearSearch(array, target);
        long endTime = System.nanoTime();
        long linearDuration = endTime - startTime;

        System.out.println(" Result " + (linearResult == -1 ? "Not Found" : "Found"));
        System.out.println(" Linear Search Time" + linearDuration);

        java.util.Arrays.sort(array);

        startTime = System.nanoTime();
        int binaryResult = binarySearch(array, target);
        endTime = System.nanoTime();
        long binaryDuration = endTime - startTime;

        System.out.println(" Result: " + (binaryResult == -1 ? "Not Found" : "Found"));
        System.out.println("Binary time " + binaryDuration);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static int binarySearch(int arr[], int target) {
        int min = 0, max = arr.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1; 
    }
}
*/

/*
class example1 {

    public static void main(String[] args) {
    
    String s = "iti assuit iti branch iti ";
    String wordFind ="iti";
    String[] words = s.split(" ");
    
    int count =0 ;
    
    for (String w : words )
    	{
    		if (w.equals(wordFind))
    			{
    				count++;
    			}

    	}
    		System.out.println(wordFind +" count of it "+ count); 
      }
   }
   */
   
 /*  
import java.util.StringTokenizer; //look

class Example2 {

    public static void main(String[] args) {
    
        String s = "iti assuit iti branch iti ";
        String wordFind = "iti";
        StringTokenizer tokenizer = new StringTokenizer(s);
        int count = 0;
        while (tokenizer.hasMoreTokens()) {  // 3enk hena de method in StringTokenizer check if there more
            String token = tokenizer.nextToken(); 
            	if (token.equals(wordFind)) {
                	count++; 
            }
        }
        System.out.println(count);
    }
}
 
*/

/*
class example3 {

    public static void main(String[] args) {
    
    String ipAdd = "168.198.1.1";
    String[] sub = ipAdd.split(".");
    for (String part : sub ){
    if (isDigit(part) && part => 255 && <=0) { //for charaacter only 
    		System.out.println(part);
    		}
    		else{
    			System.out.println(part +"not valid")
    		}
    
	    }
	}
}

*/
/*
class example3 {

    public static void main(String[] args) {
    
        String ipAdd = "168.198.1.1";
        String[] sub = ipAdd.split("\\.");
        
        for (String part : sub) {
           
            if (Integer.parseInt(part) >= 0 && Integer.parseInt(part) <= 255) {
                System.out.println(part);
            } else {
                System.out.println(part + " not valid");
            }
        }
    }
}
*/
   
   
//e1 in lab3 interfaces 
/*
import java.util.function.Function;

class temp {
    public static void main(String[] args) {
        Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9/5) + 32;
        double celsius = 25.0;
        double fahrenheit = celsiusToFahrenheit.apply(celsius);
        System.out.println(celsius + " Celsius = " + fahrenheit + " fahrenheit ");
    }
}
*/

//e2

import java.util.function.Function;

class eq {
    public static void main(String args[]) {
    double a =2;
    double b =20;
    double c =10;
    
    Function<Double, Double> discriminant = (Double val) -> Math.pow(val, 2) - 4 * a * c;
    double discriminantValue = discriminant.apply(b);
    double root1 = (-b + Math.sqrt(discriminantValue)) / (a * 2) ;
    double root2 = (-b - Math.sqrt(discriminantValue)) / (a * 2) ;
    System.out.println("root 1 = " + root1);
    System.out.println("root 2  = " + root2);
    }
}


   
   
    

