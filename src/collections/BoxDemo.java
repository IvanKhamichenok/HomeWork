package collections;

import java.util.List;
import java.util.Set;

public class BoxDemo {
    public static void main(String[] args) {
        Container container = new Container();
        Set<Ball> balls = Set.of(new Ball(10), new Ball(20), new Ball(30));
        Ball ball = new Ball(40);

        container.printBalls();
        container.addBalls(balls);
        container.printBalls();
        container.printSizeOfEachBall();
        container.getSumOfBallsSizes();
        container.getBallsAmount();
        container.checkBallIfExist(ball);
        container.removeBall(ball);
        container.printBalls();
        container.cleanUpContainer();
        System.out.println(balls);

        Ball ballWithRandomSize = new Ball();
        container.addBall(ballWithRandomSize);

        Set<Ball> balls1 = Set.of(new Ball(22), new Ball(54), new Ball(99), new Ball(33)
                , new Ball(11), new Ball(12), new Ball(45), new Ball(66), new Ball(83));
        Box box = new Box(10);
        box.printBalls();
        box.addBalls(balls1);
        box.printBalls();
        List<Ball> sortedBalls = box.getSortedBalls();
        System.out.println(sortedBalls);
        box.printBalls();
    }
}
