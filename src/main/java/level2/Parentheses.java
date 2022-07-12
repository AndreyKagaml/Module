package level2;

public class Parentheses {

    private char[] arrayOfParentheses = {'{', '[', '(','}', ']',')'};

    public  boolean ParenthesesInString(String text){
        boolean k = false;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < text.toCharArray().length; j++) {

                if(text.toCharArray()[j]==arrayOfParentheses[i]){

                    for (int l = j; l < text.toCharArray().length; l++) {
                        if(text.toCharArray()[l]==arrayOfParentheses[i+3]) return true;
                    }

                }
            }

        }
        return k;
    }

}
