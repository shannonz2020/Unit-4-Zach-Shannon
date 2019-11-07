public class Die {
    private int face;
    public Die(){
        face = 1;
    }

    public void roll(){
        face = (int) (Math.random() * (6) + 1);
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getFace() {
        return face;
    }
    public String toString() {
        return "You rolled " + face;
    }
}
