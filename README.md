# Voting_System-Java-Coding


Title: Voting System.
Task : Write a Java program to create a Voting System.


Description
First of all, I created a command-line Java project using the platform IntelliJ IDEA. I used ArrayList (because it is dynamic) and While Loop to create my application. I prefer to use ArrayList because it is one of the requirements and with ArrayList we have the flexibility to create as many as candidates because it is dynamic instead of Array that is static. This is a Voting System application. In the beginning, this app shows a welcome message and instructions on how to use the program. My application then takes input from users to create candidates and count votes, in the end, the program show who is the winner of the election.


Line 2
I import Array class from java utility class.

Line 3
I import the Scanner class from Java Utility library which I will use for user input.

Line 7
I created a class called Main.

Line 10-16
I created a void class method named “Welcome_Message()” to print “Initial welcome message” of my application. This message gives an overall idea to the users what is the real purpose of my application and what it does. This message also gives an overall idea about how the voting system works. It contains a note with 3 different guide steps for users.

Line 18
I created the entry point of my application the main method. 

Line 20
I called the void function inside the main method.

Line 22
Declaration of Scanner class input Voting_input.

Line 28
I created an Array for candidates named Camdidate_name.

Line 29
I created an Array for counting all votes named Vote_count.

Line 33
I created a Boolean type of variable and initialized “false”.

Line 34
I created another int variable max_vote which I will use later in my code.

Line 36
Starting While Loop.

Line 38
Declaration of String variable Vote.

Line 40
If condition to check if user press -1.

Line 42-52
Check if candidates are empty or not if yes then print “There are no candidates for election”,
Otherwise print voting table.

Line 55-69
Add votes.

Line 71 -78
Store candidates and their vote.

Line 80
I created a third Array for Winner.

Line 82-99
Calculate how many votes each candidate received.

Line 102-105
Announce the winner of the Election.


General idea or logic behind code
1.	Ask candidate name from users.
2.	Store candidate names
3.	Count candidates name and calculate the max.
4.	Print the winner’s name.

