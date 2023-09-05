
//------------------------------------------------------
// Assigment 4
// 
//For COMP 248 Section (EC) - Fall 2022
//------------------------------------------------------


import java.util.Scanner; // I just imported my Scanner in order to get input from the keyboard.  

public class BudgetDemo {

    public static HouseholdBudget[] init() {
        HouseholdBudget[] householdBudget = new HouseholdBudget[5];
        householdBudget[0] = new HouseholdBudget(new Fund(1, 2, 3, 4, 5), null);
        householdBudget[0].addExpense(new Expense("Bill", "Cotsco", 90.00, 1, 9));
        householdBudget[1] = new HouseholdBudget(new Fund(1, 2, 3, 4, 5), null);
        householdBudget[1].addExpense(new Expense("Bill", "Videotron", 90.00, 25, 7));
        householdBudget[2] = new HouseholdBudget(new Fund(0, 0, 2, 1, 7), null);
        householdBudget[2].addExpense(new Expense("Purchase", "Walmart", 10.00, 19, 12));
        householdBudget[2].addExpense(new Expense("Bill", "Fido", 100.00, 21, 1));
        householdBudget[2].addExpense(new Expense("Bill", "Hydro Quebec", 1000.00, 10, 5));
        householdBudget[3] = new HouseholdBudget(new Fund(1, 1, 1, 1, 1), null);
        householdBudget[4] = new HouseholdBudget(new Fund(1, 1, 1, 1, 1), null);
        return householdBudget;
        // Here, I just created 5 householdBudgets as requested by the teacher. 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, miniChoice, miniminiChoice;
        String name, type, dueDate;
        double amount;
        HouseholdBudget[] householdBudget = init();
        System.out.println(
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\nWelcome to COMP248 Geek's HouseholdBudget_2022 Application\n\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        do {
            System.out.println(
                    "What would you like to do?\n 1. See the possessions of all householdBudgets\n 2. See the possessions of one householdBudget\n 3. List householdBudgets with same total amount of fund\n 4. List householdBudgets with same fund denomination(s)\n 5. List householdBudgets with same total amount of fund and same number of expenses\n 6. Add an expenese to an existing householdBudget\n 7. Remove an existing expense from a householdBudget\n 8. Update the payment due date of an existing expense\n 9. Add fund to a housholdBudget\n 0. To quit");
            System.out.print("\nPlease enter your choice and press <Enter>: ");
            //This is the welcoming message followed by the task that the user wants to go through. He has the choice between 9 options and quit as well.
            choice = input.nextInt();
            if (choice < 0 || choice > 9) {
                System.out.println("Sorry that is not a valid input. Try again.");
                continue;
                // If he enters a number smaller than 0 or larger than 9, it will ask the user to enter again a new choice. 
            }
            switch (choice) {
                case 1:
                    System.out.println("Content of each householdBudget:\n-----------------------");
                    int temp = 0;
                    for (HouseholdBudget hb : householdBudget) {
                        System.out.println("HouseholdBudget #" + temp + "\n" + hb.toString());
                        temp++;
                        // If the user enters 1, the content of each householdBudget will be displayed. 
                    }
                    break;
                case 2:
                    System.out.print("Which householdBudget you want to see possessions of? (Enter number 0 - 4):");
                    do {
                        miniChoice = input.nextInt();
                        if (miniChoice >= 0 && miniChoice <= 4)
                            break;
                        else
                            System.out.print("Sorry but there is no HouseholdBudget number " + miniChoice
                                    + "\n--> Try again: (Enter number 0 - 4):");
                    } while (true);
                    System.out.println(householdBudget[miniChoice].toString());
                    break;
                    // Here, if the user inputs 2, a single householdBudget will be displayed. The one chosen by the user. If the user enters an invalid number, he will be
                    // asked to try again with a different number.
                case 3:
                    System.out.println("List of householdBudgets with same total fund: \n");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (householdBudget[i].compareFunds(householdBudget[j]) && j > i)
                                System.out.println("     HouseHoldBudgets " + i + " and " + j + " both have "
                                        + householdBudget[i].getTotalFund() + ".0");
                            // Here, if the user enters 3, the list of householdBudgets with the same total fund will be displayed.
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("List of householdBudgets with same fund: \n");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (householdBudget[i].fundTypeCount(householdBudget[j]) && j > i)
                                System.out.print("     HouseHoldBudgets " + i + " and " + j + " both have "
                                        + householdBudget[i].getFund().toString());
                            // Here, if the user enters 4, the list of householdBudgets with the same fund will be displayed.  
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println(
                            "List of householdBudgets with same amount of money and same number of expenses: \n");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (householdBudget[i].equals(householdBudget[j]) && j > i)
                                System.out.println("     HouseHoldBudgets " + i + " and " + j);
                        }
                    }
                    System.out.println();
                    break;
                    // Here, if the user enters 5, the list of householdBudgets with the same amount of money and number of expense will be displayed.
                case 6:
                    System.out.print("Which householdBudget do you want to add an expense to? (Enter number 0 to 4):");
                    do {
                        miniChoice = input.nextInt();
                        input.nextLine();
                        if (miniChoice >= 0 && miniChoice <= 4)
                            break;
                        // If it is written the current householdBudgets it will continue.
                        else
                            System.out.print("Sorry but there is no HouseholdBudget number " + miniChoice
                                    + "\n--> Try again: (Enter number 0 to 4):");
                        // If the user enters a householdBudget that does not exist, there will be an error message telling the user to try again.
                    } while (true);
                    System.out.print(
                            "Please enter the following information so that we may complete the expense-\n--> Type of expense(Bill, Purchase, etc..): ");
                    type = input.next();
                    // The user will enter the type of expense.
                    System.out.print("--> Amount of the expense: ");
                    amount = input.nextDouble();
                    // The user will enter the amount of the expense.
                    input.nextLine();
                    System.out.print("--> Name of the business: ");
                    name = input.nextLine();
                    // The user will enter the name of the business.
                    System.out.print("--> Payment due day number and month (seperate by space): ");
                    dueDate = input.nextLine();
                    String[] word = dueDate.split(" ");
                    // The user will enter the amount due day number and month, it will be stored in a string.
                    System.out
                            .println(
                                    "You now have "
                                            + householdBudget[miniChoice].addExpense(new Expense(type, name, amount,
                                                    Integer.parseInt(word[0]), Integer.parseInt(word[1])))
                                            + " expense\n");
                    // This message will tell the user the expense that he has.
                    break;
                case 7:
                    System.out.print("Which householdBudget do you want to remove an expense from? (Enter number 0 to 4):");
                    do {
                        miniChoice = input.nextInt();
                        input.nextLine();
                        if (miniChoice >= 0 && miniChoice <= 4)
                            break;
                        else
                            System.out.print("Sorry but there is no HouseholdBudget number " + miniChoice
                                    + "\n--> Try again: (Enter number 0 to 4): ");
                        // If the user enters a householdBudgets that is not existing, he will be asked to enter an existing one (try again).
                    } while (true);
                    if (householdBudget[miniChoice].getNumberOfExpenses() == 0) {
                        System.out.println("Sorry this household has no expenses");
                        break;
                        // If the user currently enters a householdBudget with no expense, he will be told to enter a new one.
                    }
                    System.out.println(
                            "(Enter number 0 to " + (householdBudget[miniChoice].getNumberOfExpenses() - 1) + " )");
                    do {
                        miniminiChoice = input.nextInt();
                        input.nextLine();
                        if (miniminiChoice >= 0
                                && miniminiChoice <= householdBudget[miniChoice].getNumberOfExpenses() - 1)
      
                            break;
                        else
                            System.out.print("Sorry but there is no expense number " + miniminiChoice
                                    + "\n--> Try again: \n(Enter number 0 to "
                                    + (householdBudget[miniChoice].getNumberOfExpenses() - 1) + " )");
                        // If there is no expense, the user will be told such and he will be asked to try again. 
                    } while (true);
                    if (householdBudget[miniChoice].removeExpense(miniminiChoice))
                        System.out.println("Expense was removed successfully\n");
                    else
                        System.out.println("Expense was not removed successfully\n");
                    // A message to the user telling him that the expense has been removed is displayed.
                    break;
                case 8:
                    System.out.print("Which householdBudget do you want to update an expense from? (Enter number 0 to 4):");
                    do {
                        do {
                            miniChoice = input.nextInt();
                            input.nextLine();
                            if (miniChoice >= 0 && miniChoice <= 4)
                                break;
                            else
                                System.out.print("Sorry but there is no HouseholdBudget number " + miniChoice
                                        + "\n--> Try again: (Enter number 0 to 4): ");
                            // As usual, if the user does not enter an existing householdBudget, he will be told so.
                        } while (true);
                        if (householdBudget[miniChoice].getNumberOfExpenses() == 0) {
                            System.out.println("This household dose not have any expenses. Try again: \n(Enter number 0 to 4): ");
                            // If there is no expense, the user will be told that he chose a householdBudget with no expense.
                        }
                        else
                        {
                            break;
                        }
                    } while (true);
                    System.out.println(
                            "(Enter number 0 to " + (householdBudget[miniChoice].getNumberOfExpenses() - 1) + " ): ");
                    // If there is an expense, it will ask the user which expense he wants to update.
                    do {
                        miniminiChoice = input.nextInt();
                        input.nextLine();
                        if (miniminiChoice >= 0
                                && miniminiChoice <= householdBudget[miniChoice].getNumberOfExpenses() - 1)
                            break;
                        else
                            System.out.println("Sorry but there is no expense number " + miniminiChoice
                                    + "\n--> Try again:\n (Enter number 0 to "
                                    + (householdBudget[miniChoice].getNumberOfExpenses() - 1) + " ): ");
                    } while (true);
                    System.out.print("--> Enter new payment due day number and month (seprate by space): ");
                    dueDate = input.nextLine();
                    String[] word1 = dueDate.split(" ");
                    householdBudget[miniChoice].updateDayandMonth(Integer.parseInt(word1[0]),
                            Integer.parseInt(word1[1]), miniminiChoice);
                    // Here, I am storing the new due day number and month of the updated expense. 
                    System.out.println("Due date updated.\n");
                    break;
                case 9:
                    System.out.print("Which householdBudget do you want to add fund to? (Enter number 0 to 4): ");
                    // Here, I am asking the user to enter the householdBudget he wants to remove expense from.
                    do {
                        miniChoice = input.nextInt();
                        input.nextLine();
                        if (miniChoice >= 0 && miniChoice <= 4)
                            break;
                        else
                            System.out.print("Sorry but there is no HouseholdBudget number " + miniChoice
                                    + "\n--> Try again: (Enter number 0 to 4): ");
                        // As always, if the user enters a householdBudget that does not exist, he will be reminded to choose an existing one.
                    } while (true);
                    System.out.print(
                            "How many lonnies, tonnies, $5, $10 and $20 bill do you want to add? \n(Enter 5 numbers separated by space): ");
                    dueDate = input.nextLine();
                    // Here, the number of each type of expense the user wants to add will be stored in "due date" which will be converted to a string. 
                    String[] word2 = dueDate.split(" ");
                    System.out.println("You now have " + householdBudget[miniChoice].addFund(Integer.parseInt(word2[0]),
                            Integer.parseInt(word2[1]), Integer.parseInt(word2[2]), Integer.parseInt(word2[3]),
                            Integer.parseInt(word2[4])) + "$\n");
                   // Here, I am displaying to the user the number of each toonies, 5$ bill, etc he possesses. 
                    break;
            }
        } while (choice != 0);
        // When the choice is zero, a closing message saying "Thank you" to the user is displayed. 
        System.out.println("Thank you for using COMP248 Geek's HouseholdBudget Application!");
        input.close();
    }
}
