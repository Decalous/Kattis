
moves = raw_input()
ball = 1;
for i in range(len(moves)):
    move = moves[i]
    if (move == 'A' and ball == 1):
        ball = 2
    elif (move == 'A' and ball == 2):
        ball = 1
    elif (move == 'B'and ball == 2):
        ball = 3
    elif (move == 'B' and ball == 3):
        ball = 2
    elif (move == 'C' and ball == 1):
        ball = 3
    elif (move == 'C' and ball == 3):
        ball = 1
print ball
