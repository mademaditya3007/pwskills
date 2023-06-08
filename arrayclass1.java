package gitupload;
public class arrayclass1 {
   
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        clac obj=new clac();
        System.out.println(obj.add(a));

    }
    class clac{
        public int add(int a[]){
            int res=0;

            for(int i=0;i<a.length;i++){
                res=res+a[i];
            }
            return res;

        }
    }

}
 