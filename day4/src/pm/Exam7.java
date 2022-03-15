

package pm;
		

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {

		
		//길이가 100인 배열을 만들어 for문을 이용하여 배열에 순서대로 1~100까지의 값을 넣으세요
		// 옆으로 1줄로 전체를 출력하세요, tostring사용
		
		
//		//내가 한것
//		int [] array1 = new int[100];
//		
//		for (int i = 0; i<array1.length; i++) {
//			System.out.print(Arrays.toString(array1));
//		}
		
		
		//답지
//		int[] arr = new int[100];
//		
//		for(int i = 0; i <arr.length; i++) {
//			arr[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
//		------------------------------------------------------------------------------------
		
		
//		arr1 = {5,4,3,2,1}를 뒤집어서 arr2 = {1,2,3,4,5}를 만들어라
		
		
		
//		int[] arr1 = {5,4,3,2,1};
//		int[] arr2= new int[arr1.length];
//		
//		for(int i = 0; i <arr1.length; i++) {
//			arr2[i] = arr1[arr1.length-1-i];
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2= new int[arr1.length];
		
		for(int i = 0; i <arr1.length; i++) {
			arr2[i] = 6 - arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		

	}

}
