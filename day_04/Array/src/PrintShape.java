public class PrintShape {
    public static void main(String[] args) {

        printRectangle();
        System.out.println();
        printX();
        System.out.println();
        printRectangle0();
        System.out.println();
        printTriangle();

    }

    public static void printRectangle(){
        String[][] rectangle = new String[5][4];
        for (int i= 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++){
                rectangle[i][j] = "*";
                System.out.print(rectangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printX(){
        String[][] rectangle = new String[7][7];
        for (int i= 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++){
                if (i == j || i + j == rectangle.length - 1){
                    rectangle[i][j] = "*";
                } else {
                    rectangle[i][j] = "";
                }
                System.out.print(rectangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void printRectangle0(){
        String[][] rectangle = new String[5][4];
        for (int i= 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++){
                if ((i >= 1 && i <= 3) && ( j >= 1 && j <= 2)){
                    rectangle[i][j] = "";
                } else {
                    rectangle[i][j] = "*";
                }
                System.out.print(rectangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printTriangle(){
        String[][] triangle = new String[4][4];
        for (int i= 0; i < triangle.length; i++){
            for (int j = 0; j < triangle[i].length; j++){
                if (i >= j){
                    triangle[i][j] = "*";
                } else {
                    triangle[i][j] = "";
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
