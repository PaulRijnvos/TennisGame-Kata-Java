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
