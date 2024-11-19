import java.util.Random;
import java.util.Scanner;

public class SiITYou extends Kingdom {
    private Kamadan kamadan;
    private Altreia altreia;

    public SiITYou(Kamadan kamadan, Altreia altreia) {
        super("Si IT You", kamadan, altreia); 
        this.kamadan = kamadan;
        this.altreia = altreia;
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
        System.out.println("\nYou have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }

    final String WHITE = "\u001B[97m";
    final String RED = "\u001B[31m";   
    final String GREEN = "\u001B[32m";  
    final String BLUE = "\u001B[34m";   
    final String GRAY = "\u001B[90m";   
    final String RESET = "\u001B[0m";   
    final String YELLOW = "\u001B[33m";
    final String PURPLE = "\u001B[35m"; 
    final String DARK_BLUE = "\u001B[94m"; 
    final String VIOLET = "\u001B[95m"; 
    final String ORANGE = "\u001B[38;5;202m"; 
    final String LIGHT_GREEN = "\u001B[38;5;10m"; 
    @Override
    public void enter() {
        System.out.println("\t\t\t\t\tWelcome to " + name + ", the land of coding challenges!");
        System.out.println();
        System.out.println(YELLOW+"                                                                1"+YELLOW+"111                                          ");
        System.out.println(YELLOW+"                                                                1                                          ");
        System.out.println(GRAY+"                                                              1"+RED+"1100"+GRAY+"1                                                              ");
        System.out.println(RED+"                                                            1100"+WHITE+"01"+RED+"0001                                                           "+RESET);
        System.out.println(GRAY+"          0101110111110001011111100100011000010011100000110"+RED+"11"+WHITE+"00010100"+RED+"1101"+GRAY+"010100110101000011001011111111111110000000001          "+RESET);                                          
        System.out.println(GRAY+"        101011111111001011110001011001100001110000100111"+RED+"100"+WHITE+"01101000100"+RED+"01111"+GRAY+"10101101111011010100001100110001010001111010001    "+RESET);
        System.out.println(GRAY+"     111100010010110101000100001110011010001000010100"+RED+"10110"+WHITE+"11010101111101"+RED+"1000"+GRAY+"01101100001111101111100111110011010010100110101                      ");
        System.out.println(GRAY+"  0100010100100011110010101110111001100001110101100"+RED+"011001"+WHITE+"1110100100000011"+RED+"1011"+GRAY+"100001111110101100111110010110110011011011111000");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100100100001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      111"+RED+"101010100100010000001011001011100100000001011100110001110111011110100100001011011100011101100111011110110011000"+YELLOW+"000");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"00000"+BLUE+"01"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"0000001"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"0000001"+RED+"111000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100"+BLUE+"1001"+RED+"00001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      011"+RED+"110"+BLUE+"0110"+RED+"11000"+BLUE+"000"+RED+"1010"+BLUE+"0111"+RED+"0010"+BLUE+"111"+RED+"01110"+BLUE+"010"+RED+"11000"+BLUE+"1101"+RED+"00"+YELLOW+"0"+RED+"000"+BLUE+"000111"+RED+"1000"+YELLOW+"0"+RED+"0"+BLUE+"00"+RED+"10001"+BLUE+"001"+RED+"01011"+BLUE+"100"+RED+"00010"+BLUE+"101"+RED+"100000"+BLUE+"000"+RED+"1011"+BLUE+"101"+RED+"0100"+YELLOW+"110");
        System.out.println(YELLOW+"      110"+RED+"000010010100011010000001010101101100101010100101110100100100001101111101101100000001101111100011011110110011101"+YELLOW+"011");
        System.out.println(YELLOW+"      111"+RED+"1010101001000100000"+GREEN+"0101100101110010000000"+RED+"1011100110"+WHITE+"0011101110"+RED+"111101001000"+GREEN+"01011011100011101"+RED+"100111011110110011000"+YELLOW+"000"+RESET);
    }

    @Override
    public void startQuest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Altreia objAltreia = getAltreia();
        Kamadan objKamadan = getKamadan();
        Palangga objPalangga = new Palangga();
        StoryLine objStoryLine = new StoryLine();

        Enemy[] enemies = {
            new Ada(),
            new Turing()
        };
    
            for (int i = 0; i<enemies.length; i++) {
                Enemy enemy = enemies[i];
                boolean upgradeDone = false;
                int roundCounter = 1;
                int choiceCharacter = 0;
                
                while (enemy.getHealth() > 0 && (objKamadan.getHealth() > 0 || objAltreia.getHealth() > 0 || objPalangga.getHealth() > 0)) {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + "    | Mana: " + objKamadan.getMana() + "     | Syntax Sleuth | Logic Master         | Loop Ninja       | Mana Regeneration  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + "    | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield         | Syntax Strike    | Mana Regeneration  |");
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
                            System.out.println("2. Altreia");
                            System.out.println("3. Palangga");

    
                        try {
                            System.out.print("Enter choice (1 or 2 or 3): ");
                            choiceCharacter = scanner.nextInt();
                            if ((choiceCharacter == 1 && objKamadan.getHealth() > 0) || (choiceCharacter == 2 && objAltreia.getHealth() > 0) || (choiceCharacter == 3 && objPalangga.getHealth() > 0)) {
                                break;
                            } else {
                                System.out.println("Invalid choice. Please choose a character that exists.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                            scanner.next();
                        }
                    }
    
                    int choiceAttack = 0;
                    while (choiceAttack < 1 || choiceAttack > 4) {
                        
                        if (choiceCharacter == 1) {
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
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
                        } else if(choiceCharacter == 2){
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                            System.out.println("------------------------------------------"+RESET);
                            System.out.println("Round: " + roundCounter);
                            System.out.println("You have entered as \'Altreia\'");
                            System.out.print("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "\n");
                            System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());
    
                            System.out.println("\nChoose your attack:");
                            System.out.println("1. Code Catalyst (20 damage, 15 mana)");
                            System.out.println("2. Focus Shield (35 damage, 50 mana)");
                            System.out.println("3. Syntax Strike (45 damage, 70 mana)");
                            System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                        }else{
                            System.out.println("\n------------------------------------------");
                            System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                            System.out.println("------------------------------------------"+RESET);
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
                            choiceAttack = scanner.nextInt();
                            if (choiceAttack < 1 || choiceAttack > 4) {
                                System.out.println("Invalid Attack! Please enter a number between 1 and 4!");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                            scanner.next();
                        }
                    }
    
           
                    int attackDamage;
    
                    if (choiceCharacter == 1) {
                        attackDamage = objKamadan.attack(choiceAttack);
                    } else if(choiceCharacter == 2){
                        attackDamage = objAltreia.attack(choiceAttack);
                    }else{
                        attackDamage = objPalangga.attack(choiceAttack);
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
                        int enemySkill = random.nextInt(2);
                        int enemyDamage;
                        String skillUsed;
                        
                       if(i == 0){
                            if(enemySkill == 0){
                                enemyDamage = random.nextInt(31);
                                skillUsed = enemy.getSkill1();
                            }else {
                                enemyDamage = random.nextInt(41);
                                skillUsed = enemy.getSkill2();
                            } 
                       }else{
                            if(enemySkill == 0){
                                enemyDamage = random.nextInt(26);
                                skillUsed = enemy.getSkill1();
                            }else {
                                enemyDamage = random.nextInt(41);
                                skillUsed = enemy.getSkill2();
                            } 
                       }
                        
                        simulateTyping(enemy.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
    
    
                        if (choiceCharacter == 1) {
                            objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                            if(objKamadan.getHealth() < 0){
                                System.out.println("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objKamadan.setHealth(0);
                            }
                        } else if(choiceCharacter == 2){
                            objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                            if(objAltreia.getHealth() < 0){
                                System.out.println("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objAltreia.setHealth(0);
                            }
                        } else{
                            objPalangga.setHealth(objPalangga.getHealth() - enemyDamage);
                            if(objPalangga.getHealth() < 0){
                                System.out.println("Palangga collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                                objPalangga.setHealth(0);
                            }
                        }
                    }
    
                    if (objKamadan.getHealth() <= 0 && objAltreia.getHealth() <= 0) {
                        simulateTyping("Both Kamadan and Altreia collapse to the ground, their vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objStoryLine.gameover();
                        System.exit(0);
                    }
    
                    roundCounter++;
                }
                
                if (choiceCharacter == 1 && objKamadan.getHealth() > 0 && objAltreia.getHealth() <= 0 && objPalangga.getHealth() > 0) {
                    simulateTyping("With one final strike, Kamadan and Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
                } else if(choiceCharacter == 2 && objAltreia.getHealth() > 0 && objKamadan.getHealth() <= 0 && objPalangga.getHealth() > 0) {
                    simulateTyping("With one final strike, Altreia and Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " staggers back, muttering in defeat...\n");
                }else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()<=0 && objAltreia.getHealth()<=0){
                    simulateTyping("With one final strike, Palangga has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                } else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()<=0 && objAltreia.getHealth()>0){
                    simulateTyping("With one final strike, Palangga and Altreia has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }else if(choiceCharacter == 3 && objPalangga.getHealth() > 0 && objKamadan.getHealth()>0 && objAltreia.getHealth()<=0){
                    simulateTyping("With one final strike, Palangga and Kamadan has defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }
                else{
                    simulateTyping("With one final strike, Kamadan, Altreia, and Palangga have defeated " + enemy.getName() + ". " + enemy.getName() + " stagger back, muttering in defeat...\n");
                }
    
                if(!upgradeDone){
                    int upgradeChoice;
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + "    | Mana: " + objKamadan.getMana() + "     | Syntax Sleuth | Logic Master         | Loop Ninja       | Mana Regeneration  |");
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + "    | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield         | Syntax Strike    | Mana Regeneration  |");
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
                                System.out.println("Invalid Choice. Please Try Again.");
                                upgrade();    
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid Input. Please Try Again.");
                            upgrade();
                            scanner.next(); // Clear the invalid input
                        }
                    }
                
                    while (true) {
                        try {
                            simulateTyping("Who do you want to upgrade?\n");
                            System.out.println("1. Kamadan");
                            System.out.println("2. Altreia");
                            System.out.println("3. Palangga");
                            System.out.print("Enter choice: ");
                            chooseCharacter = scanner.nextInt();

                            if (chooseCharacter == 1) {
                                if (objKamadan.getHealth() > 0) {
                                    if (upgradeChoice == 1) { // Health upgrade
                                        objKamadan.setHealth(objKamadan.getHealth() + 50);
                                        if(objKamadan.getHealth() > 250){
                                            objKamadan.setHealth(250);
                                        }
                                        simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
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
                                if (objAltreia.getHealth() > 0) {
                                    if (upgradeChoice == 1) { 
                                        objAltreia.setHealth(objAltreia.getHealth() + 50);
                                        if(objAltreia.getHealth() > 230){
                                            objAltreia.setHealth(230);
                                        }
                                        simulateTyping("Altreia increases her HEALTH! UPDATED HEALTH: " + objAltreia.getHealth());
                                    } else if (upgradeChoice == 2) { 
                                        objAltreia.setMana(objAltreia.getMana() + 50);
                                        if(objAltreia.getMana() > 250){
                                            objAltreia.setMana(250);
                                        }
                                        simulateTyping("Altreia increases her MANA! UPDATED MANA: " + objAltreia.getMana());
                                    }
                                    break;
                                } else {
                                    System.out.println("Altreia has already been defeated. Upgrades cannot be applied.");
                                }
                            } else if(chooseCharacter == 3){
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
    
            objStoryLine.thirdNarration();
            objStoryLine.questThree();
        }
    }