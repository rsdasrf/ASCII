import java.util.Random;
import java.util.Scanner;

public class SiCS extends Kingdom {
    private Kamadan kamadan;
    private Altreia altreia;

    public SiCS(Kamadan kamadan, Altreia altreia) {
        super("Si CS", kamadan, altreia); 
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
        System.out.println("You have leveled up! Choose an upgrade:");
        System.out.println("1. Increase MAXIMUM HEALTH (+50)");
        System.out.println("2. Increase MAXIMUM MANA (+50)");

        System.out.print("Enter your choice: ");
    }

    private static void resetStats(Kamadan objKamadan, Altreia objAltreia, Shang objShang){
        objKamadan.setHealth(250);
        objKamadan.setMana(200);
        objAltreia.setHealth(230);
        objAltreia.setMana(250);
        objShang.setHealth(280);
        objShang.setMana(250);
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
        System.out.println(GREEN+"                                                                              111001000110                          ");
        System.out.println(GREEN+"                                                011010                       001110000010001                          ");
        System.out.println(GREEN+"              00010100                        0110100010                    10001011101000001                                10100");
        System.out.println(GREEN+"             01100110110                     1011011110100                 1100100011001011010                              001010");
        System.out.println(GREEN+"            0110011011000                  0101101111010000               1111001000110010111001                           1001010");
        System.out.println(GREEN+"           1011001100110110               100010110111101000             0111100100011001011010101       "+YELLOW+"  11"+BLUE+"1111"+GREEN+"         12001010");
        System.out.println(GREEN+"          01101000100010010001    "+BLUE+"010"+GREEN+"01101111100000101010010"+GRAY+"1000101110"+GREEN+"11010001011111110110100001010       "+YELLOW+" 11"+RED+"1111"+GREEN+"      11010010111");
        System.out.println(GREEN+"        10100010000000000100011  "+BLUE+"10110"+GREEN+"111101000000"+RED+"0111101101111110010"+BLUE+"01"+GREEN+"0010011111101100100111100"+BLUE+"1110"+GREEN+"      "+YELLOW+" 11         "+GREEN+" 10100011000");
        System.out.println(GREEN+"        111010100000011100000101"+BLUE+" 00000"+GREEN+"100111101011"+RED+"1000011011000110111"+BLUE+"001"+GREEN+"000010010001111100010010"+BLUE+"0000"+GREEN+"       "+YELLOW+"10        "+GREEN+" 011101100101");
        System.out.println(GREEN+"        000001010101101111100"+YELLOW+"101100111000001110101"+RED+"0000110101010010111"+YELLOW+"1111"+YELLOW+"0100110000110110111011001001001011110"+GREEN+"     100101111000011");
        System.out.println(GREEN+"        1000011000110001001"+RED+"100001010100000011001010111011111000101101110010011001100101010100010001000111011"+BLUE+"01"+GREEN+"   11100111101100110");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"1011"+GRAY+"110"+RED+"1010"+GRAY+"100"+RED+"10001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"110"+BLUE+"01"+GREEN+"   00011010010100111");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"1011"+GRAY+"110"+RED+"1010"+GRAY+"100"+RED+"10001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"110"+BLUE+"01"+GREEN+"   00011010010100111");
        System.out.println(GREEN+"        000001010101101111100"+YELLOW+"101100111000001110101"+RED+"0000110101010010111"+YELLOW+"1111"+YELLOW+"0100110000110110111011001001001011110"+GREEN+"  001100101111000011");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"101"+WHITE+"11101010100"+WHITE+"1"+RED+"0001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"11001"+GREEN+"11100011010010100111");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"101"+WHITE+"1110"+GRAY+"1010"+WHITE+"100"+WHITE+"1"+RED+"0001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"110"+BLUE+"01"+GREEN+"11100011010010100111");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"101"+WHITE+"1110"+GRAY+"1010"+WHITE+"1001"+RED+"0001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"11"+GREEN+"00111100011010010100111");
        System.out.println(GREEN+"        0011111110000100100"+GRAY+"010"+RED+"01100"+GRAY+"001"+RED+"000"+GRAY+"010"+RED+"0000"+GRAY+"1001"+RED+"101"+WHITE+"1110"+GRAY+"1010"+WHITE+"1001"+RED+"0001"+GRAY+"000"+RED+"10011"+GRAY+"110"+RED+"00000"+GRAY+"100"+RED+"1011"+GRAY+"001"+RED+"0111"+GRAY+"0001"+RED+"11"+GREEN+"00111100011010010100111");
        System.out.println(WHITE+"        10000110001"+GREEN+"000100110000101010000001"+WHITE+"110010101110111110001011011100100110011001010101000100010001110110111100111101100110111");
        System.out.println(WHITE+"        100001100011000100110000101010000001100101011101111100010110111001001100110010101010"+GREEN+"00100010001110110111100111101100110111"+RESET);
    }

    @Override
        public void startQuest(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StoryLine objStoryLine = new StoryLine();
        Altreia objAltreia = getAltreia();
        Kamadan objKamadan = getKamadan();
        Khaiamanan objKhaiamanan = new Khaiamanan();
        Shang objShang = new Shang();
        Main objMain = new Main();
        ThirdStreet objThirdStreet = new ThirdStreet(objKamadan, objAltreia);
        SiITYou objSiITYou = new SiITYou(objKamadan, objAltreia);
        SiCS objSiCS = new SiCS(objKamadan, objAltreia);
        Palangga objPalangga = new Palangga();

        int choiceCharacter = 0;

        
        while (objKhaiamanan.getHealth() > 0) {
            int roundCounter = 1;

            choiceCharacter = 0;

            while (objKhaiamanan.getHealth() > 0 && (objKamadan.getHealth() > 0 || objAltreia.getHealth() > 0 || objShang.getHealth() > 0)) {
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                System.out.print("|      Kamadan's HP: " + objKamadan.getHealth() + "    | Mana: " + objKamadan.getMana() + "     | Syntax Sleuth | Logic Master         | Loop Ninja       | Mana Regeneration  |");
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                System.out.print("|      Altreia's HP: " + objAltreia.getHealth() + "    | Mana: " + objAltreia.getMana() + "     | Code Catalyst | Focus Shield         | Syntax Strike    | Mana Regeneration  |");
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                System.out.print("|      Shang's HP: " + objShang.getHealth() + "      | Mana: " + objShang.getMana() + "     | Barrier Boost | Skill Swap           | Pathfinder       | Mana Regeneration  |");
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
                        System.out.println("3. Shang");
                        System.out.println("4. Palangga");
                
                    try {
                        System.out.print("Enter choice (1 or 2 or 3 or 4): ");
                        choiceCharacter = scanner.nextInt();
                        if ((choiceCharacter == 1 && objKamadan.getHealth() > 0) || (choiceCharacter == 2 && objAltreia.getHealth() > 0) || (choiceCharacter == 3 && objShang.getHealth() > 0) || (choiceCharacter == 4 && objPalangga.getHealth() > 0)) {
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

                while (choiceAttack < 1 || choiceAttack > 5) {
                    if (choiceCharacter == 1) {
                        System.out.println("\n------------------------------------------");
                        System.out.println("|"+YELLOW+"              SICS KINGDOM              "+RESET+"|");
                        System.out.println("------------------------------------------");
                        System.out.println("Round: " + roundCounter);
                        System.out.println("You have entered as \'Kamadan\'");
                        System.out.print("Kamadan's HP: " + objKamadan.getHealth() + " | Mana: " + objKamadan.getMana() + "\n");
                        System.out.println(objKhaiamanan.getName() + "'s HP: " + objKhaiamanan.getHealth());

                        System.out.println("\nChoose your attack:");
                        System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                        System.out.println("2. Logic Master (40 damage, 60 mana)");
                        System.out.println("3. Loop Ninja (30 damage, 20 mana)");
                        System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                    } else if (choiceCharacter == 2) {
                        System.out.println("\n------------------------------------------");
                        System.out.println("|"+YELLOW+"              SICS KINGDOM              "+RESET+"|");
                        System.out.println("------------------------------------------");
                        System.out.println("Round: " + roundCounter);
                        System.out.println("You have entered as \'Altreia\'");
                        System.out.print("Altreia's HP: " + objAltreia.getHealth() + " | Mana: " + objAltreia.getMana() + "\n");
                        System.out.println(objKhaiamanan.getName() + "'s HP: " + objKhaiamanan.getHealth());

                        System.out.println("\nChoose your attack:");
                        System.out.println("1. Code Catalyst (20 damage, 15 mana)");
                        System.out.println("2. Focus Shield (35 damage, 50 mana)");
                        System.out.println("3. Syntax Strike (45 damage, 70 mana)");
                        System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                    } else if(choiceCharacter == 3){
                        System.out.println("\n------------------------------------------");
                        System.out.println("|"+YELLOW+"              SICS KINGDOM              "+RESET+"|");
                        System.out.println("------------------------------------------");
                        System.out.println("Round: " + roundCounter);
                        System.out.println("You have entered as \'Shang\'");
                        System.out.print("Shang's HP: " + objShang.getHealth() + " | Mana: " + objShang.getMana() + "\n");
                        System.out.println(objKhaiamanan.getName() + "'s HP: " + objKhaiamanan.getHealth());

                        System.out.println("\nChoose your attack:");
                        System.out.println("1. Barrier Boost (25 damage, 40 mana)");
                        System.out.println("2. Skill Swap (40 damage, 60 mana)");
                        System.out.println("3. Pathfinder (50 damage, 70 mana)");
                        System.out.println("4. Mana Regeneration (15 damage, +20 mana)");
                    } else {
                        System.out.println("\n------------------------------------------");
                        System.out.println("|"+YELLOW+"             SIITYOU KINGDOM            "+RESET+"|");
                        System.out.println("------------------------------------------");
                        System.out.println("Round: " + roundCounter);
                        System.out.println("You have entered as \'Palangga\'");
                        System.out.print("Palangga's HP: " + objPalangga.getHealth() + " | Mana: " + objPalangga.getMana() + "\n");
                        System.out.println(objKhaiamanan.getName() + "'s HP: " + objKhaiamanan.getHealth());

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
                            System.out.println("Invalid Attack! Please enter a number between 1 and 4.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        scanner.next();
                    }
                }

                int attackDamage;
                if (choiceCharacter == 1) {
                    attackDamage = objKamadan.attack(choiceAttack);
                } else if (choiceCharacter == 2) {
                    attackDamage = objAltreia.attack(choiceAttack);
                } else if (choiceCharacter == 3){
                    attackDamage = objShang.attack(choiceAttack);
                } else{
                    attackDamage = objPalangga.attack(choiceAttack);
                }

                if (attackDamage >= 0) {
                    objKhaiamanan.setHealth(objKhaiamanan.getHealth() - attackDamage);
                    if(objKhaiamanan.getHealth() < 0){
                        objKhaiamanan.setHealth(0);
                    }
                    System.out.println("You deal " + attackDamage + " damage to " + objKhaiamanan.getName() + "!");
                } else if (attackDamage == -1) {
                    simulateTyping("Invalid choice!");
                } else {
                    System.out.println("Not enough mana! You cannot attack.");
                }

                int enemyDamage = 0;

                if (objKhaiamanan.getHealth() > 0) {
                    int skillChoice = random.nextInt(3); 
                    String skillUsed = "";

                    if (skillChoice == 0) {
                        enemyDamage = random.nextInt(46); 
                        skillUsed = "Cycle Trap";
                    } else if (skillChoice == 1) {
                        enemyDamage = random.nextInt(56); 
                        skillUsed = "Surge";
                    } else if (skillChoice == 2) {
                        enemyDamage = random.nextInt(71); 
                        skillUsed = "Error Spike";
                    }
                    System.out.println(objKhaiamanan.getName() + " uses " + skillUsed + "! It deals " + enemyDamage + " damage.");
                }

                if (choiceCharacter == 1) {
                    objKamadan.setHealth(objKamadan.getHealth() - enemyDamage);
                    if (objKamadan.getHealth() < 0) {
                        System.out.println("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objKamadan.setHealth(0);
                    }
                } else if (choiceCharacter == 2) {
                    objAltreia.setHealth(objAltreia.getHealth() - enemyDamage);
                    if (objAltreia.getHealth() < 0) {
                        System.out.println("Altreia collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objAltreia.setHealth(0);
                    }
                } else if(choiceCharacter == 3){
                    objShang.setHealth(objShang.getHealth() - enemyDamage);
                    if (objShang.getHealth() < 0) {
                        System.out.println("Shang collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objShang.setHealth(0);
                    }
                } else{
                    objPalangga.setHealth(objPalangga.getHealth() - enemyDamage);
                    if(objPalangga.getHealth() < 0){
                        System.out.println("Palangga collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                        objPalangga.setHealth(0);
                    }
                }
                
                if (objKamadan.getHealth() <= 0 && objAltreia.getHealth() <= 0 && objShang.getHealth() <= 0) {
                    System.out.println("Kamadan, Altreia, and Shang have collapse to the ground, their vision fading. The laughter of her foes echoes as the screen fades to black...");
                    objStoryLine.gameover();
                    break;
                }
                roundCounter++;
            }
                if (objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() > 0 && objAltreia.getHealth() <= 0 && objShang.getHealth() <= 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Kamadan and Palangga have defeated " + objKhaiamanan.getName() + "!");
                } else if (objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() <= 0 && objAltreia.getHealth() > 0 && objShang.getHealth() <= 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Altreia and Palangga have defeated " + objKhaiamanan.getName() + "!");
                } else if (objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() <= 0 && objAltreia.getHealth() <= 0 && objShang.getHealth() > 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Shang and Palangga have defeated " + objKhaiamanan.getName() + "!");
                } else if (objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() > 0 && objAltreia.getHealth() > 0 && objShang.getHealth() > 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! All heroes have defeated " + objKhaiamanan.getName() + "!");
                }else if(objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() > 0 && objAltreia.getHealth() > 0 && objShang.getHealth() <= 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Kamadan, Altreia and Palangga have defeated " + objKhaiamanan.getName() + "!");
                }else if(objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() > 0 && objAltreia.getHealth() <= 0 && objShang.getHealth() > 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Kamadan, Shang and Palangga have defeated " + objKhaiamanan.getName() + "!");
                }else if(objKhaiamanan.getHealth() <= 0 && objKamadan.getHealth() <= 0 && objAltreia.getHealth() > 0 && objShang.getHealth() > 0 && objPalangga.getHealth() > 0){
                    simulateTyping("Congratulations! Altreia, Shang, and Palangga have defeated " + objKhaiamanan.getName() + "!");
                }
        }
        boolean restartOver = true;
        scanner.nextLine();
        
        objStoryLine.gameLogo();

            while (restartOver) {
                System.out.print("\t\t\t\t\tDo you want to enter the game? (Yes/No): ");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("Yes")) {
                    while (restartOver) {
                    System.out.print("\t\t\t\t\tDo you want to skip the storyline? (Yes/No): ");
                    String optionStoryLine = scanner.nextLine();
                        try {
                            if (optionStoryLine.equalsIgnoreCase("Yes")) {
                                
                                resetStats(objKamadan, objAltreia, objShang);

                                objStoryLine.questOne();
                                objThirdStreet.enter(); 
                                objThirdStreet.startQuest();
                                objSiITYou.enter();
                                objSiITYou.startQuest();
                                objSiCS.enter();
                                objSiCS.startQuest();
                                restartOver = false;
                            }else if (optionStoryLine.equalsIgnoreCase("No")) {
                                resetStats(objKamadan, objAltreia, objShang);
                                
                                objStoryLine.prologue();
                                objStoryLine.questOne();
                                objThirdStreet.enter();
                                objThirdStreet.startQuest();
                                objSiITYou.enter();
                                objSiITYou.startQuest();
                                objSiCS.enter();
                                objSiCS.startQuest();
                                restartOver = false;
                            }else {
                                System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                            }
                        } catch (Exception e) {
                            scanner.nextLine();
                        }
                    }
                } else if (option.equalsIgnoreCase("No")) {
                    System.out.print("\t\t\t\t\tI WILL ALWAYS FIND MY WAY BACK TO YOU");
                    break;
                } else {
                    System.out.println("\t\t\t\t\tInvalid Input. Enter either YES/NO only\n");
                }
            }
        }
    }