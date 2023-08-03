import javax.swing.*;
import java.util.ArrayList;
/**
 * This class represents a Vending Machine Factory.
 *
 * @author Rowell Herrera and Daniella Ughoc S11A
 */
public class Factory {
    /**
     * This constructor initializes the vending machine's number of slots, number of items and type
     * based on the parameters found below. The vending machine can either be normal or special.
     * @param numSlots the number of slots
     * @param numItems the number of items
     * @param vendType the type of vending machine
     */
    public Factory(int numSlots, int numItems, int vendType) {
       if (vendType == 0)
           vm = new VendingMachine(numSlots, numItems);
       else if (vendType == 1)
           vm = new SpecialVending(numSlots, numItems);
        slots = vm.getSlots();
        this.numItems = numItems;
    }
    /**
     * This method adds 6000 in different denominations.
     * @return genRepString the concatenation of the differet counts of each denomination
     */
    public String generalReplenish() {
        vm.genReplenish();
        int total = getOnes()*1 + getFives()*5 + getTens()*10 + getTwenties()*20 + getFifties()*50 + getHundreds()*100 + getFiveHundreds()*500 + getThousands()*1000;
        String genRepString = "Vending Machine Money:\n";
        genRepString = genRepString.concat(
                "\n1 peso: " + getOnes() +
                "\n5 peso: " + getFives() +
                "\n10 peso: " + getTens() +
                "\n20 peso: " + getTwenties() +
                "\n50 peso: " + getFifties() +
                "\n100 peso: " + getHundreds() +
                "\n500 peso: " + getFiveHundreds() +
                "\n1000 peso: " + getThousands() +
                "\n\nTotal: " + total);
        return genRepString;
    }
    /**
     * This method collects all the money in the vending machine.
     * @return the concatenation of the differet counts of each denomination collected
     *
     */
    public String generalCollect() {
        if (vm.getTotalMh() == 0)
            return "There is no money in the vending machine.";
        int total = getOnes()*1 + getFives()*5 + getTens()*10 + getTwenties()*20 + getFifties()*50 + getHundreds()*100 + getFiveHundreds()*500 + getThousands()*1000;
        String genRepString = "Collected Money:\n";
        genRepString = genRepString.concat(
                "\n1 peso: " + getOnes() +
                        "\n5 peso: " + getFives() +
                        "\n10 peso: " + getTens() +
                        "\n20 peso: " + getTwenties() +
                        "\n50 peso: " + getFifties() +
                        "\n100 peso: " + getHundreds() +
                        "\n500 peso: " + getFiveHundreds() +
                        "\n1000 peso: " + getThousands() +
                        "\n\nTotal: " + total);
        vm.collectAll();
        return genRepString;
    }
    /**
     * This method returns the getOnes function which gets the number of 1 peso coins.
     * @return the number of 1 peso coins
     */
    public int getOnes() {
        return vm.getMoneyHolder().getOnes();
    }
    /**
     * This method returns the getFives function which gets the number of 5 peso coins.
     * @return the number of 5 peso coins
     */
    public int getFives() {
        return vm.getMoneyHolder().getFives();
    }
    /**
     * This method returns the getTens function which gets the number of 10 peso coins.
     * @return the number of 10 peso coins
     */
    public int getTens() {
        return vm.getMoneyHolder().getTens();
    }
    /**
     * This method returns the getTwenties function which gets the number of 20 peso coins.
     * @return the number of 20 peso coins
     */
    public int getTwenties() {
        return vm.getMoneyHolder().getTwenties();
    }
    /**
     * This method returns the getFifties function which gets the number of 50 peso bills.
     * @return the number of 50 peso bills
     */
    public int getFifties() {
        return vm.getMoneyHolder().getFifties();
    }
    /**
     * This method returns the getHundreds function which gets the number of 100 peso bills.
     * @return the number of 100 peso bills
     */
    public int getHundreds() {
        return vm.getMoneyHolder().getHundreds();
    }
    /**
     * This method returns the getFiveHundreds function which gets the number of 500 peso bills.
     * @return the number of 500 peso bills
     */
    public int getFiveHundreds() {
        return vm.getMoneyHolder().getFiveHundreds();
    }
    /**
     * This method returns the getThousands function which gets the number of 1000 peso bills.
     * @return the number of 1000 peso bills
     */
    public int getThousands() {
        return vm.getMoneyHolder().getThousands();
    }
    /**
     * This method calls the addOnes function with a parameter of 1. The addOnes function
     * increments the number of one peso coins.
     */
    public void addOnes() {
        vm.getMoneyHolder().addOnes(1);
    }
    /**
     * This method calls the addFives function with a parameter of 1. The addFives function
     * increments the number of 5-peso coins.
     */
    public void addFives() {
        vm.getMoneyHolder().addFives(1);
    }
    /**
     * This method calls the addTens function with a parameter of 1. The addTens function
     * increments the number of 10-peso coins.
     */
    public void addTens() {
        vm.getMoneyHolder().addTens(1);
    }
    /**
     * This method calls the addTwenties function with a parameter of 1. The addTwneties function
     * increments the number of 20-peso coins.
     */
    public void addTwenties() {
        vm.getMoneyHolder().addTwenties(1);
    }
    /**
     * This method calls the addFifties function with a parameter of 1. The addFifties function
     * increments the number of 50-peso bills.
     */
    public void addFifties() {
        vm.getMoneyHolder().addFifties(1);
    }
    /**
     * This method calls the addHundreds function with a parameter of 1. The addHundreds function
     * increments the number of 100-peso bills.
     */
    public void addHundreds() {
        vm.getMoneyHolder().addHundreds(1);
    }
    /**
     * This method calls the addFiveHundreds function with a parameter of 1. The addFiveHundreds function
     * increments the number of 500-peso bills.
     */
    public void addFiveHundreds() {
        vm.getMoneyHolder().addFiveHundreds(1);
    }
    /**
     * This method calls the addThousands function with a parameter of 1. The addThousands function
     * increments the number of 1000-peso bills.
     */
    public void addThousands() {
        vm.getMoneyHolder().addThousands(1);
    }
    /**
     * This method calls the subtractOnes function with a parameter of 1. The subtractOnes function
     * decrements the number of one peso coins.
     */
    public void subtractOnes() {
        vm.getMoneyHolder().subtractOnes(1);
    }
    /**
     * This method calls the subtractFives function with a parameter of 1. The subtractFives function
     * decrements the number of 5-peso coins.
     */
    public void subtractFives() {
        vm.getMoneyHolder().subtractFives(1);
    }
    /**
     * This method calls the subtractTens function with a parameter of 1. The subtractTens function
     * decrements the number of 10-peso coins.
     */
    public void subtractTens() {
        vm.getMoneyHolder().subtractTens(1);
    }
    /**
     * This method calls the subtractTwenties function with a parameter of 1. The subtractTwenties function
     * decrements the number of 20-peso coins.
     */
    public void subtractTwenties() {
        vm.getMoneyHolder().subtractTwenties(1);
    }
    /**
     * This method calls the subtractFifties function with a parameter of 1. The subtractFifties function
     * decrements the number of 50-peso bills.
     */
    public void subtractFifties() {
        vm.getMoneyHolder().subtractFifties(1);
    }
    /**
     * This method calls the subtractHundreds function with a parameter of 1. The subtractHundreds function
     * decrements the number of 100-peso bills.
     */
    public void subtractHundreds() {
        vm.getMoneyHolder().subtractHundreds(1);
    }
    /**
     * This method calls the subtractFiveHundreds function with a parameter of 1. The subtractFiveHundreds function
     * decrements the number of 500-peso bills.
     */
    public void subtractFiveHundreds() {
        vm.getMoneyHolder().subtractFiveHundreds(1);
    }
    /**
     * This method calls the subtractThousands function with a parameter of 1. The subtractThousands function
     * decrements the number of 1000-peso bills.
     */
    public void subtractThousands() {
        vm.getMoneyHolder().subtractThousands(1);
    }
    /**
     * This method callse the getOnes() which gets the number of 1 peso coins.
     * @return the number of 1 peso coins
     */
    public int getPayOnes() {
        return vm.getMoneyHolder().getOnes();
    }
    /**
     * This method callse the getFives() which gets the number of 5 peso coins.
     * @return the number of 5 peso coins
     */
    public int getPayFives() {
        return vm.getMoneyHolder().getFives();
    }
    /**
     * This method callse the getTens() which gets the number of 10 peso coins.
     * @return the number of 10 peso coins
     */
    public int getPayTens() {
        return vm.getMoneyHolder().getTens();
    }
    /**
     * This method callse the getTwenties() which gets the number of 20 peso coins.
     * @return the number of 20 peso coins
     */
    public int getPayTwenties() {
        return vm.getMoneyHolder().getTwenties();
    }
    /**
     * This method callse the getFifies() which gets the number of 50 peso bills.
     * @return the number of 50 peso bills
     */
    public int getPayFifties() {
        return vm.getMoneyHolder().getFifties();
    }
    /**
     * This method callse the getHundreds() which gets the number of 100 peso bills.
     * @return the number of 100 peso bills
     */
    public int getPayHundreds() {
        return vm.getMoneyHolder().getHundreds();
    }
    /**
     * This method callse the getHFiveundreds() which gets the number of 500 peso bills.
     * @return the number of 500 peso bills
     */
    public int getPayFiveHundreds() {
        return vm.getMoneyHolder().getFiveHundreds();
    }
    /**
     * This method calls the getThousands() which gets the number of 1000 peso bills.
     * @return the number of 100 peso bills
     */
    public int getPayThousands() {
        return vm.getMoneyHolder().getThousands();
    }
    /**
     * This method gets the slots
     * @return slots araylist of arraylist pf items
     */
    public ArrayList<ArrayList<Item>> getSlots() {
        return slots;
    }
    /** This methods gets the vending machine
     * @return vm vending machine
     */
    public VendingMachine getVendingMachine() {
        return vm;
    }
    /**
     * This methods facilitates the stocking of a new item in the vending machine.
     * It checks the name, quantity, price calories and category of the item
     * and ensure the validity of ech detail. If all details about the item is valid, only then
     * the function returns 0 which means that the item is added successfully. If the value
     * 1,2,3,4,5,6 are returned then the item is not added.
     * @param addQty the quantity of the item to be added
     * @param addName the name of the item to be added
     * @param addPrice the price of the item to be added
     * @param addCalories the calories of the item to be added
     * @param category the category of the item to be added
     * @return 0,1,2,3,4,5,6
     */
    public int stockItem(int addQty, String addName, int addPrice, double addCalories, int category) {
        if (addQty > 0 && addQty <= numItems){
            if (addName != null) {
                if (addPrice > 0) {
                    if (addCalories >= 0) {
                        boolean success = true;
                        for (ArrayList<Item> slot : slots) {
                            if (slot.get(0).getName().equals(addName)) {
                                success = false;
                                break;
                            }
                        }

                        if (success) {
                            if (vm.stockNew(addQty, addName, addPrice, addCalories, category)) {
                                return 0;
                            } else
                                return 1;
                        } else return 2;
                    } else
                        return 3;
                } else return 4;
            } else return 5;
        } else return 6;
    }
    /**
     * This method edits an item. It returns 0 if an item is successfully editem,
     * 1 if item is null and 2 if the price is less than 0.
     * @param name the new name of the item
     * @param price the new price of the item
     * @return 0 or 1 or 2
     */
    public int editItem(String name, int price) {
        Item item = vm.findItem(name);
        if (price > 0) {
            if (item!=null){
                boolean success = vm.editItem(item, name, price, item.getCalories(), item.getCategory());
                if (success) return 0;
            } else return 1;
        }
        return 2;
    }
    /**
     * This method removes the a specific quantity of an item from the vending machine.
     * It returns 0 if the removal is succesful, 1 if item is not found, and 2 if
     * quantity is less than 0.
     * @param name name of item
     * @param qty quantity to be removed
     * @return 0, or 1, or 2
     */
    public int removeItem(String name, int qty) {
        Item item = vm.findItem(name);
        if (qty > 0) {
            if (item!=null) {
                boolean success = vm.removeItem(item, qty);
                if (success) return 0;
            } else return 1;
        }
        return 2;
    }
    /**
     * THis method checks if the payment is returned. It returns true if the payment
     * is returned and false if otherwise.
     * @return true or false
     */
    public boolean isPaymentReturned() {
        vm.subtractPaymentAndBank();
        if (vm.getMoneyHolder().getTotChange() !=0)
            return true;
        return false;
    }
    /**
     * This method facilitates the ordering of an item. It returns 0 if the item is successfully ordered.
     * Meanwhile, it returns 1 if the item is out of stock,2 if there is not enough change in the vending machine,
     * 3 if there is not enough payment inserted by the user or 4 if the item does not exist.
     * @param item the item to be dispensed
     * @return 0,1,2,3,or 4
     */
    public int orderItem(Item item) {
        if (item != null) { //if item is found

            int price = item.getPrice();
            if (vm.getTotalPayment() >= price) { //if there's enough payment
                if (vm.produceChange(price)) { //if there's enough change in the machine
                    if (vm.chooseItem(item)) { //if item is out of stock (fail-safe)
                        vm.updateChosen(item);
                        return 0;
                    }

                    else {
                        if (item.getCategory()==-1) vm.remove(item, 1);
                        return 1;
                    }
                }

                else {
                    if (item.getCategory()==-1) vm.remove(item, 1);
                    return 2;
                }

            }

            else {
                if (item.getCategory()==-1) vm.remove(item, 1);
                return 3;
            }

        }

        else {
            if (item.getCategory()==-1) vm.remove(item, 1);
            return 4;
        }
    }
    /**
     * This method dispenses the item.
     * @param totalPrice the total price of the item chosen by the user
     */
    public void dispenseItem(int totalPrice) {
        boolean success = vm.subtractPaymentAndBank(vm.getTotalPayment()-totalPrice);
        int dnm = 0;
        if (vm.getMoneyHolder().getTotChange() !=0) { //if there is no change
            change = "Change: \n";
            for (int i : vm.getMoneyHolder().getDenominations()) {
                String dispense = displayDispensedChange(dnm, i);
                if (dispense != null)
                    change = change.concat(displayDispensedChange(dnm, i));
                dnm++;
            }
        }
        else
            change = "Exact payment received.\n";

        if (success) { //when there is enough change
            Item item = vm.getChosen();
            vm.remove(item, 1);
            if (vm instanceof SpecialVending && item.getCategory() == -1) {
                changeEvent = "Preparing your item...\n";
                if (specBase != null) {
                    vm.remove(specBase, 1);
                    vm.updateTransactions(specBase);
                    changeEvent = changeEvent.concat("Scooping the " + specBase.getName() + "...\n");
                    specBase = null;
                }
                if (specFruit != null) {
                    vm.remove(specFruit, 1);
                    vm.updateTransactions(specFruit);
                    changeEvent = changeEvent.concat("Picking the " + specFruit.getName() + "...\n");
                    specFruit = null;
                }
                if (specTopping != null) {
                    vm.remove(specTopping, 1);
                    vm.updateTransactions(specTopping);
                    changeEvent = changeEvent.concat("Sprinkling the " + specTopping.getName() + "...\n");
                    specTopping = null;
                }
                if (specSauce != null) {
                    vm.remove(specSauce, 1);
                    vm.updateTransactions(specSauce);
                    changeEvent = changeEvent.concat("Drizzling the " + specSauce.getName() + "...\n");
                    specSauce = null;
                }
                changeEvent = changeEvent.concat("Dispensing your special order!\n");
                vm.remove(item, 1);
            }
            else {
                vm.updateTransactions(item);
                changeEvent = "Dispensing " + item.getName() + "...\n";
            }
            //System.out.println("Dispensing " + item.getName() + "...\n");
        }
        else { //when there is not enough change
            changeEvent = "Not enough small change in the machine. Payment was returned.\n\n";
            //System.out.println("Not enough small change in the machine. Payment is returned.\n");
        }
        Item item = vm.getChosen();
        if (item.getCategory()==-1) {
            vm.remove(item, 1);
        }
    }


