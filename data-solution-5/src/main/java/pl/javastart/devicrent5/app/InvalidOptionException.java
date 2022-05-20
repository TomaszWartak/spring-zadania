package pl.javastart.devicrent5.app;

class InvalidOptionException extends RuntimeException {
    InvalidOptionException() {
        super("Opcja nie istnieje");
    }
}