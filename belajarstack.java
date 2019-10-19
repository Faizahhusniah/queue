public class belajarstack {
    private String data[];
    private int Size;
    private int Top;

    public belajarstack (int kapasitas){
        Size = kapasitas;
        Top = -1;
        data = new String [Size];


    }

    public boolean isEmpty(){
        return Top==-1;

    }
    public boolean isFull(){
        return Top == Size-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("Stackk Penuh");
        } else {
            data[++Top]= input;
            System.out.println("Data " +input+ " dimasukkan ke dalam Stack");


        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println("Stack Kosong");
        } else {

            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println("Data "+temp+"dihapus dari dalam Stack");

        }
    }

    public void infoStack(){
        for(int i = 0; i<=Top;i++){
            System.out.println("Data Stack ke "+i+" = " +data[i]);
        }






        }

    public static void main(String[] args) {
        belajarstack s = new belajarstack(10);
        s.push("faizah");
        s.push("milla");
        s.push("sabar");
        s.pop();
        s.pop();
        s.infoStack();
    }
    }
