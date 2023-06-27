public class Cards {
    public static void main(String[] args) {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"spade", "diamond", "heart", "club"};
        String[] deck = new String[52];
        int n = Integer.parseInt(args[0]);

        for (int j = 0; j < suit.length; j++ )
            for (int i = 0; i < rank.length; i++)
                deck[i + 13*j] = rank[i] + suit[j];

        for (int i = 0; i < 52; i ++)
            System.out.print(deck[i] + " ");

        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++) {
                deck[4*i + j] = rank[i] + suit[j];
                System.out.print(deck[4*i + j] + " "); }

        for (int i = 0; i < n; i++)
        {
            int r = (int) (Math.random() * 52);
            System.out.println();
            System.out.println(deck[r]);
        }
    }
}
