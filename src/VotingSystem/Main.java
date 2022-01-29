package VotingSystem;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    //creating a welcome message function
    public static void Welcome_Message (){
        System.out.println("WELCOME TO VOTING SYSTEM APPLICATION\n" +
                "NOTE BEFORE START:\n" +
                "First step: Write as much as name of the candidates you want.\n" +
                "Second step: Write candidate name to vote\n" +
                "Third step: TO see the result press -1");
    }

    public static void main(String[] args) {
        //calling the welcome message for users.
        Welcome_Message();
        //declaring scanner for input.
        Scanner Voting_input = new Scanner(System.in);



        //The main Election start here
        //Arrays for candidate and vote count
        ArrayList <String> Candidates_name = new ArrayList<>();
        ArrayList <Integer> Vote_count = new ArrayList<>();


        //Variables
        boolean exit = false;
        int max_vote = 0;
        //Starting of while loop
        while(true) {
            //Declaration of string variable
            String Vote = Voting_input.nextLine().trim().toUpperCase();
            //If condition
            if(Vote.equals("-1") || Vote.equals("")) {
                //in case of no candidate.
                if(Vote_count.isEmpty()){
                    System.out.println("There are no candidates for election:(");
                    System.exit(1);
                }
                //End the voting program.
                else {
                    System.out.println("The voting table:");
                    System.out.println();
                    break;
                }
            }
            else {
                //Add votes
                for(int i = 0; i < Candidates_name.size(); i++) {

                    if(!Candidates_name.contains(Vote)){
                        Candidates_name.add(Vote);
                        Vote_count.add(1);
                        break;
                    }

                    if(Candidates_name.get(i).equals(Vote)) {
                        Vote_count.set(i, Vote_count.get(i) + 1);
                        exit = true;
                        break;
                    }

                }

                //Store candidates and count their votes
                if(!exit) {
                    Candidates_name.add(Vote);
                    Vote_count.add(1);
                }

            }
        }
        //Array for winner
        ArrayList <String> winners = new ArrayList<>();

        for(int i = 0; i < Vote_count.size(); i++){
            int count = Vote_count.get(i);

            if(count > max_vote){
                max_vote = count;
            }
        }

        for(int i = 0; i < Candidates_name.size(); i++){
            int count = Vote_count.get(i);

            if(count == max_vote){
                winners.add(Candidates_name.get(i));
            }
            //Voting Table
            System.out.println(Candidates_name.get(i) + " received " + Vote_count.get(i) + " votes");
            System.out.println();
        }

        //announce winner
        if(winners.size() == 1){
            System.out.println();
            System.out.println("The winner of the Election is: " + winners.get(0)) ;
        }

    }
}