//AbdAllah Sayed  java labs 4,5,6,7
//lab 4  waild card generic 

abstract class Shape {
    public abstract void draw();
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}


class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
import java.util.List;

public class TestShapes {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(); 
        }
    }
    public static void main(String[] args) {

        List<Rectangle> rectangles = List.of(new Rectangle(), new Rectangle());


        List<Shape> shapes = List.of(new Rectangle(), new Circle());


        System.out.println("drawing Rectangles");
        drawShapes(rectangles); 
    }
}
*/

//lab 4 e2 
/*
 class Complex 
{
     double real;
     double imag;

    // Constructor to initialize the complex number
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }
    public double getimag() 
 {
        return imag;
           }
    public Complex add(Complex other) 
   {
        double realPart = this.real + other.getReal();
        double imagPart = this.imag + other.getimag();
        return new Complex(realPart, imagPart);
    }
    
    public Complex subtract(Complex other) 
 {
           double realPart = this.real - other.getReal();
        double imagPart = this.imag - other.getimag();
           return new Complex(realPart, imagPart);
    }

                                 // look override tostring method for imag
    @Override
    public String toString() 
 {
        return real + imag + "i";
    }
}



*/


//lab5 e1 
// which string is better 
/*
 class betterString {

  public static void main(String[] args) 
  {
        betterString Instance = new betterString();


        String result = Instance.betterString("abody123", "abody" , 
        (str1, str2) -> !containsNumber(str1));
        System.out.println(result);
    }
    public String betterString(String str1, String str2, BetterStringCondition condition) 
 {
        return condition.isBetter(str1, str2) ? str1 : str2;
 }
    public static boolean containsNumber(String str) 
  {
        return str.matches(".*\\d.*"); //ask goz REGX to any number in the string 
  }

    // functional interface for the lambda 
    
    @FunctionalInterface
    public interface BetterStringCondition
   {
        boolean isBetter(String str1, String str2);
    }
}
*/
   
   
   


/*
//lab 5 e2 check alphabet
 class alphabetCheck {

    public static boolean isAlph(String str) 
  {
        if (str == null || str.isEmpty())  //if  str empty
       {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) //isLetter L capital ***charAt()
            {
                return false;
            }
        }
  return true;
    }

    public static void main(String[] args) 
 {
        String testString1 = "hello";
        String testString2 = "22hello";
        System.out.println(testString1 + isAlph(testString1)); 
        System.out.println(testString2 + isAlph(testString2));

    }
}
*/


//**********************************

/*
import java.util.*;
// lab 6 java make dictionary and search by alpha using map abooooood*******

public class dictionary {
    
    // Map 
     Map<Character, Set<String> > wordMap; //chara , value word -string


     dictionary()
     {
        wordMap = new TreeMap<>(); 
        	for (char letter = 'a'; letter <= 'z'; letter++) 
        		{
        		    wordMap.put(letter, new TreeSet<>());  // TreeSet  automatically sorts the words  
        		}
    }

    // Method to add a word to dictionary
    public void addWord(String word) 
    {
    	    if (word != null && !word.isEmpty()) 
    	    {
    	        char firstLetter = Character.toLowerCase(word.charAt(0));  // Get letter
    		        if (wordMap.containsKey(firstLetter)) 
    		        {
    	            wordMap.get(firstLetter).add(word.toLowerCase());  // Add word here 
    		        }
    		    }
 }


    public void printAllWords() 
    {
       	 for (Map.Entry<Character, Set<String>> entry : wordMap.entrySet()) 
        {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
}

    public void printWordsForLetter(char letter)
     {
        letter = Character.toLowerCase(letter); 
        if (wordMap.containsKey(letter)) {
            System.out.println("Words starting with '" + letter + wordMap.get(letter));
        } else {
            System.out.println("No words found for the letter '" + letter);     
               }
}

    public static void main(String[] args) 
    {
        dictionary dictionary = new dictionary();
        dictionary.addWord("amr");
        dictionary.addWord("billie");
        dictionary.addWord("cat");
        dictionary.addWord("doddy");

        /*System.out.println("All words in dictionary:");
        dictionary.printAllWords();*/

/*
        System.out.println("Words for b");
        dictionary.printWordsForLetter('b');
        
        System.out.println("Words for a");
        dictionary.printWordsForLetter('a');
    }
}
*/



//lab 7 
//date and move 
/*
import javax.swing.*;
import java.awt.*;
import java.util.Date;

 class DateTimeApp extends JFrame implements Runnable 
 {
    Thread th;
    Date d = new Date();
    JLabel timeLabel = new JLabel();
    int x = 0; 

     DateTimeApp() {
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());
        this.setLayout(null); 
        timeLabel.setBounds(x, 150, 400, 30); 
        this.add(timeLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        while (true) {
            d = new Date();
            timeLabel.setText(d.toString());
            x += 5; 
            if (x > this.getWidth()) {
                x = -400; // Reset position when it moves out of the frame
            }
            timeLabel.setBounds(x, 150, 400, 30); // Update label position
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

     public static void main(String[] args) {
        DateTimeApp app = new DateTimeApp();
        app.setBounds(50, 50, 600, 400); // neccesry 3enk set the window size
        app.setVisible(true); //  +++ make the window visible
    }
}

*/

//ball moves 
/*
import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

 class ballMove extends JFrame implements Runnable {
    Thread th;
    JLabel imageLabel = new JLabel();
    int x = 0; 
        int y = 0;
         int speedX = 5;
    int speedY = 5;
    BufferedImage image; // to hold the image

     ballMove() 
     
     {
        this.setTitle("ball moves ");
        this.setLayout(null); // use absolute layout for moving the label
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
           
            image = ImageIO.read(new File("/home/electronica/Downloads/balljava.jpg")); 
            ImageIcon icon = new ImageIcon(image);
            imageLabel.setIcon(icon); 
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageLabel.setBounds(x, 50, image.getWidth(), image.getHeight()); // Initial position and size of the image
        this.add(imageLabel);
        
        th = new Thread(this);
        th.start();
    }

    @Override
     public void run() {
        while (true) {
            // update x and y position based on speed mkae it control 
            x += speedX;
            y += speedY;
            if (x <= 0 || x + 50 >= this.getWidth()) { 
                speedX = -speedX; 
            }

            if (y <= 0 || y + 50 >= this.getHeight()) { 
                speedY = -speedY; 
            }
            imageLabel.setBounds(x, y, 50, 50);

            try
             {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) 
 {
        ballMove app = new ballMove();
        app.setBounds(50, 50, 600, 400); 
        app.setVisible(true);
    }
}
*/



