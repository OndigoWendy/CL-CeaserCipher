public class Decoding {
    private  String inputText;
    private int shiftKey;
    public Decoding(int shiftKey, String inputText) {
        this.inputText=inputText;
        this.shiftKey=shiftKey;
    }

    public String decode() {
        String decoded = " ";
        char decodedArray[]=this.inputText.toCharArray();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<decodedArray.length;i++){
            int singleAlphabet = inputText.charAt(i);
            int charPosition = alphabet.indexOf(singleAlphabet);
            int x = charPosition-shiftKey;

            if (inputText.charAt(i) == ' ') {
                decoded += "";
            }
            else   {
                if (x>'Z'){
                int key = (x)%26;
                decoded += alphabet.charAt(key);
             }
                else {
                    int key = (x)%26;
                    decoded +=alphabet.charAt(key);
                }
            }
        }
        return decoded.toUpperCase();
    }

    public int shiftKey() {
        return shiftKey;
    }

    public String inputText() {
        return inputText;
    }

    public boolean isNotEmpty() {
        return true;
    }

    public boolean inputTextIsValid() {
        return true;
    }

    public boolean ShiftKeyIsValid() {
        return true;
    }
}
