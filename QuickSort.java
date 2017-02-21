public class QuickSort{
	public static void main(String[] args){
		System.out.println("Hello World");
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
             System.out.println(a[i]);
         }					 
	}
	public static void sort(int[] a,int start,int end){
		int s=start,e=end;
		int flag=a[start];
		while(s<e){
			while(s<e&&a[e]>=flag){
				e--;
			}
			if(a[e]<flag){
				int temp;
				temp=a[s];
				a[s]=a[e];
				a[e]=temp;
				s++;
			}
			while(s<e&&a[s]<=flag){
				s++;
			}
			if(a[s]>flag){
				int temp;
				temp=a[e];
				a[e]=a[s];
				a[s]=temp;
				e--;
			}
		}
		if(s>start) sort(a,start,s-1);
		if(e<end) sort(a,e+1,end);								
	}
																				
}