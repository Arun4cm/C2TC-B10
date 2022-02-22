class Main4 {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }
        /*catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }*/
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception :divide by 0");
        }
	}
}
