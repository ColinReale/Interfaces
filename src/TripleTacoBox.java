public class TripleTacoBox implements TacoBox {

    private int tacos;

//    constructor
    public TripleTacoBox() {
        this.tacos = 3;
    }
//    implementing the methods from the Interface TacoBox
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0){
            tacos = tacos-1;
        }
    }
}
