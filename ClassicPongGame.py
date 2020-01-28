# Python 3.7.2
# Classic Pong
# the pieces are white to look like the classic pong game, but you can always change it to your liking


import turtle

wd = turtle.Screen()
wd.title("Pong")
wd.bgcolor("black")
wd.setup(width=800, height=600)
wd.tracer(0)

# score
score_a = 0
score_b = 0

# Paddle R
paddle_a = turtle.Turtle()
paddle_a.speed(0)
paddle_a.shape("square")
paddle_a.color("white")
paddle_a.shapesize(stretch_wid=5, stretch_len=1)
paddle_a.penup()
paddle_a.goto(-350, 0)

# Paddle L
paddle_b = turtle.Turtle()
paddle_b.speed(0)
paddle_b.shape("square")
paddle_b.color("white")
paddle_b.shapesize(stretch_wid=5, stretch_len=1)
paddle_b.penup()
paddle_b.goto(350, 0)

# Ball
ball = turtle.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("white")
ball.penup()
ball.goto(0, 0)

ball.dx = 3
ball.dy = 3

# Score Board
score = turtle.Turtle()
score.speed()
score.color("white")
score.penup()
score.hideturtle()
score.goto(0, 260)
score.write("Player A: 0 Player B: 0", align="center", font=("Courier", 24, "normal"))


# Movement
def paddle_a_up():
    y = paddle_a.ycor()
    y += 30
    paddle_a.sety(y)


def paddle_a_down():
    y = paddle_a.ycor()
    y -= 30
    paddle_a.sety(y)


def paddle_b_up():
    y = paddle_b.ycor()
    y += 30
    paddle_b.sety(y)


def paddle_b_down():
    y = paddle_b.ycor()
    y -= 30
    paddle_b.sety(y)


# Keyboard Functions
wd.listen()
wd.onkeypress(paddle_a_up, "a")
wd.onkeypress(paddle_a_down, "z")
wd.onkeypress(paddle_b_up, "Up")
wd.onkeypress(paddle_b_down, "Down")

# Main loop
while True:
    wd.update()

    # ball movement
    ball.setx(ball.xcor() + ball.dx)
    ball.sety(ball.ycor() + ball.dy)

    # Border
    if ball.ycor() > 290:
        ball.sety(290)
        ball.dy *= -1
    if ball.ycor() < -290:
        ball.sety(-290)
        ball.dy *= -1

    if ball.xcor() > 390:
        ball.goto(0, 0)
        ball.dx *= -1
        score_a += 1
        score.clear()
        score.write("Player A: {} Player B: {}".format(score_a, score_b), align="center",
                    font=("Courier", 24, "normal"))

    if ball.xcor() < -390:
        ball.goto(0, 0)
        ball.dx *= -1
        score_b += 1
        score.clear()
        score.write("Player A: {} Player B: {}".format(score_a, score_b), align="center",
                    font=("Courier", 24, "normal"))

    # Paddle bounce
    if (ball.xcor() < -340) and (ball.ycor() < paddle_a.ycor() + 50) and (ball.ycor() > paddle_a.ycor() - 50):
        ball.setx(-340)
        ball.dx *= -1

    if (ball.xcor() > 340) and (ball.ycor() < paddle_b.ycor() + 50) and (ball.ycor() > paddle_b.ycor() - 50):
        ball.setx(340)
        ball.dx *= -1
