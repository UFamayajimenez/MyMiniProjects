import java.util.Arrays;
import java.util.Scanner;
public class practiceWithArrays {

    public static String printName(char[] yourName) //Method that returns a string of the characters in a char array
        {
            String theName = "";
            for (int i = 0; i < yourName.length; i++) //For the length of the array, the loop will create a string out of every individual char in the array
            {
                String letter = Character.toString(yourName[i]);
                theName = theName.concat(letter);
            }
            return theName; //Returns the string
        }


        public static void main(String[] args){
            int nameLength; //Integer that keeps track of the length of the user's name
            char letter; //The char variable that stores each individual letter in the name
            char firstLetter; //A char variable that stores the first letter of the user's name

            Scanner myScanner = new Scanner(System.in);
            System.out.print("How many letters are in your name? ");
            nameLength = myScanner.nextInt(); //Asks the user for the length of their name and sets that value equal to the int
            char[] userName = new char[nameLength]; //Creates an array of characters the size of the user's name

            System.out.println("What is the first letter?");
            firstLetter = myScanner.next().charAt(0);
            userName[0] = firstLetter; //Sets the first letter of the user's name equal to the first space in the character array

            for(int i = 1; i < userName.length; i++){
                System.out.println("What is the next letter?");
                letter = myScanner.next().charAt(0);
                userName[i] = letter; //For every iteration of the loop, the code sets the letter that the user inputs into the char array

            }

            char[] myName = { 'A', 'm', 'a', 'y', 'a'}; //Two preset char arrays
            char[] theLoveOfMyLife = {'J', 'o', 'b', 'a'};

            if ( Arrays.equals(userName, theLoveOfMyLife)){ //I am making a change
                System.out.println("OMG NO WAY I LOVE BROCKHAMPTON. You're the BEST!!"); //Prints this out if the user's name is the same as Joba's from BROCKHAMPTON
            }
            else if(Arrays.equals(userName, myName)){
                System.out.println("Hey, " + printName(myName) + "! Your code is working :) Good job"); //Prints this out if the user's name is also my name
            }
            else{
                System.out.println("\nYour name is " + printName(userName) + "! Nice to meet you :)"); //Prints out the user's name if their name isn't Amaya or Joba
            }


        }
    }
