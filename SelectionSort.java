public class SelectionSort{
	public static void main(String[] args){
		System.out.println("Hello World");
        int[] a = {6,2,5,3,15,1,30,45,23,9};
        sort(a);
        for(int i = 0; i<a.length; i++){
             System.out.println(a[i]);
         }		
	}
	public static void sort(int[] a){
		for(int i=0;i<a.length-1;i++){			
			for(int j=i;j<a.length;j++){
				if(a[j]<a[i]){
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}		
	}
}