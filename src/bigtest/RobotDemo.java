package bigtest;

import java.awt.*;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.13
 * @Version 1.0
 */
public class RobotDemo {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(200);
//        robot.getPixelColor(58,552);
        robot.mouseMove(30,54);
    }
}
