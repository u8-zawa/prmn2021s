package lecture07;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Monster> monsterList;


    public Field (Monster monster1, Monster monster2) {
        this.monsterList = new ArrayList<>();
        this.monsterList.add(monster1); // monsterListにmonster1をadd
        this.monsterList.add(monster2); // monsterListにmonster2をadd
    }

    public void battleStart () {
        System.out.println("バトル開始");
        // 素早さの判定
        if (monsterList.get(1).getSpeed() < monsterList.get(2).getSpeed()) {
            // （m2が早いとき）
        }else {
            // （m1が早いとき）
        }

        // 技の選択


        // Monsterの生死
        if (!monsterList.get(1).isAlive()) {
            System.out.println(monsterList.get(1).getName() + "は死にました。");
        }
        if (!monsterList.get(2).isAlive()) System.out.println(monsterList.get(2).getName() + "は死にました。");

    }

}
