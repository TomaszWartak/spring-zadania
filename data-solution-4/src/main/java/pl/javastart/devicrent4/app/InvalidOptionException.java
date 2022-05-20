package pl.javastart.devicrent4.app;

class InvalidOptionException extends RuntimeException {
    InvalidOptionException() {
        super("Opcja nie istnieje");
    }
}