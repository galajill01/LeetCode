public class HammingDistance_461 {

    public static void main(String args[])
    {
        hammingDistance(4,7);
    }

    public static int hammingDistance(int x, int y) {
        int z= x^y;
        int count = 0;
            while(z!=0)
        {
            count = count + (z&1);
            z=z>>1;
        }
        return count;

    }

}
