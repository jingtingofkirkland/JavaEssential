import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/6.
 */
abstract class HexToBinary {
    // give a char, return its binary representation
    protected abstract String getBinary(char ch);

    public String getBinary(String hex) {
        String upperHex = hex.toUpperCase();
        StringBuilder result = new StringBuilder();
        for(char ch : upperHex.toCharArray()) {
            validation(ch);
            result.append(getBinary(ch));
        }
        return result.toString();
    }
    //check if the ch is 0-9 or A-F
    private void validation(char ch) {
        if(ch >='0' && ch <=9 || ch >='A' && ch <='F') {
            return;
        }
        throw new RuntimeException("String contain invalid character");
    }
}

class MapVersionHexToBinary extends HexToBinary {
    Map<Character, String> cache = new HashMap<>();

    MapVersionHexToBinary() {
        cache.put('0', "0000");
        cache.put('1', "0001");
        cache.put('2', "0010");
        cache.put('3', "0011");
        cache.put('4', "0100");
        cache.put('5', "0101");
        cache.put('6', "0110");
        cache.put('7', "0111");
        cache.put('8', "1000");
        cache.put('9', "1001");
        cache.put('A', "1010");
        cache.put('B', "1011");
        cache.put('C', "1100");
        cache.put('D', "1101");
        cache.put('E', "1110");
        cache.put('F', "1111");
    }
    @Override
    protected String getBinary(char ch) {
        return cache.get(ch);
    }
}

class ArrayVersionHexToBinary extends HexToBinary {
    String [] cache = new String[127];
    ArrayVersionHexToBinary() {
        cache['0'] = "0000";
        cache['1'] = "0001";
        cache['2'] = "0010";
        cache['3'] = "0011";
        cache['4'] = "0100";
        cache['5'] = "0101";
        cache['6'] = "0110";
        cache['7'] = "0111";
        cache['8'] = "1000";
        cache['9'] = "1001";
        cache['A'] = "1010";
        cache['B'] = "1011";
        cache['C'] = "1100";
        cache['D'] = "1101";
        cache['E'] = "1110";
        cache['F'] = "1111";
    }

    @Override
    protected String getBinary(char ch) {
        return cache[ch];
    }
}

public class FourPointTwelve_Ziyi {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.nextLine();
        HexToBinary htb = new ArrayVersionHexToBinary();
        System.out.println("Binary is \n" +htb.getBinary(hex));
    }
}
