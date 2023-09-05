public class Fund {
    static final int lonnies = 1;
    static final int tonnies = 2;
    static final int fiveBuck = 5;
    static final int tenBuck = 10;
    static final int twentyBuck = 20;
    int numberOfLonnies;
    int numberOftonnies;
    int numberOffiveBuck;
    int numberOftenBuck;
    int numberOftwentyBuck;
    // Here I just created my different cash types. I have static constants in order to evaluate how much cash a household possesses.

    public Fund() {
        numberOfLonnies = 0;
        numberOftonnies = 0;
        numberOffiveBuck = 0;
        numberOftenBuck = 0;
        numberOftwentyBuck = 0;
        // Constructor: all set to zero initially. 
    }

    public Fund(int nL, int nT, int nF, int nTe, int nTw) {
        numberOfLonnies = nL;
        numberOftonnies = nT;
        numberOffiveBuck = nF;
        numberOftenBuck = nTe;
        numberOftwentyBuck = nTw;
        // Method to have the number of different cash types by the household. The user will input values.
    }

    public Fund(Fund f) {
        numberOfLonnies = f.getLonnies();
        numberOftonnies = f.getTonnies();
        numberOffiveBuck = f.getFiveBuc();
        numberOftenBuck = f.getTenBuck();
        numberOftwentyBuck = f.getTwentyBuck();
        // This is the copy constructor.
    }

    public int getLonnies() {
        return numberOfLonnies;
        // This method will return the number of lonnies.
    }

    public int getTonnies() {
        return numberOftonnies;
        // This method will return the number of tonnies.
    }

    public int getFiveBuc() {
        return numberOffiveBuck;
        // This method will return the number of five buck.
    }

    public int getTenBuck() {
        return numberOftenBuck;
        // This method will return the number of ten buck.
    }

    public int getTwentyBuck() {
        return numberOftwentyBuck;
        // This methid will return the number of twenty buck.
    }

    public void setLonnies(int value) {
        numberOfLonnies = value;
        //This method will set the number of loonies.
    }

    public void setTonnies(int value) {
        numberOftonnies = value;
        // This number will set the number of tonnies.
    }

    public void setFiveBuck(int value) {
        numberOffiveBuck = value;
        // This method will set the number of five buck.
    }

    public void setTenBuck(int value) {
        numberOftenBuck = value;
        // This method will set the number of ten buck.
    }

    public void setTwentyBuck(int value) {
        numberOftwentyBuck = value;
        // This method will set the number of twenty buck.
    }

    public void addFund(int nL, int nT, int nF, int nTe, int nTw) {
        numberOfLonnies += nL;
        numberOftonnies += nT;
        numberOffiveBuck += nF;
        numberOftenBuck += nTe;
        numberOftwentyBuck += nTw;
        // This method will add fund to the existinh household. 
    }

    public int fundTotal() {
        return ((lonnies * numberOfLonnies) + (tonnies * numberOftonnies) + (fiveBuck * numberOffiveBuck)
                + (tenBuck * numberOftenBuck) + (twentyBuck * numberOftwentyBuck));
        // This method will return the fund of the household.
    }

    public boolean equals(Fund f) {
        int count = 0;
        if (numberOfLonnies == f.getLonnies())
            count++;
        if (numberOftonnies == f.getTonnies())
            count++;
        if (numberOffiveBuck == f.getFiveBuc())
            count++;
        if (numberOftenBuck == f.getTenBuck())
            count++;
        if (numberOftwentyBuck == f.getTwentyBuck())
            count++;
        return count==5;
        // This method will return a boolean (true or false) if two objects being compared have the same breakdown of cash type.
    }

    public String toString()
    {
        String result = "("+getLonnies()+" x $1) + ("+getTonnies()+" x $2) + ("+getFiveBuc()+" x $5) + ("+getTenBuck()+" x $10) + ("+getTwentyBuck()+" x $20)\n";
        return result;
        // This method will return the the count of each fund type the household owns. 
    }

}