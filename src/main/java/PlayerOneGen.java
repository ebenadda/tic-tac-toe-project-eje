

public class PlayerOneGen {

    public Boolean player1;
    public Boolean computer;

    public PlayerOneGen(String player1, String computer) {
        this.player1 = Boolean.valueOf(player1);
        this.computer = Boolean.valueOf(computer);
    }

    public PlayerOneGen() {

    }

    public void isPlayerFirst() {
        if (Math.random() < 0.5) {
            computer = true;
            player1 = false;
        } else {
            // This is redundant but it helps me keep it straight in my head!
            computer = false;
            player1 = true;
        }
    }
}

