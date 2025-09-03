// Last updated: 9/3/2025, 10:50:21 AM
class Solution {
    int minDistance(int[] dist,boolean[] visited, int nodes){ 
        int min=Integer.MAX_VALUE, minIndex=-1;
        for(int v=1;v<=nodes;v++){
            if(visited[v]==false && dist[v]<min){
                min=dist[v];
                minIndex=v;
            }
        }
        return minIndex;
    }
    int[][] makeAdjMat(int [][] edges,int nodes){
        int [][] adjMat=new int[nodes+1][nodes+1];
        for(int i=1;i<=nodes;i++){
            Arrays.fill(adjMat[i],Integer.MAX_VALUE);
        }
        for(int[] time:edges){
            adjMat[time[0]][time[1]]=time[2];
        }
        return adjMat;
    }
    public int networkDelayTime(int[][] edges, int nodes, int currNode) {
        int [][] adjMax=makeAdjMat(edges,nodes);
        boolean[] visited=new boolean[nodes+1];
        int [] distance=new int[nodes+1];

        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[currNode]=0;
        
        for(int count=1;count<=nodes;count++){
            visited[currNode]=true;

            for(int enode=1;enode<=nodes;enode++){
                if(adjMax[currNode][enode]!= Integer.MAX_VALUE && !visited[enode]){
                    if(distance[enode]>distance[currNode]+adjMax[currNode][enode]){
                        distance[enode]=distance[currNode]+adjMax[currNode][enode];

                    }
                }
            }
            currNode=minDistance(distance,visited,nodes);
            if(currNode==-1) break;
        }
        int maxTime=0;
        for(int i=1;i<=nodes;i++){
            if(distance[i]==Integer.MAX_VALUE) return-1;
            maxTime=Math.max(maxTime,distance[i]);
        }
        return maxTime;
    }
}