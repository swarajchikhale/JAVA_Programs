import java.util.LinkedHashMap;
//SWARAJ CHIKHALE
class demo{
    public static void main(String[] args){
        int a[] ={5,8,3,5,8,5,4,6};
       LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

       for (int i=0;i<= a.length-1;i++){
            if ( map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
       }
        int ev =0; 
        int od=0;
        for (Integer key : map.keySet()){

            System.out.println(key +":"+map.get(key));

    }

     for (Integer key : map.keySet()){
        if(key%2==0){
            ev=ev+map.get(key);
        }
        else {
            od =od+map.get(key);
        }
     }
            System.out.println("Even Sum :"+ev);
            System.out.println("Odd Sum :"+od);

    }
}
