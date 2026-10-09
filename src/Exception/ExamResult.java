package Exception;

public class ExamResult {
    public void checkScore(int mark) throws InvalidScoreException{
     if (mark<0 || mark >100){
         throw new InvalidScoreException("Score must be between 0 and 100");
     }else {
         System.out.println("Valid score: " + mark);
     }
    }
}
