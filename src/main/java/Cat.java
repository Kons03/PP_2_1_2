public class Cat {
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
