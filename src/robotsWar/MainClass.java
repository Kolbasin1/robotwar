package robotsWar;

import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        final String exitKey = "L";

        String robotName1 = Menu.readInput("Robot 1 name: ");
        if (robotName1.equals(exitKey)) {
            return;
        }
        Robot robot1 = new Robot(robotName1);

        String robotName2 = Menu.readInput("Robot 2 name: ");
        if (robotName2.equals(exitKey)) {
            return;
        }
        Robot robot2 = new Robot(robotName2);

        while (!robot1.isDead() && !robot2.isDead()) {  // проверка живы ли оба робота(обязательно оба живы)
            String udar = Menu.readInput("Input key for robot 2: ");
            if (udar.equals(exitKey)) {
                return;
            }
            int newHealth = robot1.getHealth() - robot2.getDamage(udar);  // условия выполнения цикла: работают пока они оба живы
            robot1.setHealth(newHealth);

            udar = Menu.readInput("Input key for robot 1: ");
            if (udar.equals(exitKey)) {
                return;
            }
            newHealth = robot2.getHealth() - robot1.getDamage(udar);
            robot2.setHealth(newHealth);
            System.out.println("Robot " + robot1.getName() + " health " + robot1.getHealth());
            System.out.println("Robot " + robot2.getName() + " health " + robot2.getHealth());
        }
        if (robot1.isDead()) {
            System.out.println(robot2.getName() + " Victory");
        } else {
            System.out.println(robot1.getName() + " Victory");
        }
    }
}
