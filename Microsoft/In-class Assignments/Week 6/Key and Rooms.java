class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int s=q.poll();
            for(int i=0;i<rooms.get(s).size();i++){
                int k=rooms.get(s).get(i);
                if(!visited[k]){
                    visited[k]=true;
                    q.add(k);
                }
            }
        }
        for(boolean i:visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
}
