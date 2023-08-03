import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class represents a vending machine.
 * 
 * @author Rowell Herrera and Daniella Ughoc S11A
 */
public class VendingMachine {
    /**
     * This constructor initializes the number of slots of the machine and the number
     * of items based on the given parameters below. It also initializes the 
     * the money holder, start inventory, end inventory,and the transactions, and the money holder. 
     * @param numSlots the number of slots
     * @param numItems the number of items
     */
    public VendingMachine(int numSlots, int numItems) {
        this.numSlots = numSlots;
        slots = new ArrayList<ArrayList<Item>>(numSlots);
        mh = new MoneyHolder();
        this.numItems=numItems;
        startInventory = new ArrayList<String>();
        startQuantity = new ArrayList<Integer>();
        endInventory = new ArrayList<String>();
        transactions = new ArrayList<Transaction>();
    }
    /**
     * This method increments the total payment by the product of the given count
     * and denomination. 
     * @param denomination the value of the bill/coin
     * @param count the number of bills/coins
     */
    public void updatePayment(int denomination, int count) {
        totalPayment += denomination*count;
    }
    /**
     * This method subtracts the total payment and the total money in the money holder
     * It returns true if there is enough change in the vending machine and false otherwise.
     * @param change the change of the user
     * @return true or false
     */
    public boolean subtractPaymentAndBank(int change) {
        boolean success = mh.subtractTotal(change);
        if (success) { //if there is enough change in the machine
            totalPayment =0;
            return true;
        }
        mh.subtractTotal(getTotalPayment());
        return false;
    }
    /**
     * This method subtracts the total payment and the total money in the money holder by
     * the payment.
     */
    public void subtractPaymentAndBank() {
        mh.subtractTotal(getTotalPayment());
    }
    /**
     * This method adds the item to the list of transactions.
     * @param item the item to be added
     */
    public void updateTransactions(Item item) {
        boolean success = false;
        for (Transaction t : transactions) {
            if (t.getName().equals(item.getName())) {
                t.setQuantity(t.getQuantity()+1);
                success = true;
            }
        }
        if (!success) {
            Transaction t = new Transaction(item.getName(), 1, item.getPrice());
            transactions.add(t);
        }
    }
    /**
     * This method updates the chosen item and updates the machine that
     * the user has chosen an item.
     * @param item the chosen item
     */
    public void updateChosen(Item item) {
        chosenItem = item;
        hasChosen = true;
    }
    /**
     * This method returns the address of the chosen item.
     * @return the address of the chosen item
     */
    public Item getChosen() {
        return chosenItem;
    }
    /**
     * This method returns the price of the chosen item.
     * @return the price of the chosen item
     */
    public int getTotalCost() {
        return chosenItem.getPrice();
    }
    /**
     * This method resets the attributes related to buying an item to
     * their default values (the total payment, the chosen item, and if 
     * there is a chosen item).
     */
    public void resetBuying() {
        hasChosen = false;
        totalPayment = 0;
        chosenItem = null;
    }
    /**
     * This method is used for checking if there is a chosen item.
     * It returns true if there is a chosen item and false if otherwise.
     * @return true or false
     */
    public boolean hasChosen() {
        return hasChosen;
    }
    /**
     * This method checks if there is enough money in the vending
     * machine to produce change. If there is, the function return true
     * and false otherwise.
     * @param totalPrice the total price of the chosen item
     * @return true or false 
     */
    public boolean produceChange(int totalPrice) {
        int totalCashInAmount = totalPayment;
        
        int change = totalCashInAmount - totalPrice;
    
        return change >= 0;
    }
    /**
     * This method checks if an item can be chosen by the user.
     * It returns true if the item is available and false if 
     * otherwise.
     * @param item the item to be chosen
     * @return true or false 
     */
    public boolean chooseItem(Item item) {
        boolean success = false;
        for (ArrayList<Item> slot : slots) {
            for (Item i : slot) {
                if (i.getName().equals(item.getName()))
                    if (i.getCategory() <3)
                        success = true;
            }
        }
        
        return success;
    }
    /**
     * This method checks if there are any items in the vending machine.
     * @return true or false depending if there is at least one item
     */
    public boolean isEmpty() {
        boolean isEmpty = false;
        
        if(slots.isEmpty()) {
            isEmpty = true;
        }

        return isEmpty;
    }
    /**
     * This method checks if a new item can still be added. If the total limit 
     * of 20 has been reached then it returns true and false if otherwise.
     * @return true or false 
     */
    public boolean isFull() {
        return slots.size() >= numSlots;
    }
    /**
     * This method stocks a new item in a new slot in the vending machine.
     * @param qty the quantity of the item
     * @param name the name of the item
     * @param price the price of the item
     * @param calories the calories of the item
     * @param category the category of the item
     * @return true or false depending if the item has been added.
     */
    public boolean stockNew(int qty, String name, int price, double calories, int category) {
        if (isFull())
            return false;

        int count = qty;
        ArrayList<Item> slot = new ArrayList<Item>();
        while (count!=0) {
            Item temp = new Item(name, price, calories, category);
            slot.add(temp);
            count--;
        }

        slots.add(slot);

        startInventory.clear();
        startQuantity.clear();
        for (ArrayList<Item> i : slots) {
            startInventory.add(i.get(0).getName());
            startQuantity.add(i.size());
        }
        transactions.clear();
        
        return true;
    }
    /**
     * This method stocks a new item in a new slot in the vending machine. It 
     * returns true if the item has been added. However, it returns false if
     * the item was not added. 
     * @param qty the quantity of the item
     * @param name the name of the item
     * @param price the price of the item
     * @param calories the calories of the item
     * @return true or false 
     */
    public boolean stockNew(int qty, String name, int price, double calories) {

        int count = qty;
        ArrayList<Item> slot = new ArrayList<Item>();
        while (count!=0) {
            Item temp = new Item(name, price, calories, -1);
            slot.add(temp);
            count--;
        }

        slots.add(slot);

        return true;
    }

