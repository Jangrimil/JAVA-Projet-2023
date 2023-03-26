public class Enemy extends AbstractEnemy{

    public Enemy(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
