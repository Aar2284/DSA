# DSA
A curated collection of Data Structures and Algorithms problems solved during my preparation for my first job. Includes clean implementations, explanations, and progressive difficulty coverage.

## Roadmap

How we’ll work (important)

No spoon-feeding: I’ll guide with questions, hints, constraints, and trade-offs.

Interview mindset: You’ll learn how interviewers expect you to think out loud.

Pattern first, code later: Logic → approach → edge cases → complexity → code.

Active recall: You explain ideas back before moving on.

Step 0: Mental model you must adopt

In interviews, DSA is not about memorizing solutions. It is about:

Identifying the core operation (searching, grouping, ordering, reducing, linking).

Choosing the right data structure to make that operation cheap.

Controlling time vs space trade-offs.

If you can answer why a structure or approach is used, you are interview-ready.

Step 1: Foundations (Week 1–2)

Before touching problems, we build thinking tools.

1. Time & Space Intuition (not formulas)

You must internalize:

What happens when input doubles?

What operations are “cheap” vs “expensive”?

Exercise (no coding):

If you scan a list once → what does that mean practically?

If you scan inside another scan → when does it break?

I’ll challenge your intuition here.

2. Arrays & Strings (Your first battlefield)

These appear in ~70% of interviews.

Core questions you must learn to ask yourself:

Do I need order preserved?

Am I allowed to modify input?

Is random access important?

Is this secretly a counting problem?

Thinking pattern (very important):

“Can I solve this in one pass if I remember something from the past?”

That “something” leads to:

Hash maps

Prefix sums

Two pointers

Step 2: The Interview Problem-Solving Framework

You will follow this every single time:

Restate the problem in your own words

Clarify constraints (size, negatives, duplicates, sorted?)

Brute force idea (even if bad)

Why it fails (time/space)

Optimization lever (what repeats? what can be stored?)

Final approach

Edge cases

Time & space complexity

I will stop you if you skip steps.

Step 3: DSA Roadmap (Industry-aligned)

We will move in this exact order:

Arrays & Strings

Hashing

Two Pointers & Sliding Window

Stack & Queue

Recursion → Backtracking

Linked List

Binary Search (patterns, not formulas)

Trees (DFS/BFS thinking)

Heaps

Graphs

Dynamic Programming (last, not first)

Reason:
Most people fail interviews before DP.

Step 4: How I’ll Teach You a Problem

Instead of:

“Here is the solution”

You’ll get:

“What is the most expensive operation here?”

“What information do you wish you had earlier?”

“What happens if input is already sorted?”

“What breaks if numbers are negative?”

You’ll reach the solution yourself.

Step 5: Your first task (start now)

No coding yet.

Question:

You are given a list of numbers.
You need to check if any two numbers add up to a given target.

Do not give me code.

Answer only:

Brute force idea

Why it is inefficient

What information you would want to remember while scanning

What kind of data structure could store that information