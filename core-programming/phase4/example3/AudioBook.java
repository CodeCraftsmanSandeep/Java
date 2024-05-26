public class AudioBook extends Book {
    private int runTimeMinutes;
    AudioBook (String title, String author, int runTimeMinutes){
        super(title, author);
        this.runTimeMinutes = runTimeMinutes;
    }
}
