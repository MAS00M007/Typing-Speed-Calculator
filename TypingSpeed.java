import java.util.Scanner;
import java.util.Random;

public class TypingSpeed {
    public static void main(String[] args) {
        
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "A stitch in time saves nine.",
            "Actions speak louder than words.",
            "Beauty is in the eye of the beholder.",
            "Don't count your chickens before they hatch."
        };

        Random random = new Random();
        String textToType = sentences[random.nextInt(sentences.length)];

        System.out.println("Type the following text:");
        System.out.println(textToType);

        System.out.println("Start typing when you're ready. Press Enter when finished.");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        long startTime = System.currentTimeMillis(); 

        System.out.println("Type the text:");

        String typedText = scanner.nextLine();

        long endTime = System.currentTimeMillis(); 

        
        double timeTaken = (endTime - startTime) / 1000.0;

        
        int typedChars = typedText.length();
        double typingSpeed = (typedChars / timeTaken) * 60;

        System.out.println("You typed " + typedChars + " characters in " + timeTaken + " seconds.");
        System.out.println("Your typing speed is approximately " + typingSpeed + " characters per minute.");
    }
}

