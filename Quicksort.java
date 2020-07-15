import java.util.*;

public class Quicksort {
    public static void main(String[] args){
    /*入力:
    n: 配列の長さ
    c[n]: ソート対象の配列
    入力例:
10
3 2 0 5 8 3 4 1 3 2
    */
            Scanner scanner = new Scanner(System.in);
            int n;
    	      n = scanner.nextInt();
   	      int c[] = new int[n];
   	      for(int i = 0; i < n; i++){
   		   c[i] = scanner.nextInt();
   	      }
   	      quicksort(c, 0, n-1, n);
   	      //出力
    	      System.out.println("結果:");
   	      for(int i = 0; i < n; i++){
   		   System.out.print(c[i] + " ");
   	      }
    	      System.out.println();
    	      scanner.close();
            }
            
	static void quicksort(int c[], int start, int end, int n){
    	      int t, i, j, tmp;
    	      if(start < end){
        	    t = c[start];
        	    for(int s = start+1; s <= end; s++){
        	          if(c[s] > c[start]){
        	                t = c[s];
        	                break;
                	    }else if(c[s] < c[start]){
                	          break;
                	    }
                	    if(s == end && c[s] == c[start]){
                	          return;
                	    }
                }
    		    System.out.println("軸:" + t);
        	//cout << endl << "軸:" << t << endl;
        	    i = start;
        	    j = end;
        	    System.out.print("ソート前: ");
        	//cout << "ソート前:  ";
       	    for(int ind = 0; ind < n; ind++){
       	          if(ind == start){
       	                System.out.print("|");
                	//cout << "|";
                	    }
       	          System.out.print(c[ind]);
            	//cout << c[i];
            	    if(ind == end){
            	          System.out.print("|");
                	//cout << "| ";
            	    }else{
            	          System.out.print(" ");
                	//cout << " ";
            	    }
            	}
    		      System.out.println();
        	      while(i < j){
            	      if(c[i] >= t && c[j] < t){
            	            tmp = c[i];
                	            c[i] = c[j];
                	            c[j] = tmp;
                	            i++;
                	            j--;
                	      }else if(c[i] >= t){
                	            j--;
            	      }else if(c[j] < t){
                	            i++;
            	      }else{
                	            i++;
                	            j--;
            	      }
        	       }
        	       System.out.print("ソート後: ");
        	//cout << "ソート前:  ";
       	       for(int ind = 0; ind < n; ind++){
       	             if(ind == start){
            	            System.out.print("|");
                	//cout << "|";
            	       }
       		       System.out.print(c[ind]);
            	//cout << c[i];
            	       if(ind == end){
            	            System.out.print("|");
                	//cout << "| ";
            	       }else{
            	            System.out.print(" ");
                	//cout << " ";
            	       }
                  }
    		      System.out.println();
    		      System.out.println();
        	      if(i > j){
            	      quicksort(c, start, j, n);
            	      quicksort(c, i, end, n);
        	      }else if(c[i] < t){
            	      quicksort(c, start, i, n);
            	      quicksort(c, i+1, end, n);
        	      }else{
            	      quicksort(c, start, i-1, n);
            	      quicksort(c, i, end, n);
        	      }
        	  }
    	        return;
	    }
}