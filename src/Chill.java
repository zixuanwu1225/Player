public class Chill extends Player{
    private boolean isChill;
    public Chill(String rank, int elo, double KDA,boolean isChill){
        super(rank, elo, KDA);
        this.isChill = isChill;
    }

    public boolean isChill() {
        return isChill;
    }
    public void beChill(){
        System.out.println("ns");
    }
    public void compliment(){
        System.out.println("Good!");
    }
}
