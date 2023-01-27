public class Drum implements Tool {
    int theSize;
    Drum(int theSize){
        this.theSize=theSize;
    }
    public  void play(){
        System.out.println("Идёт барабан с деаметрном " + theSize);
    }

}
