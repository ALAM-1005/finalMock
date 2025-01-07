public class player implements Comparable<player> {

    private String name;
    private int score;
    private int health;
    

    public player(String name, int score, int health) {
        this.name = name;
        this.score = score;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player [health=" + health + ", name=" + name + ", score=" + score + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        player other = (player) obj;
        if (health != other.health)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (score != other.score)
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + health;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + score;
        return result;
    }

    @Override
    public int compareTo(player o) {
        return this.score - o.score;
    }
}