import java.util.Arrays;
import java.util.Random;

public class CreateRBGCode {
    public static void main(String[] args) {
        int[] color = createRBGCode();
        System.out.println("Mã màu RBG ngẫu nhiên vừa được tạo là: ");
        System.out.println("rgb(" + color[0] + "," + color[1] + "," + color[2] + ")");

    }
    public static int[] createRBGCode(){
        Random rd = new Random();
        int R = rd.nextInt(256);
        int G = rd.nextInt(256);
        int B = rd.nextInt(256);
        int[] color = {R, G, B};
        return color;
    }
}
