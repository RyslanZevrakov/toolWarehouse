public abstract class PlayInstruments implements Tool {
    public void play(){}

    public static void main(String[] args) {
        Tool[] music = new Tool[6];
        music[0]=new Guitar(12);
        music[0]=new Pipe(12);
    }
}
