package project1;

public class Assignment3 {
	
	public static void main(String[] args){
		float fVar1 = 100.22f;
		int iVar2;
		iVar2 = (int)fVar1;
		// Following shows that float value can't be stored into integer type variable 
		System.out.println("Value of integer valiable - "+iVar2);
		
		char cVar='a';
		iVar2 = cVar;
		
		// It doesn't store variable value, it stores reference value
		System.out.println("Byte Can not be stored into integer variable - "+ iVar2);
	}

}
