public class CA1 {
    public static void main(String[] args) {
        String cipher = "ZHOO GRQH BRX KDYH VxFFHVVIXOOB frpSOHWHG TXHVWLRQ Rqh";
        String cipher2 = "JNXLmBHG MPH ptl FHKX WByYBVNEM UNM BM EhhDL EBDx RHN TvXW BM PXEE WHGX RHN";
        int shiftover = 3;
        String decryptedMessage = "";
        String decryptedMessage2 = "";
        int key = 0;

        for(int i = 0; i < cipher.length(); i++)
        {
            char alphabet = cipher.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char)(alphabet - shiftover);
                if(alphabet < 'a')
                    alphabet = (char)(alphabet-'a'+'z'+1);
                decryptedMessage += alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char)(alphabet - shiftover);
                if(alphabet < 'A')
                    alphabet = (char)(alphabet-'A'+'Z'+1);
                decryptedMessage += alphabet;
            }
            else
                decryptedMessage += alphabet;
        }
        System.out.println("Message 1 : "+decryptedMessage);

        int k = 19;
        for (int j = 0; j < cipher2.length(); j++) {

            char alphabet2 = cipher2.charAt(j);
            if (alphabet2 >= 'A' && alphabet2 <= 'Z') {
                alphabet2 = (char) (alphabet2 - k);
                if (alphabet2 < 'A')
                    alphabet2 = (char) (alphabet2 - 'A' + 'Z' + 1);
                decryptedMessage2 += alphabet2;
            } else if (alphabet2 >= 'a' && alphabet2 <= 'z') {
                alphabet2 = (char) (alphabet2 - k);
                if (alphabet2 < 'a')
                    alphabet2 = (char) (alphabet2 - 'a' + 'z' + 1);

                decryptedMessage2 += alphabet2;
            } else
                decryptedMessage2 += alphabet2;
        }
        System.out.println("=====================");
        System.out.println("Message 2  "+decryptedMessage2);
    }
}

