package Hometask_2;

public class Task7 {
    public static void main(String[] args) {
        seventh();
    }
    public static void seventh(){
        int rows = (int) (Math.random() * 10);

        int[][] randArray = new int[rows][];
        for(int i = 0; i < randArray.length; i++){
            randArray[i] = new int[(int) (Math.random() * 10)];

            for (int j = 0; j < randArray[i].length; j++){
                randArray[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int i = 0; i < randArray.length; i++){
            for(int j = 0; j < randArray[i].length; j++){
                System.out.print(randArray[i][j]);
            }
            if(i < (randArray.length - 1))
                System.out.println();
        }
    }
}
