class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
       HashMap <Integer, Stack<Integer>> hm= new HashMap<>();
       
       for(int i=0; i<2*e; i+=2){
           if(hm.containsKey(A[i])){
               hm.get(A[i]).push(A[i+1]);
           }
           else{
               Stack <Integer> st= new Stack <>();
               st.push(A[i+1]);
               hm.put(A[i], st);
           }
       }
       
       for(int i=0; i<2*e; i+=2){
           if(hm.get(B[i]).peek()!=B[i+1]) 
           return 0;
           
           else{
               hm.get(B[i]).pop();
           }
    }
    return 1;
    
}
}
