int climbStairs(int n){
    int climb[n+1];
    if(n==1){
        return 1;
    }
    climb[1]=1;
    climb[2]=2;
    for(int i=3;i<=n;i++){
        climb[i]=climb[i-1]+climb[i-2];
    }
    return climb[n];
}
