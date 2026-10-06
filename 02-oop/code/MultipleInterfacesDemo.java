interface Camera {

    void capture();

    default void start() {
        System.out.println("Camera started");
    }
}

interface MusicPlayer {

    void playMusic();

    // Same default method signature as Camera
    default void start() {
        System.out.println("Music player started");
    }
}

// Java allows implementing multiple interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void capture() {
        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    // Required because both interfaces provide start()
    @Override
    public void start() {

        // Explicitly call Camera's default implementation
        Camera.super.start();

        // Explicitly call MusicPlayer's implementation
        MusicPlayer.super.start();

        System.out.println("Smartphone started");
    }
}

public class MultipleInterfacesDemo {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.capture();
        phone.playMusic();
        phone.start();
    }
}