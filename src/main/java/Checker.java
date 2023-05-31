import java.util.Set;

public class Checker {
    public boolean isStrongPassword(String  password){
        final Set<String> UPPER = Set.of("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        final Set<String> LOWER = Set.of("abcdefghijklmnopqrstuvwxyz".split(""));
        final Set<String> NUMBERS = Set.of("0123456789".split(""));
        final Set<String> SYMBOLS = Set.of("!@#$%^&*()-_=+\\/~?".split(""));

        boolean flagUpper = false, flagLower = false, flagNum = false, flagSym = false;

        int score  = 0;

        for(char c : password.toCharArray()){
            if(flagUpper == false && UPPER.contains(String.valueOf(c))){
                score++;
                flagUpper = true;
            }
            if(flagLower == false && LOWER.contains(String.valueOf(c))){
                score++;
                flagLower = true;
            }
            if(flagNum == false && NUMBERS.contains(String.valueOf(c))){
                score++;
                flagNum = true;
            }
            if(flagSym == false && SYMBOLS.contains(String.valueOf(c))){
                score++;
                flagSym = true;
            }
        }
        return score == 4;
    }
}
