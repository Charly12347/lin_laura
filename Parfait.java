public class Parfait{
	public static void main(String[] args){
		int som=0;
		int nbP=0;
		nbP=Integer.valueOf(args[0]);
		
		for(int i=1;i<nbP; i++){
			if(nbP%i==0){
				som+=i;
			}
		}

		if(som==nbP){
			System.out.println("Le nombre " + nbP + " est parfait");
                }
                else{
                        System.out.println("Le nombre " + nbP + " n'est pas parfait");
                }
		
	}
}
