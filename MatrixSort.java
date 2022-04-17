import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class MatrixSort {

	public static void main(String[] args) {
		/*int[][] matrix={{1,3,5},{2,3,6},{6,7,8}};
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				
				for(int k=0;k<matrix.length;k++){
					for(int l=0;l<matrix[k].length;l++){
						System.out.println(i + "-" + j + ":" + matrix[i][j] + " - " + matrix[k][l] + ":" + k + "-" + l);
						if(matrix[i][j]>matrix[k][l]){
							matrix[i][j]=matrix[i][j]+matrix[k][l];
							matrix[k][l]=matrix[i][j]-matrix[k][l];
							matrix[i][j]=matrix[i][j]-matrix[k][l];
						
						}
					}
				}
				System.out.println("--");
				for(int k=0;k<matrix.length;k++){
					for(int l=0;l<matrix[k].length;l++){
						System.out.print(matrix[k][l] + " ");
					}
				}
				System.out.println("--");
				if((i==Math.ceil(matrix.length/2))&&
					(j==Math.ceil(matrix[1].length/2))){
						break;
					}
			}
		}
		System.out.println(matrix[(int)Math.ceil(matrix.length/2)][(int)Math.ceil(matrix[1].length/2)]);
		*/
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		
		/*ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(1);
		aa.add(1);
		aa.add(2);
		aa.add(9);
		aa.add(10);
		aa.add(12);
		aa.add(12);
		aa.add(17);
		aa.add(21);
		aa.add(22);
		aa.add(30);
		A.add(aa);
		
		aa = new ArrayList<Integer>();
		aa.add(2);
		aa.add(3);
		aa.add(5);
		aa.add(7);
		aa.add(8);
		aa.add(12);
		aa.add(21);
		aa.add(25);
		aa.add(26);
		aa.add(27);
		aa.add(30);
		A.add(aa);
		
		aa = new ArrayList<Integer>();
		aa.add(1);
		aa.add(3);
		aa.add(12);
		aa.add(13);
		aa.add(13);
		aa.add(14);
		aa.add(17);
		aa.add(18);
		aa.add(21);
		aa.add(21);
		aa.add(23);
		A.add(aa);*/
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(1);
		aa.add(3);
		aa.add(5);
		A.add(aa);
		aa = new ArrayList<Integer>();
		aa.add(2);
		aa.add(6);
		aa.add(9);
		A.add(aa);
		aa = new ArrayList<Integer>();
		aa.add(3);
		aa.add(6);
		aa.add(9);
		A.add(aa);
		
		for(int i=0; i<A.size(); i++){
            for(int j=0; j<A.get(i).size(); j++){
                
                for(int k=0; k<A.size(); k++){
                    for(int l=0; l<A.get(k).size(); l++){
                        if(i>k || (i>=k && j>=l)){
                        	System.out.println(i + " - " + k + " : " + j + " - " + l);
                            continue;
                        }
                       // System.out.println(A.get(i).get(j) + " - " + A.get(k).get(l));
                        if(A.get(i).get(j)>A.get(k).get(l)){
                            A.get(i).set(j, A.get(i).get(j)+A.get(k).get(l));
                            A.get(k).set(l, A.get(i).get(j)-A.get(k).get(l));
                            A.get(i).set(j, A.get(i).get(j)-A.get(k).get(l));
                        }
                    }
                }
                if((i>=(int)A.size()/2) 
                        && (j>=A.get(0).size()/2)) break;
                System.out.println(Math.ceil(A.size()/2) + " - " + A.get(0).size()/2);
                System.out.println("--");
                for(int k=0; k<A.size(); k++){
                	System.out.println();
                    for(int l=0; l<A.get(k).size(); l++){
                        System.out.print(A.get(k).get(l) + " ");
                    }
                }
                System.out.println("--");
            }
        }
        System.out.println("--");
        for(int i=0; i<A.size(); i++){
        	System.out.println();
            for(int j=0; j<A.get(i).size(); j++){
                System.out.print(A.get(i).get(j) + " ");
            }
        }
        System.out.println("--");
        
        System.out.println(A.get((int)Math.ceil(A.size()/2)).get((int)Math.ceil(A.get(1).size()/2)));

	}


}
