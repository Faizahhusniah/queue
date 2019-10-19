public class queueu {
    private int data[];
    private int tail;

    public queueu(int jumlah) {
        data = new int[jumlah];
        tail= -1;

    }

    public void enqueue (int nilai) {//enque = push
        if (tail < data.length - 1) {
            data[++tail] = nilai;
        }
    }

    public int dequeue () {//dequeue= pop
        if(tail<0) {
            //ambil indeks = 0
            int temp = data[0];
            //geser
            for (int i = 0; i < data.length - 1; i++) {
                data[i] = data[i + 1];


            }
            tail--;
            return temp;

        }
        return 0;
    }

    public void print() {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }


    }
}
