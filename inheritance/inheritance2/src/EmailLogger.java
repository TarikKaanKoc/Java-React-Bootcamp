public class EmailLogger extends Logger {
    @Override //Javada yazmasakda olur. Ama kod okunurluğu için yazılır.
    public void log() {
        System.out.println("Email gönderildi.");
    }
}
