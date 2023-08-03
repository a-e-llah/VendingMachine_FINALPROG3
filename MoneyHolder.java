import java.util.ArrayList;

/**
 * This class represents a money holder
 * @author Rowell Herrera and Daniella Ughoc S11A
 */
public class MoneyHolder {
    /**
     * This constructor initializes the bills/coins ones, tens, fives, twenties, fifties,
     * hundreds, fiveHundreds, and thousands of the vending machine to be 0. It sets the total
     * to be 0 as well.
     */
    public MoneyHolder() {
        money = new ArrayList<Money>();
        totChange=0;
        updateTotal();
        prevTotal = 0;
        denominations = new int[]{0,0,0,0,0,0,0,0};
        quant = new int[]{getOnes(),getFives(),getTens(),getTwenties(),getFifties(),getHundreds(),getFiveHundreds(),getThousands()};
    }

    //
    /**
     * This method adds 6000 in total to the machine in different denominations. To be more specific,
     * 90 one peso, 40 five pesos, 40 ten pesos, 40 twenty pesos, 20 fifty pesos, 10 100 pesos, and
     * 5 500 pesos. It also updates the total.
     */
    public void generalReplenish() {
        addOnes(100);
        addFives(40);
        addTens(40);
        addTwenties(40);
        addFifties(20);
        addHundreds(10);
        addFiveHundreds(5);
        updateTotal();
    }
    /**
     * This method subtracts the total money by the price and checks if there is enough change.
     * It returns true if there is enough change and false if otherwise.
     * @param price the price of the item
     * @return true or false 
     */
    public boolean subtractTotal(int price) {
        for(int i=0; i<8; i++)
            denominations[i] =0;

        quant[0] = getOnes();
        quant[1] = getFives();
        quant[2] = getTens();
        quant[3] = getTwenties();
        quant[4] = getFifties();
        quant[5] = getHundreds();
        quant[6] = getFiveHundreds();
        quant[7] = getThousands();
        while (price-1000 >= 0 && quant[7] != 0) { //loop until there is not enough 1000 peso bills
            denominations[0]++; //subtractThousands(1);
            price-=1000;
            quant[7]--;
        }
        while (price-500 >= 0 && quant[6] != 0) { //loop until there is not enough 500 peso bills
            denominations[1]++; //subtractFiveHundreds(1);
            price-=500;
            quant[6]--;
        }
        while (price-100 >= 0 && quant[5] != 0) { //loop until there is not enough 100 peso bills
            denominations[2]++; //subtractHundreds(1);
            price-=100;
            quant[5]--;
        }
        while (price-50 >= 0 && quant[4] != 0) { //loop until there is not enough 50 peso bills
            denominations[3]++; //subtractFifties(1);
            price-=50;
            quant[4]--;
        }
        while (price-20 >= 0 && quant[3] != 0) { //loop until there is not enough 20 peso bills
            denominations[4]++; //subtractTwenties(1);
            price-=20;
            quant[3]--;
        }
        while (price-10 >= 0 && quant[2] != 0) { //loop until there is not enough 10 peso coins
            denominations[5]++; //subtractTens(1);
            price-=10;
            quant[2]--;
        }
        while (price-5 >= 0 && quant[1] != 0) { //loop until there is not enough 5 peso coins
            denominations[6]++; //subtractFives(1);
            price-=5;
            quant[1]--;
        }
        while (price-1 >= 0 && quant[0] != 0) { //loop until there is not enough 1 peso coins
            denominations[7]++; //subtractOnes(1);
            price-=1;
            quant[0]--;
        }

        if(price!=0) //if there is not enough change
            return false;
        else { //if there is enough change
            subtractThousands(denominations[0]);
            subtractFiveHundreds(denominations[1]);
            subtractHundreds(denominations[2]);
            subtractFifties(denominations[3]);
            subtractTwenties(denominations[4]);
            subtractTens(denominations[5]);
            subtractFives(denominations[6]);
            subtractOnes(denominations[7]);
            totChange = 0;
            for (int i : denominations)
                totChange += i;
            /*
            * if (totChange!=0) { //if there is no change
                for (int i : denominations) {
                    displayDispensedChange(dnm, i);
                    dnm++;
                }

                return true;
            }
            System.out.println("Exact payment received.\n");
            * */

            return true;
        }
    }

