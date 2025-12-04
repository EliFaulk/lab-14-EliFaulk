# Lab 14

## Heat Map

**Task**: Using the pre-made classes Main and HeatmapViewer, and the sample heatmap csv files, create the Heatmap class.
The Heatmap should be a 2D array to represent the heatmap, with methods to view and calculate other data.

## Battleship Game Board Validator

**Task**: Create a program to check the validity of Battleship boards (10 x 10 2D array).
There should contain one of each ship
- C is a Carrier(5 squares)
- B is a Battleship(4 squares)
- R is a Cruiser(3 squares)
- S is a Submarine(3 squares)
- D is a Destroyer (2 squares)
Create a class containing the methods to check for the board's validity, and another class to take in user input (a board) and return true or false for the board's validity.
Then, create new methods to check if the board is balanced (contains 2 or fewer ships in each row and column).


```
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0,0
B,B,B,B,0,0,0,0,0,0
0,0,0,0,0,0,0,D,0,0
S,S,S,0,0,0,0,D,0,0
0,0,0,0,0,0,0,0,0,0
```

^ This is a **valid** battleship board. It is 10 by 10, has all 5 ships(which have each been represented by the correct number of squares) placed horizontally or vertically on the board.

```
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0,0
B,B,B,B,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0,0
S,S,S,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
```

^ This is an **invalid** battleship board. It is 10 by 10, but is missing the Destroyer. 

```
O,O,O,O,O,C,C,C,C,C
O,O,O,O,O,R,O,O,O,O
O,O,O,O,R,O,O,O,O,O
O,O,O,R,O,O,O,O,O,O
O,O,O,B,B,B,B,0,O,O
O,O,O,O,O,O,O,O,O,O
O,O,O,O,O,O,O,O,O,O
D,0,0,0,0,S,S,S,0,0
D,O,O,O,O,O,O,O,O,O
O,O,O,O,O,O,O,O,O,O
```

^ This is an **invalid** battleship board. It is 10 by 10, but the Cruiser has been placed diagonally.

```
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0,0
B,B,B,B,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
R,R,R,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,R
S,0,0,0,0,0,0,0,0,R
S,0,0,0,0,0,0,0,0,R
```

^ This is an **invalid** battleship board. It is 10 by 10, but the Cruiser has been placed twice.

```
0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0
B,B,B,B,0,0,0,D,0
0,0,0,0,0,0,0,D,0
0,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
S,S,S,0,0,0,0,0,0
```

^ This is an **invalid** battleship board. It is 9 by 9, not 10 by 10.


### Step 2

Create a new static method in `Validate` called `balanced(String[][] board)`. This will return `True` if each row and column contain only 0-2 ships.

For example:
```
0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0
B,B,B,B,0,0,0,D,0
0,0,0,0,0,0,0,D,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
S,S,S,0,0,0,0,0,0
```

This is **unbalanced** because column 1 contains 4 different ships. 

```
0,0,S,S,S,0,0,0,0
0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0
0,0,0,0,0,0,0,D,0
0,0,0,0,0,0,0,D,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,B,B,B,B
R,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0
```