    /**
     * This method tracks the categories in the special vending machine.
     * @param b the base of the custom order
     * @param f the fruit of the custom order
     * @param t the topping of the custom order
     * @param s the sauce of the custom order
     */
    public void trackSpec(Item b, Item f, Item t, Item s) {
        specBase = b;
        specFruit = f;
        specTopping = t;
        specSauce = s;
    }
    /**
     * This method displays the dispensed change.
     * @param denom the money denomination
     * @param count the count
     * @return temp the concatenation of the change in string format
     */
    public String displayDispensedChange(int denom, int count) {
        switch (denom) {
            case 0:
                denom = 1000;
                break;
            case 1:
                denom = 500;
                break;
            case 2:
                denom = 100;
                break;
            case 3:
                denom = 50;
                break;
            case 4:
                denom = 20;
                break;
            case 5:
                denom = 10;
                break;
            case 6:
                denom = 5;
                break;
            case 7:
                denom = 1;
                break;
        }
        String temp = null;
        if (count != 0)
            temp = count + " " + denom + " pesos (Total: " + count*denom + ").\n";
        return temp;
    }


    /**
     * This method displays the transactions.
     * @return trans the concatenation of the quantity, name of the item, and price
     */
    public String displayTransactions() {
        if (vm.getTransactions().isEmpty()) //if there have been no transactions yet
            return "No transactions yet.";
        String trans = "Quantity\t Name\t Total Price";
        for (Transaction t : vm.getTransactions()) {
            trans = trans.concat("\n" + t.getQuantity() + "\t " + t.getName() + "\t " + t.getPrice());
        }
        return trans;
    }


