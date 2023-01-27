public class Pipe implements Tool{
int diameter;
Pipe(int diameter){
    this.diameter=diameter;
}
    public  void play(){
        System.out.println("Идёт труба с размером "+ diameter);
    }

}
