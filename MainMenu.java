import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * This class represents a main menu for a vending machine.
 * @author Rowell Herrera and Daniella Ughoc S11A
 */

public class MainMenu {
    /** JPanel for the mainMenu */
    public JPanel mainMenu;
    /** JButton for the normal vending machine button */
    private JButton normalVendingMachineButton;
    /** JButton for the special vending machine button */
    private JButton specialVendingMachineButton;
    /** JButton for the backCreation */
    private JButton backCreation;
    /** JButton for the create vending machine button */
    private JButton createVendingMachineButton;
    /** JButton for the test vending machine button */
    private JButton testVendingMachineButton;
    /** JButton for the exit button */
    private JButton exitButton;
    /** JPanel for the create menu */
    private JPanel createMenu;
    /** JPanel for the factory menu */
    private JPanel factoryMenu;
    /** JPanel for the testing menu */
    private JPanel testingMenu;
    /** JPanel for the testing label */
    private JLabel testingLabel;
    /** JButton for the vending features button */
    private JButton vendingFeaturesButton;
    /** JButton for the maintenance features button */
    private JButton maintenanceFeaturesButton;
    /** JButton for the back to main menu button */
    private JButton backToMainMenuButton;
    /** JButton for the insert money button */
    private JButton insertMoneyButton;
    /** JButton for the choose item button */
    private JButton chooseItemButton;
    /** JButton for the back to testing menu button */
    private JButton backToTestingMenuButton;
    /** JPanel for the maintenace menu */
    private JPanel maintenanceMenu;
    /** JButton for the remove item button */
    private JButton removeItemButton;
    /** JButton for the set price item button */
    private JButton setPriceItemButton;
    /** JButton for the stock and restock item button */
    private JButton stockAndRestockItemButton;
    /** JLabel for the maintenance features */
    private JLabel maintenanceFeatures;
    /** JButton for the collect money button */
    private JButton collectMoneyButton;
    /** JButton for the replenish money button */
    private JButton replenishMoneyButton;
    /** JButton for the print transactions button */
    private JButton printTransactionsButton;
    /** JButton for the back to testing menu button 1 */
    private JButton backToTestingMenuButton1;
    /** JPanel for the stock menu */
    private JPanel stockMenu;
    /** JButton for the stock new item button */
    private JButton stockNewItemButton;
    /** JButton for the restock item button */
    private JButton restockItemButton;
    /** JButton for the back to maintenance features button */
    private JButton backToMaintenanceFeaturesButton;
    /** JLabel for the restock Label button */
    private JLabel restockLabel;
    /** JPanel for the addMenu */
    private JPanel addMenu;
    /** JPanel for the collect menu */
    private JPanel collectMenu;
    /** JPanel for the collect spec menu */
    private JPanel collectSpecMenu;
    /** JPanel for the spec register */
    private JPanel specRegister;
    /** JButton for the c1 button */
    private JButton c1Button;
    /** JButton for the c2 button */
    private JButton c2Button;
    /** JButton for the c3 button */
    private JButton c3Button;
    /** JButton for the c4 button */
    private JButton c4Button;
    /** JButton for the c5 button */
    private JButton c5Button;
    /** JButton for the c6 button */
    private JButton c6Button;
    /** JButton for the c7 button */
    private JButton c7Button;
    /** JButton for the c8 button */
    private JButton c8Button;
    /** JButton for the back to collect menu button */
    private JButton backToCollectMenuButton;
    /** JPanel for the replenish menu */
    private JPanel replenishMenu;
    /** JPanel for the replenish spec */
    private JPanel replenishSpec;
    /** JPanel for the transactions panel */
    private JPanel transactionsPanel;
    /** JPanel for the start transactions panel*/
    private JPanel startTransactionsPanel;
    /** JPanel for the end transactions panel */
    private JPanel endTransactionsPanel;
    /** JLabel for the transactions label */
    private JLabel transactionsLabel;
    /** JPanel for the transactions menu */
    private JPanel transactionsMenu;
    /** JLabel for the start inventory label */
    private JLabel startInventoryLabel;
    /** JLabel for the end inventory label */
    private JLabel endInventoryLabel;
    /** JLabel for the transaction label */
    private JLabel transactionLabel;
    /** JButton for the b1 */
    private JButton b1;
    /** JButton for the b4 */
    private JButton b4;
    /** JButton for the b3 */
    private JButton b3;
    /** JButton for the b5 */
    private JButton b5;
    /** JButton for the b7 */
    private JButton b7;
    /** JButton for the b8 */
    private JButton b8;
    /** JButton for the b2 */
    private JButton b2;
    /** JButton for the b6 */
    private JButton b6;
    /** JLabel for the insert money label */
    private JLabel insertMoneyLabel;
    /** JLabel for the back to factory menu button */
    private JButton backToFactoryMenuButton;
    /** JButton for the vending features menu*/
    private JPanel vendingFeaturesMenu;
    /** JButton for the gen replenish button*/
    private JButton genReplenishButton;
    /** JButton for the spec replenish button*/
    private JButton specReplenishButton;
    /** JButton for the back to maintenance features button*/
    private JButton backtoMaintenanceFeaturesButton;
    /** JButton for the collect all button*/
    private JButton collectAllButton;
    /** JButton for the collect specific button*/
    private JButton collectSpecificButton;
    /** JButton for the back to maintenance features button 2*/
    private JButton backToMaintenanceFeaturesButton2;
    /** JLabel for the replenish menu label*/
    private JLabel replenishMenuLabel;
    /** JButton for the r1button */
    private JButton r1Button;
    /** JButton for the r2button */
    private JButton r2Button;
    /** JButton for the r3button */
    private JButton r3Button;
    /** JButton for the r4button */
    private JButton r4Button;
    /** JButton for the r5button */
    private JButton r5Button;
    /** JButton for the r6button */
    private JButton r6Button;
    /** JButton for the r7button */
    private JButton r7Button;
    /** JButton for the r8button */
    private JButton r8Button;
    /** JLabel for the regCount1 */
    private JLabel regCount1;
    /** JLabel for the regCount2 */
    private JLabel regCount2;
    /** JLabel for the regCount3 */
    private JLabel regCount3;
    /** JLabel for the regCount4 */
    private JLabel regCount4;
    /** JLabel for the regCount5 */
    private JLabel regCount5;
    /** JLabel for the regCount6 */
    private JLabel regCount6;
    /** JLabel for the regCount7 */
    private JLabel regCount7;
    /** JLabel for the regCount8 */
    private JLabel regCount8;
    /** JPanel for the count 1000 */
    private JPanel count1000;
    /** JButton for the backtoReplenishMenu */
    private JButton backToReplenishMenu;
    /** JButton for the exit transactions menu button */
    private JButton exitTransactionsMenuButton;
    /** JSlider for the num slot slider */
    private JSlider numSlotsSlider;
    /** JRadioButton for the creation of regular radio button */
    private JRadioButton creationRegularRadioButton;
    /** JRadioButton for the creation of special radio button */
    private JRadioButton creationSpecialRadioButton;
    /** JButton for the create button */
    private JButton createButton;
    /** JSlider for the num item slider */
    private JSlider numItemsSlider;
    /** JLabel for the colCount1 */
    private JLabel colCount1;
    /** JLabel for the colCount2 */
    private JLabel colCount2;
    /** JLabel for the colCount3 */
    private JLabel colCount3;
    /** JLabel for the colCount4 */
    private JLabel colCount4;
    /** JLabel for the colCount5 */
    private JLabel colCount5;
    /** JLabel for the colCount6 */
    private JLabel colCount6;
    /** JLabel for the colCount7 */
    private JLabel colCount7;
    /** JLabel for the colCount8 */
    private JLabel colCount8;
    /** JPanel for the add vending machine screen */
    private JPanel addVendingMachineScreen;
    /** JPanel for the add first row screen */
    private JPanel addFirstRowScreen;
    /** JPanel for the add new form */
    private JPanel addNewForm;
    /** JPanel for the add first item screen */
    private JPanel addFirstItemScreen;
    /** JPanel for the add second item screen */
    private JPanel addSecondItemScreen;
    /** JPanel for the add third item screen */
    private JPanel addThirdItemScreen;
    /** JPanel for the add fourth item screen */
    private JPanel addFourthItemScreen;
    /** JPanel for the add second row screen */
    private JPanel addSecondRowScreen;
    /** JPanel for the add third row screen */
    private JPanel addThirdRowScreen;
    /** JPanel for the add fourth row screen */
    private JPanel addFourthRowScreen;
    /** JPanel for the add fifth item screen */
    private JPanel addFifthRowScreen;
    /** JPanel for the add 5th item screen */
    private JPanel add5thItemScreen;
    /** JPanel for the add 6th item screen */
    private JPanel add6thItemScreen;
    /** JPanel for the add 7th item screen */
    private JPanel add7thItemScreen;
    /** JPanel for the add 8th item screen */
    private JPanel add8thItemScreen;
    /** JPanel for the add 9th item screen */
    private JPanel add9thItemScreen;
    /** JPanel for the add 10th item screen */
    private JPanel add10thItemScreen;
    /** JPanel for the add 11th item screen */
    private JPanel add11thItemScreen;
    /** JPanel for the add 12th item screen */
    private JPanel add12thItemScreen;
    /** JPanel for the add 13th item screen */
    private JPanel add13thItemScreen;
    /** JPanel for the add 14th item screen */
    private JPanel add14thItemScreen;
    /** JPanel for the add 15th item screen */
    private JPanel add15thItemScreen;
    /** JPanel for the add 16th item screen */
    private JPanel add16thItemScreen;
    /** JPanel for the add 16th item screen */
    private JPanel add17thItemScreen;
    /** JPanel for the add 18th item screen */
    private JPanel add18thItemScreen;
    /** JPanel for the add 19th item screen */
    private JPanel add19thItemScreen;
    /** JPanel for the add 20th item screen */
    private JPanel add20thItemScreen;
    /** JTextArea for the add 1st item */
    private JTextArea Add1stItem;
    /** JTextArea for the add 2nd item */
    private JTextArea Add2ndItem;
    /** JTextArea for the add 3rd item */
    private JTextArea Add3rdItem;
    /** JTextArea for the add 4th item */
    private JTextArea Add4thItem;
    /** JTextArea for the add 5th item */
    private JTextArea Add5thItem;
    /** JTextArea for the add 6th item */
    private JTextArea Add6thItem;
    /** JTextArea for the add 7th item */
    private JTextArea Add7thItem;
    /** JTextArea for the add 8th item */
    private JTextArea Add8thItem;
    /** JTextArea for the add 9th item */
    private JTextArea Add9thItem;
    /** JTextArea for the add 10th item */
    private JTextArea Add10thItem;
    /** JTextArea for the add 11th item */
    private JTextArea Add11thItem;
    /** JTextArea for the add 12th item */
    private JTextArea Add12thItem;
    /** JTextArea for the add 13th item */
    private JTextArea Add13thItem;
    /** JTextArea for the add 14th item */
    private JTextArea Add14thItem;
    /** JTextArea for the add 15th item */
    private JTextArea Add15thItem;
    /** JTextArea for the add 16th item */
    private JTextArea Add16thItem;
    /** JTextArea for the add 17th item */
    private JTextArea Add17thItem;
    /** JTextArea for the add 18th item */
    private JTextArea Add18thItem;
    /** JTextArea for the add 19th item */
    private JTextArea Add19thItem;
    /** JTextArea for the add 20th item */
    private JTextArea Add20thItem;
    /** JTextField for the input price */
    private JTextField inputPrice;
    /** JTextField for the input calories */
    private JTextField inputCalories;
    /** JTextField for the input name */
    private JTextField inputName;
    /** JSlider for the quantity slider */
    private JSlider quantitySlider;
    /** JButton for the add new item button */
    private JButton addNewItemButton;
    /** JButton for the back to restock menu Button */
    private JButton backToRestockMenuButton;
    /** JPanel for restocking form */
    private JPanel restockingForm;
    /** JButton for back restocking button */
    private JButton backRestockingButton;
    /** JTextField for restocking name */
    private JTextField restockingName;
    /** JButton for restocking button */
    private JButton restockingButton;
    /** JSlider for back restocking qty slider */
    private JSlider restockingQtySlider;
    /** JPanel for edit form */
    private JPanel editForm;
    /** JTextField for edit price field */
    private JTextField editPriceField;
    /** JButton for set price button */
    private JButton setPriceButton;
    /** JTextField for edit name field */
    private JTextField editNameField;
    /** JButton for back to maintenance menu button */
    private JButton backToMaintenanceMenuButton;
    /** JPanel for the remove form */
    private JPanel removeForm;
    /** JTextField for remove name field */
    private JTextField removeNameField;
    /** JButton for the confirm remove button*/
    private JButton confirmRemoveButton;
    /** JButton for the back to maintenance menu button 1*/
    private JButton backToMaintenanceMenuButton1;
    /** JSlider for the removing quantity of items*/
    private JSlider removeSlider;
    /** JPanel for vending features */
    private JPanel vendingFeaturesPanel;
    /** JPanel for vFeatures 1st Row */
    private JPanel vFeatures1stRow;
    /** JPanel for vFeatures 2nd Row */
    private JPanel vFeatures2ndRow;
    /** JPanel for vFeatures 3rd Row */
    private JPanel vFeatures3rdRow;
    /** JPanel for vFeatures 4th Row */
    private JPanel vFeatures4thRow;
    /** JPanel for vFeatures 5th Row */
    private JPanel vFeatures5thRow;
    /** JLabel for the bCount1 */
    private JLabel bCount1;
    /** JLabel for the bCount2 */
    private JLabel bCount2;
    /** JLabel for the bCount3 */
    private JLabel bCount3;
    /** JLabel for the bCount4 */
    private JLabel bCount4;
    /** JLabel for the bCount5 */
    private JLabel bCount5;
    /** JLabel for the bCount6 */
    private JLabel bCount6;
    /** JLabel for the bCount7 */
    private JLabel bCount7;
    /** JLabel for the bCount8 */
    private JLabel bCount8;
    /** JLabel for the btotal money */
    private JLabel bTotMoney;
    /** JButton for the special item customization button */
    private JButton specialItemCustomizationButton;
    /** JPanel for the vFeatures 1st screen */
    private JPanel vFeatures1stScreen;
    /** JPanel for the vFeatures 2nd screen */
    private JPanel vFeatures2ndScreen;
    /** JPanel for the vFeatures 3rd screen */
    private JPanel vFeatures3rdScreen;
    /** JPanel for the vFeatures 4th screen */
    private JPanel vFeatures4thScreen;
    /** JPanel for the vFeatures 5th screen */
    private JPanel vFeatures5thScreen;
    /** JPanel for the vFeatures 6th screen */
    private JPanel vFeatures6thScreen;
    /** JPanel for the vFeatures 7th screen */
    private JPanel vFeatures7thScreen;
    /** JPanel for the vFeatures 8th screen */
    private JPanel vFeatures8thScreen;
    /** JPanel for the vFeatures 9th screen */
    private JPanel vFeatures9thScreen;
    /** JPanel for the vFeatures 10th screen */
    private JPanel vFeatures10thScreen;
    /** JPanel for the vFeatures 11th screen */
    private JPanel vFeatures11thScreen;
    /** JPanel for the vFeatures 12th screen */
    private JPanel vFeatures12thScreen;
    /** JPanel for the vFeatures 13th screen */
    private JPanel vFeatures13thScreen;
    /** JPanel for the vFeatures 14th screen */
    private JPanel vFeatures14thScreen;
    /** JPanel for the vFeatures 15th screen */
    private JPanel vFeatures15thScreen;
    /** JPanel for the vFeatures 16th screen */
    private JPanel vFeatures16thScreen;
    /** JPanel for the vFeatures 17th screen */
    private JPanel vFeatures17thScreen;
    /** JPanel for the vFeatures 18th screen */
    private JPanel vFeatures18thScreen;
    /** JPanel for the vFeatures 19th screen */
    private JPanel vFeatures19thScreen;
    /** JPanel for the vFeatures 20th screen */
    private JPanel vFeatures20thScreen;
    /** JButton for the vFeatures first item button */
    private JButton vFeatures1stItemButton;
    /** JButton for the vFeatures 2nd item button */
    private JButton vFeatures2ndItemButton;
    /** JButton for the vFeatures 3rd item button */
    private JButton vFeatures3rdItemButton;
    /** JButton for the vFeatures 4th item button */
    private JButton vFeatures4thItemButton;
    /** JButton for the vFeatures 5th item button */
    private JButton vFeatures5thItemButton;
    /** JButton for the vFeatures 6th item button */
    private JButton vFeatures6thItemButton;
    /** JButton for the vFeatures 7th item button */
    private JButton vFeatures7thItemButton;
    /** JButton for the vFeatures 8th item button */
    private JButton vFeatures8thItemButton;
    /** JButton for the vFeatures 9th item button */
    private JButton vFeatures9thItemButton;
    /** JButton for the vFeatures 10th item button */
    private JButton vFeatures10thItemButton;
    /** JButton for the vFeatures 11th item button */
    private JButton vFeatures11thItemButton;
    /** JButton for the vFeatures 12th item button */
    private JButton vFeatures12thItemButton;
    /** JButton for the vFeatures 13th item button */
    private JButton vFeatures13thItemButton;
    /** JButton for the vFeatures 14th item button */
    private JButton vFeatures14thItemButton;
    /** JButton for the vFeatures 15th item button */
    private JButton vFeatures15thItemButton;
    /** JButton for the vFeatures 16th item button */
    private JButton vFeatures16thItemButton;
    /** JButton for the vFeatures 17th item button */
    private JButton vFeatures17thItemButton;
    /** JButton for the vFeatures 18th item button */
    private JButton vFeatures18thItemButton;
    /** JButton for the vFeatures 19th item button */
    private JButton vFeatures19thItemButton;
    /** JButton for the vFeatures 20th item button */
    private JButton vFeatures20thItemButton;
    /** JTextArea for the transactionText */
    private JTextArea transactionsText;
    /** JTextArea for the startInventoryText */
    private JTextArea startInventoryText;
    /** JTextArea for the endInventoryText */
    private JTextArea endInventoryText;
    /** JRadioButton for the normalRadio */
    private JRadioButton normalRadio;
    /** JRadioButton for the baseRadio */
    private JRadioButton baseRadio;
    /** JRadioButton for the fruitRadio */
    private JRadioButton fruitRadio;
    /** JRadioButton for the toppingRadio */
    private JRadioButton toppingRadio;
    /** JRadioButton for the sauceRadio */
    private JRadioButton sauceRadio;
    /** JPanel for the categoryButtons */
    private JPanel categoryButtons;
    /** JPanel for the specialForm */
    private JPanel specialForm;
    /** JButton for the dispenseOrderButton */
    private JButton dispenseOrderButton;
    /** JLabel for the baseForm */
    private JLabel baseForm;
    /** JLabel for the fruitForm */
    private JLabel fruitForm;
    /** JLabel for the toppingForm */
    private JLabel toppingForm;
    /** JLabel for the sauceForm */
    private JLabel sauceForm;
    /** JLabel for the caloriesForm */
    private JLabel caloriesForm;
    /** JLabel for the priceForm */
    private JLabel priceForm;
    /** ButtonGroup for creation Vending */
    private ButtonGroup creationVending;
    /** ButtonGroup for stockButtons */
    private ButtonGroup stockButtons;
    /** the name of the item */
    private String name;
    /** the quantity of the item */
    private int quantity;
    /** the price of the item */
    private int price;
    /** the calories of the item */
    private int calories;
    /** the category of the item */
    private int category;
    /** the base in special vending machine */
    private Item specBase;
    /** the fruit in special vending machine */
    private Item specFruit;
    /** the topping in the special vending machine */
    private Item specTopping;
    /** the sauce in special vending machine */
    private Item specSauce;
    /** the specPrice */
    private int specPrice;
    /** the specCalories */
    private double specCalories;