    /**
     * This method displays the starting inventory of the vending machine. It
     * return empthy if no items had been added in the vending machine. Otherwise,
     * if returns the concatenation of the quanity and String s
     * @return "Empty" or the concatenation of the quantity and String s
     */
    public String displayStartInv() {
        if (vm.getStartInventory().isEmpty()) //if there have been no items added yet
            return "Empty.";
        String start = "Quantity\t\t Name";
        int count = 0;
        for (String s : vm.getStartInventory()) {
            if (s==null) {
                break;
            }
            int quantity = vm.getStartQuantity().get(count);
            start = start.concat("\n" + quantity + "\t\t " + s);
            count++;
        }
        return start;
    }


    /**
     * This method displays the end inventory of the vending machine.
     * It returns empty, if the vending machine is completely depleted.
     * Otherwise, it returns the concatenation of the quantity and String s.
     * @return "Empty" or the concatenation of the quantity and String s
     */
    public String displayEndInv() {
        vm.updateEndInv();

        if (vm.getEndInventory().isEmpty())
            return "Empty.";
        String end = "Quantity\t\t Name";
        for (String s : vm.getEndInventory()) {
            if (s==null) {
                break;
            }

            for (ArrayList<Item> slot : vm.getSlots()) {
                if (slot.get(0).getName().equals(s)) {
                    int quantity = slot.size();
                    end = end.concat("\n" + quantity + "\t\t " + s);
                    break;
                }
            }
        }
        return end;
    }
    /**
     * This method gets the change.
     * @return change the change
     */
    public String getChange() {
        return change;
    }
    /**
     * This method gets the change event.
     * @return changeEvent the event change
     */
    public String getChangeEvent() {
        return changeEvent;
    }
    /**
     * This method resets the change by setting it as null
     */
    public void resetChange() {
        change = null;
    }
    /**
     * This method resets the changeEvent by setting it as null
     */
    public void resetChangeEvent() {
        changeEvent = null;
    }
    /** the arrraylist of arraylist of items */
    private ArrayList<ArrayList<Item>> slots;
    /** the number of items */
    private int numItems;
    /** the instance of VendingMachine vm */
    private VendingMachine vm;
    /** the change */
    private String change;
    /** the changeEvent */
    private String changeEvent;
    /** the base in the special vending machine */
    private Item specBase;
    /** the fruit in the special vending machine */
    private Item specFruit;
    /** the topping in the special vending machine */
    private Item specTopping;
    /** the sauce in the special vending machine */
    private Item specSauce;
}
