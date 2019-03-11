package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"), PAPER("PAPER"), SCISSOR("SCISSOR");

    String name;
    RockPaperScissorHandSign(String name) {
        this.name = name;
    }

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign result;
        switch (this) {
            case ROCK:
                result = PAPER;
                break;
            case PAPER:
                result = SCISSOR;
                break;
            default:
                result = ROCK;
        }
        return result;
    }

    public RockPaperScissorHandSign getLoser() {
        RockPaperScissorHandSign result;
        switch (this) {
            case ROCK:
                result = SCISSOR;
                break;
            case PAPER:
                result = ROCK;
                break;
            default:
                result = PAPER;
        }
        return result;
    }
}
