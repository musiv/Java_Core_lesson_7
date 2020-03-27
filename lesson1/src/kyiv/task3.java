package kyiv;

public class task3 {
	public static void main(String[] args ) {
		int array [] = {1,2,3,4,5,6,7,8,9,10};
		int max = 0;
		int min = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i]>max)
				max= array[i];
		}
		for (int i=0;i<array.length;i++) {
			if (array[i]<min)
				min= array[i];
		}
		System.out.println("max =" + max);
		System.out.println("min = " + min);
	}
	

}
