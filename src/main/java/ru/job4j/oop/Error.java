package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public Error() {
    }

    public void printErrorInfo() {
        System.out.println("Активность " + active);
        System.out.println("Сообщение " + message);
        System.out.println("Статус " + status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error2 = new Error(true, 1, "Ошибка");
        error2.printErrorInfo();
        error.printErrorInfo();
    }
}
