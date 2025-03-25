public class SoloLevellingApplication {

    public static void main(String[] args) {
        try {
            Hunter hunter1 = new Hunter("Jack", HunterRank.B);
            Hunter hunter2 = new Hunter("Saitama", HunterRank.B);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
//        Hunter hunter1 = new Hunter("Jack", HunterRank.B);
//        Hunter hunter2 = new Hunter("Saitama", HunterRank.B);

//        Hunter hunter2 = new Hunter("Paul", 'c');
//        Hunter hunter3 = new Hunter("Loraine", 'a');
//        Hunter hunter4 = new Hunter("Saitama", '');

    }


    public static void rankReveler(Hunter hunter) {
        if (hunter.getRankLevel() == HunterRank.S) {
            System.out.println("You are in rank S");
        }
//        else if (hunter.getRankLevel() == 'a'){
//            System.out.println("You are in rank A");
//        } else if (hunter.getRankLevel() == 'b'){
//            System.out.println("You are in rank B");
//        } else if (hunter.getRankLevel() == 'c'){
//            System.out.println("You are in rank C");
//        } else if (hunter.getRankLevel() == 'd'){
//            System.out.println("You are in rank D");
//         }
    }
}
