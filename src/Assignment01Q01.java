public class Assignment01Q01 {
    public static void main(String[] args) {
        // רצה על כל המערך
        for (int i = 0 ; i < args.length ; i++) {
            // בודקת שהתו במיקום לא ריק
            if (args[i].length() > 0 ) {
                // בודקת אם התו הראשון מתחלק ב-5
                char firstChar = args[i].charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}
