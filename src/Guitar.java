public class Guitar implements Tool {
    int numberOfStrings;

    Guitar(int numberOfStrings){
        this.numberOfStrings=numberOfStrings;
    }

    public  void play(){
        System.out.println("Идёт гитара  "+ numberOfStrings +"  струн");
    }

}
