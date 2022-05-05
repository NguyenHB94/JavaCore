import java.util.Random;

public class CreateHexColor {
    public static void main(String[] args) {
        System.out.println("Mã mã HEX ngẫu nhiên được tạo là: ");
        String[] color = createHexColor();
        for (String value : color){
            System.out.print(value);
        }

    }

    public static String[] createHexColor() {
        Random rd = new Random();
        String[] randomValue = "123456789ABCDEF".split("");
        String[] hexColor = new String[7];
        hexColor[0] = "#";
        for (int i = 1; i < 7; i++) {
            hexColor[i] = randomValue[rd.nextInt(randomValue.length)];
        }
        return hexColor;
    }
}
