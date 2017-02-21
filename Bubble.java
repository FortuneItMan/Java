public class Bubble{
	public static void main(String[] args){
		System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        sort(a);
        for(int i = 0; i<a.length; i++){
             System.out.println(a[i]);
         }		
	}
	public static void sort(int[] a){
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}		
	}
}