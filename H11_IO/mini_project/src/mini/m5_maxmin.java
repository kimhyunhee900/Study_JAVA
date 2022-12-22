package mini;

public class m5_maxmin {

	public static void main(String[] args) {
		
		//5. 몇 개의 숫자를 가지는 배열을 만들고 그 배열에서 최대값과 최소값을 구하는 프로그램을 작성하시오
		
		int arr[] = {5, 3, 2, -3, 70, 90};
		
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
        if(max<arr[i]) {
        	max=arr[i];
         }
         if(min>arr[i]) {
            min=arr[i];
         }
	      }
	      System.out.println("최대값 : "+max);
	      System.out.println("최소값 : "+min);

	}

}
