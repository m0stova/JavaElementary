package reverse;

public class Reverse {
    static String stringOriginal = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

    public static void main(String[] args) {
        String stringReplace = stringOriginal.replace("Z", " ");
        String[] stringSplit = stringReplace.split(" ");
        String[] stringReverse = new String[stringSplit.length];
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < stringSplit.length; i++) {
            stringReverse[i] = new StringBuilder(stringSplit[i]).reverse().toString();
            stringResult.append(stringReverse[i]);
            if (i < stringSplit.length - 1) {
                stringResult.append(" ");
            }
        }
        System.out.println("Your original string was: " + stringOriginal);
        System.out.println("Reverse of your string is: " + stringResult);

    }

}
