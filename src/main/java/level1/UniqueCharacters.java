package level1;

public class UniqueCharacters {

    public int[] ArrayOfCharacters = {1, 4, 5, 1, 1, 3, 6, 7, 10, 5, 4};

    public int AmountOfUniqueCharacters( int[] ArrayOfCharacters){
        int score = 0;


        for (int i = 0; i < ArrayOfCharacters.length; i++) {

            boolean repeat = false;
            for(int k=0; k<i;k++){
                if(ArrayOfCharacters[k]==ArrayOfCharacters[i]){
                    repeat=true; break;
                }
            }

            if(!repeat) score++;
        }

        return score;
    }

}
