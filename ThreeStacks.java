
public class ThreeStacks {
	
	private static final int SIZE=100;
	int[] buffer=new int[SIZE*3];//the real array stores 3 stacks
	//0-99,100-199,200-299 like [0,1/3 n) [1/3 n, 2/3 n),[2/3 n,n)
	int[] pointer={-1,-1,-1};//put 3 pointers in an array,pointer[0],pointer[1],pointer[2] is from -1-99
	
	public void push(int i, int value) throws Exception{
		if(pointer[i]+1>=SIZE) throw new Exception("No more space");
		pointer[i]++;
		buffer[realIndex(i)]=value;
	}
	
	private int realIndex(int i){
		return SIZE*i+pointer[i];
	}
	
	public int pop(int i) throws Exception{
		if(isEmpty(i)) throw new Exception("No element in this stack");
		int x=buffer[realIndex(i)];
		buffer[realIndex(i)]=0;
		pointer[i]--;
		return x;
		
	}
	
	public int peek(int i) throws Exception{
		if(isEmpty(i)) throw new Exception("No Element in this stack");
		return buffer[realIndex(i)];
	}
	
	public boolean isEmpty(int i){
		return pointer[i]==-1;
	}
		
}
