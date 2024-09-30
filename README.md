# TennisGame Refactoring Kata in Java

This is my implementation of the [TennisGame Coding Dojo aka Kata](https://codingdojo.org/kata/Tennis/).

The first time I heard about Kata's was while watching Youtube video's about software refactoring. Kevlin Henney is one of those speakers that are easy and pleasant to follow. But more important, he confirms most of my ideas/principles. Something I do not often or easy encounter with my direct collegeas. 

In one of the Youtube video's the refactoring of [The Gilded Rose](https://github.com/NotMyself/GildedRose) was mentioned and that triggered my curiosity.
As a software developer since 1985 I've seen software that covers quit a range of 'quality' as it comes to:
1. functionality. A lot of software can do a lot more than originally specified and actually does so...
2. readability
3. maintainability 

The first item can be tackled by implementing a proper set of tests. One that covers all functionality, ideally.
2 and 3 are mostly a matter of taste or oppinion..
For me I try do address these by attempting to the given specifications or rules 'echo' when reading the source-code out loud.
Most of the time this results in a separation between business specs/rules and coding algorithms. 

# The Scenario

Imagine you work for a consultancy company, and one of your colleagues has been doing some work for the Tennis Society. The contract is for 10 hours billable work, and your colleague has spent 8.5 hours working on it. Unfortunately he has now fallen ill. He says he has completed the work, and the tests all pass. Your boss has asked you to take over from him. She wants you to spend an hour or so on the code so she can bill the client for the full 10 hours. She instructs you to tidy up the code a little and perhaps make some notes so you can give your colleague some feedback on his chosen design. You should also prepare to talk to your boss about the value of this refactoring work, over and above the extra billable hours.

There are several versions of this refactoring kata, each with their own design smells and challenges. I suggest you start with the first one, with the class "TennisGame1". The test suite provided is fairly comprehensive, and fast to run. You should not need to change the tests, only run them often as you refactor.

There is a deliberate error in several of the implementations - the player names are hard-coded to "player1" and "player2". After you refactor, you may want to fix this problem and add suitable test cases to prove your fix works.

## The Refactoring...

Here I will describe my observations and actions step by step, recorded per commit.
Each refactoring of a TennisGame will be done in a separate branch to prevent refactorings interfer with eachother.

### Stage1
1. Clone the repo [TennisGame-Kata-Java](https://github.com/PaulRijnvos/TennisGame-Kata-Java.git) ideally from within your favourite IDE. The repo contains a Maven project. Most IDE's know how to handle these.
2. Perform a Maven verify. This should run flawless.
3. Familiarize yourself with the game and test at hand: TennisGame1 & TennisTest.checkAllScoresTennisGame1.
   * TennisTest.checkAllScoresTennisGame1 is rather straid forward. It runs a TennisGame1 for each given scoring-scenario and checks the resulting score with the expected score.
   * TennisGame1 is of more interest...

TennisGame1 is given 2 playerNames via its constructor. These are in private variables, mostly for later use. 
But IntelliJ tells that each playerName is only used in the constructor.
=> We can get rid of the playerNames in TennisGame1. We comment them out and run the test and after succesful completion we remove the comments.

### Stage2
Can we remove the constructor? It accepts 2 playernames but doesn't use them...
We comment them out: we get 1 error and that is at the instantiation of TennisGame1 in the test for this class.
=> We should be able to remove the playerNames from the instantiation in the test. We do so by commenting them out:

![Alt](images/TennisGame1_instantiation_without_playernames.png "Title")
Verify by running the test.

=> Now we can also get rid of the redundant default constructor in TennisGame1.
![Alt](images/TennisGame1_redundant_constructor.png "Title")
Verify by running the test.

=> Remove the commented code.