    /**
     * This method increments the number of one peso coins by the given parameter.
     * @param m amount to add
     */
    public void addOnes(int m) {
        addHowMany(1, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of five peso coins by the given parameter.
     * @param m amount to add
     */
    public void addFives(int m) {
        addHowMany(5, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 10 peso coins by the given parameter.
     * @param m amount to add
     */
    public void addTens(int m) {
        addHowMany(10, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 20 peso bills by the given parameter.
     * @param m amount to add
     */
    public void addTwenties(int m) {
        addHowMany(20, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 50 peso bills by the given parameter.
     * @param m amount to add
     */
    public void addFifties(int m) {
        addHowMany(50, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 100 peso bills by the given parameter.
     * @param m amount to add
     */
    public void addHundreds(int m) {
        addHowMany(100, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 500 peso bills by the given parameter.
     * @param m amount to add
     */
    public void addFiveHundreds(int m) {
        addHowMany(500, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method increments the number of 1000 peso bills by the given parameter.
     * @param m amount to add
     */
    public void addThousands(int m) {
        addHowMany(1000, m);
        updateTotal();
        prevTotal = total;
    }
    /**
     * This method collects all the money from the vending machine.
     */
    public void generalCollect() {
        money.clear();
        prevTotal = total;
        updateTotal();
    }
    /**
     * This method decrements the number of 1 peso coins by the given parameter.
     * It returns true if there is enough 1 peso coins to subtract and false
     * otherwise.
     * @param m amount to subtract
     * @return true or false 
     */
    public boolean subtractOnes(int m) {
        int count = m;
        while (denomExists(1) && count!= 0) {
            money.remove(indexMoney(1));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 5 peso coins by the given parameter. 
     * It return true if there is enough 5 peso coins to subtract and false 
     * otherwise.
     * @param m amount to subtract
     * @return true or false 
     */
    public boolean subtractFives(int m) {
        int count = m;
        while (denomExists(5) && count!= 0) {
            money.remove(indexMoney(5));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 10 peso coins by the given parameter. 
     * It returns true if there is enough 10 peso coins to subtract and false 
     * if otherwise.
     * @param m amount to subtract
     * @return true or false
     */
    public boolean subtractTens(int m) {
        int count = m;
        while (denomExists(10) && count!= 0) {
            money.remove(indexMoney(10));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 20 peso bills by the given parameter. 
     * It returns true if there is enough 20 peso bills to subtract and false if
     * otherwise.
     * @param m amount to subtract
     * @return true or false
     */
    public boolean subtractTwenties(int m) {
        int count = m;
        while (denomExists(20) && count!= 0) {
            money.remove(indexMoney(20));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 50 peso bills by the given parameter. 
     * It returns true if there is enough 50 peso bills to subtract and false if
     * otherwise.
     * @param m amount to subtract
     * @return true or false
     */
    public boolean subtractFifties(int m) {
        int count = m;
        while (denomExists(50) && count!= 0) {
            money.remove(indexMoney(50));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 100 peso bills by the given parameter. 
     * It returns true if there is enough 100 peso bills to subtract and false if
     * otherwise.
     * @param m amount to subtract
     * @return true or false 
     */
    public boolean subtractHundreds(int m) {
        int count = m;
        while (denomExists(100) && count!= 0) {
            money.remove(indexMoney(100));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 500 peso bills by the given parameter. 
     * It returns true if there is enough 500 peso bills to subtract and false if
     * otherwise.
     * @param m amount to subtract
     * @return true or false 
     */
    public boolean subtractFiveHundreds(int m) {
        int count = m;
        while (denomExists(500) && count!= 0) {
            money.remove(indexMoney(500));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method decrements the number of 1000 peso bills by the given parameter. 
     * It returns true if there is enough 1000 peso bills to subtract and false if
     * otherwise.
     * @param m amount to subtract
     * @return true or false 
     */
    public boolean subtractThousands(int m) {
        int count = m;
        while (denomExists(1000) && count!= 0) {
            money.remove(indexMoney(1000));
            count--;
            prevTotal = total;
            updateTotal();
        }
        if (count == 0)
            return true;
        return false;
    }
    /**
     * This method updates the total money.
     */
    public void updateTotal() {
        total = 0;
        for (Money m : money)
            total+=m.getValue();
    }
    /**
     * This method gets the number of 1 peso coins.
     * @return the number of 1 peso coins
     */
    public int getOnes() {
        return getHowMany(1);
    }
    /**
     * This method gets the number of 5 peso coins.
     * @return the number of 5 peso coins
     */
    public int getFives() {
        return getHowMany(5);
    }
    /**
     * This method gets the number of 10 peso coins.
     * @return the number of 10 peso coins
     */
    public int getTens() {
        return getHowMany(10);
    }
    /**
     * This method gets the number of 20 peso bills.
     * @return the number of 20 peso bills
     */
    public int getTwenties() {
        return getHowMany(20);
    }
    /**
     * This method gets the number of 50 peso bills.
     * @return the number of 20 peso bills
     */
    public int getFifties() {
        return getHowMany(50);
    }
    /**
     * This method gets the number of 100 peso bills.
     * @return the number of 100 peso bills
     */
    public int getHundreds() {
        return getHowMany(100);
    }
    /**
     * This method gets the number of 500 peso bills.
     * @return the number of 500 peso bills
     */
    public int getFiveHundreds() {
        return getHowMany(500);
    }
    /**
     * This method gets the number of 1000 peso bills.
     * @return the number of 1000 peso bills
     */
    public int getThousands() {
        return getHowMany(1000);
    }
    /**
     * This method gets the total money.
     * @return the total money
     */
    public int getTotal() {
        updateTotal();
        return total;
    }
    /**
     * This method returns the previous total money  
     * @return prevTotal the previous total money
     */
    public int getPrevTotal() {
        return prevTotal;
    }
    /**
     * This methods returns the total change to be dispensed
     * @return totChange the total change
     */
    public int getTotChange() {
        return totChange;
    }
    /**
     * This method gets the array of denominations which contains 
     * the counts of the different denominations of money
     * @return denominations the array contaning the count of each money denominations
     */
    public int[] getDenominations() {
        return denominations;
    }
    /**
     * This method takes a denominations as input and returns the count
     * of that denomination in the 'money' list
     * @param denom a specific denomination 
     * @return count the count of a specific denomination
     */
    private int getHowMany(int denom) {
        int count = 0;
        for (Money m : money) {
            if (m.getValue() == denom)
                count++;
        }
        return count;
    }
    /**
     * This method takes a denomination and a quantity as inputs
     * and adds the specified quantity of the denomination to the 'money' list
     * @param denom a specific denomination 
     * @param quant the count of how many of the specific denomination will be added
     */
    private void addHowMany(int denom, int quant) {
        int count = 0;
        while(count != quant) {
            Money temp = new Money(denom);
            money.add(temp);
            count++;
        }
    }
    /**
     * This method finds out if a specific denomination exists in the 'money' list. 
     * It returns true if the denomination does exist and returns false if it does not.
     * @param denom the specific denomination to be searched in the 'money' list
     * @return true or false 
     */
    private boolean denomExists(int denom) {
        for (Money m : money) {
            if (m.getValue() == denom)
                return true;
        }
        return false;
    }
    /**
     * This method take a specific denomination as an input and returns the first 
     * 'Money' object in the 'money' list that matches it. However, it returns null if
     * nothing matches the input.
     * @param denom a specific denomination
     * @return Money object or null
     */
    private Money indexMoney(int denom) {
        for (Money m : money) {
            if (m.getValue() == denom)
                return m;
        }
        return null;
    }
    /** the previous total money */
    private int prevTotal;
    /** the total change */
    private int totChange;
    /** the array of denominations */
    private int[] denominations;
    /** the object representaton of the money */
    private ArrayList<Money> money;
    /** the total money */
    private int total;
    /** the array of quantity */
    private int[] quant;
}