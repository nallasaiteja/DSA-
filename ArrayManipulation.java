public static long arrayManipulation(int n, List<List<Integer>> queries) {
          long[] arr=new long[n+2];
          
          for(int i = 0;i<queries.size();i++){
              List<Integer> news = queries.get(i);
              arr[news.get(0)]= arr[news.get(0)] + news.get(2); 
              arr[news.get(1)+1] = arr[news.get(1)+1] +  news.get(2)*-1;
          }
          long  sum = 0;
          
          for(int i = 1;i<n+2;i++){
              
              arr[i] = arr[i] + arr[i-1];
              sum = Math.max(sum,arr[i]);
          }
        
         return sum;
    }