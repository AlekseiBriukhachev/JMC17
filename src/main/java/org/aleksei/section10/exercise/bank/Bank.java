package org.aleksei.section10.exercise.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
//        return findBranch(branchName) != null && branches.add(new Branch(branchName));
        Branch tempBranch = findBranch(branchName);
        if(tempBranch == null) {
            tempBranch = new Branch(branchName);
            this.branches.add(tempBranch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        return branch != null && branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        return branch != null && branch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.printf("Customer details for branch %s%n", branch.getName());
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.printf("Customer: %s[%d]%n", branch.getCustomers().get(i).getName(), (i + 1));
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branch.getCustomers().get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.printf("[%d]  Amount %.2f%n", (j + 1), transactions.get(j));
                    }
                }
            }
            return true;
        }  else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(nameOfBranch)) {
                return branches.get(i);
            }
        }
        return null;
    }
}