    /**
     * This method finds an item in the vending machine.
     * @param name the name of the item
     * @return true or false depending if the item exists.
     */
    public Item findItem(String name) {
        for (ArrayList<Item> slot : slots) {
            for (Item i : slot) {
                if (i.getName().equalsIgnoreCase(name))
                    return i;
            }
        }

        return null;
    }
    /**
     * This method restocks an item.
     * @param name the name of the item
     * @param qty the quantity to be added
     * @return true or false depending if the restock is successful
     */
    public boolean restockItem(String name, int qty) {
        int quantity = 0;
        if (findItem(name) != null) {
            for (ArrayList<Item> slot : slots) {
                if (slot.contains(findItem(name)))
                    quantity = slot.size();
            }
            if (quantity+qty <= numItems && qty > 0) {
                for (ArrayList<Item> slot : slots) {
                    if (slot.contains(findItem(name))) {
                        int count = qty;
                        while (count!=0) {
                            Item temp = new Item(name, slot.get(0).getPrice(), slot.get(0).getCalories(), slot.get(0).getCategory());
                            slot.add(temp);
                            count--;
                        }
                    }
                }
                startInventory.clear();
                startQuantity.clear();
                for (ArrayList<Item> slot : slots) {
                    startInventory.add(slot.get(0).getName());
                    startQuantity.add(slot.size());
                }
                transactions.clear();
                return true;
            }
        }

        return false;
    }
    /**
     * This method edits an item. It returns true if the edit is succesful 
     * and false if the edit is unsuccessful.
     * @param item the item to be edited
     * @param name the new name of the item
     * @param price the new price of the item
     * @param calories the calories of the item
     * @param category the category of the item
     * @return true or false 
     */
    public boolean editItem(Item item, String name, int price, double calories, int category) {
        for (ArrayList<Item> slot : slots) {
            if (slot.contains(item)) {
                int qty = slot.size();
                slot.clear();
                while (qty!=0) {
                    Item temp = new Item(name, price, calories, category);
                    slot.add(temp);
                    qty--;
                }
                startInventory.clear();
                startQuantity.clear();
                for (ArrayList<Item> s : slots) {
                    startInventory.add(s.get(0).getName());
                    startQuantity.add(s.size());
                }
                transactions.clear();
                return true;
            }
        }

        return false;
    }
    /**
     * This method removes an item. It returns true if the item 
     * is removed and false if otherwise.
     * @param i the item to be removed
     * @param qty the quantity of item
     * @return true or false
     */
    public boolean removeItem(Item i, int qty) {
        for (ArrayList<Item> slot : slots) {
            if (slot.contains(i)) {
                if (qty <= slot.size()) {
                    if (qty>1) {
                        while (qty!=0) {
                            slot.remove(0);
                            qty--;
                        }
                    }

                    else
                        slot.remove(0);

                    if (slot.size()==0)
                        slots.remove(slot);

                    startInventory.clear();
                    startQuantity.clear();
                    for (ArrayList<Item> s : slots) {
                        startInventory.add(s.get(0).getName());
                        startQuantity.add(s.size());
                    }
                    transactions.clear();
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * This method removes a specific quantity of an item I. If the item's
     * 
     * @param i the item
     * @param qty the quantity of the item
     * @return true or false
     */
    public boolean remove(Item i, int qty) {
        for (ArrayList<Item> slot : slots) {
            if (slot.contains(i)) {
                if (qty <= slot.size()) {
                    if (qty>1) {
                        while (qty!=0) {
                            slot.remove(0);
                            qty--;
                        }
                    }

                    else
                        slot.remove(0);

                    if (slot.size()==0)
                        slots.remove(slot);
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * This method collects all the money in the vending machine. It returns true 
     * if the vending contains money, but it returns false if otherwise.
     * @return true or false
     */
    public boolean collectAll() {
        if (mh.getTotal() == 0)
            return false;
        mh.generalCollect();
        return true;
    }
   /**
     * This method collects a specific denomination from the money holder.
     * @param denom the denomination of the coin/bill
     * @param count the number of bills/coins
     * @return the money collected
     */
    public int collectSpec(int denom, int count) {
        int amt=0;
        boolean success = false;
        switch (denom) { //switch statement for the different denominations
            case 1:
                if(mh.subtractOnes(count)) {
                    success = true;
                }
                break;
            case 5:
                if(mh.subtractFives(count)) {
                    success = true;
                }
                break;
            case 10:
                if(mh.subtractTens(count)) {
                    success = true;
                }
                break;
            case 20:
                if(mh.subtractTwenties(count)) {
                    success = true;
                }
                break;
            case 50:
                if(mh.subtractFifties(count)) {
                    success = true;
                }
                break;
            case 100:
                if(mh.subtractHundreds(count)) {
                    success = true;
                }
                break;
            case 500:
                if(mh.subtractFiveHundreds(count)) {
                    success = true;
                }
                break;
            case 1000:
                if(mh.subtractThousands(count)) {
                    success = true;
                }
                break;
            default:
                success = false;
        }

        if (success) 
            amt = count * denom;

        return amt;
    }
    /**
     * This method gets the total money in the vending machine.
     * @return the total money in the vending machine
     */
    public int getTotalMh() {
        return mh.getTotal();
    }
    /**
     * This method adds 6000 in different denominations to the money holder.
     */
    public void genReplenish() {
        mh.generalReplenish();
    }
   /**
     * This method adds a specific number of denomination to the money holder. 
     * It returns true if the collection was successful and false if 
     * otherwise.
     * @param denom the denomination of the bill/coin
     * @param count the count of the bills/coins
     * @return true or false 
     */
    public boolean specReplenish(int denom, int count) {
        switch (denom) { //switch statement for different denominations
            case 1:
                mh.addOnes(count);
                break;
            case 5:
                mh.addFives(count);
                break;
            case 10:
                mh.addTens(count);
                break;
            case 20:
                mh.addTwenties(count);
                break;
            case 50:
                mh.addFifties(count);
                break;
            case 100:
                mh.addHundreds(count);
                break;
            case 500:
                mh.addFiveHundreds(count);
                break;
            case 1000:
                mh.addThousands(count);
                break;
            default:
                return false;
        }

        return true;
    }
    /**
     * This method updates the end inventory.
     */
    public void updateEndInv() {
        endInventory.clear();
        for (ArrayList<Item> slot : slots) {
            endInventory.add(slot.get(0).getName());
        }
    }
    /**
     * This method gets the list of items in the machine.
     * @return the list of items in the machine
     */
    public ArrayList<ArrayList<Item>> getSlots() {
        return slots;
    }
    /**
     * This method gets the total payment of the user
     * @return the total payment of the user
     */
    public int getTotalPayment() {
        return totalPayment;
    }
    /**
     * This method gets the number of items.
     * @return numItems the number of items
     */
    public int getNumItems() {
        return numItems;
    }
    /**
     * This method gets the list of transactions.
     * @return transactions the list of transactions
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    /**
     * This method gets the end inventory.
     * @return the end inventory
     */
    public ArrayList<String> getEndInventory() {
        return endInventory;
    }
    /**
     * This method gets the start inventory.
     * @return the start inventory
     */
    public ArrayList<String> getStartInventory() {
        return startInventory;
    }
     /**
     * This method gets the start quantity of the items.
     * @return startQuantity the list of item quantities at the start
     */
    public ArrayList<Integer> getStartQuantity() {
        return startQuantity;
    }
    /**
     * This method gets the money holder.
     * @return mh the money holder
     */
    public MoneyHolder getMoneyHolder() {
        return mh;
    }
    /**
     * This method sets the number of items.
     * @param numItems the number of items
     */
    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }


    /** the list of items in the vending machine */
    protected ArrayList<ArrayList<Item>> slots;
    /** the money holder */
    protected MoneyHolder mh;
    /** the list of transactions */
    protected ArrayList<Transaction> transactions;
    /** the total payment */
    protected int totalPayment = 0;
    /** the chosen item */
    protected Item chosenItem;
    /** the existence of the chosen item */
    protected boolean hasChosen = false;
    /** the start inventory */
    protected ArrayList<String> startInventory;
    /** arraylist of the quantities at start inventory */
    protected ArrayList<Integer> startQuantity;
    /** the end inventory */
    protected ArrayList<String> endInventory;
    /** the number of slots */
    protected int numSlots;
    /** the number of Items inventory */
    protected int numItems;

    
}