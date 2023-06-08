package gitupload;


public class array1 {
    public static void main(String[] args) {
        // int a[]={1,2,3,4};
        // for(int n:a){
        //     System.out.println(n);
        // }
        int a[]=new int[3];

        // int b[][]=new int[2][2];
        // b[0][0]=2;
        // for(int n[]:b){
        //     for(int k:n){
        //         System.out.println(k);
        //     }
        // }
        int c[]={1,2,3,4,5};
            System.out.println(c.length);
        int d[][]={{1,2,3,4},{34,5,65,432,42},{23,543,645,65,532,523}};
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(d[2].length);
    }
}
