public class ReportCard {
    
    private int mTestPercentage;

    private int mQuizPercentage;

    private char mEssayScore; 

    public ReportCard(int testPercentage, int quizPercentage, char essayScore ){
        mTestPercentage = testPercentage;
        mQuizPercentage = quizPercentage;
        mEssayScore = essayScore;
    }

    public int getTestPercentage(){
        return mTestPercentage;
    }

    public int getQuizPercentage(){
        return mQuizPercentage;
    }

    public char getEssayScore(){
        return mEssayScore;
    }

    @Override
    public String toString() {
        return "Report Card { \n" + mTestPercentage + "% on tests.\n" + mQuizPercentage + "% on quizzes." + mEssayScore + " score on essays }";
    }

    public int setTestPercentage(){
        return mTestPercentage;
    }

    public int setQuizPercentage(){
        return mQuizPercentage;
    }

    public char setEssayScore(){
        return mEssayScore;
    }
}
