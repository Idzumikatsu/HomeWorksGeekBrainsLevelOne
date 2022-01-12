package LevelTwoJava.HomeWork1;

public interface Players extends Runnable, Jumpable {
    boolean isPlay();

    void setPlay(boolean success);
    int getJumpLimit();
    int getRunLimit();

    default void jump(Wall wall) {
        if (isPlay()) {
            if (wall.getHeight() <= getJumpLimit()) {
                System.out.println(this + " успешно перепрыгнул " + wall);
            } else {
                System.out.println(this + " не перепрыгнул " + wall);
                setPlay(false);
            }
        }
    }

    default void run(Track track) {
        if (isPlay()) {
            if (track.getLength() <= getRunLimit()) {
                System.out.println(this + " успешно пробежал " + track);
            } else {
                System.out.println(this + " не пробежал " + track);
                setPlay(false);
            }
        }
    }
}
