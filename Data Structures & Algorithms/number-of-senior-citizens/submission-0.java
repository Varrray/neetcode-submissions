class Solution {
    public int countSeniors(String[] details) {
        ArrayList<String> ages=new ArrayList<>();
        int c=0;
        for(int i=0;i<details.length;i++){
            String a="";
            a=a+details[i].charAt(11)+details[i].charAt(12);
            ages.add(a);
        }

        for(String a:ages){
            if(Integer.parseInt(a)>60){c++;}
        }
        return c;
    }
}