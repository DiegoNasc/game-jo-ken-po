public class Player {
    //atributos
    private String name;
    private Integer score;

    //Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        setScore(getScore() + 1);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getScore() {
        return this.score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
}
