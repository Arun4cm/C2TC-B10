import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		for(int i =0; i<6; i++) {
			System.out.println(values.get(i));

		}
		Iterator<Integer> iValues = values.iterator();
		while(iValues.hasNext()) {
			System.out.println(iValues.next());
			System.out.println("---------------------");

		}
		for(int i: values) {
			System.out.println(i);
			System.out.println("---------------------");
		}
		values.forEach(i-> System.out.println(i));
		values.forEach(new Consumer<Integer>() {//anonymous class
			public void accept(Integer i) {
				System.out.println(i);
				System.out.println("---------------------");

			}
		});
		
		values.forEach(i-> doubleIt(i));
		values.forEach(StreamAPIDemo::doubleIt);
		}

	public static void doubleIt(int i) {
		System.out.println(i*2);

	}
}
