import java.util.Random;

public class Word {

    private String word;

    public Word(int p, String alphabet)
    {
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(p);
            for (int i = 0; i < p; i++)
                sb.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
            this.word = sb.toString();
    }

    public String getWord() {
        return word;
    }
}

