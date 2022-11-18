package com.company;

import java.util.Random;
import java.util.Scanner;
class Gaame{
    Scanner sc = new Scanner (System.in);
    Random ra = new Random ();
    String name;
    int compInput;
    int userInput,range;
    int noOfGuess=0;



    //constructor
    Gaame(String n,int r){
        name=n;
        range =r;

    }
    //method
    public void setCompInput(int r){
        int ram = ra.nextInt (r);
        if (ram % 10 == 0) {
            setCompInput (r);
        } else compInput = ram;
    }


    public void introduce(){
        System.out.printf ("HELLO %S,WELCOME TO THE Gaame \n",this.name);
        System.out.println ("please don't enter any no ending on zero i.e. 10,20,30...");
        setCompInput (range);
    }
    public int setUserInput (){
        System.out.println ("GUESS THE NUMBER");
        userInput=sc.nextInt ();
        int n=toCompare (userInput);
        return n;
    }
    public int toCompare (int userInput){
        noOfGuess++;
        if (userInput>compInput) {
            System.out.println ("THE NUMBER YOU ENTERED IS HIGHER ");
            setUserInput ();
        } else if (userInput<compInput) {
            System.out.println ("THE NUMBER YOU ENTERED IS LOWER ");
            setUserInput ();

        }return noOfGuess;
    }

    public int getCompInput (){
        return compInput;
    }
}
public class guessTheNumber{
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);

                System.out.printf ("WELCOME TO THE Gaame\n");
                System.out.println ("PLEASE ENTER YOUR NAME USER");
                String userName=sc.next ();
                System.out.printf ("\nPLEASE ENTER THE RANGE OF NUMBERS");
                int n = sc.nextInt ();
                com.company.Gaame g1=new com.company.Gaame (userName,n);
                g1.introduce ();
                System.out.printf("CONGRATULATION ,YOU WON THE Gaame IN %d INPUTS",g1.setUserInput());
                System.out.printf ("\nTHE COMPUTER INPUT WAS %d",g1.getCompInput ());
            }
        }




