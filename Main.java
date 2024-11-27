public class Main{
	public static void main (String[]args){
		AdditionInterface add = (start, end) -> {
			int finval = 0;
			for ( int i = start; i <= end; i++){
				finval += i;
			}
			return finval;
		};

		System.out.println(add.AdditionMethod(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
	}
}
