package lesson_12.frame2_Balls.race;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RaceConditions {
    public static void main(String[] args) {
        Random random = new Random();
        long husband = 1122;
        long wife = 2211;

//        Atm atm = new BadAtm();
        Set<Runnable> threads = new HashSet<>();
        for (int i=0; i<50; i++) {
//            threads.add()
        }
    }
    private static Runnable CreateWithdrawalSet () {
        return new Runnable() {
            @Override
            public void run() {
//                atm.checkBalance(accountID);
//                 atm.withdrawMoney(accountID, amount);
            }
        };
    }
}
