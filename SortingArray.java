import java.util.*;
import java.util.stream.Collectors;


public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> A=new ArrayList<Integer>(
			Arrays.asList(1, 1, 2, 2, 3, 5, 5));
		Integer diff=0;
		for(int i=0; i<A.size() -1;i++){
			diff=A.get(i)^diff;
			if(diff!=A.get(i)) System.out.print(diff);
		}
		
		
		
		
		
		//A=A..range(0, A.size()-1).filter(i -> (A.get(i)<A.get(i+1))).mapToObj(A::get).collect(Collectors::toList);
		//ArrayList<Integer> B=A.stream()..sorted().collect(Collectors::toList);
		//A.sort(Comparator.comparing(Integer::valueOf));
		
		//Collections.sort(A);
		//A.stream().forEach(val -> System.out.println(val));
		
		Integer minNum = A.get(0);
		Integer maxNum = A.get(0);
		Integer min = 0;
//		for(int i=1; i<A.size(); i++){
//			if(minNum>A.get(i)){
//				minNum=A.get(i); 
//				continue;
//			}
//			if(maxNum<A.get(i)){
//				maxNum=A.get(i); 
//				continue;
//			}
//		}
//		
//		System.out.println("Min : " + minNum + " - Max : " + maxNum);
		
		
		
		

	}

}