    /** an instance of the Factory Class named factory*/
    private Factory factory;
    /** the number of slots */
    private int numSlots;
    /** the number of items*/
    private int numItems;
    /** the type of vending machine */
    private int vendingMachineType;
    /** the array of denomenations */
    private int denominations[];
    /** the arrayof payment denomenations */
    private int paymentDenominations[];
    /** the arraylist of arraylist of slots */
    private ArrayList<ArrayList<Item>> slots;
    /** the quantity of the item to be added */
    private int addQty;
    /** the name of the item to be added */
    private String addName;
    /** the price of the item to be added */
    private int addPrice;
    /** the calories of the item to be added */
    private double addCalories;
    /** the category of the item to be added */
    private int addCategory;
    /** the special Event */
    private boolean specialEvent;
    /** the total payment */
    private int paymentTotal;


    /**
     * This constructor initializes a main menu based on the given parameter below.
     * It also contains various action listeners that have their specific purposes.
     * @param frame Jframe
     * This method adds an ActionListener to the createVendingMachineButton which sets
     * the createMenu to be visible and factoryMenu to be hidden. It also sets the
     * numslots to be equal to 8 and the numItems 10.
     * <p>
     * This methods also adds an ActionListener in the testVendingMachineButton. If no vending
     * machine is yet created, it displays a message to inform the use that there is no existing
     * vending. On the other hand , if a vending machine is already created, sets the
     * factoryMenu to be visible and the testingMenu to be hidden.
     * <p>
     * This method also adds an ActionListener in the exitButton wherein it closes the program
     * when it is clicked.
     * <p>
     * This method also adds an ActionListener in the backCreation wherein it sets the createMenu
     * to be hidden while the factoryMenu is set visible.
     * <p>
     * This method also adds an ActionListener in the vendingFeaturesButton wherein it
     * sets the vendingMenu to be visible and the testingMenu to be hidden.
     * <p>
     * This methd also adds an ActionListern in the backToMainMenuButton wherein it sets the
     * testingMenu to be hidden while showing the factoryMenu.
     * <p>This methods also adds an ActionListeners in the maintenanceFeaturesButton which
     * sets the maintenanceMenu to be visible and the testingMenu hidden.
     * <p>
     *  This method also adds an ActionListeners in the stockAndRestockItemButton whcih sets the
     * maintenance menu to be hidden while showing the stockMenu.
     * <p>
     * This method also adds an ActionListeners to the setPriceItemButton which shows the
     * editMenu but hides the maintenanceMenu.
     * <p>
     * This method also adds an ActionListener to the removeItemButton which sets the maintenanceMenu to be
     * hidden and the removeMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the collectMoneyButton which sets the
     * maintenanceMenu hidden and the collectMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the replenishMoneyButton which sets the
     * maintenanceMenu hidden and the replenishMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the printTransactionsButton which sets the
     * maintenanceMenu hidden and the transactionsMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the backToTestingMenuButton1 which sets the
     * maintenanceMenu hidden and the testingMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the stockNewItemButton which sets the
     * addMenu and the addNewForm to be visible. On the other hand, it hides the restockingForm
     * and the stockMenu to be hidden. It alse calls the updateVendingMachine() functions and
     * sets the addQty equals to 1.
     * <p>
     * This method also adds an ActionListener to the restockItemButton  which sets the
     * addMenu and the restockingForm to be visible. On the other hand, it hides the addNewForm
     * and the stockMenu to be hidden. It alse calls the updateVendingMachine() functions and
     * sets the addQty equals to 1.
     * <p>
     * This method also adds an ActionListener to the backToMaintenanceFeaturesButton which sets the
     * maintenanceMenu visible and the stockMenu to be hidden.
     * <p>
     * This method also adds an ActionListener to the genReplenishButton which calls the
     * generalReplenish() of the factory. It then opens up a dialogue box show how many of each
     * denominations was inserted to obtain 6000.
     * <p>
     * This method also adds an ActionListener to the specReplenishButton which sets the replenishSpec
     * to be visible and the replenishMenu to be hidden. It calls the updateDenominations() as well as
     * display how many of each denominations was inserted while replenishing.
     * <p>
     * This method also adds an ActionListener to the backToMaintenanceFeaturesButton which shows the maintenanceMenu
     * and hides the replenishMenu.
     * <p>
     * This method also adds an ActionListener to the backToReplenishMenu which sets the
     * replenishSpec to be hidden while showing the replenishMenu.
     * <p>
     * This method also adds an ActionListener to the collectAllButton which shows a dialogue box
     * to inform the user that all money in the vending machine has been collected.
     * <p>
     * This method also adds an ActionListener to the collectSpecificButton which sets the collectMenu to be
     * hidden and shows the specMenu to be visible.Afterwards, it calls the updateDenominations() and
     * show the collected count per denominations.
     * <p>
     * This method also adds an ActionListener to the backToCollectMenuButton which shows the collectMenu
     * and hides the collectSecMenu
     * <p>
     * This method also adds an ActionListener to the backToMaintenanceFeaturesButton2 which shows the maintenanceMenu
     * and hides the collectMenu.
     * <p>
     * This method also adds an ActionListener to the exitTransactionsMenuButton which shows the maintenanceMenu
     * and hides the transactionMenu.
     * <p>
     * This method also adds an ActionListener to the numSlotsSlider for obtaining the user
     * input for the number of slots.
     * <p>
     * This method also adds an ActionListener to the numItemsSlider for obtaining the minimum number of
     * items per slot.
     * <p>
     * This method also adds an ActionListener to the creationRegularRadioButton which sets
     * the vendingMachineType to be 0.
     * <p>
     * This method also adds an ActionListener to the creationSpecialRadioButton which sets
     * the vendingMachineType to be 1.
     * <p>
     * This method also adds an ActionListener to the createButton whic checks of the created vending machine is a
     * normal or vending machine. It then hides the createMenu and sets the factoryMenu to be visible.
     * <p>
     * This method also adds an ActionListener to the r1Button which calls the addOnes function in the
     * factory class. Afterwards, it sets the denominations[0] to be equal to the
     * factory.getOnes() function call. It then updates the count of the 1 peso coin and
     * informs the user of the succesful insert of 1 count of 1 peso through a message
     * dialogue.
     * <p>
     * This method also adds an ActionListener to the r2Button which calls the addFives function in the
     * factory class. Afterwards, it sets the denominations[1] to be equal to the
     * factory.getFives() function call. It then updates the count of the 5 peso coin and
     * informs the user of the succesful insert of 1 count of 5 peso through a message
     * dialogue.
     * <p>
     * This method also adds an ActionListener to the r3Button which calls the addTens function in the
     * factory class. Afterwards, it sets the denominations[2] to be equal to the
     * factory.getTens() function call. It then updates the count of the 10 peso coin and
     * informs the user of the succesful insert of 1 count of 10 peso through a message
     * dialogue.
     * <p>
     * This method also adds an ActionListener to the r4Button which calls the addTwenties function in the
     * factory class. Afterwards, it sets the denominations[3] to be equal to the
     * factory.getTwenties() function call. It then updates the count of the 20 peso coin and
     * informs the user of the succesful insert of 1 count of 20 peso through a message
     * dialogue.
     * <p>
     * This method also adds an ActionListener to the r5Button which calls the addFifties function in the
     * factory class. Afterwards, it sets the denominations[4] to be equal to the
     * factory.getFifties() function call. It then updates the count of the 50 peso coin and
     * informs the user of the succesful insert of 1 count of 50 peso through a message
     * dialogue.
     * <p>
     * This method also adds an ActionListener to the r6Button which calls the addHundreds function in the
     * factory class. Afterwards, it sets the denominations[5] to be equal to the
     * factory.getHundreds() function call. It then updates the count of the 100 peso coin and
     * informs the user of the succesful insert of 1 count of 100 peso through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the r7Button which calls the addFiveHundreds function in the
     * factory class. Afterwards, it sets the denominations[6] to be equal to the
     * factory.getFiveHundreds() function call. It then updates the count of the 500 peso coin and
     * informs the user of the succesful insert of 1 count of 500 peso through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the r8Button which calls the addThousands function in the
     * factory class. Afterwards, it sets the denominations[7] to be equal to the
     * factory.getThousands() function call. It then updates the count of the 1000 peso coin and
     * informs the user of the succesful insert of 1 count of 1000 peso through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c1Button which checks first if is there is 1-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 1-peso denomination can be found. Otherwise, it calls the subtractOnes from the factory
     * class. It sets the denominations[0] to be equals to the getOnes() function. It updates the count of the
     * collected 1-peso denomination and informs the user of the succesful collection of 1 count of 1 peso
     *  through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c2Button which checks first if is there is 5-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 5-peso denomination can be found. Otherwise, it calls the subtractFives from the factory
     * class. It sets the denominations[1] to be equals to the getFives() function. It updates the count of the
     * collected 5-peso denomination and informs the user of the succesful collection of 1 count of 5-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c3Button which checks first if is there is 10-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 10-peso denomination can be found. Otherwise, it calls the subtractTens from the factory
     * class. It sets the denominations[2] to be equals to the getTens() function. It updates the count of the
     * collected 10-peso denomination and informs the user of the succesful collection of 1 count of 10-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c4Button which checks first if is there is 20-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 20-peso denomination can be found. Otherwise, it calls the subtractTwenties from the factory
     * class. It sets the denominations[3] to be equals to the getTwenties() function. It updates the count of the
     * collected 20-peso denomination and informs the user of the succesful collection of 1 count of 20-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c5Button which checks first if is there is 50-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 50-peso denomination can be found. Otherwise, it calls the subtractFifties from the factory
     * class. It sets the denominations[4] to be equals to the getFifties() function. It updates the count of the
     * collected 50-peso denomination and informs the user of the succesful collection of 1 count of 50-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c6Button which checks first if is there is 100-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 100-peso denomination can be found. Otherwise, it calls the subtractHundreds from the factory
     * class. It sets the denominations[5] to be equals to the getHundreds() function. It updates the count of the
     * collected 100-peso denomination and informs the user of the succesful collection of 1 count of 100-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c7Button which checks first if is there is 500-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 500-peso denomination can be found. Otherwise, it calls the subtractFiveHundreds from the factory
     * class. It sets the denominations[6] to be equals to the getFiveHundreds() function. It updates the count of the
     * collected 500-peso denomination and informs the user of the succesful collection of 1 count of 500-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the c8Button which checks first if is there is 1000-peso
     * denomination inside the vendingMachine. If there is none, a message dialogue is show to inform the
     * user that no 1000-peso denomination can be found. Otherwise, it calls the subtractThousands from the factory
     * class. It sets the denominations[7] to be equals to the getThousands() function. It updates the count of the
     * collected 1000-peso denomination and informs the user of the succesful collection of 1 count of 1000-peso
     * through a message dialogue.
     * <p>
     * This method also adds an ActionListener to the quantitySlider for obtaining the user
     * input for quantity.
     * <p>
     * This method also adds an ActionListener to the addNewItemButton which is used for adding a new item.
     * It shows different user prompts for inputting the details of the new item to be added.
     * <p>
     * This method also adds an ActionListener to the backToRestockMenuButton v
     * <p>
     * This method also adds an ActionListener to the backRestockingButton which sets the addMenu
     * to be hidden while showing the stockMenu.
     * <p>
     * This method also adds an ActionListener to the restockingQtySlider for obtaining the user
     * input for the quantity during restocking.
     * <p>
     * This method also adds an ActionListener to the restockingButton which firs checks whether
     * the restocking of an item is succeful or not. If the restocking is a success, it shows
     * a message dialogue box that informs the user the the restock is susccessful. It also shows
     * a message dialogue box when an item is failed to be restocked.
     * <p>
     * This method also adds an ActionListener to the backToMaintenanceMenuButton1 which sets
     * the addMenu to be hidden while showing the stockMenu.
     * <p>
     * This method also adds an ActionListener to the backToMaintenanceMenuButton which sets
     * the addMenu to be hidden while showing the maintenaceMenu.
     * <p>
     * This method also adds an ActionListener to the setPriceButton which uses message dialog box
     * to inform the user that the inputted price for an item is valid, invalid or that specific
     * item does not exist.
     * <p>
     * This method also adds an ActionListener to the confirmRemoveButton  which uses message dialog
     * box to inform the user that the inputted quanity for removing is succesfully removed, invalid
     *  or that specific item does not exist.
     * <p>
     * This method also adds an ActionListener to the removeSlider for obtaining the user
     * input for the number of items to be removed.
     * <p>
     * This method also adds an ActionListener to the b1 which uses a message dialog to inform the user that
     * 1 count of 1-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b2 which uses a message dialog to inform the user that
     * 1 count of 5-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b3 which uses a message dialog to inform the user that
     * 1 count of 10-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b4 which uses a message dialog to inform the user that
     * 1 count of 20-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b5 which uses a message dialog to inform the user that
     * 1 count of 50-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b6which uses a message dialog to inform the user that
     * 1 count of 100-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b7 which uses a message dialog to inform the user that
     * 1 count of 500-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the b8 which uses a message dialog to inform the user that
     * 1 count of 1000-peso was inserted.
     * <p>
     * This method also adds an ActionListener to the backToFactoryMenuButton which displays the returned
     * total payment with the corresponding count of each denomination. It also shows the testingMenu and
     * hides the vendingFeaturesMenu.
     * <p>
     * This method also adds an ActionListener to the vFeatures1stItemButton which determines if the first item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures2ndItemButton which determines if the second item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures3rdItemButton which determines if the third item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures4thItemButton which determines if the fourth item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     *
     * This method also adds an ActionListener to the vFeatures5thItemButton which determines if the fifth item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures6thItemButton which determines if the sixth item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures7thItemButton which determines if the seventh item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures8thItemButton which determines if the 8th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures9thItemButton which determines if the 9th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures10thItemButton which determines if the 10th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures11thItemButton which determines if the 11th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures12thItemButton which determines if the 12th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures13thItemButton which determines if the 13th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures14thItemButton which determines if the 14th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures15thItemButton which determines if the 15th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures16thItemButton which determines if the 16th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures17thItemButton which determines if the 18th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures18thItemButton which determines if the 19th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures19thItemButton which determines if the 20th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     * <p>
     * This method also adds an ActionListener to the vFeatures20thItemButton which determines if the 20th item
     * exists or not. If it does not exist, the word "Empty" is diplayed in the panel. However, if it does exist,
     * its details will be displayed in the slot.
     */
    public MainMenu(JFrame frame) {

        createMenu.setVisible(false);
        factoryMenu.setVisible(true);
        testingMenu.setVisible(false);
        maintenanceMenu.setVisible(false);
        stockMenu.setVisible(false);
        addMenu.setVisible(false);
        collectMenu.setVisible(false);
        collectSpecMenu.setVisible(false);
        replenishMenu.setVisible(false);
        replenishSpec.setVisible(false);
        transactionsMenu.setVisible(false);
        vendingFeaturesMenu.setVisible(false);
        creationVending = new ButtonGroup();
        creationVending.add(creationRegularRadioButton);
        creationVending.add(creationSpecialRadioButton);
        stockButtons = new ButtonGroup();
        stockButtons.add(normalRadio);
        stockButtons.add(baseRadio);
        stockButtons.add(fruitRadio);
        stockButtons.add(toppingRadio);
        stockButtons.add(sauceRadio);
        vendingMachineType = 0;
        denominations = new int[8];
        paymentDenominations = new int[8];


        createVendingMachineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMenu.setVisible(true);
                factoryMenu.setVisible(false);
                frame.pack();
                numSlots = 8;
                numItems = 10;
                numSlotsSlider.setValue(8);
                numItemsSlider.setValue(10);
                vendingMachineType = 0;
                creationRegularRadioButton.setSelected(true);
                creationSpecialRadioButton.setSelected(false);
            }
        });
        testVendingMachineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory == null)
                    JOptionPane.showMessageDialog(frame, "No existing vending machine.");
                else {
                    factoryMenu.setVisible(false);
                    testingMenu.setVisible(true);
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        backCreation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMenu.setVisible(false);
                factoryMenu.setVisible(true);
                frame.pack();
            }
        });
        vendingFeaturesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingFeaturesMenu.setVisible(true);
                testingMenu.setVisible(false);
                resetPaymentDenominations();
                updateVFeaturesScreen();
                enableEveryButton();
                specialForm.setVisible(false);
                if (factory.getVendingMachine() instanceof SpecialVending){
                    disableEveryTopSauce();
                    specialItemCustomizationButton.setVisible(true);
                    specialItemCustomizationButton.setEnabled(true);
                    specialForm.setVisible(false);
                }
                else specialItemCustomizationButton.setVisible(false);
                specialEvent = false;
                frame.pack();
            }
        });
        backToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testingMenu.setVisible(false);
                factoryMenu.setVisible(true);
            }
        });
        maintenanceFeaturesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testingMenu.setVisible(false);
                maintenanceMenu.setVisible(true);
                frame.pack();
            }
        });
        stockAndRestockItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maintenanceMenu.setVisible(false);
                stockMenu.setVisible(true);
                frame.pack();
            }
        });
        setPriceItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(true);
                restockingForm.setVisible(false);
                addNewForm.setVisible(false);
                editForm.setVisible(true);
                removeForm.setVisible(false);
                maintenanceMenu.setVisible(false);
                updateVendingMachine();
                editNameField.setText("blank");
                editPriceField.setText("1");
                frame.pack();
            }
        });
        removeItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(true);
                restockingForm.setVisible(false);
                addNewForm.setVisible(false);
                editForm.setVisible(false);
                removeForm.setVisible(true);
                maintenanceMenu.setVisible(false);
                updateVendingMachine();
                removeNameField.setText("blank");
                removeSlider.setValue(1);
                frame.pack();
                addQty = 1;
            }
        });
        collectMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maintenanceMenu.setVisible(false);
                collectMenu.setVisible(true);
                frame.pack();
            }
        });
        replenishMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replenishMenu.setVisible(true);
                maintenanceMenu.setVisible(false);
                frame.pack();
            }
        });
        printTransactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transactionsMenu.setVisible(true);
                maintenanceMenu.setVisible(false);
                transactionsText.setText(factory.displayTransactions());
                startInventoryText.setText(factory.displayStartInv());
                endInventoryText.setText(factory.displayEndInv());
                frame.pack();
            }
        });
        backToTestingMenuButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testingMenu.setVisible(true);
                maintenanceMenu.setVisible(false);
                frame.pack();
            }
        });
        stockNewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(true);
                restockingForm.setVisible(false);
                addNewForm.setVisible(true);
                editForm.setVisible(false);
                removeForm.setVisible(false);
                stockMenu.setVisible(false);
                updateVendingMachine();
                if (factory.getVendingMachine() instanceof SpecialVending)
                    categoryButtons.setVisible(true);
                else categoryButtons.setVisible(false);
                frame.pack();
                addQty = 1;
                addCategory = 0;
                quantitySlider.setValue(1);
                inputName.setText("blank");
                inputPrice.setText("1");
                inputCalories.setText("1");
                normalRadio.setSelected(true);
                baseRadio.setSelected(false);
                fruitRadio.setSelected(false);
                toppingRadio.setSelected(false);
                sauceRadio.setSelected(false);
            }
        });
        restockItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(true);
                addNewForm.setVisible(false);
                restockingForm.setVisible(true);
                editForm.setVisible(false);
                removeForm.setVisible(false);
                stockMenu.setVisible(false);
                updateVendingMachine();
                frame.pack();
                addQty = 1;
                restockingQtySlider.setValue(1);
                restockingName.setText("blank");
            }
        });
        backToMaintenanceFeaturesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maintenanceMenu.setVisible(true);
                stockMenu.setVisible(false);
                frame.pack();
            }
        });
        genReplenishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String genRepString = factory.generalReplenish();
                JOptionPane.showMessageDialog(frame,genRepString);
            }
        });
        specReplenishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replenishSpec.setVisible(true);
                replenishMenu.setVisible(false);
                updateDenominations();
                regCount1.setText("Count: " + Integer.toString(denominations[0]));
                regCount2.setText("Count: " + Integer.toString(denominations[1]));
                regCount3.setText("Count: " + Integer.toString(denominations[2]));
                regCount4.setText("Count: " + Integer.toString(denominations[3]));
                regCount5.setText("Count: " + Integer.toString(denominations[4]));
                regCount6.setText("Count: " + Integer.toString(denominations[5]));
                regCount7.setText("Count: " + Integer.toString(denominations[6]));
                regCount8.setText("Count: " + Integer.toString(denominations[7]));
                frame.pack();

            }
        });
        backtoMaintenanceFeaturesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maintenanceMenu.setVisible(true);
                replenishMenu.setVisible(false);
                frame.pack();
            }
        });

        backToReplenishMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replenishSpec.setVisible(false);
                replenishMenu.setVisible(true);
                frame.pack();

            }
        });
        collectAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String collect = factory.generalCollect();
                JOptionPane.showMessageDialog(frame,collect);
            }
        });
        collectSpecificButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectMenu.setVisible(false);
                collectSpecMenu.setVisible(true);
                updateDenominations();
                colCount1.setText("Count: " + Integer.toString(denominations[0]));
                colCount2.setText("Count: " + Integer.toString(denominations[1]));
                colCount3.setText("Count: " + Integer.toString(denominations[2]));
                colCount4.setText("Count: " + Integer.toString(denominations[3]));
                colCount5.setText("Count: " + Integer.toString(denominations[4]));
                colCount6.setText("Count: " + Integer.toString(denominations[5]));
                colCount7.setText("Count: " + Integer.toString(denominations[6]));
                colCount8.setText("Count: " + Integer.toString(denominations[7]));
                frame.pack();
            }
        });
        backToCollectMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectMenu.setVisible(true);
                collectSpecMenu.setVisible(false);
                frame.pack();
            }
        });
        backToMaintenanceFeaturesButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collectMenu.setVisible(false);
                maintenanceMenu.setVisible(true);
                frame.pack();
            }
        });
        exitTransactionsMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transactionsMenu.setVisible(false);
                maintenanceMenu.setVisible(true);
                frame.pack();
            }
        });
        numSlotsSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    numSlots = (int)source.getValue();
                    numSlotsSlider.setToolTipText(Integer.toString(numSlots));
                }
            }
        });
        numItemsSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    numItems = (int)source.getValue();
                    numItemsSlider.setToolTipText(Integer.toString(numItems));
                }
            }
        });
        creationRegularRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachineType = 0;
            }
        });
        creationSpecialRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendingMachineType = 1;
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = null;
                factory = new Factory(numSlots, numItems, vendingMachineType);
                if (vendingMachineType == 0)
                    JOptionPane.showMessageDialog(frame, "A new regular vending machine has been created!");
                else JOptionPane.showMessageDialog(frame, "A new special vending machine has been created!");
                createMenu.setVisible(false);
                factoryMenu.setVisible(true);
                frame.pack();
                slots = factory.getSlots();
            }
        });


        r1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addOnes();
                denominations[0] = factory.getOnes();
                regCount1.setText("Count: " + Integer.toString(denominations[0]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 1 peso!");
            }
        });

        r2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFives();
                denominations[1] = factory.getFives();
                regCount2.setText("Count: " + Integer.toString(denominations[1]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 5 peso!");
            }
        });

        r3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addTens();
                denominations[2] = factory.getTens();
                regCount3.setText("Count: " + Integer.toString(denominations[2]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 10 peso!");
            }
        });

        r4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addTwenties();
                denominations[3] = factory.getTwenties();
                regCount4.setText("Count: " + Integer.toString(denominations[3]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 20 peso!");
            }
        });

        r5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFifties();
                denominations[4] = factory.getFifties();
                regCount5.setText("Count: " + Integer.toString(denominations[4]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 50 peso!");
            }
        });

        r6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addHundreds();
                denominations[5] = factory.getHundreds();
                regCount6.setText("Count: " + Integer.toString(denominations[5]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 100 peso!");
            }
        });

        r7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFiveHundreds();
                denominations[6] = factory.getFiveHundreds();
                regCount7.setText("Count: " + Integer.toString(denominations[6]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 500 peso!");
            }
        });

        r8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addThousands();
                denominations[7] = factory.getThousands();
                regCount8.setText("Count: " + Integer.toString(denominations[7]));
                JOptionPane.showMessageDialog(frame, "Added 1 count of 1000 peso!");
            }
        });


        c1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getOnes()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 1-peso denomination in the vending machine.");
                else {
                    factory.subtractOnes();
                    denominations[0] = factory.getOnes();
                    colCount1.setText("Count: " + Integer.toString(denominations[0]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 1 peso!");
                }
            }
        });
        c2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getFives()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 5-peso denomination in the vending machine.");
                else {
                    factory.subtractFives();
                    denominations[1] = factory.getFives();
                    colCount2.setText("Count: " + Integer.toString(denominations[1]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 5 peso!");
                }
            }
        });
        c3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getTens()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 10-peso denomination in the vending machine.");
                else {
                    factory.subtractTens();
                    denominations[2] = factory.getTens();
                    colCount3.setText("Count: " + Integer.toString(denominations[2]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 10 peso!");
                }
            }
        });
        c4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getTwenties()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 20-peso denomination in the vending machine.");
                else {
                    factory.subtractTwenties();
                    denominations[3] = factory.getTwenties();
                    colCount4.setText("Count: " + Integer.toString(denominations[3]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 20 peso!");
                }
            }
        });
        c5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getFifties()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 50-peso denomination in the vending machine.");
                else {
                    factory.subtractFifties();
                    denominations[4] = factory.getFifties();
                    colCount5.setText("Count: " + Integer.toString(denominations[4]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 50 peso!");
                }
            }
        });
        c6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getHundreds()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 100-peso denomination in the vending machine.");
                else {
                    factory.subtractHundreds();
                    denominations[5] = factory.getHundreds();
                    colCount6.setText("Count: " + Integer.toString(denominations[5]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 100 peso!");
                }
            }
        });
        c7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getFiveHundreds()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 500-peso denomination in the vending machine.");
                else {
                    factory.subtractFiveHundreds();
                    denominations[6] = factory.getFiveHundreds();
                    colCount7.setText("Count: " + Integer.toString(denominations[6]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 100 peso!");
                }
            }
        });
        c8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (factory.getThousands()==0)
                    JOptionPane.showMessageDialog(frame, "There is no 1000-peso denomination in the vending machine.");
                else {
                    factory.subtractThousands();
                    denominations[7] = factory.getThousands();
                    colCount8.setText("Count: " + Integer.toString(denominations[7]));
                    JOptionPane.showMessageDialog(frame, "Collected 1 count of 1000 peso!");
                }
            }
        });

        quantitySlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    addQty = (int)source.getValue();
                    quantitySlider.setToolTipText(Integer.toString(addQty));
                }
            }
        });
        addNewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addName = inputName.getText();
                try {
                    addPrice = Integer.parseInt(inputPrice.getText());
                    try {
                        addCalories = Double.parseDouble(inputCalories.getText());
                        switch (factory.stockItem(addQty, addName, addPrice, addCalories, addCategory)) {
                            case 0:
                                JOptionPane.showMessageDialog(frame, "Added item.");
                                updateVendingMachine();
                                frame.pack();
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(frame, "Limit reached.");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(frame, "Item already in the vending machine.");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(frame, "Invalid submission.");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(frame, "Invalid submission.");
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(frame, "Input a name.");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(frame, "Invalid quantity.");
                                break;
                        }
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(frame, "Calories must be a double.");
                    }
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(frame, "Price must be an integer.");
                }

            }
        });
        backToRestockMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(false);
                stockMenu.setVisible(true);
                frame.pack();
            }
        });
        backRestockingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(false);
                stockMenu.setVisible(true);
                frame.pack();
            }
        });
        restockingQtySlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    addQty = (int)source.getValue();
                    restockingQtySlider.setToolTipText(Integer.toString(addQty));
                }
            }
        });
        restockingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addName = restockingName.getText();
                boolean success = factory.getVendingMachine().restockItem(addName, addQty);
                if (success) {
                    JOptionPane.showMessageDialog(frame, "Restocked item.");
                    updateVendingMachine();
                    frame.pack();
                }
                else JOptionPane.showMessageDialog(frame, "Failed to restock item.");
            }
        });
        backToMaintenanceMenuButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(false);
                maintenanceMenu.setVisible(true);
                frame.pack();
            }
        });
        backToMaintenanceMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenu.setVisible(false);
                maintenanceMenu.setVisible(true);
                frame.pack();
            }
        });
        setPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addName = editNameField.getText();
                try {
                    addPrice = Integer.parseInt(editPriceField.getText());
                    switch(factory.editItem(addName, addPrice)) {
                        case 0:
                            JOptionPane.showMessageDialog(frame, "Item price is set.");
                            updateVendingMachine();
                            frame.pack();
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(frame, "Item does not exist.");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(frame, "Invalid submission.");
                            break;
                    }
                } catch(Exception error) {
                    JOptionPane.showMessageDialog(frame, "Price must be an integer.");
                }
            }
        });
        confirmRemoveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addName = removeNameField.getText();
                switch (factory.removeItem(addName, addQty)) {
                    case 0:
                        JOptionPane.showMessageDialog(frame, "Removed successfully.");
                        updateVendingMachine();
                        frame.pack();
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(frame, "Item does not exist.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(frame, "Invalid quantity.");
                        break;
                }
            }
        });
        removeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    addQty = (int)source.getValue();
                    removeSlider.setToolTipText(Integer.toString(addQty));
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addOnes();
                denominations[0] = factory.getOnes();
                factory.getVendingMachine().updatePayment(1, 1);

                paymentDenominations[0]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 1 peso!");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFives();
                denominations[1] = factory.getFives();
                factory.getVendingMachine().updatePayment(5, 1);

                paymentDenominations[1]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 5 peso!");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addTens();
                denominations[2] = factory.getTens();
                factory.getVendingMachine().updatePayment(10, 1);

                paymentDenominations[2]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 10 peso!");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addTwenties();
                denominations[3] = factory.getTwenties();
                factory.getVendingMachine().updatePayment(20, 1);

                paymentDenominations[3]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 20 peso!");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFifties();
                denominations[4] = factory.getFifties();
                factory.getVendingMachine().updatePayment(50, 1);

                paymentDenominations[4]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 50 peso!");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addHundreds();
                denominations[5] = factory.getHundreds();
                factory.getVendingMachine().updatePayment(100, 1);

                paymentDenominations[5]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 100 peso!");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addFiveHundreds();
                denominations[6] = factory.getFiveHundreds();
                factory.getVendingMachine().updatePayment(500, 1);

                paymentDenominations[6]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 500 peso!");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.addThousands();
                denominations[7] = factory.getThousands();
                factory.getVendingMachine().updatePayment(1000, 1);

                paymentDenominations[7]++;
                updatePaymentLabels();

                JOptionPane.showMessageDialog(frame, "Inserted 1 count of 1000 peso!");
            }
        });
        backToFactoryMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paymentReturned = "Payment returned:\n" +
                        "\n1 peso: " + paymentDenominations[0] +
                        "\n5 peso: " + paymentDenominations[1] +
                        "\n10 peso: " + paymentDenominations[2] +
                        "\n20 peso: " + paymentDenominations[3] +
                        "\n50 peso: " + paymentDenominations[4] +
                        "\n100 peso: " + paymentDenominations[5] +
                        "\n500 peso: " + paymentDenominations[6] +
                        "\n1000 peso: " + paymentDenominations[7] +
                        "\n\nTotal: " + paymentTotal;
                if (factory.isPaymentReturned())
                    JOptionPane.showMessageDialog(frame, paymentReturned);
                factory.getVendingMachine().resetBuying();
                testingMenu.setVisible(true);
                vendingFeaturesMenu.setVisible(false);
                frame.pack();
            }
        });
        vFeatures1stItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures1stItemButton.isEnabled())
                    specCustomization(slots.get(0).get(0), frame);
                else {
                    if (vFeatures1stItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(0).get(0), frame);
                }
            }
        });
        vFeatures2ndItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures2ndItemButton.isEnabled())
                    specCustomization(slots.get(1).get(0), frame);
                else {
                    if (vFeatures2ndItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(1).get(0), frame);
                }
            }
        });
        vFeatures3rdItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures3rdItemButton.isEnabled())
                    specCustomization(slots.get(2).get(0), frame);
                else {
                    if (vFeatures3rdItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(2).get(0), frame);
                }
            }
        });
        vFeatures4thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures4thItemButton.isEnabled())
                    specCustomization(slots.get(3).get(0), frame);
                else {
                    if (vFeatures4thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(3).get(0), frame);
                }
            }
        });
        vFeatures5thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures5thItemButton.isEnabled())
                    specCustomization(slots.get(4).get(0), frame);
                else {
                    if (vFeatures5thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(4).get(0), frame);
                }
            }
        });
        vFeatures6thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures6thItemButton.isEnabled())
                    specCustomization(slots.get(5).get(0), frame);
                else {
                    if (vFeatures6thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(5).get(0), frame);
                }
            }
        });
        vFeatures7thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures7thItemButton.isEnabled())
                    specCustomization(slots.get(6).get(0), frame);
                else {
                    if (vFeatures7thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(6).get(0), frame);
                }
            }
        });
        vFeatures8thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures8thItemButton.isEnabled())
                    specCustomization(slots.get(7).get(0), frame);
                else {
                    if (vFeatures8thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(7).get(0), frame);
                }
            }
        });
        vFeatures9thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures9thItemButton.isEnabled())
                    specCustomization(slots.get(8).get(0), frame);
                else {
                    if (vFeatures9thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(8).get(0), frame);
                }
            }
        });
        vFeatures10thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures10thItemButton.isEnabled())
                    specCustomization(slots.get(9).get(0), frame);
                else {
                    if (vFeatures10thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(9).get(0), frame);
                }
            }
        });
        vFeatures11thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures11thItemButton.isEnabled())
                    specCustomization(slots.get(10).get(0), frame);
                else {
                    if (vFeatures11thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(10).get(0), frame);
                }
            }
        });
        vFeatures12thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures12thItemButton.isEnabled())
                    specCustomization(slots.get(11).get(0), frame);
                else {
                    if (vFeatures12thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(11).get(0), frame);
                }
            }
        });
        vFeatures13thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures13thItemButton.isEnabled())
                    specCustomization(slots.get(12).get(0), frame);
                else {
                    if (vFeatures13thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(12).get(0), frame);
                }
            }
        });
        vFeatures14thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures14thItemButton.isEnabled())
                    specCustomization(slots.get(13).get(0), frame);
                else {
                    if (vFeatures14thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(13).get(0), frame);
                }
            }
        });
        vFeatures15thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures15thItemButton.isEnabled())
                    specCustomization(slots.get(14).get(0), frame);
                else {
                    if (vFeatures15thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(14).get(0), frame);
                }
            }
        });
        vFeatures16thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures16thItemButton.isEnabled())
                    specCustomization(slots.get(15).get(0), frame);
                else {
                    if (vFeatures16thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(15).get(0), frame);
                }
            }
        });
        vFeatures17thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures17thItemButton.isEnabled())
                    specCustomization(slots.get(16).get(0), frame);
                else {
                    if (vFeatures17thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(16).get(0), frame);
                }
            }
        });
        vFeatures18thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures18thItemButton.isEnabled())
                    specCustomization(slots.get(17).get(0), frame);
                else {
                    if (vFeatures18thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(17).get(0), frame);
                }
            }
        });
        vFeatures19thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures19thItemButton.isEnabled())
                    specCustomization(slots.get(18).get(0), frame);
                else {
                    if (vFeatures19thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(18).get(0), frame);
                }
            }
        });
        vFeatures20thItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (specialEvent && vFeatures20thItemButton.isEnabled())
                    specCustomization(slots.get(19).get(0), frame);
                else {
                    if (vFeatures20thItemButton.getText().equalsIgnoreCase("Empty"))
                        JOptionPane.showMessageDialog(frame,"Empty.");
                    else buying(slots.get(19).get(0), frame);
                }
            }
        });
        normalRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCategory = 0;
            }
        });
        baseRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCategory = 1;
            }
        });
        fruitRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCategory = 2;
            }
        });
        toppingRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCategory = 3;
            }
        });
        sauceRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCategory = 4;
            }
        });
        specialItemCustomizationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Select a base, at most 1 fruit, at most 1 topping, and at most 1 sauce!");
                enableEveryButton();
                disableEveryNormal();
                specialForm.setVisible(true);
                specialEvent = true;
                specPrice = 50;
                specCalories = 200;
                specBase = slots.get(0).get(0);
                specFruit = null;
                specTopping = null;
                specSauce = null;
                specialItemCustomizationButton.setEnabled(false);
                baseForm.setText("Base: ice cream (default)");
                fruitForm.setText("Fruit: none");
                toppingForm.setText("Topping: none");
                sauceForm.setText("Sauce: none");
                caloriesForm.setText("Calories: 200");
                priceForm.setText("Price: 50");
                frame.pack();
            }
        });
        dispenseOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory.getVendingMachine().stockNew(1, "Special Item", specPrice, specCalories);
                Item item = factory.getVendingMachine().findItem("Special Item");
                factory.trackSpec(specBase, specFruit, specTopping, specSauce);
                buying(item, frame);
                specialForm.setVisible(false);
                specialItemCustomizationButton.setEnabled(true);
                enableEveryButton();
                disableEveryTopSauce();
                specialEvent = false;
            }
        });
    }

    private void buying(Item item, JFrame frame) {
        switch (factory.orderItem(item)) {
            case 0:
                JOptionPane.showMessageDialog(frame, "Payment: " + factory.getVendingMachine().getTotalPayment()
                        + "\nCost: " + factory.getVendingMachine().getTotalCost() + "\nExpected Change: " +
                        (factory.getVendingMachine().getTotalPayment() - factory.getVendingMachine().getTotalCost()) + " Php");
                factory.dispenseItem(factory.getVendingMachine().getTotalCost());
                JOptionPane.showMessageDialog(frame, factory.getChange());
                JOptionPane.showMessageDialog(frame, factory.getChangeEvent());
                updateVFeaturesScreen();
                resetPaymentDenominations();
                updatePaymentLabels();
                factory.resetChange();
                factory.resetChangeEvent();
                factory.getVendingMachine().resetBuying();
                break;
            case 1:
                JOptionPane.showMessageDialog(frame, "Item is not for single purchase.");
                break;
            case 2:
                JOptionPane.showMessageDialog(frame, "Not enough change in the machine. Transaction canceled.");
                break;
            case 3:
                JOptionPane.showMessageDialog(frame, "Not enough cash inserted.");
                break;
            case 4:
                JOptionPane.showMessageDialog(frame, "Item not found.");
                break;
        }
    }

    private void updateDenominations() {
        denominations[0] = factory.getOnes();
        denominations[1] = factory.getFives();
        denominations[2] = factory.getTens();
        denominations[3] = factory.getTwenties();
        denominations[4] = factory.getFifties();
        denominations[5] = factory.getHundreds();
        denominations[6] = factory.getFiveHundreds();
        denominations[7] = factory.getThousands();
    }

    private void resetPaymentDenominations() {
        paymentDenominations[0] = 0;
        paymentDenominations[1] = 0;
        paymentDenominations[2] = 0;
        paymentDenominations[3] = 0;
        paymentDenominations[4] = 0;
        paymentDenominations[5] = 0;
        paymentDenominations[6] = 0;
        paymentDenominations[7] = 0;
        updatePaymentLabels();
    }

    private void updatePaymentLabels() {
        bCount1.setText("Count: " + paymentDenominations[0]);
        bCount2.setText("Count: " + paymentDenominations[1]);
        bCount3.setText("Count: " + paymentDenominations[2]);
        bCount4.setText("Count: " + paymentDenominations[3]);
        bCount5.setText("Count: " + paymentDenominations[4]);
        bCount6.setText("Count: " + paymentDenominations[5]);
        bCount7.setText("Count: " + paymentDenominations[6]);
        bCount8.setText("Count: " + paymentDenominations[7]);
        paymentTotal = paymentDenominations[0]*1 + paymentDenominations[1]*5 + paymentDenominations[2]*10 +
                paymentDenominations[3]*20 + paymentDenominations[4]*50 + paymentDenominations[5]*100 +
                paymentDenominations[6]*500 + paymentDenominations[7]*1000;
        bTotMoney.setText("Total Money Inserted: " + paymentTotal);
    }

    private void updateVFeaturesScreen() {
        vFeatures3rdRow.setVisible(true);
        vFeatures4thRow.setVisible(true);
        vFeatures5thRow.setVisible(true);
        if (numSlots <17)
            vFeatures5thRow.setVisible(false);
        if (numSlots <13)
            vFeatures4thRow.setVisible(false);
        if (numSlots <9)
            vFeatures3rdRow.setVisible(false);
        vFeatures20thItemButton.setText("Empty");
        vFeatures19thItemButton.setText("Empty");
        vFeatures18thItemButton.setText("Empty");
        vFeatures17thItemButton.setText("Empty");
        vFeatures16thItemButton.setText("Empty");
        vFeatures15thItemButton.setText("Empty");
        vFeatures14thItemButton.setText("Empty");
        vFeatures13thItemButton.setText("Empty");
        vFeatures12thItemButton.setText("Empty");
        vFeatures11thItemButton.setText("Empty");
        vFeatures10thItemButton.setText("Empty");
        vFeatures9thItemButton.setText("Empty");
        vFeatures8thItemButton.setText("Empty");
        vFeatures7thItemButton.setText("Empty");
        vFeatures6thItemButton.setText("Empty");
        vFeatures5thItemButton.setText("Empty");
        vFeatures4thItemButton.setText("Empty");
        vFeatures3rdItemButton.setText("Empty");
        vFeatures2ndItemButton.setText("Empty");
        vFeatures1stItemButton.setText("Empty");

        vFeatures20thItemButton.setVisible(false);
        vFeatures19thItemButton.setVisible(false);
        vFeatures18thItemButton.setVisible(false);
        vFeatures17thItemButton.setVisible(false);
        vFeatures16thItemButton.setVisible(false);
        vFeatures15thItemButton.setVisible(false);
        vFeatures14thItemButton.setVisible(false);
        vFeatures13thItemButton.setVisible(false);
        vFeatures12thItemButton.setVisible(false);
        vFeatures11thItemButton.setVisible(false);
        vFeatures10thItemButton.setVisible(false);
        vFeatures9thItemButton.setVisible(false);

        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        String temp;
        switch (existingSlots) {
            case 20:
                temp = slots.get(19).get(0).getName();
                temp = temp.concat(" (" + slots.get(19).size() +
                        ") Php:" + slots.get(19).get(0).getPrice() +
                        " Cal: " + slots.get(19).get(0).getCalories());
                vFeatures20thItemButton.setText(temp);
            case 19:
                temp = slots.get(18).get(0).getName();
                temp = temp.concat(" (" + slots.get(18).size() +
                        ") Php: " + slots.get(18).get(0).getPrice() +
                        " Cal: " + slots.get(18).get(0).getCalories());
                vFeatures19thItemButton.setText("<html>" + temp.replaceAll("\n", "<br/>") + "</html>");
            case 18:
                temp = slots.get(17).get(0).getName();
                temp = temp.concat(" (" + slots.get(17).size() +
                        ") Php: " + slots.get(17).get(0).getPrice() +
                        " Cal: " + slots.get(17).get(0).getCalories());
                vFeatures18thItemButton.setText(temp);
            case 17:
                temp = slots.get(16).get(0).getName();
                temp = temp.concat(" (" + slots.get(16).size() +
                        ") Php: " + slots.get(16).get(0).getPrice() +
                        " Cal: " + slots.get(16).get(0).getCalories());
                vFeatures17thItemButton.setText(temp);
            case 16:
                temp = slots.get(15).get(0).getName();
                temp = temp.concat(" (" + slots.get(15).size() +
                        ") Php: " + slots.get(15).get(0).getPrice() +
                        " Cal: " + slots.get(15).get(0).getCalories());
                vFeatures16thItemButton.setText(temp);
            case 15:
                temp = slots.get(14).get(0).getName();
                temp = temp.concat(" (" + slots.get(14).size() +
                        ") Php: " + slots.get(14).get(0).getPrice() +
                        " Cal: " + slots.get(14).get(0).getCalories());
                vFeatures15thItemButton.setText(temp);
            case 14:
                temp = slots.get(13).get(0).getName();
                temp = temp.concat(" (" + slots.get(13).size() +
                        ") Php: " + slots.get(13).get(0).getPrice() +
                        " Cal: " + slots.get(13).get(0).getCalories());
                vFeatures14thItemButton.setText(temp);
            case 13:
                temp = slots.get(12).get(0).getName();
                temp = temp.concat(" (" + slots.get(12).size() +
                        ") Php: " + slots.get(12).get(0).getPrice() +
                        " Cal: " + slots.get(12).get(0).getCalories());
                vFeatures13thItemButton.setText(temp);
            case 12:
                temp = slots.get(11).get(0).getName();
                temp = temp.concat(" (" + slots.get(11).size() +
                        ") Php: " + slots.get(11).get(0).getPrice() +
                        " Cal: " + slots.get(11).get(0).getCalories());
                vFeatures12thItemButton.setText(temp);
            case 11:
                temp = slots.get(10).get(0).getName();
                temp = temp.concat(" (" + slots.get(10).size() +
                        ") Php: " + slots.get(10).get(0).getPrice() +
                        " Cal: " + slots.get(10).get(0).getCalories());
                vFeatures11thItemButton.setText(temp);
            case 10:
                temp = slots.get(9).get(0).getName();
                temp = temp.concat(" (" + slots.get(9).size() +
                        ") Php: " + slots.get(9).get(0).getPrice() +
                        " Cal: " + slots.get(9).get(0).getCalories());
                vFeatures10thItemButton.setText(temp);
            case 9:
                temp = slots.get(8).get(0).getName();
                temp = temp.concat(" (" + slots.get(8).size() +
                        ") Php: " + slots.get(8).get(0).getPrice() +
                        " Cal: " + slots.get(8).get(0).getCalories());
                vFeatures9thItemButton.setText(temp);
            case 8:
                temp = slots.get(7).get(0).getName();
                temp = temp.concat(" (" + slots.get(7).size() +
                        ") Php: " + slots.get(7).get(0).getPrice() +
                        " Cal: " + slots.get(7).get(0).getCalories());
                vFeatures8thItemButton.setText(temp);
            case 7:
                temp = slots.get(6).get(0).getName();
                temp = temp.concat(" (" + slots.get(6).size() +
                        ") Php: " + slots.get(6).get(0).getPrice() +
                        " Cal: " + slots.get(6).get(0).getCalories());
                vFeatures7thItemButton.setText(temp);
            case 6:
                temp = slots.get(5).get(0).getName();
                temp = temp.concat(" (" + slots.get(5).size() +
                        ") Php: " + slots.get(5).get(0).getPrice() +
                        " Cal: " + slots.get(5).get(0).getCalories());
                vFeatures6thItemButton.setText(temp);
            case 5:
                temp = slots.get(4).get(0).getName();
                temp = temp.concat(" (" + slots.get(4).size() +
                        ") Php: " + slots.get(4).get(0).getPrice() +
                        " Cal: " + slots.get(4).get(0).getCalories());
                vFeatures5thItemButton.setText(temp);
            case 4:
                temp = slots.get(3).get(0).getName();
                temp = temp.concat(" (" + slots.get(3).size() +
                        ") Php: " + slots.get(3).get(0).getPrice() +
                        " Cal: " + slots.get(3).get(0).getCalories());
                vFeatures4thItemButton.setText(temp);
            case 3:
                temp = slots.get(2).get(0).getName();
                temp = temp.concat(" (" + slots.get(2).size() +
                        ") Php: " + slots.get(2).get(0).getPrice() +
                        " Cal: " + slots.get(2).get(0).getCalories());
                vFeatures3rdItemButton.setText(temp);
            case 2:
                temp = slots.get(1).get(0).getName();
                temp = temp.concat(" (" + slots.get(1).size() +
                        ") Php: " + slots.get(1).get(0).getPrice() +
                        " Cal: " + slots.get(1).get(0).getCalories());
                vFeatures2ndItemButton.setText(temp);
            case 1:
                temp = slots.get(0).get(0).getName();
                temp = temp.concat(" (" + slots.get(0).size() +
                        ") Php: " + slots.get(0).get(0).getPrice() +
                        " Cal: " + slots.get(0).get(0).getCalories());
                vFeatures1stItemButton.setText(temp);
        }

        switch (numSlots) {
            case 20:
                vFeatures20thItemButton.setVisible(true);
            case 19:
                vFeatures19thItemButton.setVisible(true);
            case 18:
                vFeatures18thItemButton.setVisible(true);
            case 17:
                vFeatures17thItemButton.setVisible(true);
            case 16:
                vFeatures16thItemButton.setVisible(true);
            case 15:
                vFeatures15thItemButton.setVisible(true);
            case 14:
                vFeatures14thItemButton.setVisible(true);
            case 13:
                vFeatures13thItemButton.setVisible(true);
            case 12:
                vFeatures12thItemButton.setVisible(true);
            case 11:
                vFeatures11thItemButton.setVisible(true);
            case 10:
                vFeatures10thItemButton.setVisible(true);
            case 9:
                vFeatures9thItemButton.setVisible(true);
        }
    }

    private void updateVendingMachine() {
        addFifthRowScreen.setVisible(true);
        addFourthRowScreen.setVisible(true);
        addThirdRowScreen.setVisible(true);
        if (numSlots <17)
            addFifthRowScreen.setVisible(false);
        if (numSlots <13)
            addFourthRowScreen.setVisible(false);
        if (numSlots <9)
            addThirdRowScreen.setVisible(false);
        Add20thItem.setText("Empty");
        Add19thItem.setText("Empty");
        Add18thItem.setText("Empty");
        Add17thItem.setText("Empty");
        Add16thItem.setText("Empty");
        Add15thItem.setText("Empty");
        Add14thItem.setText("Empty");
        Add13thItem.setText("Empty");
        Add12thItem.setText("Empty");
        Add11thItem.setText("Empty");
        Add10thItem.setText("Empty");
        Add9thItem.setText("Empty");
        Add8thItem.setText("Empty");
        Add7thItem.setText("Empty");
        Add6thItem.setText("Empty");
        Add5thItem.setText("Empty");
        Add4thItem.setText("Empty");
        Add3rdItem.setText("Empty");
        Add2ndItem.setText("Empty");
        Add1stItem.setText("Empty");

        Add20thItem.setVisible(false);
        Add19thItem.setVisible(false);
        Add18thItem.setVisible(false);
        Add17thItem.setVisible(false);
        Add16thItem.setVisible(false);
        Add15thItem.setVisible(false);
        Add14thItem.setVisible(false);
        Add13thItem.setVisible(false);
        Add12thItem.setVisible(false);
        Add11thItem.setVisible(false);
        Add10thItem.setVisible(false);
        Add9thItem.setVisible(false);

        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        String temp;
        String cat = "Base";
        switch (existingSlots) {
            case 20:
                temp = slots.get(19).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(19).size() +
                        "\nPrice: " + slots.get(19).get(0).getPrice() +
                        "\nCalories: " + slots.get(19).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(19).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add20thItem.setText(temp);
            case 19:
                temp = slots.get(18).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(18).size() +
                        "\nPrice: " + slots.get(18).get(0).getPrice() +
                        "\nCalories: " + slots.get(18).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(18).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add19thItem.setText(temp);
            case 18:
                temp = slots.get(17).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(17).size() +
                        "\nPrice: " + slots.get(17).get(0).getPrice() +
                        "\nCalories: " + slots.get(17).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(17).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add18thItem.setText(temp);
            case 17:
                temp = slots.get(16).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(16).size() +
                        "\nPrice: " + slots.get(16).get(0).getPrice() +
                        "\nCalories: " + slots.get(16).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(16).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add17thItem.setText(temp);
            case 16:
                temp = slots.get(15).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(15).size() +
                        "\nPrice: " + slots.get(15).get(0).getPrice() +
                        "\nCalories: " + slots.get(15).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(15).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add16thItem.setText(temp);
            case 15:
                temp = slots.get(14).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(14).size() +
                        "\nPrice: " + slots.get(14).get(0).getPrice() +
                        "\nCalories: " + slots.get(14).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(14).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add15thItem.setText(temp);
            case 14:
                temp = slots.get(13).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(13).size() +
                        "\nPrice: " + slots.get(13).get(0).getPrice() +
                        "\nCalories: " + slots.get(13).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(13).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add14thItem.setText(temp);
            case 13:
                temp = slots.get(12).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(12).size() +
                        "\nPrice: " + slots.get(12).get(0).getPrice() +
                        "\nCalories: " + slots.get(12).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(12).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add13thItem.setText(temp);
            case 12:
                temp = slots.get(11).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(11).size() +
                        "\nPrice: " + slots.get(11).get(0).getPrice() +
                        "\nCalories: " + slots.get(11).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(11).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add12thItem.setText(temp);
            case 11:
                temp = slots.get(10).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(10).size() +
                        "\nPrice: " + slots.get(10).get(0).getPrice() +
                        "\nCalories: " + slots.get(10).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(10).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add11thItem.setText(temp);
            case 10:
                temp = slots.get(9).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(9).size() +
                        "\nPrice: " + slots.get(9).get(0).getPrice() +
                        "\nCalories: " + slots.get(9).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(9).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add10thItem.setText(temp);
            case 9:
                temp = slots.get(8).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(8).size() +
                        "\nPrice: " + slots.get(8).get(0).getPrice() +
                        "\nCalories: " + slots.get(8).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(8).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add9thItem.setText(temp);
            case 8:
                temp = slots.get(7).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(7).size() +
                        "\nPrice: " + slots.get(7).get(0).getPrice() +
                        "\nCalories: " + slots.get(7).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(7).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add8thItem.setText(temp);
            case 7:
                temp = slots.get(6).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(6).size() +
                        "\nPrice: " + slots.get(6).get(0).getPrice() +
                        "\nCalories: " + slots.get(6).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(6).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add7thItem.setText(temp);
            case 6:
                temp = slots.get(5).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(5).size() +
                        "\nPrice: " + slots.get(5).get(0).getPrice() +
                        "\nCalories: " + slots.get(5).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(5).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add6thItem.setText(temp);
            case 5:
                temp = slots.get(4).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(4).size() +
                        "\nPrice: " + slots.get(4).get(0).getPrice() +
                        "\nCalories: " + slots.get(4).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(4).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add5thItem.setText(temp);
            case 4:
                temp = slots.get(3).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(3).size() +
                        "\nPrice: " + slots.get(3).get(0).getPrice() +
                        "\nCalories: " + slots.get(3).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(3).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add4thItem.setText(temp);
            case 3:
                temp = slots.get(2).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(2).size() +
                        "\nPrice: " + slots.get(2).get(0).getPrice() +
                        "\nCalories: " + slots.get(2).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(2).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add3rdItem.setText(temp);
            case 2:
                temp = slots.get(1).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(1).size() +
                        "\nPrice: " + slots.get(1).get(0).getPrice() +
                        "\nCalories: " + slots.get(1).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(1).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add2ndItem.setText(temp);
            case 1:
                temp = slots.get(0).get(0).getName();
                temp = temp.concat("\nQty: " + slots.get(0).size() +
                        "\nPrice: " + slots.get(0).get(0).getPrice() +
                        "\nCalories: " + slots.get(0).get(0).getCalories());
                if (factory.getVendingMachine() instanceof SpecialVending) {
                    switch (slots.get(0).get(0).getCategory()) {
                        case 0:
                            cat = "Normal";
                            break;
                        case 1:
                            cat = "Base";
                            break;
                        case 2:
                            cat = "Fruit";
                            break;
                        case 3:
                            cat = "Topping";
                            break;
                        case 4:
                            cat = "Sauce";
                            break;
                    }
                    temp = temp.concat("\n" + cat);
                }
                Add1stItem.setText(temp);
        }

        switch (numSlots) {
            case 20:
                Add20thItem.setVisible(true);
            case 19:
                Add19thItem.setVisible(true);
            case 18:
                Add18thItem.setVisible(true);
            case 17:
                Add17thItem.setVisible(true);
            case 16:
                Add16thItem.setVisible(true);
            case 15:
                Add15thItem.setVisible(true);
            case 14:
                Add14thItem.setVisible(true);
            case 13:
                Add13thItem.setVisible(true);
            case 12:
                Add12thItem.setVisible(true);
            case 11:
                Add11thItem.setVisible(true);
            case 10:
                Add10thItem.setVisible(true);
            case 9:
                Add9thItem.setVisible(true);
        }
    }

    /**
     * This method disables evey toppings and sauce.
     */
    public void disableEveryTopSauce() {
        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        int i;
        switch (existingSlots) {
            case 20:
                i = slots.get(19).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures20thItemButton.setEnabled(false);
            case 19:
                i = slots.get(18).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures19thItemButton.setEnabled(false);
            case 18:
                i = slots.get(17).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures18thItemButton.setEnabled(false);
            case 17:
                i = slots.get(16).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures17thItemButton.setEnabled(false);
            case 16:
                i = slots.get(15).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures16thItemButton.setEnabled(false);
            case 15:
                i = slots.get(14).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures15thItemButton.setEnabled(false);
            case 14:
                i = slots.get(13).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures14thItemButton.setEnabled(false);
            case 13:
                i = slots.get(12).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures13thItemButton.setEnabled(false);
            case 12:
                i = slots.get(11).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures12thItemButton.setEnabled(false);
            case 11:
                i = slots.get(10).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures11thItemButton.setEnabled(false);
            case 10:
                i = slots.get(9).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures10thItemButton.setEnabled(false);
            case 9:
                i = slots.get(8).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures9thItemButton.setEnabled(false);
            case 8:
                i = slots.get(7).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures8thItemButton.setEnabled(false);
            case 7:
                i = slots.get(6).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures7thItemButton.setEnabled(false);
            case 6:
                i = slots.get(5).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures6thItemButton.setEnabled(false);
            case 5:
                i = slots.get(4).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures5thItemButton.setEnabled(false);
            case 4:
                i = slots.get(3).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures4thItemButton.setEnabled(false);
            case 3:
                i = slots.get(2).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures3rdItemButton.setEnabled(false);
            case 2:
                i = slots.get(1).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures2ndItemButton.setEnabled(false);
            case 1:
                i = slots.get(0).get(0).getCategory();
                if (i == 3 || i ==4)
                    vFeatures1stItemButton.setEnabled(false);
        }
    }

    /**
     * This method enables evey button
     */
    public void enableEveryButton() {
        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        switch (existingSlots) {
            case 20:
                    vFeatures20thItemButton.setEnabled(true);
            case 19:
                    vFeatures19thItemButton.setEnabled(true);
            case 18:
                    vFeatures18thItemButton.setEnabled(true);
            case 17:
                    vFeatures17thItemButton.setEnabled(true);
            case 16:
                    vFeatures16thItemButton.setEnabled(true);
            case 15:
                    vFeatures15thItemButton.setEnabled(true);
            case 14:
                    vFeatures14thItemButton.setEnabled(true);
            case 13:
                    vFeatures13thItemButton.setEnabled(true);
            case 12:
                    vFeatures12thItemButton.setEnabled(true);
            case 11:
                    vFeatures11thItemButton.setEnabled(true);
            case 10:
                    vFeatures10thItemButton.setEnabled(true);
            case 9:
                    vFeatures9thItemButton.setEnabled(true);
            case 8:
                    vFeatures8thItemButton.setEnabled(true);
            case 7:
                    vFeatures7thItemButton.setEnabled(true);
            case 6:
                    vFeatures6thItemButton.setEnabled(true);
            case 5:
                    vFeatures5thItemButton.setEnabled(true);
            case 4:
                    vFeatures4thItemButton.setEnabled(true);
            case 3:
                    vFeatures3rdItemButton.setEnabled(true);
            case 2:
                    vFeatures2ndItemButton.setEnabled(true);
            case 1:
                    vFeatures1stItemButton.setEnabled(true);
        }
        disableEveryEmpty();
    }

    /**
     * This methods disables the displays of the empty slots.
     */
    public void disableEveryEmpty() {
        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        switch (existingSlots) {
        case 0:
        vFeatures1stItemButton.setEnabled(false);
        case 1:
            vFeatures2ndItemButton.setEnabled(false);
        case 2:
            vFeatures3rdItemButton.setEnabled(false);
            case 3:
            vFeatures4thItemButton.setEnabled(false);
            case 4:
             vFeatures5thItemButton.setEnabled(false);
            case 5:
                vFeatures6thItemButton.setEnabled(false);
            case 6:
                vFeatures7thItemButton.setEnabled(false);
            case 7:
                vFeatures8thItemButton.setEnabled(false);
            case 8:
                vFeatures9thItemButton.setEnabled(false);
            case 9:
                vFeatures10thItemButton.setEnabled(false);
            case 10:
                vFeatures11thItemButton.setEnabled(false);
            case 11:
                vFeatures12thItemButton.setEnabled(false);
            case 12:
                vFeatures13thItemButton.setEnabled(false);
            case 13:
                vFeatures14thItemButton.setEnabled(false);
            case 14:
                vFeatures15thItemButton.setEnabled(false);
            case 15:
                vFeatures16thItemButton.setEnabled(false);
            case 16:
                vFeatures17thItemButton.setEnabled(false);
            case 17:
                vFeatures18thItemButton.setEnabled(false);
            case 18:
                vFeatures19thItemButton.setEnabled(false);
            case 19:
                vFeatures20thItemButton.setEnabled(false);
        }
    }

    /**
     * This method disables displays of the normal items in the
     * special vending machine.
     */
    public void disableEveryNormal() {
        int existingSlots = 0;
        if (slots != null)
            existingSlots = slots.size();
        int i;
        switch (existingSlots) {
            case 20:
                i = slots.get(19).get(0).getCategory();
                if (i == 0)
                    vFeatures20thItemButton.setEnabled(false);
            case 19:
                i = slots.get(18).get(0).getCategory();
                if (i == 0)
                    vFeatures19thItemButton.setEnabled(false);
            case 18:
                i = slots.get(17).get(0).getCategory();
                if (i == 0)
                    vFeatures18thItemButton.setEnabled(false);
            case 17:
                i = slots.get(16).get(0).getCategory();
                if (i == 0)
                    vFeatures17thItemButton.setEnabled(false);
            case 16:
                i = slots.get(15).get(0).getCategory();
                if (i == 0)
                    vFeatures16thItemButton.setEnabled(false);
            case 15:
                i = slots.get(14).get(0).getCategory();
                if (i == 0)
                    vFeatures15thItemButton.setEnabled(false);
            case 14:
                i = slots.get(13).get(0).getCategory();
                if (i == 0)
                    vFeatures14thItemButton.setEnabled(false);
            case 13:
                i = slots.get(12).get(0).getCategory();
                if (i == 0)
                    vFeatures13thItemButton.setEnabled(false);
            case 12:
                i = slots.get(11).get(0).getCategory();
                if (i == 0)
                    vFeatures12thItemButton.setEnabled(false);
            case 11:
                i = slots.get(10).get(0).getCategory();
                if (i == 0)
                    vFeatures11thItemButton.setEnabled(false);
            case 10:
                i = slots.get(9).get(0).getCategory();
                if (i == 0)
                    vFeatures10thItemButton.setEnabled(false);
            case 9:
                i = slots.get(8).get(0).getCategory();
                if (i == 0)
                    vFeatures9thItemButton.setEnabled(false);
            case 8:
                i = slots.get(7).get(0).getCategory();
                if (i == 0)
                    vFeatures8thItemButton.setEnabled(false);
            case 7:
                i = slots.get(6).get(0).getCategory();
                if (i == 0)
                    vFeatures7thItemButton.setEnabled(false);
            case 6:
                i = slots.get(5).get(0).getCategory();
                if (i == 0)
                    vFeatures6thItemButton.setEnabled(false);
            case 5:
                i = slots.get(4).get(0).getCategory();
                if (i == 0)
                    vFeatures5thItemButton.setEnabled(false);
            case 4:
                i = slots.get(3).get(0).getCategory();
                if (i == 0)
                    vFeatures4thItemButton.setEnabled(false);
            case 3:
                i = slots.get(2).get(0).getCategory();
                if (i == 0)
                    vFeatures3rdItemButton.setEnabled(false);
            case 2:
                i = slots.get(1).get(0).getCategory();
                if (i == 0)
                    vFeatures2ndItemButton.setEnabled(false);
            case 1:
                i = slots.get(0).get(0).getCategory();
                if (i == 0)
                    vFeatures1stItemButton.setEnabled(false);
        }
    }

    /**
     * Thos method facilitates the customization of order in the special
     * vending machine
     * @param item the item associated with the button clicked
     * @param frame the Jframe itself
     */
    public void specCustomization(Item item, JFrame frame) {
        if (item.getCategory() == 1) {
            specBase = item;
            JOptionPane.showMessageDialog(frame, "Selected your base!");
            baseForm.setText("Base: " + item.getName());
        }
        else if (item.getCategory() == 2) {
            specFruit = item;
            JOptionPane.showMessageDialog(frame, "Selected your fruit!");
            fruitForm.setText("Fruit: " + item.getName());
        }
        else if (item.getCategory() == 3) {
            specTopping = item;
            JOptionPane.showMessageDialog(frame, "Selected your topping!");
            toppingForm.setText("Topping: " + item.getName());
        }
        else if (item.getCategory() == 4) {
            specSauce = item;
            JOptionPane.showMessageDialog(frame, "Selected your sauce!");
            sauceForm.setText("Sauce: " + item.getName());
        }
        int[] bPrice = new int[4];
        bPrice[0] = bPrice[1] = bPrice[2] = bPrice[3] = 0;
        if (specBase != null) bPrice[0] = specBase.getPrice();
        if (specFruit != null) bPrice[1] = specFruit.getPrice();
        if (specTopping != null) bPrice[2] = specTopping.getPrice();
        if (specSauce != null) bPrice[3] = specSauce.getPrice();

        specPrice = bPrice[0] + bPrice[1] + bPrice[2] + bPrice[3];

        double[] bCalories = new double[4];
        bCalories[0] = bCalories[1] = bCalories[2] = bCalories[3] = 0;
        if (specBase != null) bCalories[0] = specBase.getCalories();
        if (specFruit != null) bCalories[1] = specFruit.getCalories();
        if (specTopping != null) bCalories[2] = specTopping.getCalories();
        if (specSauce != null) bCalories[3] = specSauce.getCalories();

        specCalories = bCalories[0] + bCalories[1] + bCalories[2] + bCalories[3];

        caloriesForm.setText("Calories: " + specCalories);
        priceForm.setText("Price: " + specPrice);

    }
}