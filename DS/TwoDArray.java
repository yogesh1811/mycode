package DS;

import java.util.Scanner;

public class TwoDArray {

	/**
	 * @param args
	 */
	/*
	1 1 1 0 0 0
	0 1 0 0 0 0
	1 1 1 0 0 0
	0 0 2 4 4 0
	0 0 0 2 0 0
	0 0 1 2 4 0
	
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int max=Integer.MIN_VALUE,r=0,c=0,sum=0;
        for(int i=0;i<=3;i++){
        	for(int j=0;j<=3;j++){
        		
        		for(int y=i;y<i+3;y++){
        			//System.out.println("\n");
        			for(int x=j;x<j+3;x++){
        				if(y==i+1 && ((x==j) || (x==j+2))){
        					//System.out.print(" ");
        					continue;            				
        				}else{
        					//System.out.print(arr[y][x]);
            				sum = sum + arr[y][x];
        				}        				
        			}   			
        			
        		}
        		if(sum>max){
        			max = sum;
        			r = i;
        			c = j;
        		}
        		sum=0;
        	}
        }
        System.out.print(max);
	}

}
