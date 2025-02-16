//Battle java example

import java.util.Random;
import java.util.Scanner;

class Moves {
   public String movenames;
   public int damageamount;
   
   public Moves(String name, int damageamount) {
      this.movenames = name;
      this.damageamount = damageamount;
   }
   
   public String getMovenames() {
      return movenames;
   }
   
   public int getDamageamount() {
      return damageamount;
   }
}

class Codingmon {
   public String name;
   public int hp;
   public String enemyname;
   public int enemyhp;

   public Codingmon(String name, int hp, String enemyname, int enemyhp) {
      this.name = name;
      this.hp = hp;
      this.enemyname = enemyname;
      this.enemyhp = enemyhp;
     
}

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
     public String getEnemyname() {
        return enemyname;
    }

    public int getEnemyhp() {
        return enemyhp;
    }
}

public class CodingmonBattle {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      
      Codingmon codingmon = new Codingmon("Pikachu", 400, "Zigzagoon", 400);
      
      while (codingmon.getHp() > 0 || codingmon.getEnemyhp() > 0) {
         System.out.println(codingmon.getName() + "'s turn, Choose a move by entering 1, 2, or 3. Move 1 hits for 100 at 25% chance, Move 2 hits for 50 at a 75% chance, and Move 3 hits for 75 at a 50% chance");
         int choice = input.nextInt();
         int selfAttackChance = rand.nextInt(100);
         int damageamount = 0;
         
            if (choice == 1 && selfAttackChance < 25) {
               damageamount = 100;
               System.out.println(codingmon.getEnemyname() + " was hit for 100!");
            } else if (choice == 2 && selfAttackChance < 75) {
               damageamount = 50;
               System.out.println(codingmon.getEnemyname() + " was hit for 50!");
            } else if (choice == 3 && selfAttackChance < 50) {
               damageamount = 75;
               System.out.println(codingmon.getEnemyname() + " was hit for 75!");
            } else if ((choice == 1 && selfAttackChance > 25) || (choice == 3 && selfAttackChance > 50) || (choice == 2 && selfAttackChance > 75)) {
               System.out.println(codingmon.getName() + " missed his attack! :(");
               }
               else {
               System.out.println("Put the right number pls");
               continue;
               }
            codingmon.enemyhp -= damageamount;
            
            if (codingmon.enemyhp <= 0) {
            System.out.println(codingmon.enemyname + " got CLAPPED!");
            break;

       }
       
       int enemyAttackChance = rand.nextInt(100);
       if (enemyAttackChance < 50) {
         int enemyDamage = rand.nextInt(50) + 50;
         System.out.println(codingmon.getName() + " was hit for " + enemyDamage);
                codingmon.hp -= enemyDamage;
         } else {
                System.out.println(codingmon.getEnemyname() + " slipped on a banana!");
         if (codingmon.hp <= 0) {
                System.out.println(codingmon.getName() + " got CLAPPED!");
                break;
                }
           }
   }
   }
}

               
            


   