import java.util.Random;
import java.util.Scanner;

public class ThirdStreet extends Kingdom {
    Scanner scanner = new Scanner(System.in);
    private Kamadan kamadan;
    private Altreia altreia;

    public ThirdStreet(Kamadan kamadan, Altreia altreia) {
        super("Third Street", kamadan, altreia);
        this.kamadan = kamadan;
    }

    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }

    private static void upgrade() {
        System.out.println("You have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }
    final String WHITE = "\u001B[97m";
            final String RED = "\u001B[31m";    
            final String GREEN = "\u001B[32m";  
            final String BLUE = "\u001B[34m";  
            final String RESET = "\u001B[0m";   
            final String YELLOW = "\u001B[33m"; 
            final String PURPLE = "\u001B[35m"; 
            final String DARK_BLUE = "\u001B[94m"; 
            final String VIOLET = "\u001B[95m"; 
            final String ORANGE = "\u001B[38;5;202m"; 
            final String LIGHT_GREEN = "\u001B[38;5;10m"; 
            
    @Override
    public void enter() {
        System.out.println("\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
        System.out.println();
        System.out.println(PURPLE+"                          0000111101011100001000010"); 
        System.out.println(YELLOW+"                          001011000010000101"+RED+"0011101");
        System.out.println(VIOLET+"               1100000    "+YELLOW+"1111001110011001101001110101101000101101001");
        System.out.println("               1100000    "+RED+"1111001110011001101001"+YELLOW+"110101101000101101001");
        System.out.println(YELLOW+"               1100000    "+RED+"1111001110011001101001"+VIOLET+"1101011010001011010011"+RED+"1000101100010100001010000110100101"+GREEN+"000100010001");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"10110110010"+RED+"0101010010001001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"0000101"+ORANGE+"10010110"+RED+"011101111011100110000"+LIGHT_GREEN+"1011100110000");
        System.out.println(ORANGE+"         11"+BLUE+"00"+ORANGE+"1110"+RED+"1011"+ORANGE+"10110110010"+RED+"0101010010001001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+DARK_BLUE+"101"+ORANGE+"10"+RED+"0111"+DARK_BLUE+"011"+RED+"11011"+DARK_BLUE+"100"+RED+"110"+BLUE+"000"+LIGHT_GREEN+"10111001100001");
        System.out.println(ORANGE+"         11"+BLUE+"00"+ORANGE+"1110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+DARK_BLUE+"101"+ORANGE+"10"+RED+"0111"+DARK_BLUE+"011"+RED+"11011"+DARK_BLUE+"100"+RED+"11"+LIGHT_GREEN+"100001011100110000");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+BLUE+"111011001011110111"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+YELLOW+"011"+RED+"11011"+YELLOW+"100"+RED+"1"+LIGHT_GREEN+"1000010111001100001");
        System.out.println(ORANGE+"         100011111010110010011010111000001100010"+ORANGE+"1110010111101000110100"+RED+"11101110"+ORANGE+"1000111"+RED+"0100101010010101"+GREEN+"0001011100011010101");
        System.out.println(ORANGE+"         101110111000101000010000000111100101111001100100000101101010110111010001001010011111110000"+GREEN+"1001100110100111100111");
        System.out.println(ORANGE+"         001011011000010101110111110110010110110"+VIOLET+"1100111011101100000001"+ORANGE+"0000011111101000011000011101"+GREEN+"110110011000111111001111");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"1110110010111101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111011"+RED+"11011100"+RED+"1"+LIGHT_GREEN+"1000010111001100001111");
        System.out.println(ORANGE+"         11"+BLUE+"001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"10110010111101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+BLUE+"011"+RED+"11011"+BLUE+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         11"+BLUE+"001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"1011"+YELLOW+"00101"+BLUE+"11101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+BLUE+"011"+RED+"11011"+BLUE+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         11001110"+RED+"1011"+ORANGE+"101101"+BLUE+"10010"+RED+"01010"+BLUE+"1001000"+RED+"1001"+VIOLET+"11"+RED+"11"+BLUE+"1011"+YELLOW+"00101"+BLUE+"11101"+RED+"11"+VIOLET+"00"+RED+"00000101"+ORANGE+"00"+ORANGE+"101"+ORANGE+"10"+RED+"0111"+YELLOW+"011"+RED+"11011"+YELLOW+"100"+RED+"11000"+YELLOW+"      0110");
        System.out.println(ORANGE+"         00101101"+GREEN+"1000010101110111110110010110110"+VIOLET+"11"+WHITE+"001110111011000000"+VIOLET+"01"+GREEN+"0000011111101000011000011101"+RED+"110110"+GREEN+"0110001"+YELLOW+"0110"+GREEN+"1001111"+RESET);
    }

    @Override
    public void startQuest() {
    Random random = new Random();
    Kamadan objKamadan = getKamadan();
    Palangga objPalangga = new Palangga();

    StoryLine objStoryLine = new StoryLine();
    Enemy[] enemies = {
            new Boozy(),
            new Sloshed(),
            new Jager()
    };

    for (int i = 0; i < enemies.length; i++) {
        Enemy enemy = enemies[i];
        int roundCounter = 1;
        int choiceCharacter = 0;
        boolean upgradeDone = false;
        

        while (enemy.getHealth() > 0 && (objKamadan.getHealth() > 0 || objPalangga.getHealth() > 0)) {
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + "    | Mana: " + objKamadan.getMana() + "     | Syntax Sleuth | Logic Master         | Loop Ninja       | Mana Regeneration  |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      Palangga's HP: " + objPalangga.getHealth() + "  | Mana: " + objPalangga.getMana() + "    | LoveyDovey    | Nikaon Naka, Langga? | Tulog Na, Langga | I Love You, Langga |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
        
            while (true) {
                if(roundCounter > 1){
                System.out.println("\nChoose your character to attack for the next round:");
                }else{
                    System.out.println("\nChoose your character to attack:");
                }

                    System.out.println("1. Kamadan");
                    System.out.println("2. Palangga");

                try {
                    System.out.print("Enter choice (1 or 2): ");
                    choiceCharacter = scanner.nextInt();
                    if ((choiceCharacter == 1 && objKamadan.getHealth() > 0) || (choiceCharacter == 2 && objPalangga.getHealth() > 0)) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please choose a character that exists.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }

            int choice = 0;
            while (choice < 1 || choice > 4) {
                if (choiceCharacter == 1) {
                    System.out.println("\n------------------------------------------");
                    System.out.println("|"+ORANGE+"           THIRDSTREET KINGDOM     "+RESET+"     |");
                    System.out.println("------------------------------------------");
                    System.out.println("Round: " + roundCounter);
                    System.out.println("You have entered as \'Kamadan\'");
                    System.out.print("Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " + objKamadan.getMana() + "\n");
                    System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());

                    System.out.println("\nChoose your attack:");
                    System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                    System.out.println("2. Logic Master (40 damage, 60 mana)");
                    System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                    System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                } else {
                    System.out.println("\n------------------------------------------");
                    System.out.println("|"+YELLOW+"           THIRDSTREET KINGDOM          "+RESET+"|");
                    System.out.println("------------------------------------------");                    
                    System.out.println("Round: " + roundCounter);
                    System.out.println("You have entered as \'Palangga\'");
                    System.out.print("Palangga's HP: " + objPalangga.getHealth() + " | Mana: " + objPalangga.getMana() + "\n");
                    System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());

                    System.out.println("\nChoose your attack:");
                    System.out.println("1. LoveyDovey (1000 damage, 0 mana)");
                    System.out.println("2. Nikaon Naka, Langga? (1000 damage, 0 mana)");
                    System.out.println("3. Tulog Na, Langga (1000 damage, 0 mana)");
                    System.out.println("4. I Love You, Langa (1000 damage, +20 mana)");
                }
                try {
                    System.out.print("\nEnter Attack: ");
                    choice = scanner.nextInt();
                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid Attack! Please enter a number between 1 and 4!");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }

            int attackDamage;
    
                    if (choiceCharacter == 1) {
                        attackDamage = objKamadan.attack(choice);
                    } else {
                        attackDamage = objPalangga.attack(choice);
                    }
    
                    if (attackDamage >= 0) {
                        enemy.setHealth(enemy.getHealth() - attackDamage);
                        if(enemy.getHealth() < 0){
                            enemy.setHealth(0);
                        }
                        System.out.println("You deal " + attackDamage + " damage to " + enemy.getName() + "!");
                    } else if (attackDamage == -1) {
                        simulateTyping("Invalid choice!");
                    } else {
                        System.out.println("Not enough mana! You cannot attack.");
                    }
            
            if (enemy.getHealth() > 0) {
                    int enemySkill = random.nextInt(1);
                    int enemyDamage = 0;
                    String skillUsed = " ";
                            
                           if(i == 0){
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(21);
                                    skillUsed = enemy.getSkill1();
                                }
                           }else if(i == 1){
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(41);
                                    skillUsed = enemy.getSkill1();
                                }
                           }else{
                                if(enemySkill == 0){
                                    enemyDamage = random.nextInt(36);
                                    skillUsed = enemy.getSkill1();
                                }
                            }
    
                simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                
                if (choiceCharacter == 1) {
                    objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                    if(objKamadan.getHealth() < 0){
                        System.out.println("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objKamadan.setHealth(0);
                    }
                } else {
                    objPalangga.setHealth(objPalangga.getHealth() - enemyDamage);
                    if(objPalangga.getHealth() < 0){
                        System.out.println("Palangga collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objPalangga.setHealth(0);
                    }
                }
            }
            roundCounter++;
        }

        if (choiceCharacter == 1 && objKamadan.getHealth() > 0 && objPalangga.getHealth() <= 0) {
            simulateTyping("With one final strike, Kamadan has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
        } else if(choiceCharacter == 2 && objPalangga.getHealth() > 0 && objKamadan.getHealth() <= 0) {
            simulateTyping("With one final strike, Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
        }else {
            simulateTyping("With one final strike, Kamadan and Palangga have defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
        }

        if(!upgradeDone){
            int upgradeChoice;
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + "    | Mana: " + objKamadan.getMana() + "     | Syntax Sleuth | Logic Master         | Loop Ninja       | Mana Regeneration  |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
            System.out.print("|      Palangga's HP: " + objPalangga.getHealth() + "  | Mana: " + objPalangga.getMana() + "    | LoveyDovey    | Nikaon Naka, Langga? | Tulog Na, Langga | I Love You, Langga |");
            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");

            upgrade();

            int chooseCharacter = 0;
            upgradeChoice = 0;
            while (true) {
                try {
                    upgradeChoice = scanner.nextInt();
        
                    if (upgradeChoice == 1 || upgradeChoice == 2) {
                        break; // Valid choice for upgrade
                    } else {
                        System.out.println("Invalid Choice. Please Try Again.\n");
                        upgrade();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input. Please Try Again.\n");
                    upgrade();
                    scanner.next(); // Clear the invalid input
                }
            }
        
            while (true) {
                try {
                    simulateTyping("\nWho do you want to upgrade?\n");
                    System.out.println("1. Kamadan");
                    System.out.println("2. Palangga");
                    System.out.print("Enter choice: ");
                    chooseCharacter = scanner.nextInt();

                    if (chooseCharacter == 1) {
                        if (objKamadan.getHealth() > 0) {
                            if (upgradeChoice == 1) { // Health upgrade
                                objKamadan.setHealth(objKamadan.getHealth() + 50);
                                if(objKamadan.getHealth() > 250){
                                    objKamadan.setHealth(250);
                                }
                                simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + objKamadan.getHealth());
                            } else if (upgradeChoice == 2) { // Mana upgrade
                                objKamadan.setMana(objKamadan.getMana() + 50);
                                if(objKamadan.getMana() > 200){
                                    objKamadan.setMana(200);
                                }
                                simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + objKamadan.getMana());
                            }
                            break;
                        } else {
                            System.out.println("Kamadan has already been defeated. Upgrades cannot be applied.\n");
                        }
                    } else if (chooseCharacter == 2) {
                        if (objPalangga.getHealth() > 0) {
                            if (upgradeChoice == 1) { 
                                objPalangga.setHealth(objPalangga.getHealth() + 50);
                                if(objPalangga.getHealth() > 1000){
                                    objPalangga.setHealth(1000);
                                }
                                simulateTyping("Palangga increases her HEALTH! UPDATED HEALTH: " + objPalangga.getHealth());
                            } else if (upgradeChoice == 2) { 
                                objPalangga.setMana(objPalangga.getMana() + 50);
                                if(objPalangga.getMana() > 1000){
                                    objPalangga.setMana(1000);
                                }
                                simulateTyping("Palangga increases her MANA! UPDATED MANA: " + objPalangga.getMana());
                            }
                            break;
                        } else {
                            System.out.println("Palangga has already been defeated. Upgrades cannot be applied.");
                        }
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }
        }
    }

    if(objKamadan.getHealth() > 0 && objPalangga.getHealth() > 0){
        simulateTyping("\nKamadan and Palangga stands victorious. The streets are quiet now.");
        simulateTyping("Kamadan takes a deep breath while Palangga smirks lazily, and they both prepare for the next trial.");
    }else{
        simulateTyping("\nPalangga stands victorious. The streets are quiet now.");
        simulateTyping("\"Palangga smirks lazily, effortlessly preparing for the next trial.");
    }

    System.out.println();
    System.out.println("============================================================================================================================");

    objStoryLine.unlockKey();
    boolean isTrue = false;

    while (!isTrue) {
        try {
            int enteredGate = objStoryLine.enterGate();
            if (enteredGate == 143) {
                isTrue = true;
                System.out.println("||                                                 Access granted. Welcome!                                               ||");
                System.out.println("============================================================================================================================");
            } else {
                System.out.println("||                                                  Incorrect ID! Try again.                                              ||");
                System.out.println("============================================================================================================================");
            }
        } catch (Exception e) {
            System.out.println("||                                             Invalid input! Please enter a valid number.                                 ||");
            System.out.println("============================================================================================================================");
            scanner.next();
        }
    }
    objStoryLine.secondNarration();
    objStoryLine.questTwo();
    }
}