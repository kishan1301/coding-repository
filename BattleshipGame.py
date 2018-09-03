from random import randint

# A list for the board
board = []

# Storing list numbers to make board a matrix
for x in range(0, 5):
  board.append(["O"] * 5)

# Printing a clean board
def print_board(board):
  for row in board:
    print " ".join(row)

print_board(board)


"""
Defining two funtions  random_row and random_col
which will generate two random integers to determine the position of the battleship
"""
def random_row(board):
  return randint(0, len(board) - 1)

def random_col(board):
  return randint(0, len(board[0]) - 1)

"""
Two variables teo dtores the randomly generated row and column
"""
ship_row = random_row(board)
ship_col = random_col(board)

#print ship_row + 1
#print ship_col + 1

"""
The game function which let's user play game upto 4 times... unless he/ she wins before!
"""

for turn in range(4) :
  
  """
  Taking input from the user and decreasing the 		value to store it in the matrix, since python 		indexing starts from 0.
  """
  guess_row = int(raw_input("Guess Row: ")) - 1
  guess_col = int(raw_input("Guess Col: ")) - 1

  if guess_row == ship_row and guess_col == ship_col:
    print "Congratulations! You sank my battleship!"
    break #Break the loop(game) after victory
  #if ends here  
  
  else:
    if guess_row not in range(5) or \
      guess_col not in range(5):
      print "Oops, that's not even in the ocean."
    #if ends here
    
    elif board[guess_row][guess_col] == "X":
      print( "You guessed that one already." )
    #elif ends here
    
    else:      
      print "You missed my battleship!"
      board[guess_row][guess_col] = "X"
      
      if turn >= 3 :
        print "XX Game Over XX"
      #if ends here
    #else ends here
    
  #else ends here
    print_board(board)
    print "try " + str(turn + 1)
#for ends here