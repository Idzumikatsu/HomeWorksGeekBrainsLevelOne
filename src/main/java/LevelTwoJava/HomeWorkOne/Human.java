package LevelTwoJava.HomeWorkOne;

public class Human implements Players {

    private boolean play = true;
    private static final int RUN_LIMIT = 100;
    private static final int JUMP_LIMIT = 2;

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
        return "Human";
    }
}
