package tasks.Seminar_08.Task01;

public class Track implements Obstacle{
    private int length;
    public Track(int length){
        this.length = length;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
