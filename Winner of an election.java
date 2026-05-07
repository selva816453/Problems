class Winner of an election
{
     public static String[] winner(String arr[], int n) {
        HashMap<String,Integer> map=new LinkedHashMap<>();
        for(String nn:arr){
            map.put(nn,map.getOrDefault(nn,0)+1);
        }
        int max=0;
        String a="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                a=entry.getKey();
            }else if(entry.getValue()==max && entry.getKey().compareTo(a)<0){
                a=entry.getKey();
            }
        }
        String[]ans=new String[2];
        ans[0]=a;
        ans[1]=max+"";
        return ans;
    }
}