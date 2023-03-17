public class Toxic extends Player{
    private boolean isToxic;
    public Toxic(String rank, int elo, double KDA,boolean isToxic){
        super(rank, elo, KDA);
        this.isToxic = isToxic;
    }

    public boolean isToxic() {
        return isToxic;
    }
    public void beToxic(){
        System.out.println("you r fat");
    }
    public void slander(){
        System.out.println("AHFAOFJAJOIWJOIFAJSOIFJAP");
    }
}
