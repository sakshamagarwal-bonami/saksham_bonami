public class Animal {

	public void speak() {
		System.out.println("Speak");
	}
	Integer b=4;
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.speak();
//		d.inc();
//		System.out.println(d.b);
//		try {
//			
//			d.speak();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		ArrayList<Integer> arr= new ArrayList<Integer>();
//		Scanner scn= new Scanner(System.in);
//		Integer x = 0;
//		x=scn.nextInt();
//		while(x!=-1) {
//			arr.add(x);
//			x=scn.nextInt();
//		}
//		arr.stream().forEach(c->System.out.print(c+" "));
//		System.out.println("");
//		Collections.sort(arr);
//		System.out.println("Sorted array is :");
//		arr.stream().forEach(c->System.out.print(c+" "));
//		System.out.println("");
//		Collections.sort(arr,new Comparator<Object>(){
//			public int compare(Object obj1,Object obj2) {
//				Integer i1=(Integer) obj1;
//				Integer i2=(Integer) obj2;
//				return -i1.compareTo(i2);
//			}
//			
//		});
//		arr.stream().forEach(c->System.out.print(c+" "));
//		System.out.println("");
		
//		Integer a=0;
//		Integer r=0;
//		Integer temp=x;
//		while(x>0) {
//			r=x%10;
//			a=a*10+r;
//			x=x/10;
//		}
//		if(a==temp) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not palindrome");
//		}
		
//		System.out.println("Enter String");
//		String str=scn.next();
//		int j=str.length()-1;
//		int i=0;
//		while(i<j) {
//			if(str.charAt(i)!=str.charAt(j)) {
//				System.out.println("Not palindrome");
//				return;
//			}
//			i++;
//			j--;
//		}
//		System.out.println("Palindrome");
		
		
		
	}

	
}

class Dog extends Animal { 
	@Override
	public void speak() {

		System.out.println("Bark");
				
//		throw new NotFoundException("Message");
				
	}
	Integer b=2;
	public void inc() {
		super.b++;
		System.out.println(super.b);
	}
}