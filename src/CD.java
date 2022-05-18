public class CD implements Packable{


    private String artist;


    private String cdName;

    private int year;

    public CD(String artist, String cdName, int year) {
        this.artist = artist;
        this.cdName= cdName;
        this.year = year;
        this.weight = .1;
    }





    private double weight;






    @Override
    public double weight() {

        return this.weight;




    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.year + ")";
    }





}