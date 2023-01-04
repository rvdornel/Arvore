package Tree;

public class Tree {
	private Node raiz = null;

	public void insere(int valor) {
		if (this.raiz == null)
			raiz = new Node(valor);
		else if (valor < raiz.valor) {
			if (this.raiz.fesq == null)
				raiz.fesq = new Tree();
			this.raiz.fesq.insere(valor);
		} else {
			if (this.raiz.fdir == null)
				this.raiz.fdir = new Tree();
			this.raiz.fdir.insere(valor);
		}
	}

	public int altura() {
		if (this.raiz == null)
			return -1;
		int aesq = -1, adir = -1;
		if (this.raiz.fesq != null)
			aesq = this.raiz.fesq.altura();
		if (this.raiz.fdir != null)
			adir = this.raiz.fdir.altura();
		return 1 + Math.max(aesq, adir);
	}

	public void inordem() {
		if (this.raiz == null)
			return;
		if (raiz.fesq != null)
			raiz.fesq.inordem();
		System.out.println(raiz.valor);
		if (raiz.fdir != null)
			this.raiz.fdir.inordem();
	}

	public void posordem() {
		if (this.raiz == null)
			return;
		if (raiz.fesq != null)
			raiz.fesq.posordem();
		if (raiz.fdir != null)
			this.raiz.fdir.posordem();
		System.out.println(raiz.valor);
		
	}


}
