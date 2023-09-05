public class HouseholdBudget{
    Fund fund;
    Expense[] expenses;
    // HouseholdBudget contains an object of type fund and an array storing the expense.  

    public HouseholdBudget()
    {
        fund = new Fund();
        expenses = null;
        // Constructor with 2 parameters and expense set to null as requested.
    }

    public HouseholdBudget(Fund f,Expense[] ex)
    {
        fund = new Fund(f);
        expenses = ex;
    }

    public Fund getFund()
    {
        return fund;
        // This method will return the fund.
    }

    public boolean compareFunds(HouseholdBudget hb)
    {
        if(fund.fundTotal() == hb.getTotalFund())
            return true;
        else
            return false;
        // If the two householdBudgets have the same value, it will return true. Otherwise, it will return false.
    }

    public boolean fundTypeCount(HouseholdBudget hb)
    {
        return fund.equals(hb.getFund());
        // This method will return the fund type. 
    }

    public int getTotalFund()
    {
        return fund.fundTotal();
        // This method will return the total fund.
    }

    public int getNumberOfExpenses()
    {
        if(expenses == null)
            return 0;
        return expenses.length;
        // This method will return the number of expenses. 
    }

    public int addExpense(Expense ex)
    {
        Expense[] temp;
        if(expenses == null){
            expenses = new Expense[1];
            expenses[expenses.length-1] = ex;
            return expenses.length;
        }
        else
        {
            temp = new Expense[expenses.length+1];
            for(int i=0;i<expenses.length;i++)
            {
                temp[i] = expenses[i];
            }
            temp[temp.length-1] = ex;
            expenses = temp;
            return expenses.length;
            // This method will add an expense to a householdBudget. 
        }
    }

    public boolean removeExpense(int index)
    {
        if(expenses == null)
            return false;
        if(expenses.length == 1)
        {
            expenses = null;
            return true;
        }
        else
        {
            Expense[] temp = new Expense[expenses.length-1];
            for(int i=index;i<expenses.length-1;i++)
            {
                expenses[i] = expenses[i+1];
            }
            for(int i=0;i<temp.length;i++)
            {
                temp[i] = expenses[i];
            }
            expenses = temp;
            return true;
            // This method will remove an expense from the householdBudget. If the expenses is null, it will return false to the user and he will have to enter a new household.
            // If the expense is equal to 1, expense will be set to null (since now there is no more expenses). However, if expenses are bigger than 1, they will remove the expense 
            // thanks to the index that the user put. It will reduce the array expenses (it will remove the expense that needs to be removed from the aray).
        }
    }

    public void updateDayandMonth(int d,int m,int index)
    {
        expenses[index].setDueDay(d);
        expenses[index].setDueMonth(m);
        // This method will update the day and month of an expense.
    }

    public int addFund(int a,int b,int c,int d,int e)
    {
        fund.addFund(a,b, c, d, e);
        return getTotalFund();
        // This method will return the added fund of the householdBudget. This method has 5 parameters as requested.
    }

    public boolean equals(HouseholdBudget hb)
    {
        int count=0;
        if(getTotalFund() == hb.getTotalFund())
            count++;
        if(getNumberOfExpenses() == hb.getNumberOfExpenses())
            count++;
        return count == 2;
        // This method will return a boolean if count is equal to 2.
    }

    public String toString()
    {
        String result=fund.toString();
        if(getNumberOfExpenses() == 0)
        {
            result+="No expenses\n";
            return result;
        }
        for(Expense ex : expenses)
        {
            result+=ex.toString();
            result+="\n";
        }
        return result;
        // This method will return a string indicating the number of each money type and the details of each expense in details.
    }

}