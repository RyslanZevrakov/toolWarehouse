public abstract class Main implements Tool {
    public static void main(String[] args) {
        Tool[] musicTools = new Tool[6];
        musicTools[0]=new Guitar(12);
        musicTools[1]=new Pipe(40);
        musicTools[2]=new Drum(86);
        musicTools[3]=new Drum(54);
        musicTools[4]=new Pipe(20);
        musicTools[5]=new Guitar(15);
        for (int i=0;i<musicTools.length;i++){
            Tool a=musicTools[i];
            a.play();
        }
        for (Tool odj : musicTools){
            odj.play();
        }
    }
}