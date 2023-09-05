public class Expense {
    String expenseType;
    double amount;
    String businessName;
    int dueMonth;
    int dueDay;
  // Five attributes for the object "Expense". 
    public Expense()
    {
        expenseType = "";
        amount = 0d;
        businessName = "";
        dueMonth = 0;
        dueDay = 0;
        // Constructor with 5 parameters, all set to zero as requested.
    }

    public Expense(String eT,String name,double am,int d,int m)
    {
        expenseType = eT;
        businessName = name;
        amount = am;
        if(d < 1 || d > 31 )
            d=0;
        if(m < 1 || m > 12)
            m=0;
        dueDay = d;
        dueMonth = m;
        // If the day is not between 1 and 31, it will be set to 0. If month is not between 1 and 12, it will be set to zero.
    }

    public Expense(Expense ex)
    {
        expenseType = ex.getType();
        amount = ex.getAmount();
        businessName = ex.getBusinessName();
        dueDay = ex.getDueDay();
        dueMonth = ex.getDueMonth();
        // This is the copy constructor.
    }

    public String getType()
    {
        return expenseType;
        // This method will return the expense type.
    }

    public double getAmount()
    {
        return amount;
        // This method will return the amount.
    }

    public String getBusinessName()
    {
        return businessName;
        // This method will return the business name.
    }

    public int getDueDay()
    {
        return dueDay;
        // This method will return the due day.
    }

    public int getDueMonth()
    {
        return dueMonth;
        // This method will return the due month.
    }

    public void setDueDay(int d)
    {
        if(d < 1 || d > 31 )
            d=0;
        dueDay = d;
        // This method will set the due day to zero if the day is not between 1 and 31.
    }

    public void setDueMonth(int m)
    {
        if(m < 1 || m > 12 )
            m=0;
        dueMonth = m;
        // This method will set the due month to zero if the month is not between 1 and 12. 
    }

    public boolean equals(Expense ex)
    {
        int count=0;
        if(expenseType.equals(ex.getType()))
            count++;
        if(businessName.equals(ex.getBusinessName()))
            count++;
        if(amount == ex.getAmount())
            count++;
        if(dueDay == ex.getDueDay())
            count++;
        if(dueMonth == ex.getDueMonth())
            count++;
        return count==5;
        // This method will return true if the two objects are identical.
    }

    public String toString()
    {
        String result = expenseType + " - " + amount + " - " + businessName + " - ";
        if(getDueDay() < 10)
            result+="0";
        result+=getDueDay() + "/";
        if(getDueMonth() < 10)
            result+="0";
        result+=getDueMonth() + ".";
        return result;
        // This method will return a string indicating the type of the expense.
    }

}
