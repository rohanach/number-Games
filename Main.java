package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in );


        int userWin = 0, computerWin = 0;
        int draw = 0;
        int user = 0;
        System.out.println ( "!!!ROCK PAPER SCISSOR GAME!!!" );
        System.out.println ( "HELLO USER,PLEASE ENTER YOUR NAME" );
        String userName = sc.nextLine ( );//input of user name
        userName=userName.toUpperCase ();
        System.out.println ( "HELLO " + userName + " ,WELCOME IN THE GAME OF ROCK,PAPER AND SCISSOR" );
        Random randomm = new Random ( );//random class
        System.out.println ( "HOW MANY ROUND IN A GAME WOULD YOU LIKE TO PLAY" );
        int n = sc.nextInt ( );//no of rounds in a game
        for (int i = 0; i < n; i++) {
            int comp = randomm.nextInt ( 3 );
            System.out.println ("\n_____________________________________" );
            System.out.println ( "GAME NO. " + (i + 1) );
            System.out.println ( "PRESS 'r' FOR ROCK\n\t  'p' FOR PAPER\n\t  's' FOR SCISSOR" );
            char userInp = sc.next ( ).charAt ( 0 );// user input of selection

            switch (userInp) {
                case 'r':
                case 'R':
                    user = 0;
                    break;
                case 'p':
                case 'P':
                    user = 1;
                    break;
                case 's':
                case 'S':
                    user = 2;
                    break;
                default:
                    user = 3;
            }//changes the user input to numerical value of comparision
            switch (user) {
                case 0:
                    System.out.println ( userName + " INPUT:::: ROCK" );

                    break;
                case 1:
                    System.out.println ( userName + " INPUT::::PAPER" );

                    break;
                case 2:
                    System.out.println ( userName + " INPUT::::SCISSOR" );
                    break;


            }//prints the input of user
            switch (comp) {
                case 0:
                    System.out.println ( "COMPUTER INPUT:::: ROCK" );

                    break;
                case 1:
                    System.out.println ( "COMPUTER INPUT::::PAPER" );

                    break;
                case 2:
                    System.out.println ( "COMPUTER INPUT::::SCISSOR" );
                    break;

            }//prints the input of computer
            if ( user >= 0 && user <= 2 ) {
                if ( user == comp ) {
                    System.out.println ( "!!!GAME DRAW!!!" );


                    draw++;
                } else if ( user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1 ) {
                    System.out.println ( "!!! " + userName + " WINS!!!" );


                    userWin++;
                } else {
                    System.out.println ( "!!!COMPUTER WINS!!!" );


                    computerWin++;

                }


            } else System.out.println ( "INVALID INPUT" );





        }
        if ( userWin >= computerWin ) {
            System.out.println ("\n_____________________________________" );

            System.out.println ( "\n\n!!!GAME ENDS,"+userName+" WINS!!!" );
            System.out.println ( "WINS OF " + userName + " :::" + userWin );
            System.out.println ( "WINS OF COMPUTER :::" + computerWin );
            System.out.println ( "DRAW::: " + draw );

        } else if ( userWin == computerWin ) {
            System.out.println ("\n_____________________________________" );

            System.out.println ( "\n\n!!!GAME ENDS,GAME DRAW!!!" );
            System.out.println ( "WINS OF " + userName + " :::" + userWin );
            System.out.println ( "WINS OF COMPUTER :::" + computerWin );
            System.out.println ( "DRAW::: " + draw );

        } else {
            System.out.println ("\n_____________________________________" );

            System.out.println ( "\n\n!!!GAME ENDS,COMPUTER WINS!!!" );
            System.out.println ( "WINS OF COMPUTER :::" + computerWin );
            System.out.println ( "WINS OF " + userName + " :::" + userWin );
            System.out.println ( "DRAW::: " + draw );


        }

    }
}
