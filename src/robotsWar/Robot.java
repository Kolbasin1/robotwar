package robotsWar;

import java.util.*;

public class Robot {
    private String name;
    private int health = 100;
    public int damage = 20;
    private List<String> availableKeys = new ArrayList<>(5);

    static List<String> keys = Arrays.asList("Q " , "W" , "E" , "A" , "S" , "D" , "Z" , "X" , "C");

    public Robot(String Name){            // конструктор. всегда возвращает объект класса Робот. имя такое же как у класса
        this.name = Name;
        Collections.shuffle(keys);       //перемешивает в произвольном порядке
        for (int i = 0; i < 5; i++) {    // берем первые 5, они по любому уже перемешаны
            availableKeys.add(keys.get(i));
        }
//        System.out.println(availableKeys); выводил для дебага
    }


    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(String k){
        if(!availableKeys.contains(k)){
            System.out.println("кнопка не используется");
            return 0;
        }
        availableKeys.remove(k);
        return damage;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public String getName(){
        return name;
    }




}
