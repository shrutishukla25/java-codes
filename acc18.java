public class acc18 {
    public static void main(String[] args) {
        float x1 = 1;
        float y1 = 1;
        float x2 = 2;
        float y2 = 4;
        float x3 = 3;
        float y3 = 6;
        float firstDiff = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        float secondDiff = (float) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        float thirdDiff = (float) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        System.out.println(firstDiff + secondDiff + thirdDiff);
    }
}
