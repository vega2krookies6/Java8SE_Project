package chapter4.array;

public class TestIntMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 선언
		int[][] nums;
		int[] nums2 [] = { {10,20},{30,40},{50,60} };
		int nums3 [][];
		
		nums = new int[3][2];
		System.out.println(nums.length); //3
		System.out.println(nums[0].length);  //2
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][0] = 50;
		nums[2][1] = 60;
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("");

		}
		//2차원 배열의 합을 구하세요
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		System.out.println("배열의 합 : " + sum);
		System.out.println("배열의 평균 :" + sum / (float)(arr.length * arr[0].length) );
		
		//String 타입의 2차원 배열
		String[][] names = {
				{"강기량","강흥원","김석우","김영준","김은빈"},
				{"박소정","박종현","박진서","박찬욱","서창범"},
				{"서평원","송채영","송화영","신가람","안상우"},
				{"안우선","이동훈","이윤아","이정은","장석우"},
				{"조용훈","주우선","주현아","지인철","함예리"}
		};
		for (int i = 0; i < names.length; i++) {
			for(int j=0; j< names[i].length;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}











