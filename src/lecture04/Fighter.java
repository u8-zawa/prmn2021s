package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy) {
        enemy.setHitPoint(enemy.getHitPoint() - this.power); // 相手のhpをpower分減らす
        System.out.println(this.name + " は " + enemy.getName() + " に " + this.power +" ダメージを与えた。");
        System.out.println(enemy.getName() + " の残り hitPoint : " + enemy.getHitPoint());
    }


    public boolean isAlive() {
        if(getHitPoint() <= 0) {
            System.out.println(getName() + " は倒れた。");
            return false;
        }
        return true;
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return this.name;
    }

}
