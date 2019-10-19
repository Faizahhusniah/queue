package projekgithup;

public class stackk {
    /*push = menambah
    pop= mengurang
    pop mereturnkan nilai*/


    private String data[];
    private int top;

    public stackk(int jumlah) {
        data = new String[jumlah]; top=-1;
    }
    public void push (String nilai){
        if(top<data.length-1){
            data[++top]= nilai;

        }
    }

    public String pop(){
        if(top>=0) {
            String temp = data[top--];
            return temp;
        }
        return "";
    }

    public void print (){
        for (int i =data.length-1; i>=0; i--){
            System.out.println(data[i]);
        }
    }

}

