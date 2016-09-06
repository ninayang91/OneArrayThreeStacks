# OneArrayThreeStacks
Use one array to implement three stacks

int[] buffer=new int[SIZE*3];//the real array stores 3 stacks

//0-99,100-199,200-299 like [0,1/3 n) [1/3 n, 2/3 n),[2/3 n,n)

int[] pointer={-1,-1,-1};//put 3 pointers in an array,pointer[0],pointer[1],pointer[2] is from -1-99
	
