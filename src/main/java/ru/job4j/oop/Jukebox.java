package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
            default:
                System.out.println("Песня не неайдена");
        }
    }

    public static void main(String[] args) {
        Jukebox ps = new Jukebox();
        ps.music(1);
        ps.music(2);
        ps.music(6);
        ps.music(10);
    }
}
