

public class PlayerOneGen {

    public Boolean player1;
    public Boolean computer;

    public PlayerOneGen(String player1, String computer) {
        this.player1 = Boolean.valueOf(player1);
        this.computer = Boolean.valueOf(computer);
    }

    public PlayerOneGen() {

    }

    public boolean isPlayerFirst() {

        if (Math.random() < 0.5) {
            computer = true;

        } else {
            player1 = true;
        }
        return false;
    }

}

