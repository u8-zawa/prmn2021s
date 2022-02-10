package lecture07;

public class Exercise01 {
    public static void main(String[] args) {
        // 技のインスタンス化
        Move tackle = new Move("tackle");       // たいあたり
        Move scratch = new Move("scratch");     // ひっかく
        Move Peck = new Move("Peck");           // つつく
        Move razorLeaf = new Move("razorLeaf"); // はっぱカッター
        Move ember = new Move("ember");         // ひのこ
        Move bubble = new Move("bubble");       // あわ

        // ナエトル(Turtle)をインスタンス化
        Monster Turtle = new Monster("Turtle", 55, 17, 16, 15);
        Turtle.addMove(tackle);
        Turtle.addMove(razorLeaf);
        // ヒトカゲ(Monkey)をインスタンス化
        Monster Monkey = new Monster("Monkey", 44, 14, 11, 31);
        Monkey.addMove(scratch);
        Monkey.addMove(tackle);
        Monkey.addMove(ember);
        // ポッチャマ(Penguin)をインスタンス化
        Monster Penguin = new Monster("Penguin", 53, 12, 13, 20);
        Penguin.addMove(Peck);
        Penguin.addMove(tackle);
        Penguin.addMove(bubble);

        // Fieldをインスタンス化
        Field field = new Field(Turtle, Monkey);
        while(true) {
            field.battleStart();



        }

    }
}
