
public class Normalize {
	public static void main(String[] args) {
		String path = args[0];
		int lastIndex = 0;
		for(int i=0; i<path.length()-1; i++){
			if (i+3<=path.length()&&path.substring(i, i+3).equals("/..")){
				path=path.substring(0, lastIndex)+path.substring(i+3);
				i=lastIndex-1;
			}
			else if(i+1<=path.length()&&path.substring(i, i+1).equals("/")){
				lastIndex=i;
			}
			else if (i+2<=path.length()&&path.substring(i, i+2).equals("./")){
				path=path.substring(0, i)+path.substring(i+2);
				i-=1;
			}
		}
		System.out.println(path);
	}

}
