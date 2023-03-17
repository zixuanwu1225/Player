public class Player {
    private  String rank;
    private int elo;
    private  double KDA;
    public Player(String rank, int elo, double KDA){
        this.rank = rank;
        this.elo = elo;
        this.KDA = KDA;
    }
    public String getRank() {
        return rank;
    }

    public int getElo() {
        return elo;
    }

    public double getKDA() {
        return KDA;
    }
}
