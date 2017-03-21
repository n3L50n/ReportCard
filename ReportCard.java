public class ReportCard {
   
    // Private variables representing students test, quiz, and essay scores
    private double mTestPercentage;
    private double mQuizPercentage;

    /**
     * @param testPercentage 
     */
    public ReportCard(double testPercentage, double quizPercentage){
        mTestPercentage = testPercentage;
        mQuizPercentage = quizPercentage;
    }

    public double getTestPercentage(){
        return mTestPercentage;
    }

    public double getQuizPercentage(){
        return mQuizPercentage;
    }

    @Override
    public String toString() {
        return "Report Card { \n" + mTestPercentage + "% on tests.\n" + mQuizPercentage + "% on quizzes.\n" + "}";
    }

    /**
     * @param testList an array of integers representing a students test scores
     */
    public double setTestPercentage(int[] testList){
        int sum = 0;
        for(int i = 0; i<testList.length;i++){
            sum = sum + testList[i]; 
        }
        mTestPercentage = sum / testList.length;

        return mTestPercentage;
    }

    /**
     * @param quizList an array of integers representing a students quiz scores
     */
    public double setQuizPercentage(int[] quizList){
        int sum = 0;
        for(int i = 0; i<quizList.length;i++){
            sum = sum + quizList[i]; 
        }
        mQuizPercentage = sum / quizList.length;

        return mQuizPercentage;
    }
}
