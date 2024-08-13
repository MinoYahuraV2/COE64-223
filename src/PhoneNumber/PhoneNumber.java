package PhoneNumber;

public class PhoneNumber {
    private String number;

    public PhoneNumber() {
        this.number = "";
    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public void readAs() {
        StringBuilder sb = new StringBuilder();
        for (char digit : number.toCharArray()) {
            switch (digit) {
                case '0':
                    sb.append("Zero ");
                    break;
                case '1':
                    sb.append("One ");
                    break;
                case '2':
                    sb.append("Two ");
                    break;
                case '3':
                    sb.append("Three ");
                    break;
                case '4':
                    sb.append("Four ");
                    break;
                case '5':
                    sb.append("Five ");
                    break;
                case '6':
                    sb.append("Six ");
                    break;
                case '7':
                    sb.append("Seven ");
                    break;
                case '8':
                    sb.append("Eight ");
                    break;
                case '9':
                    sb.append("Nine ");
                    break;
            }
        }
        System.out.println("Read as: " + sb.toString().trim());
    }

    public int[] calFreq() {
        int[] freq = new int[10];
        for (char digit : number.toCharArray()) {
            if (digit >= '0' && digit <= '9') {
                freq[digit - '0']++;
            }
        }
        return freq;
    }

    @Override
    public String toString() {
        return number;
    }
}