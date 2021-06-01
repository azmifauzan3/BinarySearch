
/**
 *
 * @author MUHAMMAD AZMI FAUZAN
 */
public class BinarySearch {

    int data[];
    int jumData;
    
    public BinarySearch(int data[], int jumData){
        this.jumData = jumData;
        this.data = new int[jumData];
        for(int i=0;i<jumData;i++){
            
        }
    }

    BinarySearch(int[] data, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int find(int dicari){
        boolean ada = false; //belum ketemu atau tidak ada
        
        int bawah = 0;
        int atas = jumData -1;
        int posisi = -1;
        
        while(atas >=bawah){
            int tengah = (atas + bawah)/2;
            if(dicari > data[tengah]){
                bawah = tengah + 1;
            }
            else if(dicari < data[tengah]){
                atas = tengah -1;
            }
            else{
                posisi = tengah;
                bawah = atas + 1;
            }
        }
        return posisi;
    }
    public void display(){
        for(int i=0;i<jumData;i++){
            system.out.println(data[i]);
        }
    }
}
