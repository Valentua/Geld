class Geld {
	
	public static int count=0; 
	
	public static void main(String[] s) {         
		int sum;         	        
		sum=15;
		System.out.print(euro(sum));         
		System.out.print(" kann auf ");         
		System.out.print(pay(sum));         
		System.out.println(" verschiedene Arten passend bezahlt werden");    
		
		} 

     public static long pay (int x) {             
    	 int[] c = new int[8];
    	 c[7]=200;
    	 c[6]=100;
    	 c[5]=50;
    	 c[4]=20;
    	 c[3]=10;
    	 c[2]=5;
    	 c[1]=2;
    	 c[0]=1;
    	 
    	 for (int i = 7; i>=0;i--) {
    		 if (x/c[i]==1&&x%c[i]==0)count++;
    		 if (x/c[i]==1&&x%c[i]!=0) {count++;pay(x%c[i]);}
    		 if (x/c[i]>1 && c[i]>1) {count++;for(int k=(x/c[i])-1;k>=1;k--)pay(c[i], i-1);}
    		 if (c[i]==1)count++;
    	 }
    	
    	 return count;
      
      
     }
     
     private static long pay (int m, int n) {
    	 int[] c = new int[8];
    	 c[7]=200;
    	 c[6]=100;
    	 c[5]=50;
    	 c[4]=20;
    	 c[3]=10;
    	 c[2]=5;
    	 c[1]=2;
    	 c[0]=1;
    	 
    	 for (int i = n; i>=0;i--) {
    		  
    		 if (m/c[i]>1 && c[i]>1) {count++;for(int k=(m/c[i])-1;k>=1;k--)pay(c[i], i-1);}
    		 if	(c[i]==1)count++;
    	 }
    	
    	 return count;
      
      
     }
     
     
     
    
     public static String million() {
    	 long a;
    	 int i=0;
    	 do{i++;a=pay(i);}while(a<1000000);      
    	 String m="";
    	 return m+i; 
     }
     
     
     public static String euro(int cent) {         
    	 
    	 String m ="";
    	 m=m+(float)cent/100+ " Euro";
    	 return m; 
     } 
}
