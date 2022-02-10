package lecture07;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    private String name;
    private int hitPoint;
    private int attack;
    private int block;
    private int speed;
    private List<Move> moveList;


    public Monster (String name, int hitPoint, int attack, int block, int speed) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
        this.moveList = new ArrayList<>();
    }

    public void addMove (Move move) {
        this.moveList.add(move);
    }

    public void attack (Monster enemy, int index) {
    }

    public void showMove () {}

    public boolean isAlive () {
        if(getHitPoint() <= 0) {
            System.out.println();
            return false;
        }
        return true;
    }

    public String getName () {
        return this.name;
    }

    public int getHitPoint () {
        return this.hitPoint;
    }

    public void setHitPoint (int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack () {
        return this.attack;
    }

    public int getSpeed () {
        return this.speed;
    }



}
