package LevelTwoJava.HomeWork1;

public class Cat implements Players {

    private boolean play = true;
    private static final int RUN_LIMIT = 10;
    private static final int JUMP_LIMIT = 3;

    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public void setPlay(boolean success) {
        this.play = success;
    }

    @Override
    public int getJumpLimit() {
        return JUMP_LIMIT;
    }

    @Override
    public int getRunLimit() {
        return RUN_LIMIT;
    }


    @Override
    public String toString() {
        return "Cat";
    }
}
