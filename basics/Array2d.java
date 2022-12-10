package in.co.rays.basics;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]tables= new int[9][10];
//add value in column#1
tables[0][0]=2;
tables[1][0]=4;
tables[6][0]=14;
//add value in column#2
tables[0][1]=3;
tables[1][1]=6;
tables[6][1]=21;
//Print all element of 2D array
for(int rows=0;rows<tables.length;rows++) {
for(int col=0;col<tables[0].length;col++) {
	System.out.println(tables[rows][col]+"\t");
}
System.out.println();
}
}
}