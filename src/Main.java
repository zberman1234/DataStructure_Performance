
public class Main {
    public static void main(String[] args) throws Exception {
        int epochs = 20;
        int[] nArr = {1000,10000,100000,200000,300000,400000,500000,700000,900000,1000000,
            1100000,1250000,1400000,1500000,1600000,
        1750000,1900000,2000000,2100000,2300000,2400000,2500000,
        2700000,2900000,3200000,3500000,3800000,4000000,4200000,4700000,5000000};
        for(int k = 0; k < nArr.length; k++) {
            float t1 = System.nanoTime();
        
            int N = nArr[k];
            int cycles = 5;
            BinaryTree bt;
            for(int r = 0; r < cycles; r++) {
                bt = new BinaryTree();
                for(int i = 0; i < N; i++) {
                    int key = (int) (Math.random() * N);
                    Node random = new Node(key);
                    bt.insert(random);
                }

            }
            float t2 = System.nanoTime();
            float time = (t2-t1)/cycles;
            System.out.println("N= "+N + ". Avg time= " + time/1000000000);
        }
        



    }
}
